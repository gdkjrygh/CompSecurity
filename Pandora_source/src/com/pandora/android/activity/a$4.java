// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.android.activity;

import android.content.BroadcastReceiver;
import android.content.DialogInterface;
import android.support.v4.content.j;
import com.pandora.android.provider.b;

// Referenced classes of package com.pandora.android.activity:
//            a

static final class a
    implements android.content.ogInterface.OnCancelListener
{

    final BroadcastReceiver a;

    public void onCancel(DialogInterface dialoginterface)
    {
        b.a.C().a(a);
    }

    (BroadcastReceiver broadcastreceiver)
    {
        a = broadcastreceiver;
        super();
    }
}
