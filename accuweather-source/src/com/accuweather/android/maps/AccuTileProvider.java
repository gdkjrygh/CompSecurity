// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.accuweather.android.maps;

import com.accuweather.android.utilities.Logger;
import com.google.android.gms.maps.model.UrlTileProvider;
import java.net.MalformedURLException;
import java.net.URL;

public class AccuTileProvider extends UrlTileProvider
{

    private String frameId;
    private String frameUrl;

    public AccuTileProvider(int i, int j, String s, String s1)
    {
        super(i, j);
        frameId = s;
        frameUrl = s1;
    }

    public String getFrameId()
    {
        return frameId;
    }

    public URL getTileUrl(int i, int j, int k)
    {
        int i1 = (int)Math.pow(2D, k);
        int l = i;
        if (i < 0 || i > i1)
        {
            i %= i1;
            l = i;
            if (i < 0)
            {
                l = i + i1;
            }
        }
        String s = (new StringBuilder()).append(frameUrl).append("/").append(frameId).append("/").append(k).append("/").append(l).append("_").append(j).append(".png").toString();
        URL url;
        try
        {
            url = new URL(s);
        }
        catch (MalformedURLException malformedurlexception)
        {
            Logger.e(this, (new StringBuilder()).append("Bad url for tile: ").append(s).toString());
            return null;
        }
        return url;
    }
}
