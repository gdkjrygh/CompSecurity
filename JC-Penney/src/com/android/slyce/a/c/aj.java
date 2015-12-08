// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.slyce.a.c;

import android.net.Uri;
import com.android.slyce.a.a.c;
import com.android.slyce.a.b.b;
import com.android.slyce.a.b.n;
import java.net.InetAddress;

// Referenced classes of package com.android.slyce.a.c:
//            ak, al, l, ai

class aj extends n
{

    Exception a;
    final l b;
    final Uri c;
    final int m;
    final ai n;

    aj(ai ai1, l l1, Uri uri, int i)
    {
        n = ai1;
        b = l1;
        c = uri;
        m = i;
        super();
    }

    protected volatile void a(Object obj)
    {
        a((InetAddress[])obj);
    }

    protected void a(InetAddress ainetaddress[])
    {
        b b1 = new b(new ak(this));
        int j = ainetaddress.length;
        for (int i = 0; i < j; i++)
        {
            InetAddress inetaddress = ainetaddress[i];
            b1.a(new al(this, String.format("%s:%s", new Object[] {
                inetaddress, Integer.valueOf(m)
            }), inetaddress));
        }

        b1.c();
    }

    protected void b(Exception exception)
    {
        super.b(exception);
        n.a(b, c, m, false, b.a).a(exception, null);
    }
}
