// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.util;

import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.util.Map;

public interface HttpUtil
{
    public static final class Encoding extends Enum
    {

        public static final Encoding a;
        public static final Encoding b;
        public static final Encoding c;
        public static final Encoding d;
        private static final Encoding e[];

        public static Encoding valueOf(String s)
        {
            return (Encoding)Enum.valueOf(com/skype/android/util/HttpUtil$Encoding, s);
        }

        public static Encoding[] values()
        {
            return (Encoding[])e.clone();
        }

        static 
        {
            a = new Encoding("GZIP", 0);
            b = new Encoding("XGZIP", 1);
            c = new Encoding("DEFLATE", 2);
            d = new Encoding("NONE", 3);
            e = (new Encoding[] {
                a, b, c, d
            });
        }

        private Encoding(String s, int i)
        {
            super(s, i);
        }
    }


    public abstract String a(HttpURLConnection httpurlconnection);

    public abstract HttpURLConnection a(String s);

    public abstract void a(Closeable closeable);

    public abstract void a(Flushable flushable);

    public abstract void a(HttpURLConnection httpurlconnection, String s)
        throws IOException;

    public abstract void a(HttpURLConnection httpurlconnection, Map map);

    public abstract HttpURLConnection b(String s)
        throws Exception;

    public abstract byte[] b(HttpURLConnection httpurlconnection);

    public abstract String c(HttpURLConnection httpurlconnection);

    public abstract String d(HttpURLConnection httpurlconnection)
        throws Exception;
}
