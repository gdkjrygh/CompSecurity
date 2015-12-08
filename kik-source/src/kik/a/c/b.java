// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.a.c;

import java.io.File;
import kik.a.d.a.a;
import kik.a.d.o;
import kik.a.e.n;
import kik.a.e.v;

public final class b
    implements n
{

    private final v a;

    public b(v v1)
    {
        a = v1;
    }

    public final Object a(String s, boolean flag)
    {
        return a.a(s, flag);
    }

    public final void a(String s)
    {
        a.s(s);
    }

    public final void a(String s, int i)
    {
        a.b(s, i);
    }

    public final boolean a(File file)
    {
        return a.a(file);
    }

    public final boolean a(String s, Object obj, String s1)
    {
        return a.a(s, obj, s1);
    }

    public final boolean b(String s)
    {
        return a.v(s);
    }

    public final int[] c(String s)
    {
        return a.w(s);
    }

    public final boolean d(String s)
    {
        return a.r(s).a("png-preview") != null;
    }

    public final byte[] e(String s)
    {
        s = a.r(s);
        if (s.a("png-preview") == null)
        {
            s = s.a("preview");
        } else
        {
            s = s.a("png-preview");
        }
        if (s != null)
        {
            return s.c();
        } else
        {
            return null;
        }
    }
}
