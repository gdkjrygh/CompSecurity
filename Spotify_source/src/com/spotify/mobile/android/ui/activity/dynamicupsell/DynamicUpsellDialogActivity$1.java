// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.ui.activity.dynamicupsell;

import android.animation.ObjectAnimator;
import android.view.View;

// Referenced classes of package com.spotify.mobile.android.ui.activity.dynamicupsell:
//            DynamicUpsellDialogActivity

final class a
    implements Runnable
{

    private DynamicUpsellDialogActivity a;

    public final void run()
    {
        ObjectAnimator.ofFloat(DynamicUpsellDialogActivity.a(a), View.ALPHA, new float[] {
            0.0F, 1.0F
        }).setDuration(500L).start();
    }

    (DynamicUpsellDialogActivity dynamicupselldialogactivity)
    {
        a = dynamicupselldialogactivity;
        super();
    }
}
