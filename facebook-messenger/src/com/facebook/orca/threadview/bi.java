// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.threadview;

import android.app.Activity;
import android.content.Context;
import com.facebook.messages.threads.model.ThreadViewSpec;
import com.facebook.orca.threadlist.s;
import com.facebook.push.mqtt.cj;

// Referenced classes of package com.facebook.orca.threadview:
//            cb, ThreadViewFragment

class bi extends cb
{

    final ThreadViewFragment a;

    bi(ThreadViewFragment threadviewfragment, Context context)
    {
        a = threadviewfragment;
        super(context);
    }

    public void a(long l)
    {
        if (l == -1L)
        {
            ThreadViewFragment.a(a);
        } else
        if (ThreadViewFragment.b(a) < l)
        {
            ThreadViewFragment.a(a);
            return;
        }
    }

    public void a(cj cj)
    {
        ThreadViewFragment.a(a);
    }

    public void a(String s1)
    {
        if (s1 != null)
        {
            ThreadViewFragment.a(a, ThreadViewSpec.a(s1));
            return;
        } else
        {
            ThreadViewFragment.a(a);
            return;
        }
    }

    public void d()
    {
        if (a.l() instanceof s)
        {
            ThreadViewFragment.c(a);
            return;
        } else
        {
            ((Activity)a.n()).finish();
            return;
        }
    }
}
