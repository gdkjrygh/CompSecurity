// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.mnv;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.telephony.SmsMessage;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// Referenced classes of package com.skype.android.app.mnv:
//            a

public class MnvSmsReceiver extends BroadcastReceiver
{

    private Pattern SMS_PATTERN;
    private a mnvSmsResponseHandler;

    public MnvSmsReceiver(a a1)
    {
        SMS_PATTERN = Pattern.compile("\\b[0-9]{4}\\b");
        mnvSmsResponseHandler = a1;
    }

    private String getPinFromMessage(String s)
    {
        String s1 = "";
        Matcher matcher = SMS_PATTERN.matcher(s);
        s = s1;
        if (matcher.find())
        {
            s = matcher.group(0);
        }
        return s;
    }

    public void onReceive(Context context, Intent intent)
    {
        context = intent.getExtras();
        if (context != null && intent.getAction().equals("android.provider.Telephony.SMS_RECEIVED"))
        {
            intent = ((Intent) ((Object[])context.get("pdus")));
            context = new SmsMessage[intent.length];
            for (int i = 0; i < intent.length; i++)
            {
                context[i] = SmsMessage.createFromPdu((byte[])intent[i]);
            }

            int k = context.length;
            for (int j = 0; j < k; j++)
            {
                intent = getPinFromMessage(context[j].getDisplayMessageBody());
                mnvSmsResponseHandler.handle(intent);
            }

        }
    }
}
