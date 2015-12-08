// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.userfeedback.android.api;

import android.widget.CompoundButton;
import android.widget.EditText;

// Referenced classes of package com.google.userfeedback.android.api:
//            UserFeedbackActivity

final class w
    implements android.widget.CompoundButton.OnCheckedChangeListener
{

    final UserFeedbackActivity a;

    w(UserFeedbackActivity userfeedbackactivity)
    {
        a = userfeedbackactivity;
        super();
    }

    public final void onCheckedChanged(CompoundButton compoundbutton, boolean flag)
    {
        UserFeedbackActivity.a(UserFeedbackActivity.a(a), UserFeedbackActivity.b(a), UserFeedbackActivity.c(a).getText().toString());
    }
}
