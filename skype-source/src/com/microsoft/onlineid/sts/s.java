// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.microsoft.onlineid.sts;

import com.microsoft.onlineid.internal.k;
import java.util.HashMap;
import java.util.Map;

public final class s
{
    public static final class a extends Enum
    {

        public static final a a;
        private static final a b[];

        public static a valueOf(String s1)
        {
            return (a)Enum.valueOf(com/microsoft/onlineid/sts/s$a, s1);
        }

        public static a[] values()
        {
            return (a[])b.clone();
        }

        static 
        {
            a = new a("CID");
            b = (new a[] {
                a
            });
        }

        private a(String s1)
        {
            super(s1, 0);
        }
    }


    private final Map a = new HashMap();

    public s()
    {
    }

    public final s a(a a1, String s1)
    {
        a.put(a1, s1);
        return this;
    }

    public final String a(a a1)
    {
        return (String)a.get(a1);
    }

    public final boolean equals(Object obj)
    {
        if (this == obj)
        {
            return true;
        }
        if (obj != null && (obj instanceof s))
        {
            obj = (s)obj;
            return k.a(a, ((s) (obj)).a);
        } else
        {
            return false;
        }
    }

    public final int hashCode()
    {
        return k.a(a);
    }
}
