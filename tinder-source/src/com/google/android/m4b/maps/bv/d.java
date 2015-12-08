// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.bv;

import android.util.Log;
import com.google.android.m4b.maps.ay.ab;

public final class d
{

    public static void a(String s)
    {
        if (ab.a("StreetView", 3))
        {
            Log.d("StreetView", s);
        }
    }

    public static void a(String s, Throwable throwable)
    {
        if (ab.a("StreetView", 4))
        {
            Log.i("StreetView", s, throwable);
        }
    }

    public static void b(String s)
    {
        if (ab.a("StreetView", 4))
        {
            Log.i("StreetView", s);
        }
    }
}
