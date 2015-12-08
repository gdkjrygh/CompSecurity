// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.apptentive.android.sdk.module.engagement.interaction.view.survey;

import android.app.Activity;
import android.content.DialogInterface;
import android.view.View;
import com.apptentive.android.sdk.Log;
import com.apptentive.android.sdk.model.Payload;
import com.apptentive.android.sdk.model.SurveyResponse;
import com.apptentive.android.sdk.module.engagement.EngagementModule;
import com.apptentive.android.sdk.module.engagement.interaction.model.SurveyInteraction;
import com.apptentive.android.sdk.storage.ApptentiveDatabase;
import com.apptentive.android.sdk.util.Util;

// Referenced classes of package com.apptentive.android.sdk.module.engagement.interaction.view.survey:
//            SurveyInteractionView, SurveyThankYouDialog

class this._cls1
    implements android.content.istener
{

    final l.activity this$1;

    public void onDismiss(DialogInterface dialoginterface)
    {
        activity.finish();
    }

    l.activity()
    {
        this$1 = this._cls1.this;
        super();
    }

    // Unreferenced inner class com/apptentive/android/sdk/module/engagement/interaction/view/survey/SurveyInteractionView$1

/* anonymous class */
    class SurveyInteractionView._cls1
        implements android.view.View.OnClickListener
    {

        final SurveyInteractionView this$0;
        final Activity val$activity;

        public void onClick(View view)
        {
            Util.hideSoftKeyboard(activity, view);
            if (((SurveyInteraction)SurveyInteractionView.access$000(SurveyInteractionView.this)).isShowSuccessMessage() && ((SurveyInteraction)SurveyInteractionView.access$100(SurveyInteractionView.this)).getSuccessMessage() != null)
            {
                view = new SurveyThankYouDialog(activity);
                view.setMessage(((SurveyInteraction)SurveyInteractionView.access$200(SurveyInteractionView.this)).getSuccessMessage());
                view.setOnDismissListener(new SurveyInteractionView._cls1._cls1());
                view.show();
            } else
            {
                activity.finish();
            }
            EngagementModule.engageInternal(activity, ((SurveyInteraction)SurveyInteractionView.access$300(SurveyInteractionView.this)).getType().name(), "submit", SurveyInteractionView.access$400());
            ApptentiveDatabase.getInstance(activity).addPayload(new Payload[] {
                new SurveyResponse((SurveyInteraction)SurveyInteractionView.access$500(SurveyInteractionView.this), SurveyInteractionView.access$600())
            });
            Log.d("Survey Submitted.", new Object[0]);
            SurveyInteractionView.access$700(SurveyInteractionView.this, true);
            SurveyInteractionView.access$800(SurveyInteractionView.this);
        }

            
            {
                this$0 = final_surveyinteractionview;
                activity = Activity.this;
                super();
            }
    }

}
