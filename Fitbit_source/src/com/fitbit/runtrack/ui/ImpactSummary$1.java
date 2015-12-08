// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.runtrack.ui;

import android.content.Intent;
import android.text.TextUtils;
import com.fitbit.livedata.LiveDataPacket;
import com.fitbit.util.threading.c;

// Referenced classes of package com.fitbit.runtrack.ui:
//            ImpactSummary

class a extends c
{

    final ImpactSummary a;

    protected void a(Intent intent)
    {
        if (TextUtils.equals("com.fitbit.livedata.LiveDataBroadcaster.ACTION_LIVE_DATA_RECEIVED", intent.getAction()) && ImpactSummary.a(a) != null)
        {
            intent = (LiveDataPacket)intent.getParcelableExtra("com.fitbit.livedata.LiveDataBroadcaster.EXTRA_LIVE_DATA_PACKET");
            ImpactSummary.a(a).a(pactable.a, Integer.valueOf(intent.a()));
            ImpactSummary.a(a).a(pactable.d, Double.valueOf(intent.c()));
            ImpactSummary.a(a).a(pactable.b, Integer.valueOf(intent.b()));
            ImpactSummary.a(a).notifyDataSetChanged();
        }
    }

    pactable(ImpactSummary impactsummary)
    {
        a = impactsummary;
        super();
    }
}
