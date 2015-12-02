// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mobvista.sdk.m.a.d.a;

import com.mobvista.sdk.m.a.b.a.a;

public final class c
{

    public int a;
    public boolean b;

    public c()
    {
        a = 0x500000;
        b = true;
    }

    public final void a(float f)
    {
        long l = Runtime.getRuntime().maxMemory();
        com.mobvista.sdk.m.a.b.a.a.b("ImageCache", (new StringBuilder("maxMemory = ")).append(l).append("    freeMemory = ").append(Runtime.getRuntime().freeMemory()).append("totalMemory = ").append(Runtime.getRuntime().totalMemory()).toString());
        a = Math.round((float)l * 0.1F);
    }
}
