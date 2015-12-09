// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.flurry.sdk;


public final class ge
{

    private final Class a;
    private final int b;

    public ge(Class class1, int i)
    {
        a = class1;
        b = i;
    }

    public Class a()
    {
        return a;
    }

    public boolean b()
    {
        return a != null && android.os.Build.VERSION.SDK_INT >= b;
    }
}
