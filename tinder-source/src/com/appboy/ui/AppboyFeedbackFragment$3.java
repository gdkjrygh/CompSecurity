// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.appboy.ui;

import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import com.appboy.Appboy;

// Referenced classes of package com.appboy.ui:
//            AppboyFeedbackFragment

class this._cls0
    implements android.view.
{

    final AppboyFeedbackFragment this$0;

    public void onClick(View view)
    {
        if (AppboyFeedbackFragment.access$100(AppboyFeedbackFragment.this))
        {
            AppboyFeedbackFragment.access$200(AppboyFeedbackFragment.this);
            boolean flag = AppboyFeedbackFragment.access$500(AppboyFeedbackFragment.this).isChecked();
            String s = AppboyFeedbackFragment.access$600(AppboyFeedbackFragment.this).getText().toString();
            String s1 = AppboyFeedbackFragment.access$700(AppboyFeedbackFragment.this).getText().toString();
            view = s;
            if (AppboyFeedbackFragment.access$300(AppboyFeedbackFragment.this) != null)
            {
                view = AppboyFeedbackFragment.access$300(AppboyFeedbackFragment.this).beforeFeedbackSubmitted(s);
            }
            flag = Appboy.getInstance(getActivity()).submitFeedback(s1, view, flag);
            if (AppboyFeedbackFragment.access$300(AppboyFeedbackFragment.this) != null)
            {
                edbackFinishedListener edbackfinishedlistener = AppboyFeedbackFragment.access$300(AppboyFeedbackFragment.this);
                if (flag)
                {
                    view = edbackResult.SENT;
                } else
                {
                    view = edbackResult.ERROR;
                }
                edbackfinishedlistener.onFeedbackFinished(view);
            }
            AppboyFeedbackFragment.access$400(AppboyFeedbackFragment.this);
            return;
        } else
        {
            AppboyFeedbackFragment.access$002(AppboyFeedbackFragment.this, true);
            return;
        }
    }

    edbackResult()
    {
        this$0 = AppboyFeedbackFragment.this;
        super();
    }
}
