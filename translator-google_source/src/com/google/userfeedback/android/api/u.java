// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.userfeedback.android.api;

import android.app.AlertDialog;
import android.view.View;

// Referenced classes of package com.google.userfeedback.android.api:
//            i, UserFeedbackActivity, v

final class u
    implements android.view.View.OnClickListener
{

    final UserFeedbackActivity a;

    u(UserFeedbackActivity userfeedbackactivity)
    {
        a = userfeedbackactivity;
        super();
    }

    public final void onClick(View view)
    {
        view = (new android.app.AlertDialog.Builder(a)).setTitle(a.getString(i.gf_privacy_policy)).setMessage(a.getString(i.gf_privacy_text)).create();
        view.setButton("OK", new v(this));
        view.show();
    }
}
