// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.app;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

// Referenced classes of package com.qihoo.security.app:
//            BaseActivity

class t> extends BroadcastReceiver
{

    final BaseActivity a;

    public void onReceive(Context context, Intent intent)
    {
        a.finish();
    }

    (BaseActivity baseactivity)
    {
        a = baseactivity;
        super();
    }
}
