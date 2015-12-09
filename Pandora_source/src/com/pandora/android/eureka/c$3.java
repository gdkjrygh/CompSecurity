// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.android.eureka;

import android.support.v4.content.j;
import com.pandora.android.activity.PandoraIntent;
import com.pandora.android.provider.b;
import com.pandora.android.util.ai;
import p.by.g;
import p.by.h;
import p.bz.f;
import p.cw.c;

// Referenced classes of package com.pandora.android.eureka:
//            c

class a
    implements h
{

    final com.pandora.android.eureka.c a;

    public void a(g g1)
    {
        com.pandora.android.eureka.c.c("Connection Succeeded - starting player");
        com.pandora.android.eureka.c.c((new StringBuilder()).append("Was reconnect: ").append(g1.a).toString());
        a.a(g1.a);
        ai.a().a(a);
        g1 = new PandoraIntent("hide_banner_ad");
        b.a.C().a(g1);
        b.a.e().a(new f(true, a.R()));
    }

    public void b(g g1)
    {
        if (c.a(a) == null)
        {
            return;
        }
        com.pandora.android.eureka.c.c("Connection Terminated");
        if (c.d(a) != null && a.R() != null && !a.R().isEmpty())
        {
            c.a(a).a(new p.dd.j((new StringBuilder()).append("Your cast session with ").append(a.R()).append(" has ended.").toString()));
        } else
        {
            c.a(a).a(new p.dd.j("Your cast session has ended."));
        }
        a.j();
        ai.a().b(a);
        a.d(false);
        b.a.e().a(new f(false, null));
    }

    ndoraIntent(com.pandora.android.eureka.c c1)
    {
        a = c1;
        super();
    }
}
