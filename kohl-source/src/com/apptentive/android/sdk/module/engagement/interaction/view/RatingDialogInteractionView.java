// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.apptentive.android.sdk.module.engagement.interaction.view;

import android.app.Activity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.apptentive.android.sdk.module.engagement.EngagementModule;
import com.apptentive.android.sdk.module.engagement.interaction.model.RatingDialogInteraction;

// Referenced classes of package com.apptentive.android.sdk.module.engagement.interaction.view:
//            InteractionView

public class RatingDialogInteractionView extends InteractionView
{

    private static final String CODE_POINT_CANCEL = "cancel";
    private static final String CODE_POINT_DECLINE = "decline";
    private static final String CODE_POINT_LAUNCH = "launch";
    private static final String CODE_POINT_RATE = "rate";
    private static final String CODE_POINT_REMIND = "remind";

    public RatingDialogInteractionView(RatingDialogInteraction ratingdialoginteraction)
    {
        super(ratingdialoginteraction);
    }

    public boolean onBackPressed(Activity activity)
    {
        EngagementModule.engageInternal(activity, ((RatingDialogInteraction)interaction).getType().name(), "cancel");
        return true;
    }

    public void onStop()
    {
    }

    public void show(final Activity activity)
    {
        super.show(activity);
        activity.setContentView(com.apptentive.android.sdk.R.layout.apptentive_rating_dialog_interaction);
        EngagementModule.engageInternal(activity, ((RatingDialogInteraction)interaction).getType().name(), "launch");
        Object obj = ((RatingDialogInteraction)interaction).getTitle();
        if (obj != null)
        {
            ((TextView)activity.findViewById(com.apptentive.android.sdk.R.id.title)).setText(((CharSequence) (obj)));
        }
        ((TextView)activity.findViewById(com.apptentive.android.sdk.R.id.body)).setText(((RatingDialogInteraction)interaction).getBody(activity));
        obj = (Button)activity.findViewById(com.apptentive.android.sdk.R.id.rate);
        ((Button) (obj)).setText(((RatingDialogInteraction)interaction).getRateText(activity));
        ((Button) (obj)).setOnClickListener(new android.view.View.OnClickListener() {

            final RatingDialogInteractionView this$0;
            final Activity val$activity;

            public void onClick(View view)
            {
                EngagementModule.engageInternal(activity, ((RatingDialogInteraction)interaction).getType().name(), "rate");
                activity.finish();
            }

            
            {
                this$0 = RatingDialogInteractionView.this;
                activity = activity1;
                super();
            }
        });
        obj = (Button)activity.findViewById(com.apptentive.android.sdk.R.id.remind);
        String s = ((RatingDialogInteraction)interaction).getRemindText();
        if (s != null)
        {
            ((Button) (obj)).setText(s);
        }
        ((Button) (obj)).setOnClickListener(new android.view.View.OnClickListener() {

            final RatingDialogInteractionView this$0;
            final Activity val$activity;

            public void onClick(View view)
            {
                EngagementModule.engageInternal(activity, ((RatingDialogInteraction)interaction).getType().name(), "remind");
                activity.finish();
            }

            
            {
                this$0 = RatingDialogInteractionView.this;
                activity = activity1;
                super();
            }
        });
        obj = (Button)activity.findViewById(com.apptentive.android.sdk.R.id.decline);
        s = ((RatingDialogInteraction)interaction).getDeclineText();
        if (s != null)
        {
            ((Button) (obj)).setText(s);
        }
        ((Button) (obj)).setOnClickListener(new android.view.View.OnClickListener() {

            final RatingDialogInteractionView this$0;
            final Activity val$activity;

            public void onClick(View view)
            {
                EngagementModule.engageInternal(activity, ((RatingDialogInteraction)interaction).getType().name(), "decline");
                activity.finish();
            }

            
            {
                this$0 = RatingDialogInteractionView.this;
                activity = activity1;
                super();
            }
        });
    }
}
