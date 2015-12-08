// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fsr.tracker.app;

import android.app.Activity;
import android.content.res.Resources;
import android.view.WindowManager;
import com.fsr.tracker.domain.Configuration;
import com.fsr.tracker.layouts.InviteViewParams;
import com.fsr.tracker.layouts.OnExitDetailsView;
import com.fsr.tracker.layouts.SurveyInviteClickHandler;

// Referenced classes of package com.fsr.tracker.app:
//            OnExitSurveyInviteActivity, TrackingContext

private class <init>
    implements <init>
{

    final OnExitSurveyInviteActivity this$0;

    public void onAccept(Activity activity, SurveyInviteClickHandler surveyinviteclickhandler)
    {
        InviteViewParams inviteviewparams = new InviteViewParams(getWindowManager().getDefaultDisplay(), getResources().getConfiguration());
        OnExitSurveyInviteActivity.access$202(OnExitSurveyInviteActivity.this, new OnExitDetailsView(activity, inviteviewparams, OnExitSurveyInviteActivity.access$300(OnExitSurveyInviteActivity.this).getCustomLogoPath(), surveyinviteclickhandler, stringsProvider));
        inviteView = OnExitSurveyInviteActivity.access$200(OnExitSurveyInviteActivity.this);
        setContentView(inviteView);
        TrackingContext.Instance().acceptInvitation();
        OnExitSurveyInviteActivity.access$402(OnExitSurveyInviteActivity.this, new ted(OnExitSurveyInviteActivity.this, null));
    }

    public void onDecline(SurveyInviteClickHandler surveyinviteclickhandler)
    {
        TrackingContext.Instance().declineInvitation();
        finish();
    }

    private ted()
    {
        this$0 = OnExitSurveyInviteActivity.this;
        super();
    }

    this._cls0(this._cls0 _pcls0)
    {
        this();
    }
}
