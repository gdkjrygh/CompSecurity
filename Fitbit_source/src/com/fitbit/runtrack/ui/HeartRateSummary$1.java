// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.runtrack.ui;

import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.view.View;

// Referenced classes of package com.fitbit.runtrack.ui:
//            HeartRateSummary

class a
    implements android.view.r
{

    final HeartRateSummary a;

    public void onClick(View view)
    {
        view = new Intent("android.intent.action.VIEW", Uri.parse(a.getResources().getString(0x7f08024e)));
        a.startActivity(view);
    }

    (HeartRateSummary heartratesummary)
    {
        a = heartratesummary;
        super();
    }
}
