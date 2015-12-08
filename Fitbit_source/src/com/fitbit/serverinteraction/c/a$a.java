// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.serverinteraction.c;

import com.fitbit.FitBitApplication;
import com.squareup.picasso.Cache;
import com.squareup.picasso.Picasso;

// Referenced classes of package com.fitbit.serverinteraction.c:
//            a, c, b, d

private static class r
{

    public static final Picasso a;
    public static final Picasso b;
    public static final Cache c;

    static 
    {
        c = new c(FitBitApplication.a());
        com.squareup.picasso.sso.Builder builder = new com.squareup.picasso.sso.Builder(FitBitApplication.a());
        builder.downloader(new b());
        builder.memoryCache(c);
        a = builder.build();
        builder = new com.squareup.picasso.sso.Builder(FitBitApplication.a());
        builder.downloader(new d());
        builder.memoryCache(c);
        b = builder.build();
    }

    private r()
    {
    }
}
