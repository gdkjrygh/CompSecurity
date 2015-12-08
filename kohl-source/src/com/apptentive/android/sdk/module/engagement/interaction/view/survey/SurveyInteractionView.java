// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.apptentive.android.sdk.module.engagement.interaction.view.survey;

import android.app.Activity;
import android.content.DialogInterface;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.apptentive.android.sdk.ApptentiveInternal;
import com.apptentive.android.sdk.Log;
import com.apptentive.android.sdk.model.Configuration;
import com.apptentive.android.sdk.model.Payload;
import com.apptentive.android.sdk.model.SurveyResponse;
import com.apptentive.android.sdk.module.engagement.EngagementModule;
import com.apptentive.android.sdk.module.engagement.interaction.model.Interaction;
import com.apptentive.android.sdk.module.engagement.interaction.model.SurveyInteraction;
import com.apptentive.android.sdk.module.engagement.interaction.model.survey.MultichoiceQuestion;
import com.apptentive.android.sdk.module.engagement.interaction.model.survey.MultiselectQuestion;
import com.apptentive.android.sdk.module.engagement.interaction.model.survey.Question;
import com.apptentive.android.sdk.module.engagement.interaction.model.survey.SinglelineQuestion;
import com.apptentive.android.sdk.module.engagement.interaction.model.survey.SurveyState;
import com.apptentive.android.sdk.module.engagement.interaction.view.InteractionView;
import com.apptentive.android.sdk.module.survey.OnSurveyFinishedListener;
import com.apptentive.android.sdk.module.survey.OnSurveyQuestionAnsweredListener;
import com.apptentive.android.sdk.storage.ApptentiveDatabase;
import com.apptentive.android.sdk.util.Util;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

// Referenced classes of package com.apptentive.android.sdk.module.engagement.interaction.view.survey:
//            TextSurveyQuestionView, MultichoiceSurveyQuestionView, MultiselectSurveyQuestionView, SurveyThankYouDialog

public class SurveyInteractionView extends InteractionView
{

    private static final String EVENT_CANCEL = "cancel";
    private static final String EVENT_LAUNCH = "launch";
    private static final String EVENT_QUESTION_RESPONSE = "question_response";
    private static final String EVENT_SUBMIT = "submit";
    private static Map data;
    private static SurveyState surveyState;

    public SurveyInteractionView(SurveyInteraction surveyinteraction)
    {
        super(surveyinteraction);
        if (surveyState == null)
        {
            surveyState = new SurveyState(surveyinteraction);
        }
        if (data == null)
        {
            data = new HashMap();
            data.put("id", surveyinteraction.getId());
        }
    }

    private void callListener(boolean flag)
    {
        OnSurveyFinishedListener onsurveyfinishedlistener = ApptentiveInternal.getOnSurveyFinishedListener();
        if (onsurveyfinishedlistener != null)
        {
            onsurveyfinishedlistener.onSurveyFinished(flag);
        }
    }

    private void cleanup()
    {
        surveyState = null;
        data = null;
    }

    public boolean isSurveyValid()
    {
        for (Iterator iterator = ((SurveyInteraction)interaction).getQuestions().iterator(); iterator.hasNext();)
        {
            Question question = (Question)iterator.next();
            if (!surveyState.isQuestionValid(question))
            {
                return false;
            }
        }

        return true;
    }

    public boolean onBackPressed(Activity activity)
    {
        if (!((SurveyInteraction)interaction).isRequired())
        {
            EngagementModule.engageInternal(activity, ((SurveyInteraction)interaction).getType().name(), "cancel", data);
            callListener(false);
            cleanup();
            return true;
        } else
        {
            return false;
        }
    }

    public void onStop()
    {
    }

    void sendMetricForQuestion(Activity activity, Question question)
    {
        String s = question.getId();
        if (!surveyState.isMetricSent(s) && surveyState.isQuestionValid(question))
        {
            HashMap hashmap = new HashMap();
            hashmap.put("id", question.getId());
            hashmap.put("survey_id", ((SurveyInteraction)interaction).getId());
            EngagementModule.engageInternal(activity, ((SurveyInteraction)interaction).getType().name(), "question_response", hashmap);
            surveyState.markMetricSent(s);
        }
    }

    public void show(final Activity activity)
    {
        super.show(activity);
        if (interaction == null)
        {
            activity.finish();
            return;
        }
        if (!surveyState.isSurveyLaunchSent())
        {
            EngagementModule.engageInternal(activity, ((SurveyInteraction)interaction).getType().name(), "launch", data);
            surveyState.setSurveyLaunchSent();
        }
        activity.setContentView(com.apptentive.android.sdk.R.layout.apptentive_survey);
        Object obj = activity.findViewById(com.apptentive.android.sdk.R.id.apptentive_branding_view);
        if (obj != null && Configuration.load(activity).isHideBranding(activity))
        {
            ((View) (obj)).setVisibility(8);
        }
        obj = (TextView)activity.findViewById(com.apptentive.android.sdk.R.id.title);
        ((TextView) (obj)).setFocusable(true);
        ((TextView) (obj)).setFocusableInTouchMode(true);
        ((TextView) (obj)).setText(((SurveyInteraction)interaction).getName());
        final Button send = ((SurveyInteraction)interaction).getDescription();
        if (send != null)
        {
            TextView textview = (TextView)activity.findViewById(com.apptentive.android.sdk.R.id.description);
            textview.setText(send);
            textview.setVisibility(0);
        }
        send = (Button)activity.findViewById(com.apptentive.android.sdk.R.id.send);
        send.setOnClickListener(new android.view.View.OnClickListener() {

            final SurveyInteractionView this$0;
            final Activity val$activity;

            public void onClick(View view)
            {
                Util.hideSoftKeyboard(activity, view);
                if (((SurveyInteraction)show).isShowSuccessMessage() && ((SurveyInteraction)show).getSuccessMessage() != null)
                {
                    view = new SurveyThankYouDialog(activity);
                    view.setMessage(((SurveyInteraction)show).getSuccessMessage());
                    view.setOnDismissListener(new android.content.DialogInterface.OnDismissListener() {

                        final _cls1 this$1;

                        public void onDismiss(DialogInterface dialoginterface)
                        {
                            activity.finish();
                        }

            
            {
                this$1 = _cls1.this;
                super();
            }
                    });
                    view.show();
                } else
                {
                    activity.finish();
                }
                EngagementModule.engageInternal(activity, ((SurveyInteraction)show).getType().name(), "submit", SurveyInteractionView.data);
                ApptentiveDatabase.getInstance(activity).addPayload(new Payload[] {
                    new SurveyResponse((SurveyInteraction)show, SurveyInteractionView.surveyState)
                });
                Log.d("Survey Submitted.", new Object[0]);
                callListener(true);
                cleanup();
            }

            
            {
                this$0 = SurveyInteractionView.this;
                activity = activity1;
                super();
            }
        });
        LinearLayout linearlayout = (LinearLayout)activity.findViewById(com.apptentive.android.sdk.R.id.questions);
        linearlayout.removeAllViews();
        Iterator iterator = ((SurveyInteraction)interaction).getQuestions().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            final Question question = (Question)iterator.next();
            if (question.getType() == 1)
            {
                TextSurveyQuestionView textsurveyquestionview = new TextSurveyQuestionView(activity, surveyState, (SinglelineQuestion)question);
                textsurveyquestionview.setOnSurveyQuestionAnsweredListener(new OnSurveyQuestionAnsweredListener() {

                    final SurveyInteractionView this$0;
                    final Activity val$activity;
                    final Question val$question;
                    final Button val$send;

                    public void onAnswered()
                    {
                        sendMetricForQuestion(activity, question);
                        send.setEnabled(isSurveyValid());
                    }

            
            {
                this$0 = SurveyInteractionView.this;
                activity = activity1;
                question = question1;
                send = button;
                super();
            }
                });
                linearlayout.addView(textsurveyquestionview);
            } else
            if (question.getType() == 2)
            {
                MultichoiceSurveyQuestionView multichoicesurveyquestionview = new MultichoiceSurveyQuestionView(activity, surveyState, (MultichoiceQuestion)question);
                multichoicesurveyquestionview.setOnSurveyQuestionAnsweredListener(new OnSurveyQuestionAnsweredListener() {

                    final SurveyInteractionView this$0;
                    final Activity val$activity;
                    final Question val$question;
                    final Button val$send;

                    public void onAnswered()
                    {
                        sendMetricForQuestion(activity, question);
                        send.setEnabled(isSurveyValid());
                    }

            
            {
                this$0 = SurveyInteractionView.this;
                activity = activity1;
                question = question1;
                send = button;
                super();
            }
                });
                linearlayout.addView(multichoicesurveyquestionview);
            } else
            if (question.getType() == 3)
            {
                MultiselectSurveyQuestionView multiselectsurveyquestionview = new MultiselectSurveyQuestionView(activity, surveyState, (MultiselectQuestion)question);
                multiselectsurveyquestionview.setOnSurveyQuestionAnsweredListener(new OnSurveyQuestionAnsweredListener() {

                    final SurveyInteractionView this$0;
                    final Activity val$activity;
                    final Question val$question;
                    final Button val$send;

                    public void onAnswered()
                    {
                        sendMetricForQuestion(activity, question);
                        send.setEnabled(isSurveyValid());
                    }

            
            {
                this$0 = SurveyInteractionView.this;
                activity = activity1;
                question = question1;
                send = button;
                super();
            }
                });
                linearlayout.addView(multiselectsurveyquestionview);
            }
        } while (true);
        send.setEnabled(isSurveyValid());
        ((TextView) (obj)).requestFocus();
    }









}
