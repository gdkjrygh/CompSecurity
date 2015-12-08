// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.iid;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

// Referenced classes of package com.google.android.gms.iid:
//            b

final class er extends BroadcastReceiver
{

    final b a;

    public final void onReceive(Context context, Intent intent)
    {
        if (Log.isLoggable("InstanceID", 3))
        {
            intent.getStringExtra("registration_id");
            Log.d("InstanceID", (new StringBuilder("Received GSF callback using dynamic receiver: ")).append(intent.getExtras()).toString());
        }
        a.a(intent);
        a.a();
    }

    er(b b1)
    {
        a = b1;
        super();
    }
}
