// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import org.chromium.net.UrlRequestContext;
import org.chromium.net.UrlRequestContextConfig;

public final class cun extends bmb
    implements cve
{

    private static final cvf a = (cvf)ddz.a(cvf);
    private final cut b = new cut(this);
    private final cup e = new cup(this);
    private final BlockingQueue f = new LinkedBlockingQueue(36);
    private final Context g;
    private Uri h;
    private jif i;
    private jig j;
    private chy k;
    private ExecutorService l;
    private final noj m;
    private final cag n;
    private final dfk o;
    private cvf p;
    private cuc q;
    private final mti r = new cuo(this);

    public cun(bmb bmb1, Context context, noj noj1, cag cag1, dfk dfk1)
    {
        super(bmb1);
        p = a;
        g = (Context)b.a(context, "context", null);
        m = (noj)b.a(noj1, "movieMakerProvider", null);
        n = (cag)b.a(cag1, "backgroundTaskManager", null);
        o = (dfk)b.a(dfk1, "namedExecutorFactory", null);
    }

    static jif a(cun cun1)
    {
        return cun1.i;
    }

    static void a(cun cun1, mue mue1)
    {
        cun1.i = b.o(3);
        cun1.i.a(cun1.e);
        Object obj = new otl(UrlRequestContext.a(cun1.g.getApplicationContext(), (UrlRequestContextConfig)olm.a(cun1.g, org/chromium/net/UrlRequestContextConfig)), cun1.l, null, null, 8000, 8000, cun1.f);
        String s;
        Object obj1;
        for (mue1 = ((Map)mue1.a().getSerializable("authentication_headers")).entrySet().iterator(); mue1.hasNext(); ((otl) (obj)).a.put(s, obj1))
        {
            obj1 = (java.util.Map.Entry)mue1.next();
            s = (String)((java.util.Map.Entry) (obj1)).getKey();
            obj1 = (String)((java.util.Map.Entry) (obj1)).getValue();
        }

        mue1 = new jmt(cun1.g, null, ((jmr) (obj)));
        mue1 = new jkg(cun1.h, mue1, 0xa00000, new jkd[] {
            new jlf()
        });
        cun1.j = new jjc(cun1.g, mue1, 1, 100L);
        mue1 = new jin(mue1);
        obj = new cur(cun1);
        cun1.i.a(new jig[] {
            cun1.j, mue1, obj
        });
        mue1 = cun1.b;
        if (((cut) (mue1)).a != null)
        {
            mue1.a(((cut) (mue1)).a);
        }
        if (cun1.q != null)
        {
            cun1.a(cun1.q.b);
            if (!cun1.q.b())
            {
                boolean flag;
                if (cun1.q.a == cud.c)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                if (!flag)
                {
                    cun1.i.a(true);
                }
            }
            cun1.q = null;
        }
    }

    static jig b(cun cun1)
    {
        return cun1.j;
    }

    static cvf c(cun cun1)
    {
        return cun1.p;
    }

    static bww d(cun cun1)
    {
        return cun1.c;
    }

    private void g()
    {
label0:
        {
            if (i == null && h != null && !Uri.EMPTY.equals(h))
            {
                cag cag1 = n;
                String s = cuq.a;
                if (!cag1.a.a(s))
                {
                    break label0;
                }
            }
            return;
        }
        n.a(new cuq(g, m));
    }

    private void h()
    {
        if (i == null)
        {
            return;
        } else
        {
            i.b(e);
            i.c();
            i.b(j, 1, null);
            i.d();
            i = null;
            j = null;
            return;
        }
    }

    public final void C_()
    {
        c();
        n.b(r);
        super.C_();
    }

    public final void T_()
    {
        c.a(i, "player", null);
        i.a(true);
    }

    public final boolean U_()
    {
        return i != null && i.b() && i.a() != 5 && i.a() != 1;
    }

    public final void a()
    {
        boolean flag = d();
        h();
        if (k != null)
        {
            k.b(b);
            k.a();
            k = null;
        }
        if (flag)
        {
            p.a(0, false);
        }
        if (l != null)
        {
            l.shutdownNow();
        }
    }

    public final void a(long l1)
    {
        c.a(i, "player", null);
        long l2 = TimeUnit.MICROSECONDS.toMillis(l1);
        if (l2 != i.f())
        {
            i.a(l2);
            p.a(l1);
        }
    }

    public final void a(cqf cqf)
    {
    }

    public final void a(cqf cqf, cuc cuc1, chp chp1)
    {
        b.a(cuc1, "playbackInstruction", null);
        b.a(chp1, "renderSink", null);
        boolean flag;
        if (!d())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        c.a(flag, "PreviewStoryboardPlayer already started.");
        l = o.a(cun, "cronet executorService");
        cqf = c.b.ad;
        if (h == null || !h.equals(cqf))
        {
            h = cqf;
            if (i != null)
            {
                h();
                g();
            }
        }
        k = chp1;
        chp1.a(b);
        g();
        q = cuc1;
    }

    public final void a(cvf cvf1)
    {
        if (cvf1 == null)
        {
            p = a;
            return;
        } else
        {
            p = cvf1;
            return;
        }
    }

    public final void a(k k1)
    {
    }

    public final void b()
    {
        c.a(i, "player", null);
        i.a(false);
    }

    public final boolean d()
    {
        return i != null;
    }

    public final void e()
    {
        super.e();
        n.a(r);
    }

    public final void f()
    {
    }

}
