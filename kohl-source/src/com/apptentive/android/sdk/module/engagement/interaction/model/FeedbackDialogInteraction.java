// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.apptentive.android.sdk.module.engagement.interaction.model;

import android.content.Context;
import android.content.res.Resources;
import com.apptentive.android.sdk.model.Configuration;
import org.json.JSONException;

// Referenced classes of package com.apptentive.android.sdk.module.engagement.interaction.model:
//            Interaction, InteractionConfiguration

public class FeedbackDialogInteraction extends Interaction
{

    private static final String KEY_ASK_FOR_EMAIL = "ask_for_email";
    private static final String KEY_BODY = "body";
    private static final String KEY_DECLINE_TEXT = "decline_text";
    private static final String KEY_EMAIL_HINT_TEXT = "email_hint_text";
    private static final String KEY_EMAIL_REQUIRED = "email_required";
    private static final String KEY_ENABLE_MESSAGE_CENTER = "enable_message_center";
    private static final String KEY_MESSAGE_HINT_TEXT = "message_hint_text";
    private static final String KEY_SUBMIT_TEXT = "submit_text";
    private static final String KEY_THANK_YOU_BODY = "thank_you_body";
    private static final String KEY_THANK_YOU_CLOSE_TEXT = "thank_you_close_text";
    private static final String KEY_THANK_YOU_TITLE = "thank_you_title";
    private static final String KEY_THANK_YOU_VIEW_MESSAGES_TEXT = "thank_you_view_messages_text";
    private static final String KEY_TITLE = "title";

    public FeedbackDialogInteraction(String s)
        throws JSONException
    {
        super(s);
    }

    public String getBody(Context context)
    {
        InteractionConfiguration interactionconfiguration = getConfiguration();
        if (interactionconfiguration != null && !interactionconfiguration.isNull("body"))
        {
            return interactionconfiguration.optString("body", null);
        } else
        {
            return context.getResources().getString(com.apptentive.android.sdk.R.string.apptentive_intro_dialog_body, new Object[] {
                Configuration.load(context).getAppDisplayName()
            });
        }
    }

    public String getDeclineText()
    {
        Object obj = null;
        InteractionConfiguration interactionconfiguration = getConfiguration();
        String s = obj;
        if (interactionconfiguration != null)
        {
            s = obj;
            if (!interactionconfiguration.isNull("decline_text"))
            {
                s = interactionconfiguration.optString("decline_text", null);
            }
        }
        return s;
    }

    public String getEmailHintText()
    {
        Object obj = null;
        InteractionConfiguration interactionconfiguration = getConfiguration();
        String s = obj;
        if (interactionconfiguration != null)
        {
            s = obj;
            if (!interactionconfiguration.isNull("email_hint_text"))
            {
                s = interactionconfiguration.optString("email_hint_text", null);
            }
        }
        return s;
    }

    public String getMessageHintText()
    {
        Object obj = null;
        InteractionConfiguration interactionconfiguration = getConfiguration();
        String s = obj;
        if (interactionconfiguration != null)
        {
            s = obj;
            if (!interactionconfiguration.isNull("message_hint_text"))
            {
                s = interactionconfiguration.optString("message_hint_text", null);
            }
        }
        return s;
    }

    public String getSubmitText()
    {
        Object obj = null;
        InteractionConfiguration interactionconfiguration = getConfiguration();
        String s = obj;
        if (interactionconfiguration != null)
        {
            s = obj;
            if (!interactionconfiguration.isNull("submit_text"))
            {
                s = interactionconfiguration.optString("submit_text", null);
            }
        }
        return s;
    }

    public String getThankYouBody()
    {
        Object obj = null;
        InteractionConfiguration interactionconfiguration = getConfiguration();
        String s = obj;
        if (interactionconfiguration != null)
        {
            s = obj;
            if (!interactionconfiguration.isNull("thank_you_body"))
            {
                s = interactionconfiguration.optString("thank_you_body", null);
            }
        }
        return s;
    }

    public String getThankYouCloseText()
    {
        Object obj = null;
        InteractionConfiguration interactionconfiguration = getConfiguration();
        String s = obj;
        if (interactionconfiguration != null)
        {
            s = obj;
            if (!interactionconfiguration.isNull("thank_you_close_text"))
            {
                s = interactionconfiguration.optString("thank_you_close_text", null);
            }
        }
        return s;
    }

    public String getThankYouTitle()
    {
        Object obj = null;
        InteractionConfiguration interactionconfiguration = getConfiguration();
        String s = obj;
        if (interactionconfiguration != null)
        {
            s = obj;
            if (!interactionconfiguration.isNull("thank_you_title"))
            {
                s = interactionconfiguration.optString("thank_you_title", null);
            }
        }
        return s;
    }

    public String getThankYouViewMessagesText()
    {
        Object obj = null;
        InteractionConfiguration interactionconfiguration = getConfiguration();
        String s = obj;
        if (interactionconfiguration != null)
        {
            s = obj;
            if (!interactionconfiguration.isNull("thank_you_view_messages_text"))
            {
                s = interactionconfiguration.optString("thank_you_view_messages_text", null);
            }
        }
        return s;
    }

    public String getTitle()
    {
        Object obj = null;
        InteractionConfiguration interactionconfiguration = getConfiguration();
        String s = obj;
        if (interactionconfiguration != null)
        {
            s = obj;
            if (!interactionconfiguration.isNull("title"))
            {
                s = interactionconfiguration.optString("title", null);
            }
        }
        return s;
    }

    public boolean isAskForEmail()
    {
        boolean flag1 = true;
        InteractionConfiguration interactionconfiguration = getConfiguration();
        boolean flag = flag1;
        if (interactionconfiguration != null)
        {
            flag = flag1;
            if (!interactionconfiguration.isNull("ask_for_email"))
            {
                flag = interactionconfiguration.optBoolean("ask_for_email", true);
            }
        }
        return flag;
    }

    public boolean isEmailRequired()
    {
        boolean flag1 = false;
        InteractionConfiguration interactionconfiguration = getConfiguration();
        boolean flag = flag1;
        if (interactionconfiguration != null)
        {
            flag = flag1;
            if (!interactionconfiguration.isNull("email_required"))
            {
                flag = interactionconfiguration.optBoolean("email_required", false);
            }
        }
        return flag;
    }

    public boolean isMessageCenterEnabled()
    {
        boolean flag1 = true;
        InteractionConfiguration interactionconfiguration = getConfiguration();
        boolean flag = flag1;
        if (interactionconfiguration != null)
        {
            flag = flag1;
            if (!interactionconfiguration.isNull("enable_message_center"))
            {
                flag = interactionconfiguration.optBoolean("enable_message_center", true);
            }
        }
        return flag;
    }
}
