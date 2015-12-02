// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.v5;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

// Referenced classes of package com.qihoo.security.v5:
//            UpdatedDialog

class t> extends BroadcastReceiver
{

    final UpdatedDialog a;

    public void onReceive(Context context, Intent intent)
    {
        if (intent != null && "com.qihoo.security.action.ACTION_DISMISS_UPDATED_DIALOG".equals(intent.getAction()))
        {
            a.finish();
        }
    }

    (UpdatedDialog updateddialog)
    {
        a = updateddialog;
        super();
    }
}
