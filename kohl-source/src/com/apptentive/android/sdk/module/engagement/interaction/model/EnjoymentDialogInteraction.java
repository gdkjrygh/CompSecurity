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

public class EnjoymentDialogInteraction extends Interaction
{

    private static final String KEY_NO_TEXT = "no_text";
    private static final String KEY_TITLE = "title";
    private static final String KEY_YES_TEXT = "yes_text";

    public EnjoymentDialogInteraction(String s)
        throws JSONException
    {
        super(s);
    }

    public String getNoText()
    {
        Object obj = null;
        InteractionConfiguration interactionconfiguration = getConfiguration();
        String s = obj;
        if (interactionconfiguration != null)
        {
            s = obj;
            if (!interactionconfiguration.isNull("no_text"))
            {
                s = interactionconfiguration.optString("no_text", null);
            }
        }
        return s;
    }

    public String getTitle(Context context)
    {
        InteractionConfiguration interactionconfiguration = getConfiguration();
        if (interactionconfiguration != null && !interactionconfiguration.isNull("title"))
        {
            return interactionconfiguration.optString("title", null);
        } else
        {
            return context.getResources().getString(com.apptentive.android.sdk.R.string.apptentive_do_you_love_this_app, new Object[] {
                Configuration.load(context).getAppDisplayName()
            });
        }
    }

    public String getYesText()
    {
        Object obj = null;
        InteractionConfiguration interactionconfiguration = getConfiguration();
        String s = obj;
        if (interactionconfiguration != null)
        {
            s = obj;
            if (!interactionconfiguration.isNull("yes_text"))
            {
                s = interactionconfiguration.optString("yes_text", null);
            }
        }
        return s;
    }
}
