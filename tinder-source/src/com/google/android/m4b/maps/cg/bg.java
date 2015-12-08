// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.cg;


public class bg
{

    static final String a = com/google/android/m4b/maps/cg/bg.getSimpleName();
    static final String b[] = {
        "android.permission.ACCESS_NETWORK_STATE", "android.permission.INTERNET"
    };
    final int c;
    private final boolean d = true;
    private final boolean e = false;

    public bg(int i)
    {
        c = i;
    }

    public final boolean a(int i)
    {
        return e || d || c >= i;
    }

}
