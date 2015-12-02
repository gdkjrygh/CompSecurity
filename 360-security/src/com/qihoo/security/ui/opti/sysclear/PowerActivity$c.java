// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.ui.opti.sysclear;


// Referenced classes of package com.qihoo.security.ui.opti.sysclear:
//            PowerActivity

static class c
    implements Comparable
{

    final String a;
    CharSequence b;
    boolean c;
    int d;
    boolean e;
    boolean f;
    boolean g;
    boolean h;
    public int i[];
    public int j;

    public int a(c c1)
    {
        if (c1 != null)
        {
            if (j < c1.j)
            {
                return 1;
            }
            if (j <= c1.j)
            {
                return 0;
            }
        }
        return -1;
    }

    void a(int k)
    {
        d = k;
    }

    public int compareTo(Object obj)
    {
        return a((a)obj);
    }

    _cls9(String s, String s1, int k, boolean flag, boolean flag1, boolean flag2, int ai[], 
            int l)
    {
        b = null;
        c = false;
        d = 0;
        e = false;
        f = false;
        g = false;
        h = false;
        j = 0;
        a = s;
        d = k;
        c = true;
        e = flag;
        g = flag1;
        b = s1;
        h = flag2;
        i = ai;
        j = l;
        if (flag2)
        {
            c = false;
        }
    }
}
