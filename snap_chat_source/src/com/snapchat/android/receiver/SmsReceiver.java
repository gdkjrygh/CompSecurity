// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.receiver;

import Bt;
import Mf;
import OJ;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.telephony.SmsMessage;
import android.text.TextUtils;
import com.snapchat.android.Timber;
import com.squareup.otto.Bus;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SmsReceiver extends BroadcastReceiver
{

    public SmsReceiver()
    {
    }

    private static SmsMessage[] a(Bundle bundle)
    {
        if (bundle == null || !bundle.containsKey("pdus"))
        {
            break MISSING_BLOCK_LABEL_146;
        }
        SmsMessage asmsmessage[];
        bundle = ((Bundle) ((Object[])bundle.get("pdus")));
        asmsmessage = new SmsMessage[bundle.length];
        int i = 0;
_L2:
        if (i >= bundle.length)
        {
            break; /* Loop/switch isn't completed */
        }
        asmsmessage[i] = SmsMessage.createFromPdu((byte[])bundle[i]);
        Timber.c("SmsReceiver", (new StringBuilder("getReceivedMessages - body: ")).append(asmsmessage[i].getDisplayMessageBody()).append(" origin: ").append(asmsmessage[i].getDisplayOriginatingAddress()).append(" service center: ").append(asmsmessage[i].getServiceCenterAddress()).append(" subject: ").append(asmsmessage[i].getPseudoSubject()).toString(), new Object[0]);
        i++;
        if (true) goto _L2; else goto _L1
_L1:
        return asmsmessage;
        bundle;
        Timber.e("SmsReceiver", "Failed to parse SMS messages from Intent. ", new Object[] {
            bundle
        });
        return null;
    }

    public void onReceive(Context context, Intent intent)
    {
        Timber.c("SmsReceiver", (new StringBuilder("onReceive ")).append(intent).toString(), new Object[0]);
        if (intent == null) goto _L2; else goto _L1
_L1:
        intent = a(intent.getExtras());
        if (intent == null || intent.length <= 0) goto _L2; else goto _L3
_L3:
        int i;
        int j;
        j = intent.length;
        i = 0;
_L13:
        if (i >= j) goto _L2; else goto _L4
_L4:
        context = intent[i];
        if (context == null) goto _L6; else goto _L5
_L5:
        String s;
        s = context.getDisplayMessageBody();
        context = Bt.bx();
        if (TextUtils.isEmpty(context) || TextUtils.isEmpty(s)) goto _L8; else goto _L7
_L7:
        Matcher matcher;
        context = Pattern.compile(context.replace("{0}", "(\\d+)"));
        matcher = context.matcher(s);
        if (!matcher.find()) goto _L8; else goto _L9
_L9:
        context = context.matcher(matcher.group());
        if (!context.matches() || context.groupCount() <= 0) goto _L8; else goto _L10
_L10:
        context = context.group(1);
_L11:
        Timber.c("SmsReceiver", (new StringBuilder("messageBody: ")).append(s).append(" verificationCode: ").append(context).toString(), new Object[0]);
        if (!TextUtils.isEmpty(context))
        {
            Mf.a().a(new OJ(context));
        }
_L6:
        i++;
        continue; /* Loop/switch isn't completed */
_L8:
        context = null;
        if (true) goto _L11; else goto _L2
_L2:
        return;
        if (true) goto _L13; else goto _L12
_L12:
    }
}
