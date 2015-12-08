// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.microsoft.onlineid.sts.a;

import com.microsoft.onlineid.b.b;
import com.microsoft.onlineid.internal.k;
import com.microsoft.onlineid.sts.q;

public final class e extends b
{

    private final q a;

    public e(String s, q q1)
    {
        super((new StringBuilder()).append(s).append(": ").append(q1.b()).toString());
        k.a(q1, "error");
        a = q1;
    }

    public final q a()
    {
        return a;
    }
}
