// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.microsoft.onlineid.internal.sso;

import com.microsoft.onlineid.b.b;
import com.microsoft.onlineid.internal.o;

public final class c extends b
{

    private final String a;

    public c(String s, String s1)
    {
        super((new StringBuilder()).append(s).append(": ").append(s1).toString());
        o.a(s1, "redirectRequestTo");
        a = s1;
    }

    public final String a()
    {
        return a;
    }
}
