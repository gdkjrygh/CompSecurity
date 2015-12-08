// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.home.ui;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

// Referenced classes of package com.fitbit.home.ui:
//            DetailActivity

class nit> extends BroadcastReceiver
{

    final DetailActivity a;

    public void onReceive(Context context, Intent intent)
    {
        DetailActivity.a(a);
    }

    (DetailActivity detailactivity)
    {
        a = detailactivity;
        super();
    }
}
