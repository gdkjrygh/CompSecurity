// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.util.HashMap;
import java.util.Map;

// Referenced classes of package com.google.android.gms.internal:
//            ke

public static final class <init>
{

    private final Map a;
    private a b;

    public final <init> a()
    {
        return new <init>(a, b, (byte)0);
    }

    public final b a(b b1)
    {
        b = b1;
        return this;
    }

    public final b a(String s, b b1)
    {
        a.put(s, b1);
        return this;
    }

    private ()
    {
        a = new HashMap();
    }

    a(byte byte0)
    {
        this();
    }
}
