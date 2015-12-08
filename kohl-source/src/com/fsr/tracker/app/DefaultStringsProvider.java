// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fsr.tracker.app;

import com.fsr.tracker.StringsProvider;
import fs.org.slf4j.Logger;
import fs.org.slf4j.LoggerFactory;
import java.util.Locale;
import java.util.MissingResourceException;
import java.util.ResourceBundle;

public class DefaultStringsProvider
    implements StringsProvider
{

    private ResourceBundle customBundle;
    private ResourceBundle defaultBundle;
    private Logger logger;

    public DefaultStringsProvider()
    {
        logger = LoggerFactory.getLogger("ForeSee Trigger Code");
        defaultBundle = ResourceBundle.getBundle("strings", Locale.getDefault());
        try
        {
            customBundle = ResourceBundle.getBundle("custom-strings", Locale.getDefault());
            return;
        }
        catch (MissingResourceException missingresourceexception)
        {
            logger.debug("No custom-strings.properties file found");
        }
    }

    private String resolveString(String s)
    {
        if (customBundle == null)
        {
            break MISSING_BLOCK_LABEL_19;
        }
        String s1 = customBundle.getString(s);
        return s1;
        MissingResourceException missingresourceexception;
        missingresourceexception;
        return defaultBundle.getString(s);
    }

    public String getAcceptButtonText()
    {
        return resolveString("acceptButtonText");
    }

    public String getAlertButtonText()
    {
        return resolveString("alertDialogButtonText");
    }

    public String getAlertDialogTitle()
    {
        return resolveString("alertDialogTitle");
    }

    public String getConductedByText()
    {
        return resolveString("conductedBy");
    }

    public String getDeclineButtonText()
    {
        return resolveString("declineButtonText");
    }

    public String getEmailNotificationSubmit()
    {
        return resolveString("emailNotificationButton");
    }

    public String getInvalidFormatMessage()
    {
        return resolveString("invalidFormat");
    }

    public String getInviteText()
    {
        return resolveString("inviteBody");
    }

    public String getInviteTitle()
    {
        return resolveString("inviteTitle");
    }

    public String getOnExitDetailAcceptButtonText()
    {
        return resolveString("onExitDetailsAcceptButtonText");
    }

    public String getOnExitDetailDeclineButtonText()
    {
        return resolveString("onExitDetailsDeclineButtonText");
    }

    public String getOnExitDetailsBody()
    {
        return resolveString("onExitDetailsBody");
    }

    public String getOnExitDetailsTitle()
    {
        return resolveString("onExitDetailsTitle");
    }

    public String getOnExitHintText()
    {
        return resolveString("onExitHint");
    }

    public String getOnExitInviteText()
    {
        return resolveString("onExitInviteBody");
    }

    public String getOnExitLocalNotificationText()
    {
        return resolveString("onExitLocalNotificationText");
    }

    public String getOnExitNotificationText()
    {
        return resolveString("onExitNotificationText");
    }

    public String getOnExitNotificationTitle()
    {
        return resolveString("onExitNotificationTitle");
    }

    public String getOnExitSurveyUrlTemplate()
    {
        return resolveString("onExitSurveyUrlTemplate");
    }

    public String getProgressMessage()
    {
        return resolveString("progressMessage");
    }

    public String getRequiredFieldMessage()
    {
        return resolveString("requiredField");
    }

    public String getStringByKey(String s)
    {
        return resolveString(s);
    }

    public String getTextMessageNotificationSubmit()
    {
        return resolveString("textMessageNotificationButton");
    }
}
