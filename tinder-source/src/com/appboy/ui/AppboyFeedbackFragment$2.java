// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.appboy.ui;

import android.view.View;

// Referenced classes of package com.appboy.ui:
//            AppboyFeedbackFragment

class this._cls0
    implements android.view.
{

    final AppboyFeedbackFragment this$0;

    public void onClick(View view)
    {
        AppboyFeedbackFragment.access$200(AppboyFeedbackFragment.this);
        if (AppboyFeedbackFragment.access$300(AppboyFeedbackFragment.this) != null)
        {
            AppboyFeedbackFragment.access$300(AppboyFeedbackFragment.this).onFeedbackFinished(edbackResult.CANCELLED);
        }
        AppboyFeedbackFragment.access$400(AppboyFeedbackFragment.this);
    }

    edbackFinishedListener()
    {
        this$0 = AppboyFeedbackFragment.this;
        super();
    }
}
