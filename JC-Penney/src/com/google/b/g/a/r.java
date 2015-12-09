// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.b.g.a;

import com.google.b.s;

public final class r
{

    private final boolean a;

    r(boolean flag)
    {
        a = flag;
    }

    public void a(s as[])
    {
        if (!a || as == null || as.length < 3)
        {
            return;
        } else
        {
            s s = as[0];
            as[0] = as[2];
            as[2] = s;
            return;
        }
    }
}
