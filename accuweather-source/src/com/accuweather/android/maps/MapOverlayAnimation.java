// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.accuweather.android.maps;

import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.accuweather.android.maps:
//            AccuTileProvider

public class MapOverlayAnimation
{

    private static final int MAP_TILE_HEIGHT = 256;
    private static final int MAP_TILE_WIDTH = 256;
    private static final int MAX_ANIMATION_FRAME_COUNT = 6;
    private JSONObject jsonObject;
    private String overlayType;

    public MapOverlayAnimation(String s, JSONObject jsonobject)
    {
        overlayType = s;
        jsonObject = jsonobject;
    }

    public List buildTileProviders()
        throws JSONException
    {
        int j = getNumberOfAnimationFrames();
        ArrayList arraylist = new ArrayList();
        for (int i = 0; i < j; i++)
        {
            arraylist.add(new AccuTileProvider(256, 256, getFrameIdForAnimationOffset(i), getUrl()));
        }

        return arraylist;
    }

    public String getFrameIdForAnimationOffset(int i)
        throws JSONException
    {
        JSONArray jsonarray = getFrames();
        return (String)jsonarray.get((jsonarray.length() - getNumberOfAnimationFrames()) + i);
    }

    public JSONArray getFrames()
        throws JSONException
    {
        return jsonObject.getJSONArray("frames");
    }

    public int getNumberOfAnimationFrames()
        throws JSONException
    {
        return Math.min(6, getFrames().length());
    }

    public String getOverlayType()
    {
        return overlayType;
    }

    public String getUrl()
        throws JSONException
    {
        return jsonObject.getString("url");
    }
}
