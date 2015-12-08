// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.map.lyft;

import java.net.MalformedURLException;
import java.net.URL;
import me.lyft.android.infrastructure.api.UrlBuilder;
import me.lyft.android.map.core.tileoverlay.ITileProvider;

public class DriverHeatMapTileProvider
    implements ITileProvider
{

    private static final int MAX_ZOOM_IN = 20;
    private static final int MAX_ZOOM_OUT = 10;
    private final int height = 256;
    private final String url;
    private final int width = 256;

    public DriverHeatMapTileProvider(String s)
    {
        url = s;
    }

    private boolean checkTileExists(int i, int j, int k)
    {
        return k >= 10 && k <= 20;
    }

    public int getHeight()
    {
        return height;
    }

    public URL getTileUrl(int i, int j, int k)
    {
        if (!checkTileExists(i, j, k))
        {
            return null;
        }
        Object obj = (new UrlBuilder(url)).addPathParam("x", Integer.toString(i)).addPathParam("y", Integer.toString(j)).addPathParam("z", Integer.toString(k)).build();
        try
        {
            obj = new URL(((String) (obj)));
        }
        catch (MalformedURLException malformedurlexception)
        {
            throw new AssertionError(malformedurlexception);
        }
        return ((URL) (obj));
    }

    public int getWidth()
    {
        return width;
    }
}
