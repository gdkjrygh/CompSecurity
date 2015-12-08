// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.userfeedback.android.api;

import android.content.Intent;
import android.view.View;
import android.widget.EditText;

// Referenced classes of package com.google.userfeedback.android.api:
//            UserFeedbackActivity, PreviewActivity

final class q
    implements android.view.View.OnClickListener
{

    final UserFeedbackActivity a;

    q(UserFeedbackActivity userfeedbackactivity)
    {
        a = userfeedbackactivity;
        super();
    }

    public final void onClick(View view)
    {
        UserFeedbackActivity.a(UserFeedbackActivity.a(a), UserFeedbackActivity.b(a), UserFeedbackActivity.c(a).getText().toString());
        view = new Intent(a.getApplicationContext(), com/google/userfeedback/android/api/PreviewActivity);
        a.startActivityForResult(view, 0);
    }
}
