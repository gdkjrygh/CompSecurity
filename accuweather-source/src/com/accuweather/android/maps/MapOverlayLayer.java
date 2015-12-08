// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.accuweather.android.maps;

import com.accuweather.android.utilities.DateUtils;
import com.accuweather.android.utilities.HttpUtils;
import com.google.android.gms.maps.model.TileOverlay;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

// Referenced classes of package com.accuweather.android.maps:
//            MapOverlayMetadata, MapOverlayFrame, MapOverlayAnimation

public class MapOverlayLayer
{

    private boolean isActive;
    private List mapOverlayFrames;
    private MapOverlayMetadata mapOverlayMetadata;

    public MapOverlayLayer(MapOverlayMetadata mapoverlaymetadata)
    {
        isActive = false;
        mapOverlayFrames = new ArrayList();
        mapOverlayMetadata = mapoverlaymetadata;
    }

    private String getJsonUrl()
    {
        return mapOverlayMetadata.getJsonUrl();
    }

    public void addMapOverlayFrame(MapOverlayFrame mapoverlayframe)
    {
        mapOverlayFrames.add(mapoverlayframe);
    }

    public String buildLatestTimestamp()
    {
        if (mapOverlayFrames.size() == 0)
        {
            return "";
        } else
        {
            return ((MapOverlayFrame)mapOverlayFrames.get(mapOverlayFrames.size() - 1)).buildLocalTimestamp();
        }
    }

    public String buildTimestampForFrame(int i)
    {
        if (mapOverlayFrames.size() > 0)
        {
            if (i > mapOverlayFrames.size() - 1)
            {
                return buildLatestTimestamp();
            } else
            {
                return ((MapOverlayFrame)mapOverlayFrames.get(i)).buildLocalTimestamp();
            }
        } else
        {
            return "";
        }
    }

    public void clearOverlays()
    {
        MapOverlayFrame mapoverlayframe;
        for (Iterator iterator = mapOverlayFrames.iterator(); iterator.hasNext(); mapoverlayframe.getTileOverlay().setVisible(false))
        {
            mapoverlayframe = (MapOverlayFrame)iterator.next();
            mapoverlayframe.getTileOverlay().clearTileCache();
        }

        mapOverlayFrames.clear();
    }

    public List getMapOverlayFrames()
    {
        return mapOverlayFrames;
    }

    public String getOverlayType()
    {
        return mapOverlayMetadata.getOverlayType();
    }

    public void hideOverlays(int i)
    {
        if (mapOverlayFrames.size() > i)
        {
            ((MapOverlayFrame)mapOverlayFrames.get(i)).getTileOverlay().setVisible(false);
        }
    }

    public void hideOverlaysForAllFrames()
    {
        for (Iterator iterator = mapOverlayFrames.iterator(); iterator.hasNext(); ((MapOverlayFrame)iterator.next()).getTileOverlay().setVisible(false)) { }
    }

    public boolean isActive()
    {
        return isActive;
    }

    public MapOverlayAnimation retrieveOverlayAnimation()
        throws Exception
    {
        String s = HttpUtils.doGet((new StringBuilder()).append(getJsonUrl()).append("&").append(DateUtils.getUrlCacheBusterValue()).toString());
        return new MapOverlayAnimation(getOverlayType(), new JSONObject(s));
    }

    public void setActive(boolean flag)
    {
        isActive = flag;
    }

    public void showOverlays(int i)
    {
        if (mapOverlayFrames.size() > i)
        {
            ((MapOverlayFrame)mapOverlayFrames.get(i)).getTileOverlay().setVisible(true);
        }
    }
}
