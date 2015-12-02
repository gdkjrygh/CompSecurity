// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.engine.cloudscan.a;

import java.util.Vector;

// Referenced classes of package com.qihoo.security.engine.cloudscan.a:
//            f, i, j

public static class <init>
{

    private Vector a;
    private boolean b;
    private Vector c;
    private boolean d;

    static Vector a(<init> <init>1)
    {
        return <init>1.a;
    }

    static Vector b(a a1)
    {
        return a1.c;
    }

    public c a(i i)
    {
        if (!b)
        {
            b = true;
        }
        a.addElement(i);
        return this;
    }

    public a a(j j)
    {
        if (!d)
        {
            d = true;
        }
        c.addElement(j);
        return this;
    }

    public f a()
    {
        return new f(this, null);
    }

    private ()
    {
        a = new Vector();
        b = false;
        c = new Vector();
        d = false;
    }

    d(d d1)
    {
        this();
    }
}
