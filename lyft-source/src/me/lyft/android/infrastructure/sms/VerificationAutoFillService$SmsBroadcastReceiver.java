// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.infrastructure.sms;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.telephony.SmsMessage;
import me.lyft.android.logging.L;
import rx.functions.Action1;

// Referenced classes of package me.lyft.android.infrastructure.sms:
//            VerificationCodeSmsParser

class smsCallback extends BroadcastReceiver
{

    private Action1 smsCallback;
    private final VerificationCodeSmsParser smsParser = new VerificationCodeSmsParser();

    public void onReceive(Context context, Intent intent)
    {
        {
            context = intent.getExtras();
            if (context == null)
            {
                break MISSING_BLOCK_LABEL_80;
            }
            int i;
            int j;
            try
            {
                context = ((Context) ((Object[])(Object[])context.get("pdus")));
                j = context.length;
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                L.w(context, "failed to parse verification sms", new Object[0]);
                return;
            }
            i = 0;
        }
        if (i >= j)
        {
            break MISSING_BLOCK_LABEL_80;
        }
        intent = SmsMessage.createFromPdu((byte[])(byte[])context[i]);
        intent = smsParser.extractCode(intent.getDisplayMessageBody());
        if (intent == null)
        {
            break MISSING_BLOCK_LABEL_81;
        }
        if (smsCallback != null)
        {
            smsCallback.call(intent);
        }
        return;
        i++;
        if (false)
        {
        } else
        {
            break MISSING_BLOCK_LABEL_28;
        }
    }

    public Y(Action1 action1)
    {
        smsCallback = action1;
    }
}
