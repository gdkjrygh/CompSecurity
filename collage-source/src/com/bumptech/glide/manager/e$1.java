// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bumptech.glide.manager;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

// Referenced classes of package com.bumptech.glide.manager:
//            e

class er extends BroadcastReceiver
{

    final e a;

    public void onReceive(Context context, Intent intent)
    {
        boolean flag = e.a(a);
        e.a(a, e.a(a, context));
        if (flag != e.a(a))
        {
            e.b(a).a(e.a(a));
        }
    }

    er(e e1)
    {
        a = e1;
        super();
    }
}
