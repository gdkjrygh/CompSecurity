// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.fragments;

import android.view.View;
import android.widget.AdapterView;
import java.util.Map;

// Referenced classes of package com.dominos.fragments:
//            TrackerFeedbackFragment

class val.feedbackQuestions
    implements android.widget.Listener
{

    final TrackerFeedbackFragment this$0;
    final Map val$feedbackQuestions;

    public void onItemSelected(AdapterView adapterview, View view, int i, long l)
    {
        onSendShoutoutClick(view, val$feedbackQuestions);
    }

    public void onNothingSelected(AdapterView adapterview)
    {
    }

    r()
    {
        this$0 = final_trackerfeedbackfragment;
        val$feedbackQuestions = Map.this;
        super();
    }
}
