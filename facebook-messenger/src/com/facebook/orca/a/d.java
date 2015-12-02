// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.a;

import com.facebook.abtest.qe.c;
import com.facebook.abtest.qe.data.QuickExperimentInfo;
import com.facebook.common.e.h;
import com.facebook.debug.log.b;
import com.google.common.base.Objects;
import com.google.common.base.Optional;
import com.google.common.d.a.i;
import java.util.concurrent.Executor;

// Referenced classes of package com.facebook.orca.a:
//            b, a, g, e, 
//            f

public class d
{

    private static final Class a = com/facebook/orca/a/d;
    private static final com.facebook.orca.a.b b;
    private static final a c;
    private final c d;
    private final h e;
    private final Executor f;
    private a g;
    private g h;

    public d(c c1, h h1, Executor executor)
    {
        g = c;
        d = c1;
        e = h1;
        f = executor;
        h = g.UNINITIALIZED;
    }

    static h a(d d1)
    {
        return d1.e;
    }

    static g a(d d1, g g1)
    {
        d1.h = g1;
        return g1;
    }

    private void a(QuickExperimentInfo quickexperimentinfo)
    {
        if (Objects.equal("local_default_group", quickexperimentinfo.b()))
        {
            return;
        }
        Object obj = b;
        Optional optional = quickexperimentinfo.a("upsell_type");
        int j;
        if (optional.isPresent())
        {
            com.facebook.orca.a.b b1 = com.facebook.orca.a.b.lookup((String)optional.get());
            obj = b1;
            if (b1 == null)
            {
                obj = (new StringBuilder()).append("experiment info contains unexpected upsell_type: ").append((String)optional.get()).append(", using default of ").append(b).toString();
                com.facebook.debug.log.b.d(a, ((String) (obj)));
                e.a(a.getSimpleName(), ((String) (obj)));
                obj = b;
            }
            com.facebook.debug.log.b.b(a, (new StringBuilder()).append("Group name upsell type: ").append(obj).toString());
        } else
        {
            String s = (new StringBuilder()).append("experiment info does not contain upsell_type, using default of ").append(b).toString();
            com.facebook.debug.log.b.d(a, s);
            e.a(a.getSimpleName(), s);
        }
        quickexperimentinfo = quickexperimentinfo.a("num_upsells");
        if (quickexperimentinfo.isPresent())
        {
            try
            {
                j = Integer.parseInt((String)quickexperimentinfo.get());
            }
            catch (NumberFormatException numberformatexception)
            {
                quickexperimentinfo = (new StringBuilder()).append("experiment info contains unexpected num_upsells: ").append((String)quickexperimentinfo.get()).append(", using default of ").append(3).toString();
                com.facebook.debug.log.b.d(a, quickexperimentinfo);
                e.a(a.getSimpleName(), quickexperimentinfo);
                j = 3;
            }
            com.facebook.debug.log.b.b(a, (new StringBuilder()).append("Num upsells: ").append(j).toString());
        } else
        {
            com.facebook.debug.log.b.d(a, "experiment info does not contain num_upsells, using default of 3");
            e.a(a.getSimpleName(), "experiment info does not contain num_upsells, using default of 3");
            j = 3;
        }
        g = new a(((com.facebook.orca.a.b) (obj)), j);
    }

    static void a(d d1, QuickExperimentInfo quickexperimentinfo)
    {
        d1.a(quickexperimentinfo);
    }

    static Class d()
    {
        return a;
    }

    static com.facebook.orca.a.b e()
    {
        return b;
    }

    public a a()
    {
        return g;
    }

    public void b()
    {
        com.facebook.debug.log.b.b(a, "Init MessengerGroupNameUpsellInitializer");
        if (h != g.UNINITIALIZED)
        {
            return;
        } else
        {
            h = g.INITIALIZING;
            i.a(d.a("messenger_group_name_upsell", new e(this)), new f(this), f);
            return;
        }
    }

    public g c()
    {
        return h;
    }

    static 
    {
        b = b.NONE;
        c = new a(b, 3);
    }
}
