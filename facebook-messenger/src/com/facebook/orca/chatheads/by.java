// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.chatheads;

import com.facebook.analytics.av;
import com.facebook.analytics.cb;
import com.facebook.messages.threads.model.ThreadViewSpec;
import com.facebook.orca.prefs.n;
import com.facebook.prefs.shared.d;
import com.facebook.prefs.shared.e;
import java.util.List;
import javax.inject.a;

// Referenced classes of package com.facebook.orca.chatheads:
//            ag, dy

class by
{

    private final av a;
    private final a b;
    private final a c;
    private final d d;

    public by(av av1, d d1, a a1, a a2)
    {
        a = av1;
        d = d1;
        b = a1;
        c = a2;
    }

    private cb a(String s, String s1, ThreadViewSpec threadviewspec)
    {
        s = (new cb(s)).f(s1);
        if (threadviewspec != null)
        {
            threadviewspec.a(s);
        }
        return s;
    }

    public cb a(String s, ThreadViewSpec threadviewspec, String s1)
    {
        s = a(s, "chathead", threadviewspec);
        if (s1 != null)
        {
            s.b("reason", s1);
        }
        return s;
    }

    public cb a(String s, List list, String s1)
    {
        ThreadViewSpec threadviewspec;
        if (list.size() == 1)
        {
            threadviewspec = ((ag)list.get(0)).getThreadViewSpec();
        } else
        {
            threadviewspec = null;
        }
        s = a(s, "chathead", threadviewspec);
        s.a("gesture_headcount", list.size());
        if (s1 != null)
        {
            s.b("reason", s1);
        }
        return s;
    }

    public void a()
    {
        cb cb1 = new cb("chathead_settings_change");
        cb1.a("HAS_CHAT_HEADS_GK", d.a(com.facebook.orca.chatheads.dy.a, false));
        cb1.a("permitted", ((Boolean)b.b()).booleanValue());
        cb1.a("enabled", ((Boolean)c.b()).booleanValue());
        b(cb1);
        if (!d.a(n.G, false))
        {
            d.b().a(n.G, true).a();
        }
    }

    public void a(cb cb1)
    {
        cb1.e("chatheads");
        a.a(cb1);
    }

    public void b(cb cb1)
    {
        cb1.e("chatheads");
        a.b(cb1);
    }
}
