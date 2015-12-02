// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.base.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.app.q;
import com.facebook.common.e.h;
import com.facebook.common.w.c;
import com.facebook.debug.log.b;
import com.facebook.inject.t;

// Referenced classes of package com.facebook.base.fragment:
//            FbFragment, b, a, e, 
//            c

public class AbstractNavigableFragment extends FbFragment
    implements com.facebook.base.fragment.b
{

    private static final Class a = com/facebook/base/fragment/AbstractNavigableFragment;
    protected com.facebook.base.fragment.c b;
    private Intent c;
    private String d;
    private h e;
    private boolean f;

    public AbstractNavigableFragment()
    {
        f = false;
    }

    static Intent a(AbstractNavigableFragment abstractnavigablefragment)
    {
        return abstractnavigablefragment.c;
    }

    static Intent a(AbstractNavigableFragment abstractnavigablefragment, Intent intent)
    {
        abstractnavigablefragment.c = intent;
        return intent;
    }

    public boolean R()
    {
        return f;
    }

    public void a(Bundle bundle)
    {
        super.a(bundle);
        d = com.facebook.common.w.c.a(new Throwable());
        e = (h)S().a(com/facebook/common/e/h);
    }

    public void a(com.facebook.base.fragment.c c1)
    {
        b = c1;
        if (c1 != null && c != null)
        {
            String s = (new StringBuilder()).append(getClass().getName()).append(": Saved intent found: ").append(c).toString();
            com.facebook.debug.log.b.e(a, s, new Throwable());
            e.a("FRAGMENT_NAVIGATION", s);
            (new Handler()).post(new a(this, c1));
        }
    }

    protected void a(Class class1)
    {
        d((new e(class1)).c());
    }

    protected boolean b()
    {
        q q1 = p();
        if (q1.f() == 0)
        {
            return false;
        } else
        {
            q1.d();
            return true;
        }
    }

    protected void d(Intent intent)
    {
        if (R())
        {
            String s = (new StringBuilder()).append(getClass().getName()).append(": Fragment already finished").toString();
            intent = s;
            if (c != null)
            {
                intent = (new StringBuilder()).append(s).append(" with saved intent: ").append(c).toString();
            }
            com.facebook.debug.log.b.e(a, intent);
            e.a("FRAGMENT_NAVIGATION", intent);
            return;
        }
        if (b == null)
        {
            String s1 = (new StringBuilder()).append(getClass().getName()).append(": No navigation listener set; saving intent.").append("  Created at:\n").append(d).toString();
            com.facebook.debug.log.b.e(a, s1, new Throwable());
            e.a("FRAGMENT_NAVIGATION", s1);
            c = intent;
        } else
        {
            b.a(this, intent);
        }
        f = true;
    }

    public void h()
    {
        super.h();
        f = false;
    }

}
