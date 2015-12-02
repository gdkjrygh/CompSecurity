// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.notify;

import com.qihoo.security.widget.a;
import com.qihoo360.mobilesafe.b.q;
import com.qihoo360.mobilesafe.b.r;

// Referenced classes of package com.qihoo.security.notify:
//            c

class a
    implements com.qihoo.security.widget.a
{

    final c a;

    public void a()
    {
        if (c.b(a) != null)
        {
            c.b(a).b();
            com.qihoo.security.notify.c.a(a, null);
            com.qihoo.security.notify.c.a(a, false);
            a.c();
        }
    }

    public void a(boolean flag)
    {
    }

    public void b()
    {
        r.b(a.b);
        q.a().a(0x7f0c0179);
        if (c.b(a) != null)
        {
            c.b(a).b();
            com.qihoo.security.notify.c.a(a, null);
            com.qihoo.security.notify.c.a(a, false);
        }
    }

    public void b(boolean flag)
    {
        c.b(a, flag);
    }

    (c c1)
    {
        a = c1;
        super();
    }
}
