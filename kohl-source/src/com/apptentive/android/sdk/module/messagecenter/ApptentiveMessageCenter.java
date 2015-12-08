// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.apptentive.android.sdk.module.messagecenter;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.net.Uri;
import android.view.ViewGroup;
import android.widget.Toast;
import com.apptentive.android.sdk.Log;
import com.apptentive.android.sdk.ViewActivity;
import com.apptentive.android.sdk.model.Configuration;
import com.apptentive.android.sdk.model.FileMessage;
import com.apptentive.android.sdk.model.Payload;
import com.apptentive.android.sdk.model.Person;
import com.apptentive.android.sdk.model.TextMessage;
import com.apptentive.android.sdk.module.messagecenter.view.MessageCenterIntroDialog;
import com.apptentive.android.sdk.module.messagecenter.view.MessageCenterThankYouDialog;
import com.apptentive.android.sdk.module.messagecenter.view.MessageCenterView;
import com.apptentive.android.sdk.module.metric.MetricModule;
import com.apptentive.android.sdk.storage.ApptentiveDatabase;
import com.apptentive.android.sdk.storage.PersonManager;
import com.apptentive.android.sdk.util.Util;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.apptentive.android.sdk.module.messagecenter:
//            MessageManager, MessagePollingWorker

public class ApptentiveMessageCenter
{
    static final class Trigger extends Enum
    {

        private static final Trigger $VALUES[];
        public static final Trigger enjoyment_dialog;
        public static final Trigger message_center;

        public static Trigger valueOf(String s)
        {
            return (Trigger)Enum.valueOf(com/apptentive/android/sdk/module/messagecenter/ApptentiveMessageCenter$Trigger, s);
        }

        public static Trigger[] values()
        {
            return (Trigger[])$VALUES.clone();
        }

        static 
        {
            enjoyment_dialog = new Trigger("enjoyment_dialog", 0);
            message_center = new Trigger("message_center", 1);
            $VALUES = (new Trigger[] {
                enjoyment_dialog, message_center
            });
        }

        private Trigger(String s, int i)
        {
            super(s, i);
        }
    }


    private static Map customData;
    protected static MessageCenterView messageCenterView;
    private static Trigger trigger;

    public ApptentiveMessageCenter()
    {
    }

    public static void clearPendingMessageCenterPushNotification(Activity activity)
    {
        SharedPreferences sharedpreferences = activity.getSharedPreferences("APPTENTIVE", 0);
        String s = sharedpreferences.getString("pendingPushNotification", null);
        if (s != null)
        {
            try
            {
                JSONObject jsonobject = new JSONObject(s);
                com.apptentive.android.sdk.ApptentiveInternal.PushAction pushaction = com.apptentive.android.sdk.ApptentiveInternal.PushAction.unknown;
                if (jsonobject.has("action"))
                {
                    pushaction = com.apptentive.android.sdk.ApptentiveInternal.PushAction.parse(jsonobject.getString("action"));
                }
                static class _cls5
                {

                    static final int $SwitchMap$com$apptentive$android$sdk$ApptentiveInternal$PushAction[];
                    static final int $SwitchMap$com$apptentive$android$sdk$module$messagecenter$ApptentiveMessageCenter$Trigger[];

                    static 
                    {
                        $SwitchMap$com$apptentive$android$sdk$ApptentiveInternal$PushAction = new int[com.apptentive.android.sdk.ApptentiveInternal.PushAction.values().length];
                        try
                        {
                            $SwitchMap$com$apptentive$android$sdk$ApptentiveInternal$PushAction[com.apptentive.android.sdk.ApptentiveInternal.PushAction.pmc.ordinal()] = 1;
                        }
                        catch (NoSuchFieldError nosuchfielderror2) { }
                        $SwitchMap$com$apptentive$android$sdk$module$messagecenter$ApptentiveMessageCenter$Trigger = new int[Trigger.values().length];
                        try
                        {
                            $SwitchMap$com$apptentive$android$sdk$module$messagecenter$ApptentiveMessageCenter$Trigger[Trigger.enjoyment_dialog.ordinal()] = 1;
                        }
                        catch (NoSuchFieldError nosuchfielderror1) { }
                        try
                        {
                            $SwitchMap$com$apptentive$android$sdk$module$messagecenter$ApptentiveMessageCenter$Trigger[Trigger.message_center.ordinal()] = 2;
                        }
                        catch (NoSuchFieldError nosuchfielderror)
                        {
                            return;
                        }
                    }
                }

                switch (_cls5..SwitchMap.com.apptentive.android.sdk.ApptentiveInternal.PushAction[pushaction.ordinal()])
                {
                case 1: // '\001'
                    Log.i("Clearing pending Message Center push notification.", new Object[0]);
                    sharedpreferences.edit().remove("pendingPushNotification").commit();
                    return;
                }
            }
            catch (JSONException jsonexception)
            {
                Log.w("Error parsing JSON from push notification.", jsonexception, new Object[0]);
                MetricModule.sendError(activity.getApplicationContext(), jsonexception, "Parsing Push notification", s);
                return;
            }
        }
    }

    public static void doShow(Context context)
    {
        if (!(context instanceof Activity))
        {
            Log.e((new StringBuilder()).append(com/apptentive/android/sdk/module/messagecenter/ApptentiveMessageCenter.getSimpleName()).append(" must be initialized with an Activity Context.").toString(), new Object[0]);
            return;
        }
        com.apptentive.android.sdk.model.Event.EventLabel eventlabel = com.apptentive.android.sdk.model.Event.EventLabel.message_center__launch;
        Object obj;
        if (trigger == null)
        {
            obj = null;
        } else
        {
            obj = trigger.name();
        }
        MetricModule.sendMetric(context, eventlabel, ((String) (obj)));
        obj = new com.apptentive.android.sdk.module.messagecenter.view.MessageCenterView.OnSendMessageListener(context) {

            final Context val$context;

            public void onSendFileMessage(Uri uri)
            {
                FileMessage filemessage = new FileMessage();
                if (filemessage.internalCreateStoredImage(context, uri.toString()))
                {
                    filemessage.setRead(true);
                    filemessage.setCustomData(ApptentiveMessageCenter.customData);
                    ApptentiveMessageCenter.customData = null;
                    MessageManager.sendMessage(context, filemessage);
                    ApptentiveMessageCenter.messageCenterView.post(filemessage. new Runnable() {

                        final _cls1 this$0;
                        final FileMessage val$message;

                        public void run()
                        {
                            ApptentiveMessageCenter.messageCenterView.addMessage(message);
                        }

            
            {
                this$0 = final__pcls1;
                message = FileMessage.this;
                super();
            }
                    });
                    ApptentiveMessageCenter.scrollToBottom();
                    return;
                } else
                {
                    Log.e("Unable to send file.", new Object[0]);
                    Toast.makeText(ApptentiveMessageCenter.messageCenterView.getContext(), "Unable to send file.", 0).show();
                    return;
                }
            }

            public void onSendTextMessage(String s)
            {
                TextMessage textmessage = new TextMessage();
                textmessage.setBody(s);
                textmessage.setRead(true);
                textmessage.setCustomData(ApptentiveMessageCenter.customData);
                ApptentiveMessageCenter.customData = null;
                MessageManager.sendMessage(context, textmessage);
                ApptentiveMessageCenter.messageCenterView.post(textmessage. new Runnable() {

                    final _cls1 this$0;
                    final TextMessage val$message;

                    public void run()
                    {
                        ApptentiveMessageCenter.messageCenterView.addMessage(message);
                    }

            
            {
                this$0 = final__pcls1;
                message = TextMessage.this;
                super();
            }
                });
                ApptentiveMessageCenter.scrollToBottom();
            }

            
            {
                context = context1;
                super();
            }
        };
        messageCenterView = new MessageCenterView((Activity)context, ((com.apptentive.android.sdk.module.messagecenter.view.MessageCenterView.OnSendMessageListener) (obj)));
        if (messageCenterView.getParent() != null)
        {
            ((ViewGroup)messageCenterView.getParent()).removeView(messageCenterView);
        }
        ((Activity)context).setContentView(messageCenterView);
        messageCenterView.setMessages(MessageManager.getMessages(context));
        MessageManager.setInternalOnMessagesUpdatedListener(new MessageManager.OnNewMessagesListener(context) {

            final Context val$context;

            public void onMessagesUpdated()
            {
                ApptentiveMessageCenter.messageCenterView.post(new Runnable() {

                    final _cls2 this$0;

                    public void run()
                    {
                        java.util.List list = MessageManager.getMessages(context);
                        ApptentiveMessageCenter.messageCenterView.setMessages(list);
                        ApptentiveMessageCenter.scrollToBottom();
                    }

            
            {
                this$0 = _cls2.this;
                super();
            }
                });
            }

            
            {
                context = context1;
                super();
            }
        });
        MessagePollingWorker.setMessageCenterInForeground(true);
        MessageManager.setSentMessageListener(messageCenterView);
        scrollToBottom();
    }

    public static boolean onBackPressed(Activity activity)
    {
        clearPendingMessageCenterPushNotification(activity);
        MetricModule.sendMetric(activity, com.apptentive.android.sdk.model.Event.EventLabel.message_center__close);
        return true;
    }

    public static void onStop(Activity activity)
    {
        clearPendingMessageCenterPushNotification(activity);
        MessagePollingWorker.setMessageCenterInForeground(false);
    }

    public static void scrollToBottom()
    {
        messageCenterView.scrollMessageListViewToBottom();
    }

    protected static void show(Activity activity)
    {
        boolean flag = false;
        SharedPreferences sharedpreferences = activity.getSharedPreferences("APPTENTIVE", 0);
        Configuration configuration = Configuration.load(activity);
        boolean flag1 = configuration.isMessageCenterEnabled(activity);
        boolean flag2 = configuration.isMessageCenterEmailRequired(activity);
        if (!flag1 || sharedpreferences.getBoolean("messageCenterShouldShowIntroDialog", true))
        {
            flag = true;
        }
        if (flag)
        {
            showIntroDialog(activity, flag2);
            return;
        } else
        {
            Intent intent = new Intent();
            intent.setClass(activity, com/apptentive/android/sdk/ViewActivity);
            intent.putExtra("activityContent", com.apptentive.android.sdk.module.ActivityContent.Type.MESSAGE_CENTER.toString());
            activity.startActivity(intent);
            activity.overridePendingTransition(com.apptentive.android.sdk.R.anim.slide_up_in, com.apptentive.android.sdk.R.anim.slide_down_out);
            return;
        }
    }

    public static void show(Activity activity, boolean flag, Map map)
    {
        MessageManager.createMessageCenterAutoMessage(activity, flag);
        Trigger trigger1;
        if (flag)
        {
            trigger1 = Trigger.message_center;
        } else
        {
            trigger1 = Trigger.enjoyment_dialog;
        }
        trigger = trigger1;
        customData = map;
        show(activity);
    }

    static void showIntroDialog(Activity activity, Trigger trigger1, boolean flag)
    {
        trigger = trigger1;
        showIntroDialog(activity, flag);
    }

    static void showIntroDialog(Activity activity, boolean flag)
    {
        MessageCenterIntroDialog messagecenterintrodialog;
        String s;
        messagecenterintrodialog = new MessageCenterIntroDialog(activity);
        messagecenterintrodialog.setEmailRequired(flag);
        s = PersonManager.loadPersonEmail(activity);
        String s1 = PersonManager.loadInitialPersonEmail(activity);
        if (Util.isEmpty(s))
        {
            if (!Util.isEmpty(s1))
            {
                messagecenterintrodialog.setEmailFieldHidden(false);
                messagecenterintrodialog.prePopulateEmail(s1);
            }
        } else
        {
            messagecenterintrodialog.setEmailFieldHidden(true);
        }
        messagecenterintrodialog.setCanceledOnTouchOutside(false);
        messagecenterintrodialog.setOnCancelListener(new android.content.DialogInterface.OnCancelListener(activity, messagecenterintrodialog) {

            final Activity val$activity;
            final MessageCenterIntroDialog val$dialog;

            public void onCancel(DialogInterface dialoginterface)
            {
                MetricModule.sendMetric(activity, com.apptentive.android.sdk.model.Event.EventLabel.message_center__intro__cancel);
                dialog.dismiss();
            }

            
            {
                activity = activity1;
                dialog = messagecenterintrodialog;
                super();
            }
        });
        messagecenterintrodialog.setOnSendListener(new com.apptentive.android.sdk.module.messagecenter.view.MessageCenterIntroDialog.OnSendListener(activity, messagecenterintrodialog) {

            final Activity val$activity;
            final MessageCenterIntroDialog val$dialog;

            public void onSend(String s2, String s3)
            {
                boolean flag1 = true;
                activity.getSharedPreferences("APPTENTIVE", 0).edit().putBoolean("messageCenterShouldShowIntroDialog", false).commit();
                if (dialog.isEmailFieldVisible() && s2 != null && s2.length() != 0)
                {
                    PersonManager.storePersonEmail(activity, s2);
                    Object obj = PersonManager.storePersonAndReturnDiff(activity);
                    if (obj != null)
                    {
                        Log.d("Person was updated.", new Object[0]);
                        Log.v(((Person) (obj)).toString(), new Object[0]);
                        ApptentiveDatabase.getInstance(activity).addPayload(new Payload[] {
                            obj
                        });
                    } else
                    {
                        Log.d("Person was not updated.", new Object[0]);
                    }
                }
                obj = new TextMessage();
                ((TextMessage) (obj)).setBody(s3);
                ((TextMessage) (obj)).setRead(true);
                ((TextMessage) (obj)).setCustomData(ApptentiveMessageCenter.customData);
                ApptentiveMessageCenter.customData = null;
                MessageManager.sendMessage(activity, ((com.apptentive.android.sdk.model.Message) (obj)));
                MetricModule.sendMetric(activity, com.apptentive.android.sdk.model.Event.EventLabel.message_center__intro__send);
                dialog.dismiss();
                s3 = new MessageCenterThankYouDialog(activity);
                if (s2 == null || !Util.isEmailValid(s2))
                {
                    flag1 = false;
                }
                s3.setValidEmailProvided(flag1);
                s3.setOnChoiceMadeListener(new com.apptentive.android.sdk.module.messagecenter.view.MessageCenterThankYouDialog.OnChoiceMadeListener() {

                    final _cls4 this$0;

                    public void onNo()
                    {
                        MetricModule.sendMetric(activity, com.apptentive.android.sdk.model.Event.EventLabel.message_center__thank_you__close);
                    }

                    public void onYes()
                    {
                        MetricModule.sendMetric(activity, com.apptentive.android.sdk.model.Event.EventLabel.message_center__thank_you__messages);
                        ApptentiveMessageCenter.show(activity);
                    }

            
            {
                this$0 = _cls4.this;
                super();
            }
                });
                MetricModule.sendMetric(activity, com.apptentive.android.sdk.model.Event.EventLabel.message_center__thank_you__launch);
                s3.show();
            }

            
            {
                activity = activity1;
                dialog = messagecenterintrodialog;
                super();
            }
        });
        s = Configuration.load(activity).getAppDisplayName();
        _cls5..SwitchMap.com.apptentive.android.sdk.module.messagecenter.ApptentiveMessageCenter.Trigger[trigger.ordinal()];
        JVM INSTR tableswitch 1 2: default 124
    //                   1 133
    //                   2 180;
           goto _L1 _L2 _L3
_L1:
        return;
_L2:
        messagecenterintrodialog.setTitle(com.apptentive.android.sdk.R.string.apptentive_intro_dialog_title_no_love);
        messagecenterintrodialog.setBody(activity.getResources().getString(com.apptentive.android.sdk.R.string.apptentive_intro_dialog_body, new Object[] {
            s
        }));
_L5:
        MetricModule.sendMetric(activity, com.apptentive.android.sdk.model.Event.EventLabel.message_center__intro__launch, trigger.name());
        messagecenterintrodialog.show();
        return;
_L3:
        messagecenterintrodialog.setTitle(com.apptentive.android.sdk.R.string.apptentive_intro_dialog_title_default);
        messagecenterintrodialog.setBody(activity.getResources().getString(com.apptentive.android.sdk.R.string.apptentive_intro_dialog_body, new Object[] {
            s
        }));
        if (true) goto _L5; else goto _L4
_L4:
    }



/*
    static Map access$002(Map map)
    {
        customData = map;
        return map;
    }

*/
}
