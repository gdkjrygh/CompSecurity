// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.cx;

import java.util.Hashtable;
import p.al.f;
import p.an.k;
import p.l.a;

// Referenced classes of package p.cx:
//            c

class Object
    implements f
{

    final int a;
    final String b;
    final c c;

    public volatile boolean a(Exception exception, Object obj, k k, boolean flag)
    {
        return a(exception, (String)obj, k, flag);
    }

    public boolean a(Exception exception, String s, k k, boolean flag)
    {
        c.a("Failed art request.", exception);
        p.cx.c.i(c).remove(Integer.valueOf(a));
        return false;
    }

    public volatile boolean a(Object obj, Object obj1, k k, boolean flag, boolean flag1)
    {
        return a((byte[])obj, (String)obj1, k, flag, flag1);
    }

    public boolean a(byte abyte0[], String s, k k, boolean flag, boolean flag1)
    {
        if (!p.cx.c.j(c).containsKey(Integer.valueOf(a)))
        {
            return false;
        } else
        {
            ((a)p.cx.c.k(c).get(Integer.valueOf(a))).a(null);
            c.d(b, abyte0.length);
            return true;
        }
    }

    String(c c1, int i, String s)
    {
        c = c1;
        a = i;
        b = s;
        super();
    }
}
