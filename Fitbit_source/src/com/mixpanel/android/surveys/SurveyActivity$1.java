// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mixpanel.android.surveys;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.util.Log;
import android.view.View;
import com.mixpanel.android.mpmetrics.InAppNotification;
import com.mixpanel.android.mpmetrics.UpdateDisplayState;
import com.mixpanel.android.mpmetrics.h;

// Referenced classes of package com.mixpanel.android.surveys:
//            SurveyActivity

class a
    implements android.view.ner
{

    final InAppNotification a;
    final SurveyActivity b;

    public void onClick(View view)
    {
        view = a.l();
        if (view != null && view.length() > 0)
        {
            try
            {
                view = Uri.parse(view);
            }
            // Misplaced declaration of an exception variable
            catch (View view)
            {
                Log.i("MixpanelAPI.SrvyActvty", "Can't parse notification URI, will not take any action", view);
                return;
            }
            try
            {
                view = new Intent("android.intent.action.VIEW", view);
                b.startActivity(view);
                SurveyActivity.a(b).e().tActivity("$campaign_open", a);
            }
            // Misplaced declaration of an exception variable
            catch (View view)
            {
                Log.i("MixpanelAPI.SrvyActvty", "User doesn't have an activity for notification URI");
            }
        }
        b.finish();
        UpdateDisplayState.a(SurveyActivity.b(b));
    }

    on(SurveyActivity surveyactivity, InAppNotification inappnotification)
    {
        b = surveyactivity;
        a = inappnotification;
        super();
    }
}
