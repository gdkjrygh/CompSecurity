// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.android.activity;

import android.app.AlertDialog;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.support.v4.content.j;
import com.pandora.android.provider.b;
import p.bx.a;

// Referenced classes of package com.pandora.android.activity:
//            a, PandoraIntent

static final class  extends BroadcastReceiver
{

    final a a;
    final AlertDialog b;

    public void onReceive(Context context, Intent intent)
    {
        context = intent.getAction();
        if (!com.pandora.android.activity.PandoraIntent.a("cmd_change_settings_result").equals(context)) goto _L2; else goto _L1
_L1:
        b.a.C().a(this);
        if (!intent.getBooleanExtra("intent_success", false)) goto _L4; else goto _L3
_L3:
        a.a();
_L2:
        b.cancel();
        return;
_L4:
        if (com.pandora.android.activity.PandoraIntent.a("cmd_change_settings_result").equals(context))
        {
            a.b();
        }
        if (true) goto _L2; else goto _L5
_L5:
    }

    oraIntent(a a1, AlertDialog alertdialog)
    {
        a = a1;
        b = alertdialog;
        super();
    }
}
