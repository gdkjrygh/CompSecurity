// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.slyce.a.c.d;

import android.net.Uri;
import com.android.slyce.a.a.c;
import com.android.slyce.a.b.g;
import com.android.slyce.a.b.j;
import com.android.slyce.a.c.l;
import com.android.slyce.a.c.u;

// Referenced classes of package com.android.slyce.a.c.d:
//            ar, aj, a

class ao
    implements g
{

    final l a;
    final j b;
    final aj c;

    ao(aj aj1, l l1, j j1)
    {
        c = aj1;
        a = l1;
        b = j1;
        super();
    }

    public void a(Exception exception, a a1)
    {
        if (!(exception instanceof ar)) goto _L2; else goto _L1
_L1:
        a.j.b("spdy not available");
        b.b(aj.a(c, a));
_L4:
        return;
_L2:
        if (exception == null)
        {
            break; /* Loop/switch isn't completed */
        }
        if (b.f())
        {
            a.a.a(exception, null);
            return;
        }
        if (true) goto _L4; else goto _L3
_L3:
        a.j.b((new StringBuilder()).append("using existing spdy connection for host: ").append(a.j.d().getHost()).toString());
        if (b.f())
        {
            aj.a(c, a, a1, a.a);
            return;
        }
        if (true) goto _L4; else goto _L5
_L5:
    }

    public volatile void a(Exception exception, Object obj)
    {
        a(exception, (a)obj);
    }
}
