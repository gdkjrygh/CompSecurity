// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.c;

import com.facebook.base.j;
import com.facebook.common.w.m;
import com.google.common.base.Preconditions;

public class l
{

    private final j a;

    public l(j j1)
    {
        a = (j)Preconditions.checkNotNull(j1);
    }

    public String a(String s)
    {
        return m.a("com.facebook.intent.action.%s.%s", new Object[] {
            a.name().toLowerCase(), s
        });
    }
}
