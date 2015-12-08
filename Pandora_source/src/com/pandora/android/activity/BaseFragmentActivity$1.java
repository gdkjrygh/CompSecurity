// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.android.activity;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

// Referenced classes of package com.pandora.android.activity:
//            BaseFragmentActivity

class a extends BroadcastReceiver
{

    final BaseFragmentActivity a;

    public void onReceive(Context context, Intent intent)
    {
        a.a(context, intent, intent.getAction());
    }

    _cls9(BaseFragmentActivity basefragmentactivity)
    {
        a = basefragmentactivity;
        super();
    }
}
