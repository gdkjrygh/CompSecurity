// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.fbservice.service;

import com.google.common.d.a.s;

// Referenced classes of package com.facebook.fbservice.service:
//            h, m, o

class i
    implements Runnable
{

    final h a;

    i(h h1)
    {
        a = h1;
        super();
    }

    public void run()
    {
        if (h.a(a) != null)
        {
            h.a(a).a();
        }
        if (h.b(a) != null)
        {
            m.a(h.b(a)).cancel(false);
        }
        h.c(a).b(a);
    }
}
