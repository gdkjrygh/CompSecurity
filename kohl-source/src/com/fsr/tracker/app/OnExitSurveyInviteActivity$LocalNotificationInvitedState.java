// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fsr.tracker.app;

import android.app.Activity;
import com.fsr.tracker.layouts.SurveyInviteClickHandler;

// Referenced classes of package com.fsr.tracker.app:
//            OnExitSurveyInviteActivity, TrackingContext

private class <init>
    implements <init>
{

    final OnExitSurveyInviteActivity this$0;

    public void onAccept(Activity activity, SurveyInviteClickHandler surveyinviteclickhandler)
    {
        TrackingContext.Instance().acceptInvitation();
        finish();
    }

    public void onDecline(SurveyInviteClickHandler surveyinviteclickhandler)
    {
        TrackingContext.Instance().declineInvitation();
        finish();
    }

    private ()
    {
        this$0 = OnExitSurveyInviteActivity.this;
        super();
    }

    this._cls0(this._cls0 _pcls0)
    {
        this();
    }
}
