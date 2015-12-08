// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.gsa.shared.b;

import com.google.android.apps.gsa.shared.exception.a;
import com.google.android.apps.gsa.shared.util.common.L;
import com.google.common.b.a.c;
import com.google.common.b.aa;
import com.google.common.b.ae;
import com.google.common.b.av;
import com.google.common.b.q;
import com.google.common.b.z;
import com.google.common.base.p;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.google.android.apps.gsa.shared.b:
//            h, o

public class f
{

    private String a;
    public final a b;
    public int c;
    public c d;
    public Throwable e;
    private o f;
    private String g;

    public f(a a1)
    {
        c = 0;
        b = (a)p.a(a1);
    }

    private static void a(a a1, o o1, int i, String s, c c1, Throwable throwable)
    {
        Throwable throwable1;
        for (throwable1 = a1.asException().getCause(); throwable1 != null && !(throwable1 instanceof a); throwable1 = throwable1.getCause()) { }
        if (throwable1 != null)
        {
            a((a)throwable1, o1, 0, null, null, null);
        }
        o1 = com.google.android.apps.gsa.shared.b.h.a(a1.getErrorType(), o1);
        if (s != null)
        {
            if (s == null)
            {
                throw new NullPointerException();
            }
            o1.E = s;
            o1.b = ((ae) (o1)).b | 0x400;
        }
        s = new z();
        s.b = a1.getErrorCode();
        s.a = ((z) (s)).a | 1;
        if (throwable != null)
        {
            s.c = a(throwable);
        }
        o1.z = s;
        if (i != 0)
        {
            a1 = new q();
            a1.b = i;
            a1.a = ((q) (a1)).a | 1;
            o1.j = a1;
        }
        if (c1 != null)
        {
            o1.N = c1;
        }
        com.google.android.apps.gsa.shared.b.h.a(o1);
    }

    private static aa[] a(Throwable throwable)
    {
        ArrayList arraylist = new ArrayList();
        for (; throwable != null; throwable = throwable.getCause())
        {
            aa aa1 = new aa();
            StackTraceElement astacktraceelement[] = throwable.getStackTrace();
            aa1.c = new av[astacktraceelement.length];
            for (int i = 0; i < astacktraceelement.length; i++)
            {
                aa1.c[i] = new av();
                Object obj = aa1.c[i];
                String s1 = astacktraceelement[i].getClassName();
                if (s1 == null)
                {
                    throw new NullPointerException();
                }
                obj.b = s1;
                obj.a = ((av) (obj)).a | 1;
                obj = astacktraceelement[i].getFileName();
                if (obj != null)
                {
                    av av1 = aa1.c[i];
                    if (obj == null)
                    {
                        throw new NullPointerException();
                    }
                    av1.d = ((String) (obj));
                    av1.a = av1.a | 4;
                }
                obj = astacktraceelement[i].getMethodName();
                if (obj != null)
                {
                    av av2 = aa1.c[i];
                    if (obj == null)
                    {
                        throw new NullPointerException();
                    }
                    av2.c = ((String) (obj));
                    av2.a = av2.a | 2;
                }
                obj = aa1.c[i];
                obj.e = astacktraceelement[i].getLineNumber();
                obj.a = ((av) (obj)).a | 8;
            }

            String s = throwable.getClass().getCanonicalName();
            if (s != null)
            {
                if (s == null)
                {
                    throw new NullPointerException();
                }
                aa1.b = s;
                aa1.a = aa1.a | 1;
            }
            arraylist.add(aa1);
        }

        return (aa[])arraylist.toArray(new aa[arraylist.size()]);
    }

    public void a()
    {
        b();
        c();
    }

    protected final void b()
    {
        String s;
        if (a != null)
        {
            s = a;
        } else
        {
            s = b.asException().getMessage();
        }
        L.a(5, "ErrorReporter", "reportError [type: %s, code: %s]: %s", new Object[] {
            Integer.valueOf(b.getErrorType()), Integer.valueOf(b.getErrorCode()), s
        });
    }

    protected final void c()
    {
        if (f == null)
        {
            com.google.android.apps.gsa.shared.b.a.a a1 = (com.google.android.apps.gsa.shared.b.a.a)com.google.android.apps.gsa.shared.b.a.a.a.get();
            if (a1 != null)
            {
                f = new o(a1.b);
            }
        }
        a(b, f, c, g, d, e);
    }
}
