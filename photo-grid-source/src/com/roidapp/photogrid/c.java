// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid;

import android.os.Handler;
import android.os.Message;

// Referenced classes of package com.roidapp.photogrid:
//            a

public final class c
    implements Runnable
{

    final a a;

    public c(a a1)
    {
        a = a1;
        super();
    }

    public final void run()
    {
        com.roidapp.photogrid.a.e(a);
        if (com.roidapp.photogrid.a.a(a) > com.roidapp.photogrid.a.f(a) - 1)
        {
            com.roidapp.photogrid.a.g(a);
        }
        com.roidapp.photogrid.a.c(a).obtainMessage().sendToTarget();
    }
}
