// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.media;

import com.netflix.mediaclient.util.JsonUtils;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class TrickplayUrl
    implements Comparable
{

    protected static final String TAG = "TrickplayUrl";
    private int aspectX;
    private int aspectY;
    private int height;
    private String url[];
    private int width;

    public TrickplayUrl(JSONObject jsonobject)
        throws JSONException
    {
        width = JsonUtils.getInt(jsonobject, "width", 0);
        height = JsonUtils.getInt(jsonobject, "height", 0);
        aspectX = JsonUtils.getInt(jsonobject, "aspectX", 0);
        aspectY = JsonUtils.getInt(jsonobject, "aspectY", 0);
        jsonobject = JsonUtils.getJSONArray(jsonobject, "urls");
        if (jsonobject != null)
        {
            url = new String[jsonobject.length()];
            for (int i = 0; i < jsonobject.length(); i++)
            {
                url[i] = jsonobject.getString(i);
            }

        }
    }

    public int compareTo(TrickplayUrl trickplayurl)
    {
        return this != trickplayurl ? 1 : 0;
    }

    public volatile int compareTo(Object obj)
    {
        return compareTo((TrickplayUrl)obj);
    }

    public float getAspect()
    {
        if (aspectY != 0)
        {
            return (float)(aspectX / aspectY);
        } else
        {
            return 0.0F;
        }
    }

    public int getHeight()
    {
        return height;
    }

    public String[] getUrl()
    {
        return url;
    }

    public int getWidth()
    {
        return width;
    }

    public String toString()
    {
        return (new StringBuilder()).append("TrickplayUrl: width=").append(width).append(", height=").append(height).append(" aspect=").append((float)aspectX / (float)aspectY).append(", url:").append(url).toString();
    }
}
