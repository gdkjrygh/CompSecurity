// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.bugreporter.activity.tasklist;

import com.google.common.a.es;
import com.google.common.base.Preconditions;

public class f
{

    private final es a;
    private final String b;

    public f(es es, String s)
    {
        a = es;
        b = s;
        Preconditions.checkNotNull(s);
    }

    public es a()
    {
        return a;
    }

    public String b()
    {
        return b;
    }
}
