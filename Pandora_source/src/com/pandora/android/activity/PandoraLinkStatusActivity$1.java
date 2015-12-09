// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.android.activity;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.widget.Button;
import com.pandora.android.fordsync.a;
import p.cx.c;

// Referenced classes of package com.pandora.android.activity:
//            PandoraLinkStatusActivity, c, AndroidLinkConnectActivity

class a
    implements android.view.tatusActivity._cls1
{

    final PandoraLinkStatusActivity a;

    public void onClick(View view)
    {
        view = a.getApplicationContext().getResources().getString(0x7f08006a);
        if (com.pandora.android.activity.PandoraLinkStatusActivity.a(a).getText().equals(view))
        {
            com.pandora.android.activity.c.a().a(a, com/pandora/android/activity/AndroidLinkConnectActivity);
            return;
        }
        if (com.pandora.android.fordsync.a.a().G())
        {
            com.pandora.android.fordsync.a.a().i();
        } else
        {
            c.a().l();
        }
        a.m();
    }

    (PandoraLinkStatusActivity pandoralinkstatusactivity)
    {
        a = pandoralinkstatusactivity;
        super();
    }
}
