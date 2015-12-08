// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.android.activity;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v4.content.j;
import com.pandora.android.provider.b;

// Referenced classes of package com.pandora.android.activity:
//            GlobalBroadcastReceiver

class a
    implements android.content.tener
{

    final Intent a;
    final GlobalBroadcastReceiver b;

    public void onClick(DialogInterface dialoginterface, int i)
    {
        b.a.C().a(a);
        dialoginterface.cancel();
    }

    (GlobalBroadcastReceiver globalbroadcastreceiver, Intent intent)
    {
        b = globalbroadcastreceiver;
        a = intent;
        super();
    }
}
