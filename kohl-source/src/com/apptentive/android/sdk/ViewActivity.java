// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.apptentive.android.sdk;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Toast;
import com.apptentive.android.sdk.module.ActivityContent;
import com.apptentive.android.sdk.module.engagement.interaction.model.AppStoreRatingInteraction;
import com.apptentive.android.sdk.module.engagement.interaction.model.EnjoymentDialogInteraction;
import com.apptentive.android.sdk.module.engagement.interaction.model.FeedbackDialogInteraction;
import com.apptentive.android.sdk.module.engagement.interaction.model.Interaction;
import com.apptentive.android.sdk.module.engagement.interaction.model.RatingDialogInteraction;
import com.apptentive.android.sdk.module.engagement.interaction.model.SurveyInteraction;
import com.apptentive.android.sdk.module.engagement.interaction.model.UpgradeMessageInteraction;
import com.apptentive.android.sdk.module.engagement.interaction.view.AppStoreRatingInteractionView;
import com.apptentive.android.sdk.module.engagement.interaction.view.EnjoymentDialogInteractionView;
import com.apptentive.android.sdk.module.engagement.interaction.view.FeedbackDialogInteractionView;
import com.apptentive.android.sdk.module.engagement.interaction.view.InteractionView;
import com.apptentive.android.sdk.module.engagement.interaction.view.RatingDialogInteractionView;
import com.apptentive.android.sdk.module.engagement.interaction.view.UpgradeMessageInteractionView;
import com.apptentive.android.sdk.module.engagement.interaction.view.survey.SurveyInteractionView;
import com.apptentive.android.sdk.module.messagecenter.ApptentiveMessageCenter;
import com.apptentive.android.sdk.module.messagecenter.view.MessageCenterView;
import com.apptentive.android.sdk.module.metric.MetricModule;
import com.apptentive.android.sdk.util.ActivityUtil;
import org.json.JSONObject;

// Referenced classes of package com.apptentive.android.sdk:
//            ApptentiveActivity, Log, AboutModule, ApptentiveInternal, 
//            GlobalInfo, Apptentive

public class ViewActivity extends ApptentiveActivity
{

    private com.apptentive.android.sdk.module.ActivityContent.Type activeContentType;
    private ActivityContent activityContent;
    private String pushCallbackActivityName;
    private boolean returnToPushCallbackActivity;

    public ViewActivity()
    {
    }

    public void finish()
    {
        super.finish();
        overridePendingTransition(0, R.anim.slide_down_out);
        if (pushCallbackActivityName != null)
        {
            Log.d("Returning to callback Activity: %s", new Object[] {
                pushCallbackActivityName
            });
            Class class1 = ActivityUtil.getActivityClassFromName(pushCallbackActivityName);
            if (class1 != null)
            {
                startActivity(new Intent(this, class1));
                overridePendingTransition(R.anim.slide_up_in, 0);
            }
        }
    }

    protected void onActivityResult(int i, int j, Intent intent)
    {
        super.onActivityResult(i, j, intent);
        if (j != -1) goto _L2; else goto _L1
_L1:
        i;
        JVM INSTR tableswitch 1000 1000: default 32
    //                   1000 33;
           goto _L2 _L3
_L2:
        return;
_L3:
        MessageCenterView.showAttachmentDialog(this, intent.getData());
        return;
    }

    public void onBackPressed()
    {
        boolean flag = true;
        static class _cls1
        {

            static final int $SwitchMap$com$apptentive$android$sdk$ApptentiveInternal$PushAction[];
            static final int $SwitchMap$com$apptentive$android$sdk$module$ActivityContent$Type[];
            static final int $SwitchMap$com$apptentive$android$sdk$module$engagement$interaction$model$Interaction$Type[];

            static 
            {
                $SwitchMap$com$apptentive$android$sdk$module$ActivityContent$Type = new int[com.apptentive.android.sdk.module.ActivityContent.Type.values().length];
                try
                {
                    $SwitchMap$com$apptentive$android$sdk$module$ActivityContent$Type[com.apptentive.android.sdk.module.ActivityContent.Type.ABOUT.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror10) { }
                try
                {
                    $SwitchMap$com$apptentive$android$sdk$module$ActivityContent$Type[com.apptentive.android.sdk.module.ActivityContent.Type.MESSAGE_CENTER.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror9) { }
                try
                {
                    $SwitchMap$com$apptentive$android$sdk$module$ActivityContent$Type[com.apptentive.android.sdk.module.ActivityContent.Type.INTERACTION.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror8) { }
                $SwitchMap$com$apptentive$android$sdk$module$engagement$interaction$model$Interaction$Type = new int[com.apptentive.android.sdk.module.engagement.interaction.model.Interaction.Type.values().length];
                try
                {
                    $SwitchMap$com$apptentive$android$sdk$module$engagement$interaction$model$Interaction$Type[com.apptentive.android.sdk.module.engagement.interaction.model.Interaction.Type.UpgradeMessage.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror7) { }
                try
                {
                    $SwitchMap$com$apptentive$android$sdk$module$engagement$interaction$model$Interaction$Type[com.apptentive.android.sdk.module.engagement.interaction.model.Interaction.Type.EnjoymentDialog.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror6) { }
                try
                {
                    $SwitchMap$com$apptentive$android$sdk$module$engagement$interaction$model$Interaction$Type[com.apptentive.android.sdk.module.engagement.interaction.model.Interaction.Type.RatingDialog.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror5) { }
                try
                {
                    $SwitchMap$com$apptentive$android$sdk$module$engagement$interaction$model$Interaction$Type[com.apptentive.android.sdk.module.engagement.interaction.model.Interaction.Type.AppStoreRating.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror4) { }
                try
                {
                    $SwitchMap$com$apptentive$android$sdk$module$engagement$interaction$model$Interaction$Type[com.apptentive.android.sdk.module.engagement.interaction.model.Interaction.Type.FeedbackDialog.ordinal()] = 5;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    $SwitchMap$com$apptentive$android$sdk$module$engagement$interaction$model$Interaction$Type[com.apptentive.android.sdk.module.engagement.interaction.model.Interaction.Type.Survey.ordinal()] = 6;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    $SwitchMap$com$apptentive$android$sdk$module$engagement$interaction$model$Interaction$Type[com.apptentive.android.sdk.module.engagement.interaction.model.Interaction.Type.MessageCenter.ordinal()] = 7;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                $SwitchMap$com$apptentive$android$sdk$ApptentiveInternal$PushAction = new int[ApptentiveInternal.PushAction.values().length];
                try
                {
                    $SwitchMap$com$apptentive$android$sdk$ApptentiveInternal$PushAction[ApptentiveInternal.PushAction.pmc.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        _cls1..SwitchMap.com.apptentive.android.sdk.module.ActivityContent.Type[activeContentType.ordinal()];
        JVM INSTR tableswitch 1 3: default 40
    //                   1 53
    //                   2 64
    //                   3 72;
           goto _L1 _L2 _L3 _L4
_L1:
        if (flag)
        {
            finish();
            super.onBackPressed();
        }
        return;
_L2:
        flag = AboutModule.getInstance().onBackPressed(this);
        continue; /* Loop/switch isn't completed */
_L3:
        flag = ApptentiveMessageCenter.onBackPressed(this);
        continue; /* Loop/switch isn't completed */
_L4:
        if (activityContent != null)
        {
            flag = activityContent.onBackPressed(this);
        }
        if (true) goto _L1; else goto _L5
_L5:
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        String s;
        requestWindowFeature(1);
        bundle = getIntent().getStringExtra("activityContent");
        s = getIntent().getStringExtra("com.parse.Data");
        if (bundle == null) goto _L2; else goto _L1
_L1:
        try
        {
            Log.v("Started ViewActivity normally for %s.", new Object[] {
                bundle
            });
            activeContentType = com.apptentive.android.sdk.module.ActivityContent.Type.parse(getIntent().getStringExtra("activityContent"));
        }
        // Misplaced declaration of an exception variable
        catch (Bundle bundle)
        {
            Log.e("Error creating ViewActivity.", bundle, new Object[0]);
            MetricModule.sendError(this, bundle, null, null);
        }
_L3:
        if (activeContentType == null)
        {
            finish();
        }
        bundle = getWindow();
        bundle.setFormat(1);
        bundle.addFlags(4096);
        return;
_L2:
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_243;
        }
        break MISSING_BLOCK_LABEL_97;
        if (false)
        {
        } else
        {
            break MISSING_BLOCK_LABEL_64;
        }
label0:
        {
            Log.i("Started ViewActivity from Parse push.", new Object[0]);
            pushCallbackActivityName = ApptentiveInternal.getPushCallbackActivityName();
            if (pushCallbackActivityName == null)
            {
                break label0;
            }
            returnToPushCallbackActivity = true;
            bundle = ApptentiveInternal.PushAction.parse((new JSONObject((new JSONObject(s)).optString("apptentive"))).getString("action"));
            switch (_cls1..SwitchMap.com.apptentive.android.sdk.ApptentiveInternal.PushAction[bundle.ordinal()])
            {
            default:
                if (false)
                {
                } else
                {
                    break MISSING_BLOCK_LABEL_64;
                }

            case 1: // '\001'
                activeContentType = com.apptentive.android.sdk.module.ActivityContent.Type.MESSAGE_CENTER;
                break;
            }
            break MISSING_BLOCK_LABEL_64;
        }
        Log.a("Push callback Activity was not set. Make sure to call Apptentive.setPushCallback()", new Object[0]);
        if (GlobalInfo.isAppDebuggable)
        {
            Toast.makeText(this, "Push callback Activity was not set. Make sure to call Apptentive.setPushCallback()", 1).show();
        }
        finish();
          goto _L3
        Log.e("Started ViewActivity in a bad way.", new Object[0]);
          goto _L3
    }

    protected void onRestoreInstanceState(Bundle bundle)
    {
        super.onRestoreInstanceState(bundle);
        returnToPushCallbackActivity = bundle.getBoolean("returnToPushCallbackActivity", false);
        pushCallbackActivityName = bundle.getString("pushCallbackActivityName");
    }

    protected void onSaveInstanceState(Bundle bundle)
    {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("returnToPushCallbackActivity", returnToPushCallbackActivity);
        bundle.putString("pushCallbackActivityName", pushCallbackActivityName);
    }

    protected void onStart()
    {
        super.onStart();
        _cls1..SwitchMap.com.apptentive.android.sdk.module.ActivityContent.Type[activeContentType.ordinal()];
        JVM INSTR tableswitch 1 3: default 299
    //                   1 54
    //                   2 82
    //                   3 95;
           goto _L1 _L2 _L3 _L4
_L1:
        Log.w("No Activity specified. Finishing...", new Object[0]);
        finish();
        return;
_L2:
        try
        {
            AboutModule.getInstance().doShow(this);
            return;
        }
        catch (Exception exception)
        {
            Log.e("Error starting ViewActivity.", exception, new Object[0]);
            MetricModule.sendError(this, exception, null, null);
            return;
        }
_L3:
        getWindow().setSoftInputMode(1);
        ApptentiveMessageCenter.doShow(this);
        return;
_L4:
        Interaction interaction = com.apptentive.android.sdk.module.engagement.interaction.model.Interaction.Factory.parseInteraction(getIntent().getExtras().getCharSequence("interaction").toString());
        Object obj = null;
        _cls1..SwitchMap.com.apptentive.android.sdk.module.engagement.interaction.model.Interaction.Type[interaction.getType().ordinal()];
        JVM INSTR tableswitch 1 7: default 302
    //                   1 186
    //                   2 201
    //                   3 216
    //                   4 231
    //                   5 246
    //                   6 261
    //                   7 276;
           goto _L5 _L6 _L7 _L8 _L9 _L10 _L11 _L12
_L5:
        activityContent = ((ActivityContent) (obj));
        if (obj != null) goto _L14; else goto _L13
_L13:
        finish();
        return;
_L6:
        obj = new UpgradeMessageInteractionView((UpgradeMessageInteraction)interaction);
          goto _L5
_L7:
        obj = new EnjoymentDialogInteractionView((EnjoymentDialogInteraction)interaction);
          goto _L5
_L8:
        obj = new RatingDialogInteractionView((RatingDialogInteraction)interaction);
          goto _L5
_L9:
        obj = new AppStoreRatingInteractionView((AppStoreRatingInteraction)interaction);
          goto _L5
_L10:
        obj = new FeedbackDialogInteractionView((FeedbackDialogInteraction)interaction);
          goto _L5
_L11:
        obj = new SurveyInteractionView((SurveyInteraction)interaction);
          goto _L5
_L12:
        getWindow().setSoftInputMode(2);
        finish();
        Apptentive.showMessageCenter(this);
        return;
_L14:
        ((InteractionView) (obj)).show(this);
        return;
    }

    protected void onStop()
    {
        super.onStop();
        _cls1..SwitchMap.com.apptentive.android.sdk.module.ActivityContent.Type[activeContentType.ordinal()];
        JVM INSTR tableswitch 1 3: default 40
    //                   1 40
    //                   2 41
    //                   3 46;
           goto _L1 _L1 _L2 _L3
_L1:
        return;
_L2:
        ApptentiveMessageCenter.onStop(this);
        return;
_L3:
        if (activityContent != null)
        {
            activityContent.onStop();
            return;
        }
        if (true) goto _L1; else goto _L4
_L4:
    }

    public void showAboutActivity(View view)
    {
        AboutModule.getInstance().show(this);
    }
}
