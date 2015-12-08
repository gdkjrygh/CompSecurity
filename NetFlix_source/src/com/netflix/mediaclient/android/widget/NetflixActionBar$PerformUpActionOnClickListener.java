// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.android.widget;

import android.view.View;
import com.netflix.mediaclient.android.activity.NetflixActivity;

// Referenced classes of package com.netflix.mediaclient.android.widget:
//            NetflixActionBar

protected static class activity
    implements android.view.rmUpActionOnClickListener
{

    private final NetflixActivity activity;

    public void onClick(View view)
    {
        activity.performUpAction();
    }

    public (NetflixActivity netflixactivity)
    {
        activity = netflixactivity;
    }
}
