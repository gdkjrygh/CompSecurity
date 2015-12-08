// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.fragments;

import android.view.View;
import android.widget.LinearLayout;

// Referenced classes of package com.dominos.fragments:
//            TrackerFeedbackFragment

class this._cls0
    implements android.view.agment._cls1
{

    final TrackerFeedbackFragment this$0;

    public void onClick(View view)
    {
        if (mFeedbackDisplay.getVisibility() == 0)
        {
            mFeedbackDisplay.setVisibility(8);
            return;
        } else
        {
            mFeedbackDisplay.setVisibility(0);
            return;
        }
    }

    ()
    {
        this$0 = TrackerFeedbackFragment.this;
        super();
    }
}
