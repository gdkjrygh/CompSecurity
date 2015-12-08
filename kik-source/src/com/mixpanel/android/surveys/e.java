// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mixpanel.android.surveys;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import com.mixpanel.android.mpmetrics.InAppNotification;
import com.mixpanel.android.mpmetrics.UpdateDisplayState;

// Referenced classes of package com.mixpanel.android.surveys:
//            SurveyActivity

final class e
    implements android.view.View.OnClickListener
{

    final InAppNotification a;
    final SurveyActivity b;

    e(SurveyActivity surveyactivity, InAppNotification inappnotification)
    {
        b = surveyactivity;
        a = inappnotification;
        super();
    }

    public final void onClick(View view)
    {
        view = a.i();
        if (view != null && view.length() > 0)
        {
            try
            {
                view = Uri.parse(view);
            }
            // Misplaced declaration of an exception variable
            catch (View view)
            {
                return;
            }
            try
            {
                view = new Intent("android.intent.action.VIEW", view);
                b.startActivity(view);
            }
            // Misplaced declaration of an exception variable
            catch (View view) { }
        }
        b.finish();
        UpdateDisplayState.a(SurveyActivity.a(b));
    }
}
