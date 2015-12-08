// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.amazon.device.iap.internal.model;


public final class a extends Enum
{

    public static final a a;
    public static final a b;
    private static final a c[];

    private a(String s, int i)
    {
        super(s, i);
    }

    static 
    {
        a = new a("DELIVERED", 0);
        b = new a("DELIVERY_ATTEMPTED", 1);
        c = (new a[] {
            a, b
        });
    }
}
