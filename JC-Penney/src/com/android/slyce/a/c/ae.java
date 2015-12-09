// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.slyce.a.c;

import android.net.Uri;
import com.android.slyce.a.a.c;
import com.android.slyce.a.ag;
import com.android.slyce.a.bp;

// Referenced classes of package com.android.slyce.a.c:
//            ac, l, u, af

class ae
    implements c
{

    final c a;
    final boolean b;
    final l c;
    final Uri d;
    final int e;
    final ac f;

    ae(ac ac1, c c1, boolean flag, l l1, Uri uri, int i)
    {
        f = ac1;
        a = c1;
        b = flag;
        c = l1;
        d = uri;
        e = i;
        super();
    }

    public void a(Exception exception, ag ag)
    {
        if (exception != null)
        {
            a.a(exception, ag);
            return;
        }
        if (!b)
        {
            f.a(ag, c, d, e, a);
            return;
        } else
        {
            exception = String.format("CONNECT %s:%s HTTP/1.1\r\nHost: %s\r\n\r\n", new Object[] {
                d.getHost(), Integer.valueOf(e), d.getHost()
            });
            c.j.b((new StringBuilder()).append("Proxying: ").append(exception).toString());
            bp.a(ag, exception.getBytes(), new af(this, ag));
            return;
        }
    }
}
