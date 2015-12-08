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

public class RatingDialogInteraction extends Interaction
{

    private static final String KEY_BODY = "body";
    private static final String KEY_DECLINE_TEXT = "decline_text";
    private static final String KEY_RATE_TEXT = "rate_text";
    private static final String KEY_REMIND_TEXT = "remind_text";
    private static final String KEY_TITLE = "title";

    public RatingDialogInteraction(String s)
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
            return String.format(context.getResources().getString(com.apptentive.android.sdk.R.string.apptentive_rating_message_fs), new Object[] {
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

    public String getRateText(Context context)
    {
        InteractionConfiguration interactionconfiguration = getConfiguration();
        if (interactionconfiguration != null && !interactionconfiguration.isNull("rate_text"))
        {
            return interactionconfiguration.optString("rate_text", null);
        } else
        {
            return String.format(context.getResources().getString(com.apptentive.android.sdk.R.string.apptentive_rate_this_app), new Object[] {
                Configuration.load(context).getAppDisplayName()
            });
        }
    }

    public String getRemindText()
    {
        Object obj = null;
        InteractionConfiguration interactionconfiguration = getConfiguration();
        String s = obj;
        if (interactionconfiguration != null)
        {
            s = obj;
            if (!interactionconfiguration.isNull("remind_text"))
            {
                s = interactionconfiguration.optString("remind_text", null);
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
}
