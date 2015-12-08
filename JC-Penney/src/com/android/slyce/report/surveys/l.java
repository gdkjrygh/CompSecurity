// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.slyce.report.surveys;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.util.Log;
import android.view.View;
import com.android.slyce.report.mpmetrics.InAppNotification;
import com.android.slyce.report.mpmetrics.UpdateDisplayState;
import com.android.slyce.report.mpmetrics.af;
import com.android.slyce.report.mpmetrics.ak;

// Referenced classes of package com.android.slyce.report.surveys:
//            k

class l
    implements android.view.View.OnClickListener
{

    final InAppNotification a;
    final k b;

    l(k k1, InAppNotification inappnotification)
    {
        b = k1;
        a = inappnotification;
        super();
    }

    public void onClick(View view)
    {
        view = a.j();
        if (view != null && view.length() > 0)
        {
            try
            {
                view = Uri.parse(view);
            }
            // Misplaced declaration of an exception variable
            catch (View view)
            {
                Log.i("MixpanelAPI.SurveyActivity", "Can't parse notification URI, will not take any action", view);
                return;
            }
            try
            {
                view = new Intent("android.intent.action.VIEW", view);
                b.startActivity(view);
                k.a(b).c().a("$campaign_open", a);
            }
            // Misplaced declaration of an exception variable
            catch (View view)
            {
                Log.i("MixpanelAPI.SurveyActivity", "User doesn't have an activity for notification URI");
            }
        }
        b.finish();
        UpdateDisplayState.a(k.b(b));
    }
}
