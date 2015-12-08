// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.utils;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Iterator;
import me.lyft.android.logging.L;

public class GoogleMapsUrlBuilder
{

    public static final String ICON_CURRENT_DRIVER = "http://goo.gl/CAakqc";
    public static String ICON_MY_LOCATION_DOT = "http://goo.gl/1SEL9z";
    public static final String ICON_PICKUP_PIN = "http://goo.gl/Xc8lXP";
    private static final String MAP_BASE_URL = "http://maps.googleapis.com/maps/api/staticmap?";
    private ArrayList params;

    public GoogleMapsUrlBuilder()
    {
        params = initParams();
    }

    private void addParam(String s, String s1)
    {
        params.add(new QueryStringParam(s, s1));
    }

    private String encodeForUrl(String s)
    {
        String s1 = "";
        try
        {
            s = URLEncoder.encode(String.valueOf(s), "UTF-8");
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return s1;
        }
        s1 = s;
        s = s.replace("+", "%20");
        return s;
    }

    private ArrayList initParams()
    {
        params = new ArrayList();
        addParam("sensor", Boolean.toString(true));
        return params;
    }

    public GoogleMapsUrlBuilder addMarkers(String s, String s1)
    {
        addParam("markers", (new StringBuilder()).append("icon:").append(s).append("|").append(s1).toString());
        return this;
    }

    public String build()
    {
        Object obj = new StringBuilder("http://maps.googleapis.com/maps/api/staticmap?");
        int j = params.size();
        Iterator iterator = params.iterator();
        for (int i = 0; iterator.hasNext(); i++)
        {
            QueryStringParam querystringparam = (QueryStringParam)iterator.next();
            ((StringBuilder) (obj)).append((new StringBuilder()).append(querystringparam.getName()).append("=").append(encodeForUrl(querystringparam.getValue())).toString());
            if (i < j - 1)
            {
                ((StringBuilder) (obj)).append("&");
            }
        }

        obj = ((StringBuilder) (obj)).toString();
        L.d(((String) (obj)), new Object[0]);
        return ((String) (obj));
    }

    public GoogleMapsUrlBuilder setCenter(String s)
    {
        addParam("center", s);
        return this;
    }

    public GoogleMapsUrlBuilder setScale(int i)
    {
        addParam("scale", Integer.toString(i));
        return this;
    }

    public GoogleMapsUrlBuilder setSize(int i, int j)
    {
        addParam("size", (new StringBuilder()).append(i).append("x").append(j).toString());
        return this;
    }

    public GoogleMapsUrlBuilder setZoom(int i)
    {
        addParam("zoom", Integer.toString(i));
        return this;
    }


    private class QueryStringParam
    {

        String name;
        String value;

        public String getName()
        {
            return name;
        }

        public String getValue()
        {
            return value;
        }

        public QueryStringParam(String s, String s1)
        {
            name = s;
            value = s1;
        }
    }

}
