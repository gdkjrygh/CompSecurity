// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Bundle;
import android.util.Log;
import android.util.TimingLogger;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class bsm extends bmb
    implements az, bru
{

    private static final String a = bsm.getSimpleName();
    private static final String b = String.valueOf(bsm.getName()).concat(":runtime_tag");
    private static final String e = String.valueOf(bsm.getName()).concat(":expected_tag");
    private static final String f = String.valueOf(bsm.getName()).concat(":task_index");
    private final mti g = new bsn(this);
    private final bsq h = new bso(this);
    private final String i;
    private final cag j;
    private final List k;
    private final List l = new ArrayList();
    private final k m;
    private final TimingLogger n;
    private String o;
    private String p;
    private int q;

    bsm(bmb bmb1, String s, Bundle bundle, cag cag1, List list, k k1)
    {
        super(bmb1);
        n = new TimingLogger(a, "");
        i = (String)b.a(s, "name", null);
        j = (cag)b.a(cag1, "taskManager", null);
        k = (List)b.a(list, "steps", null);
        m = k1;
        if (bundle != null)
        {
            bmb1 = b;
            o = bundle.getString((new StringBuilder(String.valueOf(bmb1).length() + 1 + String.valueOf(s).length())).append(bmb1).append("|").append(s).toString());
            bmb1 = e;
            p = bundle.getString((new StringBuilder(String.valueOf(bmb1).length() + 1 + String.valueOf(s).length())).append(bmb1).append("|").append(s).toString());
            bmb1 = f;
            q = bundle.getInt((new StringBuilder(String.valueOf(bmb1).length() + 1 + String.valueOf(s).length())).append(bmb1).append("|").append(s).toString(), -1);
        } else
        {
            o = null;
            p = null;
            q = -1;
        }
        bmb1 = list.iterator();
        do
        {
            if (!bmb1.hasNext())
            {
                break;
            }
            s = (az)bmb1.next();
            if (s instanceof bsm)
            {
                ((bsm)s).a(h);
            }
        } while (true);
    }

    private void a(boolean flag)
    {
        for (Iterator iterator = l.iterator(); iterator.hasNext(); ((bsq)iterator.next()).a(i, flag)) { }
        if (!l.isEmpty())
        {
            n.addSplit("finish callbacks");
        }
        n.dumpToLog();
    }

    private void b(String s)
    {
        n.reset(a, s);
        for (Iterator iterator = l.iterator(); iterator.hasNext(); ((bsq)iterator.next()).a()) { }
        if (!l.isEmpty())
        {
            n.addSplit("start callbacks");
        }
        o = s;
        p = null;
        g();
    }

    private void c(String s)
    {
        String s1 = i;
        (new StringBuilder(String.valueOf(s1).length() + 5 + String.valueOf(s).length())).append("((").append(s1).append(")) ").append(s);
    }

    private void g()
    {
        while (q < k.size()) 
        {
            Object obj = (az)k.get(q);
            q = q + 1;
            if (obj instanceof bsm)
            {
                bsm bsm1 = (bsm)obj;
                boolean flag;
                if (bsm1.m == null || bsm1.m.a())
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                if (flag)
                {
                    p = bsm1.i;
                    obj = String.valueOf(p);
                    if (((String) (obj)).length() != 0)
                    {
                        obj = "start subflow:".concat(((String) (obj)));
                    } else
                    {
                        obj = new String("start subflow:");
                    }
                    c(((String) (obj)));
                    bsm1.a(o);
                    return;
                }
                obj = String.valueOf(((az) (obj)).d());
                if (((String) (obj)).length() != 0)
                {
                    obj = "skip subflow:".concat(((String) (obj)));
                } else
                {
                    obj = new String("skip subflow:");
                }
                c(((String) (obj)));
            } else
            {
                mtf mtf1 = ((bsr)obj).a(o);
                if (mtf1 != null)
                {
                    p = mtf1.d;
                    c(String.valueOf(p).concat(" start task"));
                    j.a(mtf1);
                    return;
                }
                obj = String.valueOf(((az) (obj)).d());
                if (((String) (obj)).length() != 0)
                {
                    obj = "skip task:".concat(((String) (obj)));
                } else
                {
                    obj = new String("skip task:");
                }
                c(((String) (obj)));
            }
        }
        c("finished");
        o = null;
        p = null;
        q = -1;
        a(false);
    }

    public final void C_()
    {
        j.b(g);
        super.C_();
    }

    final bsm a(bsq bsq1)
    {
        l.add(bsq1);
        return this;
    }

    public final void a(Bundle bundle)
    {
        String s = b;
        String s1 = i;
        bundle.putString((new StringBuilder(String.valueOf(s).length() + 1 + String.valueOf(s1).length())).append(s).append("|").append(s1).toString(), o);
        s = e;
        s1 = i;
        bundle.putString((new StringBuilder(String.valueOf(s).length() + 1 + String.valueOf(s1).length())).append(s).append("|").append(s1).toString(), p);
        s = f;
        s1 = i;
        bundle.putInt((new StringBuilder(String.valueOf(s).length() + 1 + String.valueOf(s1).length())).append(s).append("|").append(s1).toString(), q);
    }

    public final void a(String s)
    {
        if (q != -1)
        {
            s = i;
            throw new IllegalStateException((new StringBuilder(String.valueOf(s).length() + 36)).append("starting flow [").append(s).append("] while still running").toString());
        } else
        {
            c("start");
            q = 0;
            b(s);
            return;
        }
    }

    final void a(String s, mue mue)
    {
        if (q == -1)
        {
            return;
        }
        if (!p.equals(s))
        {
            mue = a;
            String s1 = i;
            String s3 = p;
            Log.w(mue, (new StringBuilder(String.valueOf(s1).length() + 24 + String.valueOf(s3).length() + String.valueOf(s).length())).append("flow [").append(s1).append("] expected:").append(s3).append(" found:").append(s).toString());
            return;
        }
        c.a(q, "nextStepIndex", 1, k.size());
        az az1 = (az)k.get(q - 1);
        String s2 = String.valueOf(p);
        if (s2.length() != 0)
        {
            s2 = "finished step:".concat(s2);
        } else
        {
            s2 = new String("finished step:");
        }
        c(s2);
        n.addSplit(p);
        if ((az1 instanceof bsr) && !((bsr)az1).a(s, mue))
        {
            s = String.valueOf(p);
            if (s.length() != 0)
            {
                s = "abort flow after task:".concat(s);
            } else
            {
                s = new String("abort flow after task:");
            }
            c(s);
            o = null;
            p = null;
            q = -1;
            a(true);
            return;
        } else
        {
            g();
            return;
        }
    }

    public final void b()
    {
        if (p == null)
        {
            return;
        }
        c.a(q, "nextStepIndex", 1, k.size());
        az az1 = (az)k.get(q - 1);
        if (az1 instanceof bsm)
        {
            ((bsm)az1).b();
        } else
        {
            cag cag1 = j;
            String s = p;
            cag1.a.b(s);
        }
        o = null;
        p = null;
        q = -1;
        a(true);
    }

    public final String d()
    {
        return i;
    }

    public final void e()
    {
        super.e();
        j.a(g);
    }

    public final boolean f()
    {
        return p != null;
    }

}
