// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.chatheads;

import android.content.Context;
import com.facebook.messages.threads.model.ThreadViewSpec;
import com.facebook.orca.threadview.cb;
import com.facebook.push.mqtt.cj;

// Referenced classes of package com.facebook.orca.chatheads:
//            dh

class dl extends cb
{

    final dh a;

    dl(dh dh1, Context context)
    {
        a = dh1;
        super(context);
    }

    public void a(long l)
    {
        if (l == -1L)
        {
            a.f();
        } else
        if (dh.c(a) < l)
        {
            a.f();
            return;
        }
    }

    public void a(cj cj)
    {
        a.f();
    }

    public void a(String s)
    {
        if (s != null)
        {
            dh.a(a, ThreadViewSpec.a(s));
            return;
        } else
        {
            a.f();
            return;
        }
    }

    public void d()
    {
        dh.a(a, "thread_updates_finish");
    }
}
