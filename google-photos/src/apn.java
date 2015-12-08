// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class apn
    implements aor, bao
{

    private static final apo m = new apo();
    private static final Handler n = new Handler(Looper.getMainLooper(), new app());
    public final List a;
    public final baq b;
    public final apq c;
    public final arw d;
    public final arw e;
    public ane f;
    public boolean g;
    public boolean h;
    public boolean i;
    public List j;
    public aop k;
    public volatile boolean l;
    private final jw o;
    private final apo p;
    private aqa q;
    private amz r;
    private apv s;
    private apt t;

    apn(arw arw1, arw arw2, apq apq1, jw jw1)
    {
        this(arw1, arw2, apq1, jw1, m);
    }

    private apn(arw arw1, arw arw2, apq apq1, jw jw1, apo apo1)
    {
        a = new ArrayList(2);
        b = baq.a();
        d = arw1;
        e = arw2;
        c = apq1;
        o = jw1;
        p = apo1;
    }

    static void a(apn apn1)
    {
        apn1.b.b();
        if (apn1.l)
        {
            apn1.q.d();
            apn1.a(false);
            return;
        }
        if (apn1.a.isEmpty())
        {
            throw new IllegalStateException("Received a resource without any callbacks to notify");
        }
        if (apn1.h)
        {
            throw new IllegalStateException("Already have resource");
        }
        apn1.t = new apt(apn1.q, apn1.g);
        apn1.h = true;
        apn1.t.e();
        apn1.c.a(apn1.f, apn1.t);
        Iterator iterator = apn1.a.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            ayu ayu1 = (ayu)iterator.next();
            if (!apn1.b(ayu1))
            {
                apn1.t.e();
                ayu1.a(apn1.t, apn1.r);
            }
        } while (true);
        apn1.t.f();
        apn1.a(false);
    }

    static void b(apn apn1)
    {
        apn1.b.b();
        if (!apn1.l)
        {
            if (apn1.a.isEmpty())
            {
                throw new IllegalStateException("Received an exception without any callbacks to notify");
            }
            if (apn1.i)
            {
                throw new IllegalStateException("Already failed once");
            }
            apn1.i = true;
            apn1.c.a(apn1.f, null);
            Iterator iterator = apn1.a.iterator();
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                ayu ayu1 = (ayu)iterator.next();
                if (!apn1.b(ayu1))
                {
                    ayu1.a(apn1.s);
                }
            } while (true);
        }
        apn1.a(false);
    }

    private boolean b(ayu ayu1)
    {
        return j != null && j.contains(ayu1);
    }

    static void c(apn apn1)
    {
        apn1.b.b();
        if (!apn1.l)
        {
            throw new IllegalStateException("Not cancelled");
        } else
        {
            apn1.c.a(apn1, apn1.f);
            apn1.a(false);
            return;
        }
    }

    public final void a(aop aop1)
    {
        if (l)
        {
            n.obtainMessage(3, this).sendToTarget();
            return;
        } else
        {
            e.execute(aop1);
            return;
        }
    }

    public final void a(apv apv)
    {
        s = apv;
        n.obtainMessage(2, this).sendToTarget();
    }

    public final void a(aqa aqa1, amz amz)
    {
        q = aqa1;
        r = amz;
        n.obtainMessage(1, this).sendToTarget();
    }

    public final void a(ayu ayu1)
    {
        bag.a();
        b.b();
        if (h)
        {
            ayu1.a(t, r);
            return;
        }
        if (i)
        {
            ayu1.a(s);
            return;
        } else
        {
            a.add(ayu1);
            return;
        }
    }

    public void a(boolean flag)
    {
        bag.a();
        a.clear();
        f = null;
        t = null;
        q = null;
        if (j != null)
        {
            j.clear();
        }
        i = false;
        l = false;
        h = false;
        aop aop1 = k;
        if (aop1.c.a(flag))
        {
            aop1.a();
        }
        k = null;
        s = null;
        r = null;
        o.a(this);
    }

    public final baq q_()
    {
        return b;
    }

}
