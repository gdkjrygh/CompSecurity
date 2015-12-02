// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.stickers;

import com.facebook.analytics.av;
import com.facebook.analytics.cb;

class h
{

    private final av a;

    h(av av1)
    {
        a = av1;
    }

    cb a(String s)
    {
        cb cb1 = new cb("click");
        cb1.f(s);
        return cb1;
    }

    void a(cb cb1)
    {
        a.a(cb1);
    }
}
