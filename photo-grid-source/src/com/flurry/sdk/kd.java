// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.flurry.sdk;


public final class kd
{

    private final Class a;
    private final int b;

    public kd(Class class1, int i)
    {
        a = class1;
        b = i;
    }

    public final Class a()
    {
        return a;
    }

    public final boolean b()
    {
        return a != null && android.os.Build.VERSION.SDK_INT >= b;
    }
}
