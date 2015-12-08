// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.android.activity;

import android.content.DialogInterface;
import com.pandora.radio.data.af;

// Referenced classes of package com.pandora.android.activity:
//            GlobalBroadcastReceiver

class a
    implements android.content.tener
{

    final GlobalBroadcastReceiver a;

    public void onClick(DialogInterface dialoginterface, int i)
    {
        dialoginterface.cancel();
        a.b.c(true);
    }

    (GlobalBroadcastReceiver globalbroadcastreceiver)
    {
        a = globalbroadcastreceiver;
        super();
    }
}
