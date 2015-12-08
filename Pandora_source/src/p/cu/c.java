// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.cu;

import p.bd.e;

public class c
    implements Comparable
{

    private e a;
    private p.cv.c b;
    private boolean c;

    public c(e e, p.cv.c c1)
    {
        this(e, c1, false);
    }

    public c(e e, p.cv.c c1, boolean flag)
    {
        a = null;
        b = null;
        c = false;
        a = e;
        b = c1;
        c = flag;
    }

    public int a(c c1)
    {
        if (c1 != null)
        {
            if (c1.c() == c())
            {
                return 0;
            }
            if (c1.c() && !c())
            {
                return -1;
            }
            if (c1.c() || !c())
            {
                return 0;
            }
        }
        return 1;
    }

    public e a()
    {
        return a;
    }

    public p.cv.c b()
    {
        return b;
    }

    public boolean c()
    {
        return c;
    }

    public int compareTo(Object obj)
    {
        return a((c)obj);
    }
}
