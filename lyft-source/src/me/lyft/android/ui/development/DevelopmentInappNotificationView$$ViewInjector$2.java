// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.development;

import android.view.View;
import butterknife.internal.DebouncingOnClickListener;

// Referenced classes of package me.lyft.android.ui.development:
//            DevelopmentInappNotificationView

class val.target extends DebouncingOnClickListener
{

    final endedOnClick this$0;
    final DevelopmentInappNotificationView val$target;

    public void doClick(View view)
    {
        val$target.showInviteRecommendedOnClick(view);
    }

    ()
    {
        this$0 = final_;
        val$target = DevelopmentInappNotificationView.this;
        super();
    }
}
