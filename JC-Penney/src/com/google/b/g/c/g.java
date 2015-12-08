// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.b.g.c;

import com.google.b.g.a.o;
import com.google.b.g.a.q;
import com.google.b.g.a.s;

// Referenced classes of package com.google.b.g.c:
//            b

public final class g
{

    private q a;
    private o b;
    private s c;
    private int d;
    private b e;

    public g()
    {
        d = -1;
    }

    public static boolean b(int i)
    {
        return i >= 0 && i < 8;
    }

    public b a()
    {
        return e;
    }

    public void a(int i)
    {
        d = i;
    }

    public void a(o o)
    {
        b = o;
    }

    public void a(q q)
    {
        a = q;
    }

    public void a(s s)
    {
        c = s;
    }

    public void a(b b1)
    {
        e = b1;
    }

    public String toString()
    {
        StringBuilder stringbuilder = new StringBuilder(200);
        stringbuilder.append("<<\n");
        stringbuilder.append(" mode: ");
        stringbuilder.append(a);
        stringbuilder.append("\n ecLevel: ");
        stringbuilder.append(b);
        stringbuilder.append("\n version: ");
        stringbuilder.append(c);
        stringbuilder.append("\n maskPattern: ");
        stringbuilder.append(d);
        if (e == null)
        {
            stringbuilder.append("\n matrix: null\n");
        } else
        {
            stringbuilder.append("\n matrix:\n");
            stringbuilder.append(e);
        }
        stringbuilder.append(">>\n");
        return stringbuilder.toString();
    }
}
