// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.android.activity;

import android.view.View;
import com.pandora.android.provider.b;
import com.pandora.radio.data.y;
import com.pandora.radio.util.k;
import p.cw.c;

// Referenced classes of package com.pandora.android.activity:
//            CustomStationAlertActivity

class a
    implements android.view.AlertActivity._cls1
{

    final CustomStationAlertActivity a;

    public void onClick(View view)
    {
        CustomStationAlertActivity.a(a);
        b.a.b().o().a("replay_click", com.pandora.android.activity.CustomStationAlertActivity.b(a).c());
    }

    (CustomStationAlertActivity customstationalertactivity)
    {
        a = customstationalertactivity;
        super();
    }
}
