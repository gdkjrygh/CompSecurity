// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.bx;

import com.google.android.m4b.maps.y.j;

// Referenced classes of package com.google.android.m4b.maps.bx:
//            d

public static final class j
{
    public static final class a
    {

        boolean a;
        private Boolean b;
        private Integer c;
        private Integer d;
        private int e;
        private int f;

        public final a a(int k)
        {
            c = Integer.valueOf(k);
            d = Integer.valueOf(k);
            return this;
        }

        public final a a(int k, int l)
        {
            e = k;
            f = l;
            return this;
        }

        public final a a(boolean flag)
        {
            b = Boolean.valueOf(flag);
            return this;
        }

        public final d.a a()
        {
            boolean flag;
            if (d != null)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            com.google.android.m4b.maps.y.j.b(flag, "Texture ID must be specified.");
            return new d.a(b, a, c.intValue(), d.intValue(), e, f);
        }

        public a()
        {
        }
    }


    final Boolean a;
    final Boolean b = null;
    final Boolean c = null;
    public final boolean d;
    public final int e;
    public final int f;
    public final int g = 0;
    public final int h = 0;
    public final int i;
    public final int j;

    public a(Boolean boolean1, boolean flag, int k, int l, int i1, int j1)
    {
        a = boolean1;
        d = flag;
        e = k;
        f = l;
        i = i1;
        j = j1;
    }
}
