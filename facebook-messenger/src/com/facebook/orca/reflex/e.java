// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.reflex;

import android.app.Activity;
import com.facebook.abtest.qe.d.a;
import com.facebook.base.c;
import com.facebook.orca.threadlist.FrameworkBasedThreadListActivity;
import com.facebook.prefs.shared.d;
import com.google.common.base.Preconditions;

// Referenced classes of package com.facebook.orca.reflex:
//            f, g, d

public class e
    implements c
{

    private final d a;
    private final a b;

    public e(d d1, com.facebook.abtest.qe.d.e e1)
    {
        a = d1;
        b = ((com.facebook.abtest.qe.d.e)Preconditions.checkNotNull(e1)).a("reflex_threadlistactivity", new f(this));
    }

    static d a(e e1)
    {
        return e1.a;
    }

    public void a()
    {
        b.e();
        b.a(new g(this));
    }

    public void a(Activity activity)
    {
        boolean flag1 = activity instanceof FrameworkBasedThreadListActivity;
        boolean flag;
        if (!b())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        b.c();
        if (flag1 == flag)
        {
            b.d();
        }
    }

    public boolean b()
    {
        return a.a(com.facebook.orca.reflex.d.a, false);
    }
}
