// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.abtest.qe.b;

import com.facebook.abtest.qe.c.e;
import com.facebook.abtest.qe.c.f;
import com.facebook.abtest.qe.data.QuickExperimentInfo;
import com.facebook.abtest.qe.data.c;
import com.facebook.auth.f.b;
import com.facebook.common.e.h;
import com.google.common.a.ev;
import com.google.common.a.fi;
import com.google.common.a.fk;
import com.google.common.a.hy;
import com.google.common.a.ik;
import com.google.common.a.kl;
import com.google.common.base.Objects;
import com.google.common.base.Preconditions;
import com.google.common.d.a.u;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.facebook.abtest.qe.b:
//            f, b, d, c, 
//            e

public class a
    implements b
{

    private static final Class a = com/facebook/abtest/qe/b/a;
    private final Set b;
    private final Map c = ik.a();
    private final Map d = ik.a();
    private final Map e = (new hy()).f().n();
    private final Map f = ik.a();
    private final com.facebook.abtest.qe.b g;
    private final com.facebook.abtest.qe.e.a h;
    private final e i;
    private final u j;
    private final com.facebook.abtest.qe.g.a k;
    private final h l;
    private boolean m;

    public a(Set set, com.facebook.abtest.qe.b b1, com.facebook.abtest.qe.e.a a1, e e1, u u1, com.facebook.abtest.qe.g.a a2, h h1)
    {
        m = false;
        fk fk1 = new fk();
        for (set = ((Set)Preconditions.checkNotNull(set)).iterator(); set.hasNext();)
        {
            Iterator iterator = ((com.facebook.abtest.qe.f.b)set.next()).a().iterator();
            while (iterator.hasNext()) 
            {
                fk1.b(((com.facebook.abtest.qe.f.a)iterator.next()).a);
            }
        }

        b = fk1.b();
        g = (com.facebook.abtest.qe.b)Preconditions.checkNotNull(b1);
        h = (com.facebook.abtest.qe.e.a)Preconditions.checkNotNull(a1);
        i = (e)Preconditions.checkNotNull(e1);
        j = (u)Preconditions.checkNotNull(u1);
        k = (com.facebook.abtest.qe.g.a)Preconditions.checkNotNull(a2);
        l = (h)Preconditions.checkNotNull(h1);
    }

    static e a(a a1)
    {
        return a1.i;
    }

    private Set a(Set set, Set set1)
    {
        boolean flag = true;
        this;
        JVM INSTR monitorenter ;
        java.util.HashSet hashset;
        QuickExperimentInfo quickexperimentinfo;
        if (m)
        {
            flag = false;
        }
        Preconditions.checkState(flag, "QuickExperimentMemoryCache has been initialized more than once");
        m = true;
        hashset = kl.a();
        set = set.iterator();
_L1:
        do
        {
            if (!set.hasNext())
            {
                break MISSING_BLOCK_LABEL_115;
            }
            quickexperimentinfo = (QuickExperimentInfo)set.next();
            if (!b.contains(quickexperimentinfo.a()))
            {
                break MISSING_BLOCK_LABEL_103;
            }
            c.put(quickexperimentinfo.a(), quickexperimentinfo);
        } while (true);
        set;
        throw set;
        hashset.add(quickexperimentinfo);
          goto _L1
        set = set1.iterator();
_L3:
        do
        {
            if (!set.hasNext())
            {
                break MISSING_BLOCK_LABEL_186;
            }
            set1 = (QuickExperimentInfo)set.next();
            if (!b.contains(set1.a()))
            {
                break MISSING_BLOCK_LABEL_175;
            }
            d.put(set1.a(), set1);
        } while (true);
        hashset.add(set1);
        if (true) goto _L3; else goto _L2
_L2:
        this;
        JVM INSTR monitorexit ;
        return hashset;
    }

    private String d(String s)
    {
        Preconditions.checkArgument(b.contains(s), "Experiment(%s) can't be found in experiment set.", new Object[] {
            s
        });
        return s;
    }

    private void f()
    {
        this;
        JVM INSTR monitorenter ;
        for (Iterator iterator = e.keySet().iterator(); iterator.hasNext(); ((com.facebook.abtest.qe.b.f)iterator.next()).b()) { }
        break MISSING_BLOCK_LABEL_48;
        Exception exception;
        exception;
        throw exception;
        this;
        JVM INSTR monitorexit ;
    }

    public QuickExperimentInfo a(String s)
    {
        QuickExperimentInfo quickexperimentinfo1 = a(s, f.FROM_USER);
        QuickExperimentInfo quickexperimentinfo = quickexperimentinfo1;
        if (quickexperimentinfo1 == null)
        {
            quickexperimentinfo = a(s, f.FROM_SERVER);
        }
        quickexperimentinfo1 = quickexperimentinfo;
        if (g.a(s))
        {
            if (quickexperimentinfo != null)
            {
                c(s);
                j.b(new com.facebook.abtest.qe.b.b(this, s));
                h.a(quickexperimentinfo, com.facebook.abtest.qe.e.b.CLIENT_EXPIRE);
            }
            quickexperimentinfo1 = null;
        }
        quickexperimentinfo = quickexperimentinfo1;
        if (quickexperimentinfo1 == null)
        {
            quickexperimentinfo = b(s);
        }
        return quickexperimentinfo;
    }

    public QuickExperimentInfo a(String s, f f1)
    {
        this;
        JVM INSTR monitorenter ;
        d(s);
        d.a[f1.ordinal()];
        JVM INSTR tableswitch 1 2: default 107
    //                   1 72
    //                   2 90;
           goto _L1 _L2 _L3
_L1:
        throw new IllegalStateException((new StringBuilder()).append("Unknown experiment data source ").append(f1).toString());
        s;
        this;
        JVM INSTR monitorexit ;
        throw s;
_L2:
        s = (QuickExperimentInfo)c.get(s);
_L4:
        this;
        JVM INSTR monitorexit ;
        return s;
_L3:
        s = (QuickExperimentInfo)d.get(s);
          goto _L4
    }

    public void a()
    {
        try
        {
            QuickExperimentInfo quickexperimentinfo;
            for (Iterator iterator = a(i.a(f.FROM_SERVER), i.a(f.FROM_USER)).iterator(); iterator.hasNext(); i.a(quickexperimentinfo.a()))
            {
                quickexperimentinfo = (QuickExperimentInfo)iterator.next();
                h.a(quickexperimentinfo, com.facebook.abtest.qe.e.b.APP_UPGRADE);
            }

        }
        catch (Exception exception)
        {
            l.a("QuickExperimentCache", "Data in disk cache is corrupted. Delete all of them.");
            i.a();
            d();
            return;
        }
        c();
        return;
    }

    public void a(com.facebook.abtest.qe.b.f f1)
    {
        this;
        JVM INSTR monitorenter ;
        e.put(f1, Boolean.TRUE);
        this;
        JVM INSTR monitorexit ;
        return;
        f1;
        throw f1;
    }

    public void a(QuickExperimentInfo quickexperimentinfo, f f1)
    {
        this;
        JVM INSTR monitorenter ;
        d(quickexperimentinfo.a());
        d.a[f1.ordinal()];
        JVM INSTR tableswitch 1 2: default 182
    //                   1 72
    //                   2 164;
           goto _L1 _L2 _L3
_L1:
        throw new IllegalStateException((new StringBuilder()).append("Unknown experiment data source ").append(f1).toString());
        quickexperimentinfo;
        this;
        JVM INSTR monitorexit ;
        throw quickexperimentinfo;
_L2:
        f1 = (QuickExperimentInfo)c.get(quickexperimentinfo.a());
        if (f1 == null) goto _L5; else goto _L4
_L4:
        if (!f1.c()) goto _L5; else goto _L6
_L6:
        if (quickexperimentinfo.c()) goto _L8; else goto _L7
_L7:
        h.a(f1, com.facebook.abtest.qe.e.b.SERVER_EXPIRE);
_L5:
        c.put(quickexperimentinfo.a(), quickexperimentinfo);
_L10:
        this;
        JVM INSTR monitorexit ;
        return;
_L8:
        if (Objects.equal(quickexperimentinfo.b(), f1.b())) goto _L5; else goto _L9
_L9:
        h.a(f1, com.facebook.abtest.qe.e.b.CHANGE_GROUP);
          goto _L5
_L3:
        d.put(quickexperimentinfo.a(), quickexperimentinfo);
          goto _L10
    }

    public QuickExperimentInfo b(String s)
    {
        QuickExperimentInfo quickexperimentinfo;
label0:
        {
            QuickExperimentInfo quickexperimentinfo1 = (QuickExperimentInfo)f.get(s);
            if (quickexperimentinfo1 != null)
            {
                quickexperimentinfo = quickexperimentinfo1;
                if (k.a().equals(quickexperimentinfo1.e()))
                {
                    break label0;
                }
            }
            quickexperimentinfo = (new c()).a(s).b("local_default_group").a(false).d(k.a()).a(ev.j()).a();
            f.put(s, quickexperimentinfo);
        }
        return quickexperimentinfo;
    }

    public Set b()
    {
        return fi.a(b);
    }

    public void c()
    {
        this;
        JVM INSTR monitorenter ;
        for (Iterator iterator = e.keySet().iterator(); iterator.hasNext(); ((com.facebook.abtest.qe.b.f)iterator.next()).a()) { }
        break MISSING_BLOCK_LABEL_48;
        Exception exception;
        exception;
        throw exception;
        this;
        JVM INSTR monitorexit ;
    }

    public void c(String s)
    {
        this;
        JVM INSTR monitorenter ;
        c.remove(s);
        d.remove(s);
        this;
        JVM INSTR monitorexit ;
        return;
        s;
        throw s;
    }

    public void d()
    {
        this;
        JVM INSTR monitorenter ;
        QuickExperimentInfo quickexperimentinfo;
        for (Iterator iterator = c.values().iterator(); iterator.hasNext(); h.a(quickexperimentinfo, com.facebook.abtest.qe.e.b.USER_LOGOUT))
        {
            quickexperimentinfo = (QuickExperimentInfo)iterator.next();
        }

        break MISSING_BLOCK_LABEL_55;
        Exception exception;
        exception;
        throw exception;
        c.clear();
        d.clear();
        f();
        this;
        JVM INSTR monitorexit ;
    }

    public com.facebook.abtest.qe.b.e e()
    {
        return new com.facebook.abtest.qe.b.c(this);
    }

}
