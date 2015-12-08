// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.accuweather.android.maps;

import com.accuweather.android.utilities.Logger;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.accuweather.android.maps:
//            MapOverlayMetadata, MapOverlayLayer, MapOverlayFrame, MapListener

public class MapOverlayLayerManager
{

    private static final int MAX_ANIMATION_FRAME_COUNT = 6;
    private static final String RAD_FRAME = "radFrame";
    private static final String RAD_LENGTH = "radLength";
    private static final String RAD_TIME = "radTime";
    private int mAnimActiveMapFrame;
    private int mCurrentMaxAnimationFrameCount;
    private MapListener mapListener;
    private List mapOverlayLayers;

    public MapOverlayLayerManager(MapListener maplistener)
    {
        mapOverlayLayers = new ArrayList();
        mCurrentMaxAnimationFrameCount = 6;
        mapListener = maplistener;
    }

    private void addAvailableOverlays(String s)
    {
        for (s = MapOverlayMetadata.getAvailableOverlayTypesForCountry(s).iterator(); s.hasNext();)
        {
            MapOverlayMetadata mapoverlaymetadata = (MapOverlayMetadata)s.next();
            try
            {
                mapOverlayLayers.add(new MapOverlayLayer(mapoverlaymetadata));
            }
            catch (IllegalArgumentException illegalargumentexception) { }
        }

    }

    private MapOverlayLayer getOverlayLayer(String s)
    {
        for (int i = 0; i < mapOverlayLayers.size(); i++)
        {
            if (s.equals(((MapOverlayLayer)mapOverlayLayers.get(i)).getOverlayType()))
            {
                return (MapOverlayLayer)mapOverlayLayers.get(i);
            }
        }

        return null;
    }

    private void setNextFrameAnimationIndex()
    {
        if (mAnimActiveMapFrame < mCurrentMaxAnimationFrameCount - 1)
        {
            mAnimActiveMapFrame = mAnimActiveMapFrame + 1;
            return;
        } else
        {
            mAnimActiveMapFrame = 0;
            return;
        }
    }

    private void showCurrentFrameOverlays()
    {
        for (int i = 0; i < mapOverlayLayers.size(); i++)
        {
            if (((MapOverlayLayer)mapOverlayLayers.get(i)).isActive())
            {
                ((MapOverlayLayer)mapOverlayLayers.get(i)).showOverlays(mAnimActiveMapFrame);
            }
        }

    }

    public void addMapOverlayFrame(MapOverlayFrame mapoverlayframe)
    {
        MapOverlayLayer mapoverlaylayer = getOverlayLayer(mapoverlayframe.getOverlayType());
        if (mapoverlaylayer != null)
        {
            mapoverlaylayer.addMapOverlayFrame(mapoverlayframe);
        }
    }

    public void animateMap()
    {
        hideCurrentFrameOverlays();
        setNextFrameAnimationIndex();
        showCurrentFrameOverlays();
        animateMapForCurrentFrame();
    }

    public void animateMapForCurrentFrame()
    {
        int i = 0;
        while (i < mapOverlayLayers.size()) 
        {
            MapOverlayLayer mapoverlaylayer = (MapOverlayLayer)mapOverlayLayers.get(i);
            if (mapoverlaylayer.isActive())
            {
                try
                {
                    mapListener.processMessage((new StringBuilder()).append("radLength").append(mapoverlaylayer.getMapOverlayFrames().size()).toString());
                    mapListener.processMessage((new StringBuilder()).append("radFrame").append(mAnimActiveMapFrame).toString());
                    mapListener.processMessage((new StringBuilder()).append("radTime").append(mapoverlaylayer.buildTimestampForFrame(mAnimActiveMapFrame)).toString());
                }
                catch (NumberFormatException numberformatexception)
                {
                    Logger.e((new StringBuilder()).append("Error parsing the overlay timestamp: ").append(numberformatexception).toString());
                }
            }
            i++;
        }
    }

    public void clearOverlays()
    {
        for (int i = 0; i < mapOverlayLayers.size(); i++)
        {
            ((MapOverlayLayer)mapOverlayLayers.get(i)).clearOverlays();
        }

    }

    public void displayLayerExclusively(String s)
    {
        int i = 0;
        while (i < mapOverlayLayers.size()) 
        {
            MapOverlayLayer mapoverlaylayer = (MapOverlayLayer)mapOverlayLayers.get(i);
            if (s.equals(mapoverlaylayer.getOverlayType()))
            {
                mapoverlaylayer.setActive(true);
                mCurrentMaxAnimationFrameCount = Math.min(6, mapoverlaylayer.getMapOverlayFrames().size());
            } else
            {
                mapoverlaylayer.setActive(false);
                mapoverlaylayer.hideOverlaysForAllFrames();
            }
            i++;
        }
        showActiveLayer(s);
    }

    public MapOverlayLayer getActiveLayer()
    {
        for (int i = 0; i < mapOverlayLayers.size(); i++)
        {
            if (((MapOverlayLayer)mapOverlayLayers.get(i)).isActive())
            {
                return (MapOverlayLayer)mapOverlayLayers.get(i);
            }
        }

        return null;
    }

    public void hideCurrentFrameOverlays()
    {
        for (int i = 0; i < mapOverlayLayers.size(); i++)
        {
            ((MapOverlayLayer)mapOverlayLayers.get(i)).hideOverlays(mAnimActiveMapFrame);
        }

    }

    public void initialize(String s)
    {
        mAnimActiveMapFrame = 5;
        if (mapOverlayLayers.isEmpty())
        {
            addAvailableOverlays(s);
        }
    }

    public List retrieveOverlayAnimations()
        throws Exception
    {
        ArrayList arraylist = new ArrayList();
        for (int i = 0; i < mapOverlayLayers.size(); i++)
        {
            arraylist.add(((MapOverlayLayer)mapOverlayLayers.get(i)).retrieveOverlayAnimation());
        }

        return arraylist;
    }

    public void showActiveLayer(String s)
    {
        s = getOverlayLayer(s);
        if (s != null)
        {
            s.showOverlays(mAnimActiveMapFrame);
        }
    }
}
