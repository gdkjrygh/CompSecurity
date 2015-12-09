// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.slyce.a;

import com.android.slyce.a.b.l;
import java.net.InetAddress;

// Referenced classes of package com.android.slyce.a:
//            x

class y
    implements Runnable
{

    final InetAddress a[];
    final x b;

    y(x x1, InetAddress ainetaddress[])
    {
        b = x1;
        a = ainetaddress;
        super();
    }

    public void run()
    {
        b.b.b(null, a);
    }
}
