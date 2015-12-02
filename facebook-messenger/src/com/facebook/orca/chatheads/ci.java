// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.chatheads;

import com.facebook.messages.ipc.peer.d;
import com.facebook.orca.prefs.n;
import com.facebook.prefs.shared.ae;
import com.facebook.prefs.shared.f;
import javax.inject.a;

// Referenced classes of package com.facebook.orca.chatheads:
//            dy, ch, by

class ci
    implements f
{

    final ch a;

    ci(ch ch1)
    {
        a = ch1;
        super();
    }

    public void a(com.facebook.prefs.shared.d d1, ae ae1)
    {
        if (com.facebook.orca.chatheads.dy.a.equals(ae1))
        {
            com.facebook.orca.chatheads.ch.a(a).a();
        } else
        if (n.s.equals(ae1))
        {
            if (!((Boolean)ch.b(a).b()).booleanValue())
            {
                ch.c(a).a(d.f, null);
            } else
            {
                ch.c(a).a(d.k, Boolean.valueOf(true));
            }
            com.facebook.orca.chatheads.ch.a(a).a();
            return;
        }
    }
}
