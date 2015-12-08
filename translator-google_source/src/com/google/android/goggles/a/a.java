// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.goggles.a;

import com.google.common.base.s;
import com.google.g.a.a.m;
import com.google.g.a.a.t;

public final class a
    implements s
{

    private final String a;
    private final int b;

    public a(String s1, int i)
    {
        a = s1;
        b = i;
    }

    public final Object get()
    {
        t t1 = new t();
        t1.a = (new m()).a("https://www.google.com/m/voice-search/down?pair=").a().b().a(true);
        t1.b = (new m()).a("https://www.google.com/m/voice-search/up?pair=").a().b().a(true).b(a).a(b);
        return t1;
    }
}
