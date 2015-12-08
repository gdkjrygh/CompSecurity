// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.apptentive.android.sdk.module.engagement.interaction.view;

import android.app.Activity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.apptentive.android.sdk.module.engagement.EngagementModule;
import com.apptentive.android.sdk.module.engagement.interaction.model.EnjoymentDialogInteraction;
import com.apptentive.android.sdk.prefence.KohlsApptentivePreference;

// Referenced classes of package com.apptentive.android.sdk.module.engagement.interaction.view:
//            InteractionView

public class EnjoymentDialogInteractionView extends InteractionView
{

    private static final String CODE_POINT_CANCEL = "cancel";
    private static final String CODE_POINT_LAUNCH = "launch";
    private static final String CODE_POINT_NO = "no";
    private static final String CODE_POINT_YES = "yes";

    public EnjoymentDialogInteractionView(EnjoymentDialogInteraction enjoymentdialoginteraction)
    {
        super(enjoymentdialoginteraction);
    }

    public boolean onBackPressed(Activity activity)
    {
        EngagementModule.engageInternal(activity, ((EnjoymentDialogInteraction)interaction).getType().name(), "cancel");
        return true;
    }

    public void onStop()
    {
    }

    public void show(final Activity activity)
    {
        (new KohlsApptentivePreference(activity)).setApptentivePreference(true);
        super.show(activity);
        activity.setContentView(com.apptentive.android.sdk.R.layout.apptentive_enjoyment_dialog_interaction);
        EngagementModule.engageInternal(activity, ((EnjoymentDialogInteraction)interaction).getType().name(), "launch");
        ((TextView)activity.findViewById(com.apptentive.android.sdk.R.id.title)).setText(((EnjoymentDialogInteraction)interaction).getTitle(activity));
        String s = ((EnjoymentDialogInteraction)interaction).getNoText();
        Button button = (Button)activity.findViewById(com.apptentive.android.sdk.R.id.no);
        if (s != null)
        {
            button.setText(s);
        }
        button.setOnClickListener(new android.view.View.OnClickListener() {

            final EnjoymentDialogInteractionView this$0;
            final Activity val$activity;

            public void onClick(View view)
            {
                EngagementModule.engageInternal(activity, ((EnjoymentDialogInteraction)interaction).getType().name(), "no");
                activity.finish();
            }

            
            {
                this$0 = EnjoymentDialogInteractionView.this;
                activity = activity1;
                super();
            }
        });
        s = ((EnjoymentDialogInteraction)interaction).getYesText();
        button = (Button)activity.findViewById(com.apptentive.android.sdk.R.id.yes);
        if (s != null)
        {
            button.setText(s);
        }
        button.setOnClickListener(new android.view.View.OnClickListener() {

            final EnjoymentDialogInteractionView this$0;
            final Activity val$activity;

            public void onClick(View view)
            {
                EngagementModule.engageInternal(activity, ((EnjoymentDialogInteraction)interaction).getType().name(), "yes");
                activity.finish();
            }

            
            {
                this$0 = EnjoymentDialogInteractionView.this;
                activity = activity1;
                super();
            }
        });
    }
}
