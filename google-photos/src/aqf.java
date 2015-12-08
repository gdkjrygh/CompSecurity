// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.util.Log;
import java.util.Collections;
import java.util.List;

final class aqf
    implements ano, aom, aon
{

    private final aoo a;
    private final aon b;
    private int c;
    private aok d;
    private Object e;
    private volatile atn f;
    private aol g;

    public aqf(aoo aoo1, aon aon1)
    {
        a = aoo1;
        b = aon1;
    }

    public final void a(ane ane, Exception exception, ann ann1, amz amz)
    {
        b.a(ane, exception, ann1, f.c.c());
    }

    public final void a(ane ane, Object obj, ann ann1, amz amz, ane ane1)
    {
        b.a(ane, obj, ann1, f.c.c(), ane);
    }

    public final void a(Exception exception)
    {
        b.a(g, exception, f.c, f.c.c());
    }

    public final void a(Object obj)
    {
        apa apa1 = a.p;
        if (obj != null && apa1.a(f.c.c()))
        {
            e = obj;
            b.c();
            return;
        } else
        {
            b.a(f.a, obj, f.c, f.c.c(), g);
            return;
        }
    }

    public final boolean a()
    {
        Object obj1;
        long l;
        if (e == null)
        {
            break MISSING_BLOCK_LABEL_275;
        }
        obj1 = e;
        e = null;
        l = bac.a();
        Object obj = a.c.b.b.a(obj1.getClass());
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_294;
        }
        arf arf1 = new arf(((anc) (obj)), obj1, a.i);
        g = new aol(f.a, a.n);
        a.a().a(g, arf1);
        if (Log.isLoggable("SourceGenerator", 2))
        {
            String s = String.valueOf("Finished encoding source to cache, key: ");
            String s1 = String.valueOf(g);
            obj1 = String.valueOf(obj1);
            obj = String.valueOf(obj);
            double d1 = bac.a(l);
            (new StringBuilder(String.valueOf(s).length() + 55 + String.valueOf(s1).length() + String.valueOf(obj1).length() + String.valueOf(obj).length())).append(s).append(s1).append(", data: ").append(((String) (obj1))).append(", encoder: ").append(((String) (obj))).append(", duration: ").append(d1);
        }
        f.c.a();
        d = new aok(Collections.singletonList(f.a), a, this);
        if (d != null && d.a())
        {
            return true;
        }
        break MISSING_BLOCK_LABEL_322;
        throw new amd(obj1.getClass());
        Exception exception;
        exception;
        f.c.a();
        throw exception;
        d = null;
        f = null;
        boolean flag = false;
        do
        {
            if (flag)
            {
                break;
            }
            List list;
            int i;
            if (c < a.b().size())
            {
                i = 1;
            } else
            {
                i = 0;
            }
            if (i == 0)
            {
                break;
            }
            list = a.b();
            i = c;
            c = i + 1;
            f = (atn)list.get(i);
            if (f != null && (a.p.a(f.c.c()) || a.a(f.c.d())))
            {
                f.c.a(a.o, this);
                flag = true;
            }
        } while (true);
        return flag;
    }

    public final void b()
    {
        atn atn1 = f;
        if (atn1 != null)
        {
            atn1.c.b();
        }
    }

    public final void c()
    {
        throw new UnsupportedOperationException();
    }
}
