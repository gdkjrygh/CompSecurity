// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.background;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

// Referenced classes of package com.facebook.orca.background:
//            d

class e extends BroadcastReceiver
{

    final d a;

    e(d d1)
    {
        a = d1;
        super();
    }

    public void onReceive(Context context, Intent intent)
    {
        context = intent.getStringArrayListExtra("threads");
        d.a(a, context);
    }
}
