// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.serverinteraction.c;

import android.graphics.Bitmap;
import android.text.TextUtils;
import com.fitbit.FitBitApplication;
import com.squareup.picasso.Cache;
import com.squareup.picasso.Picasso;

// Referenced classes of package com.fitbit.serverinteraction.c:
//            c, b, d

public final class com.fitbit.serverinteraction.c.a
{
    private static class a
    {

        public static final Picasso a;
        public static final Picasso b;
        public static final Cache c;

        static 
        {
            c = new c(FitBitApplication.a());
            com.squareup.picasso.Picasso.Builder builder = new com.squareup.picasso.Picasso.Builder(FitBitApplication.a());
            builder.downloader(new b());
            builder.memoryCache(c);
            a = builder.build();
            builder = new com.squareup.picasso.Picasso.Builder(FitBitApplication.a());
            builder.downloader(new d());
            builder.memoryCache(c);
            b = builder.build();
        }

        private a()
        {
        }
    }


    public static final String a = "FitbitPicasso";
    public static final String b = "my://com.app/";

    private com.fitbit.serverinteraction.c.a()
    {
    }

    static Bitmap a(String s)
    {
        return c().get(b(s));
    }

    public static Picasso a()
    {
        return a.a;
    }

    static void a(String s, Bitmap bitmap)
    {
        c().set(b(s), bitmap);
    }

    public static Picasso b()
    {
        return a.b;
    }

    private static String b(String s)
    {
        if (!TextUtils.isEmpty(s))
        {
            s = new StringBuilder(s);
            s.append("\n");
            return s.toString();
        } else
        {
            return "";
        }
    }

    public static Cache c()
    {
        return a.c;
    }
}
