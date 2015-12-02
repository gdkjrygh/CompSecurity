// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.opti.a;

import android.os.RemoteException;
import com.qihoo360.mobilesafe.core.c.b;

// Referenced classes of package com.qihoo.security.opti.a:
//            b

class .b extends b
{

    final com.qihoo.security.opti.a.b a;

    public void b(int i, int j)
        throws RemoteException
    {
        super.b(i, j);
        if (com.qihoo.security.opti.a.b.d(a) != null)
        {
            com.qihoo.security.opti.a.b.d(a).a(i, j);
        }
        a.a();
    }

    .b(com.qihoo.security.opti.a.b b1)
    {
        a = b1;
        super();
    }
}
