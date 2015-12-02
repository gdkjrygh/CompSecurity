// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.vvm.datasms;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.telephony.SmsMessage;
import com.facebook.vvm.a.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.facebook.vvm.datasms:
//            DataSmsReceiver

public class DataSmsBroadcastReceiver extends BroadcastReceiver
{

    public DataSmsBroadcastReceiver()
    {
    }

    private static final List a(Intent intent)
    {
        ArrayList arraylist = new ArrayList();
        if (intent == null)
        {
            return arraylist;
        }
        intent = ((Intent) ((Object[])(Object[])intent.getExtras().get("pdus")));
        if (intent == null)
        {
            return arraylist;
        }
        int i = 0;
        while (i < intent.length) 
        {
            SmsMessage smsmessage = SmsMessage.createFromPdu((byte[])(byte[])intent[i]);
            if (smsmessage != null && smsmessage.getDisplayMessageBody() != null)
            {
                arraylist.add(smsmessage);
            }
            i++;
        }
        return arraylist;
    }

    public void onReceive(Context context, Intent intent)
    {
        intent = a(intent).iterator();
        do
        {
            if (!intent.hasNext())
            {
                break;
            }
            a a1 = com.facebook.vvm.a.a.a(((SmsMessage)intent.next()).getDisplayMessageBody());
            if (a1 != null)
            {
                Intent intent1 = new Intent();
                intent1.putExtra("application_directed_string", a1);
                intent1.setClassName(context, com/facebook/vvm/datasms/DataSmsReceiver.getName());
                context.startService(intent1);
            }
        } while (true);
    }
}
