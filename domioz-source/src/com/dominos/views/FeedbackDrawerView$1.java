// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.views;

import android.view.View;
import android.widget.LinearLayout;
import java.util.ArrayList;

// Referenced classes of package com.dominos.views:
//            FeedbackDrawerView, DrawerQuestionView

class val.isBeforeArrive
    implements android.view.ew._cls1
{

    final FeedbackDrawerView this$0;
    final boolean val$isBeforeArrive;
    final FeedbackDrawerSubmitListener val$listener;

    public void onClick(View view)
    {
        for (int i = 0; i < mQuestionContainer.getChildCount(); i++)
        {
            float f = ((DrawerQuestionView)mQuestionContainer.getChildAt(i)).getRating();
            FeedbackDrawerView.access$000(FeedbackDrawerView.this).add(Float.valueOf(f));
        }

        val$listener.onSubmitButtonClick(FeedbackDrawerView.access$000(FeedbackDrawerView.this), val$isBeforeArrive);
    }

    FeedbackDrawerSubmitListener()
    {
        this$0 = final_feedbackdrawerview;
        val$listener = feedbackdrawersubmitlistener;
        val$isBeforeArrive = Z.this;
        super();
    }
}
