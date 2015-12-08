// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.admarvel.android.ads;

import android.app.ProgressDialog;
import android.content.Context;
import android.widget.LinearLayout;
import java.lang.ref.WeakReference;

// Referenced classes of package com.admarvel.android.ads:
//            AdMarvelVideoActivity

static class adMarvelVideoActivityReference extends ProgressDialog
{

    private final WeakReference adMarvelVideoActivityReference;

    protected void onStop()
    {
        super.onStop();
        AdMarvelVideoActivity admarvelvideoactivity = (AdMarvelVideoActivity)adMarvelVideoActivityReference.get();
        if (admarvelvideoactivity != null)
        {
            LinearLayout linearlayout = (LinearLayout)admarvelvideoactivity.findViewById(AdMarvelVideoActivity.VIDEO_VIEW_ID);
            if (linearlayout != null)
            {
                linearlayout.setVisibility(0);
            }
            if ((LinearLayout)admarvelvideoactivity.findViewById(AdMarvelVideoActivity.VIEW_ID) != null && AdMarvelVideoActivity.access$20(admarvelvideoactivity) && AdMarvelVideoActivity.access$7(admarvelvideoactivity))
            {
                admarvelvideoactivity.toolbarDisplayToggle(true);
                return;
            }
        }
    }

    public (Context context, AdMarvelVideoActivity admarvelvideoactivity)
    {
        super(context);
        adMarvelVideoActivityReference = new WeakReference(admarvelvideoactivity);
    }
}
