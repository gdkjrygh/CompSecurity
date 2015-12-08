// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.apptentive.android.sdk.module.engagement.interaction.model;

import org.json.JSONException;

// Referenced classes of package com.apptentive.android.sdk.module.engagement.interaction.model:
//            Interaction, InteractionConfiguration

public class UpgradeMessageInteraction extends Interaction
{

    private static final String KEY_ACTIVE = "active";
    private static final String KEY_APP_VERSION = "app_version";
    private static final String KEY_BODY = "body";
    private static final String KEY_SHOW_APP_ICON = "show_app_icon";
    private static final String KEY_SHOW_POWERED_BY = "show_powered_by";

    public UpgradeMessageInteraction(String s)
        throws JSONException
    {
        super(s);
    }

    public String getAppVersion()
    {
        Object obj = getConfiguration();
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_28;
        }
        if (!((InteractionConfiguration) (obj)).has("app_version"))
        {
            break MISSING_BLOCK_LABEL_28;
        }
        obj = ((InteractionConfiguration) (obj)).getString("app_version");
        return ((String) (obj));
        JSONException jsonexception;
        jsonexception;
        return null;
    }

    public String getBody()
    {
        Object obj = getConfiguration();
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_28;
        }
        if (!((InteractionConfiguration) (obj)).has("body"))
        {
            break MISSING_BLOCK_LABEL_28;
        }
        obj = ((InteractionConfiguration) (obj)).getString("body");
        return ((String) (obj));
        JSONException jsonexception;
        jsonexception;
        return null;
    }

    public boolean isActive()
    {
        InteractionConfiguration interactionconfiguration = getConfiguration();
        if (interactionconfiguration == null)
        {
            break MISSING_BLOCK_LABEL_28;
        }
        boolean flag;
        if (!interactionconfiguration.has("active"))
        {
            break MISSING_BLOCK_LABEL_28;
        }
        flag = interactionconfiguration.getBoolean("active");
        return flag;
        JSONException jsonexception;
        jsonexception;
        return false;
    }

    public boolean isShowAppIcon()
    {
        InteractionConfiguration interactionconfiguration = getConfiguration();
        if (interactionconfiguration == null)
        {
            break MISSING_BLOCK_LABEL_28;
        }
        boolean flag;
        if (!interactionconfiguration.has("show_app_icon"))
        {
            break MISSING_BLOCK_LABEL_28;
        }
        flag = interactionconfiguration.getBoolean("show_app_icon");
        return flag;
        JSONException jsonexception;
        jsonexception;
        return false;
    }

    public boolean isShowPoweredBy()
    {
        InteractionConfiguration interactionconfiguration = getConfiguration();
        if (interactionconfiguration == null)
        {
            break MISSING_BLOCK_LABEL_28;
        }
        boolean flag;
        if (!interactionconfiguration.has("show_powered_by"))
        {
            break MISSING_BLOCK_LABEL_28;
        }
        flag = interactionconfiguration.getBoolean("show_powered_by");
        return flag;
        JSONException jsonexception;
        jsonexception;
        return false;
    }
}
