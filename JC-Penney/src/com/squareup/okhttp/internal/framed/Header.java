// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.okhttp.internal.framed;

import c.k;

public final class Header
{

    public static final k RESPONSE_STATUS = k.a(":status");
    public static final k TARGET_AUTHORITY = k.a(":authority");
    public static final k TARGET_HOST = k.a(":host");
    public static final k TARGET_METHOD = k.a(":method");
    public static final k TARGET_PATH = k.a(":path");
    public static final k TARGET_SCHEME = k.a(":scheme");
    public static final k VERSION = k.a(":version");
    final int hpackSize;
    public final k name;
    public final k value;

    public Header(k k1, k k2)
    {
        name = k1;
        value = k2;
        hpackSize = k1.f() + 32 + k2.f();
    }

    public Header(k k1, String s)
    {
        this(k1, k.a(s));
    }

    public Header(String s, String s1)
    {
        this(k.a(s), k.a(s1));
    }

    public boolean equals(Object obj)
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (obj instanceof Header)
        {
            obj = (Header)obj;
            flag = flag1;
            if (name.equals(((Header) (obj)).name))
            {
                flag = flag1;
                if (value.equals(((Header) (obj)).value))
                {
                    flag = true;
                }
            }
        }
        return flag;
    }

    public int hashCode()
    {
        return (name.hashCode() + 527) * 31 + value.hashCode();
    }

    public String toString()
    {
        return String.format("%s: %s", new Object[] {
            name.a(), value.a()
        });
    }

}
