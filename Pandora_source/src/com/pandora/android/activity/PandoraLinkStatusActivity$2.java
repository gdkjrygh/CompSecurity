// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.android.activity;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import p.cx.c;

// Referenced classes of package com.pandora.android.activity:
//            PandoraLinkStatusActivity, c, AndroidLinkInterceptorActivity

class a
    implements android.view.tatusActivity._cls2
{

    final PandoraLinkStatusActivity a;

    public void onClick(View view)
    {
        view = a.getApplicationContext().getResources().getString(0x7f08006a);
        if (PandoraLinkStatusActivity.b(a).getText().equals(view))
        {
            if (a.n())
            {
                c.a().a(a, com/pandora/android/activity/AndroidLinkInterceptorActivity);
                return;
            } else
            {
                ((TextView)a.findViewById(0x7f1001e2)).setText(a.getApplicationContext().getResources().getString(0x7f080292));
                return;
            }
        } else
        {
            c.a().ae();
            a.m();
            return;
        }
    }

    ty(PandoraLinkStatusActivity pandoralinkstatusactivity)
    {
        a = pandoralinkstatusactivity;
        super();
    }
}
