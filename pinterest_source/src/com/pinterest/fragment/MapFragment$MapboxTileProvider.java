// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.fragment;

import com.google.android.gms.maps.model.UrlTileProvider;
import com.pinterest.base.Application;
import com.pinterest.base.Device;
import com.pinterest.kit.utils.AppUtils;
import com.pinterest.kit.utils.LocaleUtils;
import java.net.MalformedURLException;
import java.net.URL;

public class resolveIdentifier extends UrlTileProvider
{

    private static final String ACCESS_TOKEN = AppUtils.getApplicationMetadata(Application.context().getPackageName(), "com.pinterest.mapbox.ApiKey");
    private static final String ACCOUNT = "pinterest.";
    private static final String FORMAT = "http://api.tiles.mapbox.com/v4/%s/%d/%d/%d.png";
    private static final String FORMAT_2X = "http://api.tiles.mapbox.com/v4/%s/%d/%d/%d.png".replace(".png", "@2x.png");
    public static final String MAP_ID_DE = "md5kx1or";
    public static final String MAP_ID_EN = "ijz1714i";
    public static final String MAP_ID_ES = "hiqhyqfr";
    public static final String MAP_ID_FR = "vypkfbt9";
    private String _mapIdentifier;

    private String resolveIdentifier()
    {
        if (LocaleUtils.isLanguageEs())
        {
            return "hiqhyqfr";
        }
        if (LocaleUtils.isLanguageDe())
        {
            return "md5kx1or";
        }
        if (LocaleUtils.isLanguageFr())
        {
            return "vypkfbt9";
        } else
        {
            return "ijz1714i";
        }
    }

    public URL getTileUrl(int i, int j, int k)
    {
        String s;
        StringBuilder stringbuilder;
        stringbuilder = new StringBuilder();
        if (!Device.shouldLoadBigImages())
        {
            break MISSING_BLOCK_LABEL_99;
        }
        s = FORMAT_2X;
_L1:
        return new URL(stringbuilder.append(String.format(s, new Object[] {
            (new StringBuilder("pinterest.")).append(_mapIdentifier).toString(), Integer.valueOf(k), Integer.valueOf(i), Integer.valueOf(j)
        })).append("?access_token=").append(ACCESS_TOKEN).toString());
        s = "http://api.tiles.mapbox.com/v4/%s/%d/%d/%d.png";
          goto _L1
        MalformedURLException malformedurlexception;
        malformedurlexception;
        return null;
    }


    public ()
    {
        super(256, 256);
        _mapIdentifier = resolveIdentifier();
    }
}
