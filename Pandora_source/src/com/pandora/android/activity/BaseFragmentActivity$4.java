// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.android.activity;

import android.content.DialogInterface;
import android.support.v4.content.j;
import com.pandora.android.provider.b;

// Referenced classes of package com.pandora.android.activity:
//            BaseFragmentActivity, PandoraIntent

class a
    implements android.content.ssListener
{

    final BaseFragmentActivity a;

    public void onDismiss(DialogInterface dialoginterface)
    {
        b.a.C().a(new PandoraIntent("cmd_ack_trial_expired"));
    }

    _cls9(BaseFragmentActivity basefragmentactivity)
    {
        a = basefragmentactivity;
        super();
    }
}
