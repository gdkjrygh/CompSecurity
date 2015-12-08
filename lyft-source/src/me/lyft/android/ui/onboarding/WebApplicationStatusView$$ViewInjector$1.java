// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.onboarding;

import android.view.View;
import butterknife.internal.DebouncingOnClickListener;

// Referenced classes of package me.lyft.android.ui.onboarding:
//            WebApplicationStatusView

class val.target extends DebouncingOnClickListener
{

    final ionClicked this$0;
    final WebApplicationStatusView val$target;

    public void doClick(View view)
    {
        val$target.onResumeApplicationClicked();
    }

    ()
    {
        this$0 = final_;
        val$target = WebApplicationStatusView.this;
        super();
    }
}
