// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.systrace;


final class alBuilder extends ThreadLocal
{

    private static alBuilder a()
    {
        return new alBuilder((byte)0);
    }

    protected final Object initialValue()
    {
        return a();
    }

    alBuilder()
    {
    }
}
