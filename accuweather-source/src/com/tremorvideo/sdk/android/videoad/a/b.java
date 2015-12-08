// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tremorvideo.sdk.android.videoad.a;

import java.util.Comparator;

// Referenced classes of package com.tremorvideo.sdk.android.videoad.a:
//            a

class b
    implements Comparator
{

    final int a;
    final int b;
    final a c;

    b(a a1, int i, int j)
    {
        c = a1;
        a = i;
        b = j;
        super();
    }

    public int a(a.c c1, a.c c2)
    {
        int i1 = a;
        int j1 = c1.a;
        int k1 = b;
        int l1 = c1.b;
        int i = a;
        int j = c2.a;
        int k = b;
        int l = c2.b;
        i1 = Math.max(Math.abs(i1 - j1), Math.abs(k1 - l1));
        i = Math.max(Math.abs(i - j), Math.abs(k - l));
        if (i1 == i)
        {
            return c2.e - c1.e;
        } else
        {
            return i1 - i;
        }
    }

    public int compare(Object obj, Object obj1)
    {
        return a((a.c)obj, (a.c)obj1);
    }
}
