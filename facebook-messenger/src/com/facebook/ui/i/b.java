// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.ui.i;

import com.facebook.analytics.av;
import com.facebook.analytics.cb;
import com.facebook.common.h.a;
import java.util.UUID;

public class b
{

    private final av a;

    public b(av av1)
    {
        a = av1;
    }

    public void a(CharSequence charsequence, String s, String s1, String s2)
    {
        cb cb1 = new cb("error");
        cb1.b("message", charsequence.toString());
        cb1.h(com.facebook.common.h.a.a().toString());
        if (s1 != null)
        {
            cb1.g(s1);
        }
        if (s != null)
        {
            cb1.f(s);
        }
        if (s2 != null)
        {
            cb1.e(s2);
        }
        if (a != null)
        {
            a.a(cb1);
        }
    }
}
