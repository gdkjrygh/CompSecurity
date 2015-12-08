// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.dncs.observers.sms;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.telephony.SmsMessage;
import android.text.TextUtils;
import com.fitbit.FitBitApplication;
import com.fitbit.dncs.Notification;
import com.fitbit.dncs.NotificationManager;
import com.fitbit.dncs.domain.CategoryID;
import com.fitbit.dncs.domain.NotificationAttributeId;
import com.fitbit.dncs.domain.a;
import com.fitbit.dncs.observers.DncsObserver;

public class SmsObserver extends DncsObserver
{

    private static final String a = "SmsObserver";
    private final String b = "pdus";

    public SmsObserver()
    {
    }

    private void a(String s, String s1)
    {
        Notification notification = new Notification();
        notification.a(CategoryID.e);
        notification.a(FitBitApplication.a().getPackageName());
        notification.a(new a(NotificationAttributeId.b, com.fitbit.dncs.observers.a.a(s1)));
        notification.a(new a(NotificationAttributeId.d, s));
        NotificationManager.a().a(notification, com.fitbit.dncs.NotificationManager.DncsNotificationDisplayType.b);
    }

    public void a(Context context, Intent intent)
    {
        context = intent.getExtras();
        if (context != null)
        {
            context = ((Context) ((Object[])(Object[])context.get("pdus")));
            if (context.length > 0)
            {
                intent = SmsMessage.createFromPdu((byte[])(byte[])context[context.length - 1]);
                if (intent != null)
                {
                    context = "";
                    if (!TextUtils.isEmpty(intent.getMessageBody()))
                    {
                        context = intent.getMessageBody().toString();
                    }
                    a(((String) (context)), intent.getOriginatingAddress());
                }
            }
        }
    }
}
