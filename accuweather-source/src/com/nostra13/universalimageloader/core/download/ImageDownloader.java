// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nostra13.universalimageloader.core.download;

import java.io.IOException;
import java.io.InputStream;
import java.util.Locale;

public interface ImageDownloader
{
    public static final class Scheme extends Enum
    {

        private static final Scheme $VALUES[];
        public static final Scheme ASSETS;
        public static final Scheme CONTENT;
        public static final Scheme DRAWABLE;
        public static final Scheme FILE;
        public static final Scheme HTTP;
        public static final Scheme HTTPS;
        public static final Scheme UNKNOWN;
        private String scheme;
        private String uriPrefix;

        private boolean belongsTo(String s)
        {
            return s.toLowerCase(Locale.US).startsWith(uriPrefix);
        }

        public static Scheme ofUri(String s)
        {
            if (s != null)
            {
                Scheme ascheme[] = values();
                int j = ascheme.length;
                for (int i = 0; i < j; i++)
                {
                    Scheme scheme1 = ascheme[i];
                    if (scheme1.belongsTo(s))
                    {
                        return scheme1;
                    }
                }

            }
            return UNKNOWN;
        }

        public static Scheme valueOf(String s)
        {
            return (Scheme)Enum.valueOf(com/nostra13/universalimageloader/core/download/ImageDownloader$Scheme, s);
        }

        public static Scheme[] values()
        {
            return (Scheme[])$VALUES.clone();
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
            HTTP = new Scheme("HTTP", 0, "http");
            HTTPS = new Scheme("HTTPS", 1, "https");
            FILE = new Scheme("FILE", 2, "file");
            CONTENT = new Scheme("CONTENT", 3, "content");
            ASSETS = new Scheme("ASSETS", 4, "assets");
            DRAWABLE = new Scheme("DRAWABLE", 5, "drawable");
            UNKNOWN = new Scheme("UNKNOWN", 6, "");
            $VALUES = (new Scheme[] {
                HTTP, HTTPS, FILE, CONTENT, ASSETS, DRAWABLE, UNKNOWN
            });
        }

        private Scheme(String s, int i, String s1)
        {
            super(s, i);
            scheme = s1;
            uriPrefix = (new StringBuilder()).append(s1).append("://").toString();
        }
    }


    public abstract InputStream getStream(String s, Object obj)
        throws IOException;
}
