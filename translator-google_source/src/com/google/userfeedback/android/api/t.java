// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.userfeedback.android.api;

import android.content.Context;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Spinner;

// Referenced classes of package com.google.userfeedback.android.api:
//            UserFeedbackActivity, i, m, z

final class t
    implements android.widget.AdapterView.OnItemSelectedListener
{

    final Context a;
    final UserFeedbackActivity b;

    t(UserFeedbackActivity userfeedbackactivity, Context context)
    {
        b = userfeedbackactivity;
        a = context;
        super();
    }

    public final void onItemSelected(AdapterView adapterview, View view, int j, long l)
    {
        adapterview = (String)UserFeedbackActivity.e(b).getSelectedItem();
        if (!adapterview.equals(a.getString(i.gf_anonymous)))
        {
            UserFeedbackActivity.d(b).g.E = adapterview;
            return;
        } else
        {
            UserFeedbackActivity.d(b).g.E = "";
            return;
        }
    }

    public final void onNothingSelected(AdapterView adapterview)
    {
        UserFeedbackActivity.d(b).g.E = "";
    }
}
