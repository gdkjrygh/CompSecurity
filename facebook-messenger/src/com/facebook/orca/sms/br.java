// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.sms;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.telephony.SmsManager;
import android_src.c.m;
import com.facebook.messages.model.threads.Message;
import com.facebook.messages.model.threads.c;
import com.facebook.messages.model.threads.e;
import com.google.common.a.ev;
import com.google.common.a.hq;
import com.google.common.a.kl;
import java.util.ArrayList;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.facebook.orca.sms:
//            bu, bs, bt, af, 
//            bn

public class br
{

    private static final Class a = com/facebook/orca/sms/br;
    private final Context b;
    private final bn c;
    private final af d;

    public br(Context context, bn bn1, af af1)
    {
        b = context;
        c = bn1;
        d = af1;
    }

    static af a(br br1)
    {
        return br1.d;
    }

    Message a(Message message, String s)
    {
        Semaphore semaphore = new Semaphore(0);
        bu bu1 = new bu(null);
        PendingIntent pendingintent = PendingIntent.getBroadcast(b, 0, new Intent("SMS_SENT"), 0);
        PendingIntent pendingintent1 = PendingIntent.getBroadcast(b, 0, new Intent("SMS_DELIVERED"), 0);
        String s1 = message.e();
        if (s1 == null)
        {
            s1 = com.facebook.orca.threads.m.a(m.a(b, kl.a(new String[] {
                s
            })));
        }
        String s2;
        bs bs1;
        bt bt1;
        SmsManager smsmanager;
        ArrayList arraylist;
        ArrayList arraylist1;
        ArrayList arraylist2;
        if (message.I())
        {
            s2 = (String)message.J().get("trigger");
        } else
        {
            s2 = null;
        }
        bs1 = new bs(this, bu1, semaphore);
        b.registerReceiver(bs1, new IntentFilter("SMS_SENT"));
        bt1 = new bt(this, s1);
        b.registerReceiver(bt1, new IntentFilter("SMS_DELIVERED"));
        smsmanager = SmsManager.getDefault();
        arraylist = smsmanager.divideMessage(message.k());
        arraylist1 = hq.a();
        arraylist2 = hq.a();
        for (int i = 0; i < arraylist.size(); i++)
        {
            arraylist1.add(pendingintent);
            arraylist2.add(pendingintent1);
        }

        smsmanager.sendMultipartTextMessage(s, null, arraylist, arraylist1, arraylist2);
        if (!semaphore.tryAcquire(arraylist.size(), 120L, TimeUnit.SECONDS))
        {
            d.a(message.e());
            throw new Exception("Semaphore could not acquire requested permits");
        }
        if (bu.a(bu1) != -1)
        {
            d.a(message.e(), false, bu.a(bu1), s2);
            throw new Exception((new StringBuilder()).append("SMS send failed with code: ").append(bu.a(bu1)).toString());
        } else
        {
            b.unregisterReceiver(bs1);
            b.unregisterReceiver(bt1);
            long l = System.currentTimeMillis();
            s = com.facebook.orca.threads.m.b(c.a(s, message.k(), l, l, 2));
            s = (new e()).a(message).a(false).f("sms").a(c.SMS).a(0).a(s).b(s1).a(null).a(null).d(System.currentTimeMillis()).B();
            d.a(message.e(), true, bu.a(bu1), s2);
            return s;
        }
    }

}
