// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.microsoft.onlineid.sms;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.telephony.SmsMessage;
import android.text.TextUtils;
import com.microsoft.onlineid.a.a;
import com.microsoft.onlineid.a.b;
import com.microsoft.onlineid.internal.k;
import com.microsoft.onlineid.internal.ui.f;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SmsReceiver extends BroadcastReceiver
{

    public static final Pattern a = Pattern.compile("\\s*(\\d+).+\\Qhttp://aka.ms/smscode\\E");
    private final f b;

    public SmsReceiver(f f1)
    {
        k.a(f1, "javaScriptBridge");
        b = f1;
    }

    public void onReceive(Context context, Intent intent)
    {
        context = intent.getExtras();
        if (context != null) goto _L2; else goto _L1
_L1:
        return;
_L2:
        if ((context = ((Context) ((Object[])context.get("pdus")))).length <= 0)
        {
            continue; /* Loop/switch isn't completed */
        }
        context = SmsMessage.createFromPdu((byte[])context[0]).getMessageBody();
        if (context == null)
        {
            break; /* Loop/switch isn't completed */
        }
        context = a.matcher(context);
        if (!context.matches() || context.groupCount() != 1)
        {
            break; /* Loop/switch isn't completed */
        }
        context = context.group(1);
_L4:
        if (!TextUtils.isEmpty(context))
        {
            com.microsoft.onlineid.a.a.a().a("SMS verification", "Successfully verified");
            b.Property(com.microsoft.onlineid.internal.ui.g.a.r.name(), context);
            abortBroadcast();
            return;
        }
        if (true) goto _L1; else goto _L3
_L3:
        context = null;
          goto _L4
        if (true) goto _L1; else goto _L5
_L5:
    }

}
