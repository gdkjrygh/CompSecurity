// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;

public class gtp
{

    private static onh b = (new oqh("debug.photos.nde_fishfood")).a();
    private final myf a;

    gtp(Context context)
    {
        a = (myf)olm.a(context, myf);
    }

    public final boolean a(int i)
    {
        return a.a(gtq.a, i);
    }

    public final boolean a(int i, ekp ekp1)
    {
        return a(i, ekp1.c());
    }

    public final boolean a(int i, euv euv1)
    {
        if (i != -1 && a(i))
        {
            i = 1;
        } else
        {
            i = 0;
        }
        return i != 0 && euv1 == euv.b;
    }

}
