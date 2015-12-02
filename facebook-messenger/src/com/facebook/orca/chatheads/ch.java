// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.chatheads;

import com.facebook.base.c;
import com.facebook.i.a.a.f;
import com.facebook.messages.ipc.peer.d;
import com.facebook.orca.prefs.n;
import javax.inject.a;

// Referenced classes of package com.facebook.orca.chatheads:
//            ci, cj, by

public class ch
    implements c
{

    private final f a;
    private final com.facebook.prefs.shared.d b;
    private final a c;
    private final by d;
    private final a e;
    private final com.facebook.prefs.shared.f f = new ci(this);

    public ch(f f1, com.facebook.prefs.shared.d d1, by by1, a a1, a a2)
    {
        a = f1;
        b = d1;
        c = a1;
        d = by1;
        e = a2;
    }

    static by a(ch ch1)
    {
        return ch1.d;
    }

    static a b(ch ch1)
    {
        return ch1.c;
    }

    static f c(ch ch1)
    {
        return ch1.a;
    }

    static com.facebook.prefs.shared.f d(ch ch1)
    {
        return ch1.f;
    }

    static com.facebook.prefs.shared.d e(ch ch1)
    {
        return ch1.b;
    }

    public void a()
    {
        a.a(d.k, c.b());
        b.a(new cj(this));
        if (!b.a(n.G, false) && e.b() != null)
        {
            d.a();
        }
    }
}
