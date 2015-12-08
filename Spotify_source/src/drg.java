// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.common.collect.ImmutableList;
import com.spotify.mobile.android.porcelain.collection.PorcelainCarouselCollection;

public final class drg
{

    public static boolean a(int i)
    {
        return b(i) || dqz.b.contains(Integer.valueOf(i));
    }

    public static boolean a(drf drf)
    {
        return (drf instanceof drh) && ((drh)drf).isEnabled();
    }

    public static boolean b(int i)
    {
        return i == 0x7f1100fa;
    }

    public static boolean c(int i)
    {
        return a(i) || PorcelainCarouselCollection.b.contains(Integer.valueOf(i)) || i == 0x7f1100ec;
    }

    public static boolean d(int i)
    {
        return i == 0x7f1100f8 || i == 0x7f1100f9;
    }

    public static boolean e(int i)
    {
        return drh.c.contains(Integer.valueOf(i));
    }
}
