// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kik.ui.fragment;

import kik.android.util.an;

// Referenced classes of package com.kik.ui.fragment:
//            FragmentBase

public static class a extends an
{
    public static final class a extends Enum
    {

        public static final int a;
        public static final int b;
        public static final int c;
        private static final int d[];

        public static int[] a()
        {
            return (int[])d.clone();
        }

        static 
        {
            a = 1;
            b = 2;
            c = 3;
            d = (new int[] {
                a, b, c
            });
        }
    }


    public final a.c a(int i)
    {
        int j = i;
        if (i == 0)
        {
            j = a.a;
        }
        a("com.kik.ui.fragment.FragmentBundle.onWebStack", j - 1);
        return this;
    }

    public final int h()
    {
        int i = b("com.kik.ui.fragment.FragmentBundle.onWebStack", a.a - 1);
        if (i >= 0 && i < a.a().length)
        {
            return a.a()[i];
        } else
        {
            return a.a;
        }
    }

    public a()
    {
    }
}
