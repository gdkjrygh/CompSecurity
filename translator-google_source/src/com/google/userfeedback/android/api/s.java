// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.userfeedback.android.api;

import android.app.Activity;
import android.app.Dialog;
import android.view.View;
import android.widget.EditText;

// Referenced classes of package com.google.userfeedback.android.api:
//            UserFeedbackActivity, m

final class s
    implements android.view.View.OnClickListener
{

    final Activity a;
    final UserFeedbackActivity b;

    s(UserFeedbackActivity userfeedbackactivity, Activity activity)
    {
        b = userfeedbackactivity;
        a = activity;
        super();
    }

    public final void onClick(View view)
    {
        view = UserFeedbackActivity.d(b).a(a, UserFeedbackActivity.a(b), UserFeedbackActivity.b(b), UserFeedbackActivity.c(b).getText().toString());
        if (view == null)
        {
            UserFeedbackActivity.d(b).a(UserFeedbackActivity.a(b), UserFeedbackActivity.b(b), UserFeedbackActivity.c(b).getText().toString());
            b.setResult(-1);
            b.finish();
            return;
        } else
        {
            view.show();
            return;
        }
    }
}
