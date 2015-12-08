// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cleanmaster.sdk.cmloginsdkjar.model;


final class f
    implements java.util.Map.Entry
{

    private final String a;
    private final Object b;

    f(String s, Object obj)
    {
        a = s;
        b = obj;
    }

    public final volatile Object getKey()
    {
        return a;
    }

    public final Object getValue()
    {
        return b;
    }

    public final Object setValue(Object obj)
    {
        throw new UnsupportedOperationException("JSONObjectEntry is immutable");
    }
}
