// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.ads.internal;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Handler;
import com.facebook.ads.c;
import com.facebook.ads.internal.adapters.e;
import com.facebook.ads.internal.adapters.f;
import com.facebook.ads.internal.c.a;
import com.facebook.ads.internal.d.d;
import com.facebook.ads.internal.util.t;

// Referenced classes of package com.facebook.ads.internal:
//            h, a

class a
    implements f
{

    final Runnable a;
    final h b;

    public void a(e e)
    {
        com.facebook.ads.internal.h.d(b);
        com.facebook.ads.internal.h.e(b).removeCallbacks(a);
        h.b(b, e);
        h.l(b).a();
        h.b(b);
    }

    public void a(e e, c c1)
    {
        com.facebook.ads.internal.h.d(b);
        com.facebook.ads.internal.h.e(b).removeCallbacks(a);
        com.facebook.ads.internal.h.a(b, e);
        com.facebook.ads.internal.h.c(b);
    }

    public void a(e e, String s, boolean flag)
    {
        com.facebook.ads.internal.h.d(b);
        h.n(b).b();
        StringBuilder stringbuilder;
        boolean flag1;
        if (!t.a(s))
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        stringbuilder = (new StringBuilder()).append("Clickthrough event with playerHandles=").append(flag).append(" and url ");
        if (flag1)
        {
            e = "defined";
        } else
        {
            e = "not defined";
        }
        com.facebook.ads.internal.c.a.b(stringbuilder.append(e).toString());
        if (!flag)
        {
            com.facebook.ads.internal.c.a.a("Adapter handles click, ignoring click url.");
        } else
        if (flag1)
        {
            com.facebook.ads.internal.c.a.b((new StringBuilder()).append("Intent url=").append(s).toString());
            e = new Intent("android.intent.action.VIEW");
            if (!(h.o(b).f instanceof Activity))
            {
                com.facebook.ads.internal.c.a.b("Context is not instance of Activity");
                e.addFlags(0x10000000);
            }
            e.setData(Uri.parse(s));
            h.o(b).f.startActivity(e);
            return;
        }
    }

    public void b(e e)
    {
        com.facebook.ads.internal.h.d(b);
        h.m(b).c();
    }

    public void c(e e)
    {
        com.facebook.ads.internal.h.d(b);
        h.p(b).e();
    }

    public void d(e e)
    {
        com.facebook.ads.internal.h.d(b);
        h.q(b).d();
    }

    ters.e(h h1, Runnable runnable)
    {
        b = h1;
        a = runnable;
        super();
    }
}
