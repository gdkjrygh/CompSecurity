// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.ui.images.a;

import com.facebook.ui.images.cache.f;

class c
{

    static final int a[];

    static 
    {
        a = new int[f.values().length];
        try
        {
            a[f.MemoryUsagePowerOfTwo.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror2) { }
        try
        {
            a[f.MaxScaleNonPowerOfTwo.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        try
        {
            a[f.MinScaleNonPowerOfTwo.ordinal()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror)
        {
            return;
        }
    }
}
