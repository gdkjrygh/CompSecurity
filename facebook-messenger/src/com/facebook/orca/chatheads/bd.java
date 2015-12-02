// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.chatheads;

import android.graphics.PointF;
import com.facebook.debug.log.b;
import com.facebook.messages.threads.model.ThreadViewSpec;
import com.google.common.d.a.ab;
import com.google.common.d.a.h;
import java.util.concurrent.CancellationException;

// Referenced classes of package com.facebook.orca.chatheads:
//            al, dc, ef, ak

class bd
    implements h
{

    final ThreadViewSpec a;
    final ThreadViewSpec b;
    final String c;
    final ab d;
    final al e;

    bd(al al1, ThreadViewSpec threadviewspec, ThreadViewSpec threadviewspec1, String s, ab ab1)
    {
        e = al1;
        a = threadviewspec;
        b = threadviewspec1;
        c = s;
        d = ab1;
        super();
    }

    public volatile void a(Object obj)
    {
        a((Void)obj);
    }

    public void a(Throwable throwable)
    {
        if (!(throwable instanceof CancellationException) && com.facebook.debug.log.b.b(3))
        {
            com.facebook.debug.log.b.b(al.a, "Got exception opening chat head popup space: ", throwable);
        }
        d.cancel(false);
    }

    public void a(Void void1)
    {
        if (!e.e())
        {
            return;
        }
        if (al.t(e) != null)
        {
            al.t(e).b().b(new PointF(0.0F, 0.0F));
            al.t(e).c();
        }
        al.c(e, al.D(e).d(a));
        al.a(e, "open", b, c);
        d.a_(null);
    }
}
