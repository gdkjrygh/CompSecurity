// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.event.nrdp.media;

import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.netflix.mediaclient.event.nrdp.media:
//            BaseMediaEvent

public class VideoWindowChanged extends BaseMediaEvent
{

    private static final String ATTR_HEIGHT = "height";
    private static final String ATTR_WIDTH = "width";
    private static final String ATTR_X = "x";
    private static final String ATTR_Y = "y";
    public static final String TYPE = "videoWindowChanged";
    private int height;
    private int width;
    private int x;
    private int y;

    public VideoWindowChanged(JSONObject jsonobject)
        throws JSONException
    {
        super("videoWindowChanged", jsonobject);
    }

    public int getHeight()
    {
        return height;
    }

    public int getWidth()
    {
        return width;
    }

    public int getX()
    {
        return x;
    }

    public int getY()
    {
        return y;
    }

    protected void populate(JSONObject jsonobject)
        throws JSONException
    {
        x = getInt(jsonobject, "x", 0);
        y = getInt(jsonobject, "y", 0);
        width = getInt(jsonobject, "width", 0);
        height = getInt(jsonobject, "height", 0);
    }
}
