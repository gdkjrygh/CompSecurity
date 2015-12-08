// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.controller.b;

import android.text.TextUtils;
import org.a.d.f;

public class c extends f
{

    private String a;
    private long b;

    public c()
    {
        this("", "", 0L);
    }

    public c(String s, String s1, long l)
    {
        super(s, null);
        a = s1;
        b = l;
    }

    public String a()
    {
        return a;
    }

    public long b()
    {
        return b;
    }

    public boolean c()
    {
        return TextUtils.isEmpty(d()) && TextUtils.isEmpty(a) && b == 0L;
    }
}
