// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cm.kinfoc;

import java.util.ArrayList;

// Referenced classes of package com.cm.kinfoc:
//            l

public final class i
    implements Cloneable
{

    private byte a[];
    private String b;
    private String c;
    private boolean d;
    private long e;
    private int f;
    private l g;
    private ArrayList h;

    public i()
    {
        a = null;
        b = null;
        c = null;
        d = false;
        f = -1;
        h = null;
    }

    public final void a(int j)
    {
        f = j;
    }

    public final void a(long l)
    {
        e = l;
    }

    public final void a(String s)
    {
        c = s;
    }

    public final void a(byte abyte0[])
    {
        a = abyte0;
    }

    public final byte[] a()
    {
        return a;
    }

    public final String b()
    {
        return c;
    }

    public final boolean c()
    {
        return d;
    }

    public final Object clone()
    {
        i j;
        try
        {
            j = (i)super.clone();
        }
        catch (CloneNotSupportedException clonenotsupportedexception)
        {
            clonenotsupportedexception.printStackTrace();
            return null;
        }
        return j;
    }

    public final void d()
    {
        d = true;
    }

    public final long e()
    {
        return e;
    }

    public final String f()
    {
        return b;
    }

    public final int g()
    {
        return f;
    }

    public final void h()
    {
        g = null;
    }

    public final ArrayList i()
    {
        return h;
    }

    public final String toString()
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append(" KHttpData : \n");
        stringbuilder.append("  * tname  : ").append(c).append("\n");
        stringbuilder.append("  * ctime  : ").append(e).append("\n");
        stringbuilder.append("  * sproi  : ").append(f).append("\n");
        stringbuilder.append("  * force  : ").append(d).append("\n");
        StringBuilder stringbuilder1 = stringbuilder.append("  * dsize  : ");
        int j;
        if (a == null)
        {
            j = 0;
        } else
        {
            j = a.length;
        }
        stringbuilder1.append(j).append("\n");
        stringbuilder.append("  * -----  : ").append(b).append("\n");
        return super.toString();
    }
}
