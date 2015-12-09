// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.android.activity;

import android.content.DialogInterface;
import com.pandora.android.provider.b;

// Referenced classes of package com.pandora.android.activity:
//            GlobalBroadcastReceiver

class a
    implements android.content.istener
{

    final GlobalBroadcastReceiver a;

    public void onDismiss(DialogInterface dialoginterface)
    {
        b.a.E();
    }

    (GlobalBroadcastReceiver globalbroadcastreceiver)
    {
        a = globalbroadcastreceiver;
        super();
    }
}
