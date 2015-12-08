// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nostra13.universalimageloader.core.download;

import java.util.Locale;

// Referenced classes of package com.nostra13.universalimageloader.core.download:
//            ImageDownloader

public static final class uriPrefix extends Enum
{

    private static final UNKNOWN $VALUES[];
    public static final UNKNOWN ASSETS;
    public static final UNKNOWN CONTENT;
    public static final UNKNOWN DRAWABLE;
    public static final UNKNOWN FILE;
    public static final UNKNOWN HTTP;
    public static final UNKNOWN HTTPS;
    public static final UNKNOWN UNKNOWN;
    private String scheme;
    private String uriPrefix;

    private boolean belongsTo(String s)
    {
        return s.toLowerCase(Locale.US).startsWith(uriPrefix);
    }

    public static uriPrefix ofUri(String s)
    {
        if (s != null)
        {
            uriPrefix auriprefix[] = values();
            int j = auriprefix.length;
            for (int i = 0; i < j; i++)
            {
                uriPrefix uriprefix = auriprefix[i];
                if (uriprefix.belongsTo(s))
                {
                    return uriprefix;
                }
            }

        }
        return UNKNOWN;
    }

    public static UNKNOWN valueOf(String s)
    {
        return (UNKNOWN)Enum.valueOf(com/nostra13/universalimageloader/core/download/ImageDownloader$Scheme, s);
    }

    public static UNKNOWN[] values()
    {
        return (UNKNOWN[])$VALUES.clone();
    }

    public String crop(String s)
    {
        if (!belongsTo(s))
        {
            throw new IllegalArgumentException(String.format("URI [%1$s] doesn't have expected scheme [%2$s]", new Object[] {
                s, scheme
            }));
        } else
        {
            return s.substring(uriPrefix.length());
        }
    }

    public String wrap(String s)
    {
        return (new StringBuilder()).append(uriPrefix).append(s).toString();
    }

    static 
    {
        HTTP = new <init>("HTTP", 0, "http");
        HTTPS = new <init>("HTTPS", 1, "https");
        FILE = new <init>("FILE", 2, "file");
        CONTENT = new <init>("CONTENT", 3, "content");
        ASSETS = new <init>("ASSETS", 4, "assets");
        DRAWABLE = new <init>("DRAWABLE", 5, "drawable");
        UNKNOWN = new <init>("UNKNOWN", 6, "");
        $VALUES = (new .VALUES[] {
            HTTP, HTTPS, FILE, CONTENT, ASSETS, DRAWABLE, UNKNOWN
        });
    }

    private (String s, int i, String s1)
    {
        super(s, i);
        scheme = s1;
        uriPrefix = (new StringBuilder()).append(s1).append("://").toString();
    }
}
