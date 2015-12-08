// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.aa;

import com.google.android.m4b.maps.y.h;

public class w
{
    static final class a extends Enum
        implements av.c
    {

        public static final a a;
        private static final a b[];

        public static a valueOf(String s)
        {
            return (a)Enum.valueOf(com/google/android/m4b/maps/aa/w$a, s);
        }

        public static a[] values()
        {
            return (a[])b.clone();
        }

        static 
        {
            a = new a("INSTANCE");
            b = (new a[] {
                a
            });
        }

        private a(String s)
        {
            super(s, 0);
        }
    }


    av.c k;

    w()
    {
    }

    final av.c e()
    {
        return (av.c)h.b(k, a.a);
    }
}
