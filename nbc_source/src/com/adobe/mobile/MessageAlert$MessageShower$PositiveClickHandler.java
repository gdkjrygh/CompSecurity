// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.adobe.mobile;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import java.math.BigDecimal;
import java.util.HashMap;

// Referenced classes of package com.adobe.mobile:
//            MessageAlert, StaticMethods, AnalyticsTrackLifetimeValueIncrease

private static final class message
    implements android.content.
{

    private final MessageAlert message;

    public void onClick(DialogInterface dialoginterface, int i)
    {
        message.clickedThrough();
        message.isVisible = false;
        if (message.url == null || message.url.length() <= 0)
        {
            break MISSING_BLOCK_LABEL_159;
        }
        Object obj = new HashMap();
        if (StaticMethods.getVisitorID() == null)
        {
            dialoginterface = "";
        } else
        {
            dialoginterface = StaticMethods.getVisitorID();
        }
        ((HashMap) (obj)).put("{userId}", dialoginterface);
        if (StaticMethods.getAID() == null)
        {
            dialoginterface = "";
        } else
        {
            dialoginterface = StaticMethods.getAID();
        }
        ((HashMap) (obj)).put("{trackingId}", dialoginterface);
        ((HashMap) (obj)).put("{messageId}", message.messageId);
        ((HashMap) (obj)).put("{lifetimeValue}", AnalyticsTrackLifetimeValueIncrease.getLifetimeValue().toString());
        message.url = StaticMethods.expandTokens(message.url, ((java.util.Map) (obj)));
        try
        {
            dialoginterface = StaticMethods.getCurrentActivity();
        }
        // Misplaced declaration of an exception variable
        catch (DialogInterface dialoginterface)
        {
            StaticMethods.logErrorFormat(dialoginterface.message(), new Object[0]);
            return;
        }
        obj = new Intent("android.intent.action.VIEW");
        ((Intent) (obj)).setData(Uri.parse(message.url));
        dialoginterface.startActivity(((Intent) (obj)));
        return;
        dialoginterface;
        StaticMethods.logDebugFormat("Messages - Could not load click-through intent for message (%s)", new Object[] {
            dialoginterface.toString()
        });
        return;
    }

    public (MessageAlert messagealert)
    {
        message = messagealert;
    }
}
