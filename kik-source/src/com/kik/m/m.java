// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kik.m;

import java.util.ArrayList;
import java.util.List;
import kik.a.d.a.a;
import kik.a.d.a.g;
import kik.a.d.a.h;
import kik.a.d.s;
import kik.android.util.v;

public final class m
{

    public static List a(s s)
    {
        h h1 = (h)g.a(s, kik/a/d/a/h);
        if (h1 != null)
        {
            return v.a(h1.a(), new String[] {
                "http://", "https://"
            });
        }
        s = (a)g.a(s, kik/a/d/a/a);
        if (s != null && s.f().size() > 0 && ((com.kik.f.a.a.a)s.f().get(0)).f() != null)
        {
            return v.a(((com.kik.f.a.a.a)s.f().get(0)).f(), new String[] {
                "http://", "https://"
            });
        } else
        {
            return new ArrayList();
        }
    }
}
