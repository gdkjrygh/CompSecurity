// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.device_id;

import com.google.common.base.Objects;

public class i
{

    private final String a;
    private final long b;

    public i(String s, long l)
    {
        a = s;
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

    public String toString()
    {
        return Objects.toStringHelper(com/facebook/device_id/i).add("id", a).add("timestamp", Long.valueOf(b)).toString();
    }
}
