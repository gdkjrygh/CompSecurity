// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.engine.cloudscan.a;

import java.util.Vector;

// Referenced classes of package com.qihoo.security.engine.cloudscan.a:
//            i, j

public static class <init>
{

    private String a;
    private boolean b;
    private Vector c;
    private boolean d;

    static boolean a(<init> <init>1)
    {
        return <init>1.b;
    }

    static String b(b b1)
    {
        return b1.a;
    }

    static Vector c(a a1)
    {
        return a1.c;
    }

    public c a(j j)
    {
        if (!d)
        {
            d = true;
        }
        c.addElement(j);
        return this;
    }

    public c a(String s)
    {
        a = s;
        b = true;
        return this;
    }

    public i a()
    {
        return new i(this, null);
    }

    private ()
    {
        b = false;
        c = new Vector();
        d = false;
    }

    d(d d1)
    {
        this();
    }
}
