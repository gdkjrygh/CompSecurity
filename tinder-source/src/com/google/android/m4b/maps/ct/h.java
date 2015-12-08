// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.ct;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public final class h
{
    static final class a
    {

        private final Object a;
        private final int b;

        public final boolean equals(Object obj)
        {
            if (obj instanceof a)
            {
                if (a == ((a) (obj = (a)obj)).a && b == ((a) (obj)).b)
                {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode()
        {
            return System.identityHashCode(a) * 65535 + b;
        }

        a(Object obj, int i)
        {
            a = obj;
            b = i;
        }
    }


    private static volatile boolean b = false;
    private static final h c = new h((byte)0);
    final Map a;

    h()
    {
        a = new HashMap();
    }

    private h(byte byte0)
    {
        a = Collections.emptyMap();
    }

    public static h a()
    {
        return c;
    }

}
