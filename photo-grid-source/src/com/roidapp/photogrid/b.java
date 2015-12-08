// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid;

import android.os.Handler;
import android.os.Message;
import android.support.v4.view.ViewPager;

// Referenced classes of package com.roidapp.photogrid:
//            a

final class b extends Handler
{

    final a a;

    b(a a1)
    {
        a = a1;
        super();
    }

    public final void handleMessage(Message message)
    {
        super.handleMessage(message);
        com.roidapp.photogrid.a.b(a).setCurrentItem(com.roidapp.photogrid.a.a(a));
        if (com.roidapp.photogrid.a.c(a) != null)
        {
            com.roidapp.photogrid.a.c(a).postDelayed(com.roidapp.photogrid.a.d(a), 5000L);
        }
    }
}
