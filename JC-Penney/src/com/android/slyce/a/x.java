// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.slyce.a;

import com.android.slyce.a.b.l;
import java.net.InetAddress;

// Referenced classes of package com.android.slyce.a:
//            aw, z, r, y

class x
    implements Runnable
{

    final String a;
    final l b;
    final r c;

    x(r r1, String s, l l)
    {
        c = r1;
        a = s;
        b = l;
        super();
    }

    public void run()
    {
        Object obj;
        try
        {
            obj = InetAddress.getAllByName(a);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            c.a(new z(this, ((Exception) (obj))));
            return;
        }
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_17;
        }
        if (obj.length != 0)
        {
            break MISSING_BLOCK_LABEL_46;
        }
        throw new aw("no addresses for host");
        c.a(new y(this, ((InetAddress []) (obj))));
        return;
    }
}
