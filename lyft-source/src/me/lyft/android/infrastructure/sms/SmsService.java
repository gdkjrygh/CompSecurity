// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.infrastructure.sms;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.telephony.SmsManager;
import me.lyft.android.analytics.AsyncActionAnalytics;
import me.lyft.android.analytics.studies.WorkPerksAnalytics;

// Referenced classes of package me.lyft.android.infrastructure.sms:
//            ISmsService

public class SmsService
    implements ISmsService
{

    private static final String SMS_SENT_INTENT = "SMS_SENT";
    private final Context context;

    public SmsService(Context context1)
    {
        context = context1;
    }

    public void openSmsComposer(String s)
    {
        s = new Intent("android.intent.action.VIEW", Uri.fromParts("sms", s, null));
        s.addFlags(0x10000000);
        context.startActivity(s);
    }

    public void sendShareRouteMessage(String s)
    {
        Intent intent = new Intent("android.intent.action.SEND");
        intent.setType("text/plain");
        intent.putExtra("android.intent.extra.TEXT", context.getString(0x7f07033c, new Object[] {
            s
        }));
        s = Intent.createChooser(intent, context.getString(0x7f07033e));
        s.addFlags(0x10000000);
        context.startActivity(s);
    }

    public void sendSms(String s, String s1)
    {
        AsyncActionAnalytics asyncactionanalytics = WorkPerksAnalytics.trackSendSmsAttempt();
        PendingIntent pendingintent = PendingIntent.getBroadcast(context, 0, new Intent("SMS_SENT"), 0);
        if (s1.length() > 160)
        {
            asyncactionanalytics.trackResponseFailure(String.format("smsBody has %s characters which has exceeded maximum of 160 characters limit!", new Object[] {
                Integer.valueOf(s1.length())
            }));
            return;
        }
        try
        {
            SmsManager.getDefault().sendTextMessage(s.replaceAll("\\D+", ""), null, s1, pendingintent, null);
            asyncactionanalytics.trackResponseSuccess();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            asyncactionanalytics.trackResponseFailure(s);
        }
    }
}
