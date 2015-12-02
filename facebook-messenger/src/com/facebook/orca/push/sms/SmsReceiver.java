// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.push.sms;

import android.app.IntentService;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.telephony.SmsMessage;
import com.facebook.common.hardware.o;
import com.facebook.debug.log.b;
import com.facebook.debug.log.l;
import com.facebook.inject.t;
import com.facebook.messages.model.threads.Message;
import com.facebook.messages.model.threads.ParticipantInfo;
import com.facebook.orca.annotations.IsSmsNotifyEnabled;
import com.facebook.orca.prefs.n;
import com.facebook.orca.sms.af;
import com.facebook.orca.sms.bn;
import com.facebook.orca.sms.bq;
import com.facebook.orca.sms.y;
import com.facebook.prefs.shared.d;
import com.facebook.prefs.shared.e;
import com.facebook.push.g;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class SmsReceiver extends IntentService
{

    private static final Class a = com/facebook/orca/push/sms/SmsReceiver;
    private static final l b = new l();
    private bq c;
    private com.facebook.orca.push.a.b d;
    private com.facebook.orca.push.b e;
    private d f;
    private bn g;
    private y h;
    private boolean i;
    private af j;

    public SmsReceiver()
    {
        super("SmsReceiver");
    }

    private long a(SmsMessage smsmessage, String s, long l1)
    {
        long l2 = smsmessage.getTimestampMillis();
        return g.a(smsmessage.getOriginatingAddress(), s, l1, l2, 1);
    }

    private String a(SmsMessage smsmessage)
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append("\n  Display Originating Address: ").append(smsmessage.getDisplayOriginatingAddress());
        stringbuilder.append("\n                 Message Body: ").append(smsmessage.getMessageBody());
        stringbuilder.append("\n         Display Message Body: ").append(smsmessage.getDisplayMessageBody());
        stringbuilder.append("\n                    Timestamp: ").append(smsmessage.getTimestampMillis());
        stringbuilder.append("\n                Message Class: ").append(smsmessage.getMessageClass());
        stringbuilder.append("\n          Originating Address: ").append(smsmessage.getOriginatingAddress());
        stringbuilder.append("\n          Protocol Identifier: ").append(smsmessage.getProtocolIdentifier());
        stringbuilder.append("\n                   Email Body: ").append(smsmessage.getEmailBody());
        stringbuilder.append("\n                   Email From: ").append(smsmessage.getEmailFrom());
        stringbuilder.append("\n               Pseudo Subject: ").append(smsmessage.getPseudoSubject());
        stringbuilder.append("\n                       Status: ").append(smsmessage.getStatus());
        stringbuilder.append("\n                Status on Icc: ").append(smsmessage.getStatusOnIcc());
        stringbuilder.append("\n                 Index On Icc: ").append(smsmessage.getIndexOnIcc());
        stringbuilder.append("\n                 Index on Sim: ").append(smsmessage.getIndexOnSim());
        stringbuilder.append("\n                Status on Sim: ").append(smsmessage.getStatusOnSim());
        stringbuilder.append("\n       Service Center Address: ").append(smsmessage.getServiceCenterAddress());
        stringbuilder.append("\n                    User Data: ").append(smsmessage.getUserData().length);
        return stringbuilder.toString();
    }

    private String a(SmsMessage asmsmessage[])
    {
        StringBuilder stringbuilder = new StringBuilder();
        int i1 = asmsmessage.length;
        for (int k = 0; k < i1; k++)
        {
            stringbuilder.append(asmsmessage[k].getMessageBody());
        }

        return stringbuilder.toString();
    }

    static void a(Context context, Intent intent)
    {
        ((bq)t.a(context).a(com/facebook/orca/sms/bq)).a.a();
        intent.setClassName(context, com/facebook/orca/push/sms/SmsReceiver.getName());
        context.startService(intent);
    }

    private long b(SmsMessage smsmessage)
    {
        GregorianCalendar gregoriancalendar = new GregorianCalendar(2011, 8, 18);
        GregorianCalendar gregoriancalendar1 = new GregorianCalendar();
        long l1 = System.currentTimeMillis();
        gregoriancalendar1.setTimeInMillis(l1);
        if (gregoriancalendar1.before(gregoriancalendar))
        {
            l1 = smsmessage.getTimestampMillis();
        }
        return l1;
    }

    private void b(Context context, Intent intent)
    {
        Object obj;
        Object obj1;
        obj = null;
        obj1 = null;
        com.facebook.debug.log.b.b(a, "Received onMessage");
        if (intent.getExtras() == null) goto _L2; else goto _L1
_L1:
        context = f.b();
        context.a(n.d, System.currentTimeMillis());
        context.a();
        context = intent.getExtras();
        if (context == null) goto _L2; else goto _L3
_L3:
        intent = ((Intent) ((Object[])(Object[])context.get("pdus")));
        context = new SmsMessage[intent.length];
        for (int k = 0; k < context.length; k++)
        {
            context[k] = SmsMessage.createFromPdu((byte[])(byte[])intent[k]);
            if (com.facebook.debug.log.b.b(2))
            {
                com.facebook.debug.log.b.a(a, "Received SMS msg: \n%s", new Object[] {
                    a(context[k])
                });
            }
        }

        if (intent.length <= 0) goto _L2; else goto _L4
_L4:
        intent = context[0];
        long l1 = b(((SmsMessage) (intent)));
        if (!i) goto _L6; else goto _L5
_L5:
        context = a(context);
        long l3 = a(intent, context, l1);
        context = d.a(intent, l3, context, l1);
_L8:
        if (context == null)
        {
            break MISSING_BLOCK_LABEL_262;
        }
        intent = context;
        String s = context.e();
        intent = context;
        String s2 = (new StringBuilder()).append(context.i().d()).append(": ").append(context.k()).toString();
        intent = context;
        e.a(s2, s, context, g.SMS);
        Exception exception;
        String s1;
        long l2;
        if (context != null)
        {
            context = context.e();
        } else
        {
            context = null;
        }
        j.a(context, true);
_L2:
        return;
_L6:
        context = intent.getOriginatingAddress();
        l2 = h.b(context);
        context = h.b(l2);
        if (true) goto _L8; else goto _L7
_L7:
        exception;
        context = null;
_L12:
        intent = context;
        com.facebook.debug.log.b.a(b, a, exception);
        intent = obj1;
        if (context != null)
        {
            intent = context.e();
        }
        j.a(intent, false);
        return;
        context;
        intent = null;
_L10:
        s1 = obj;
        if (intent != null)
        {
            s1 = intent.e();
        }
        j.a(s1, true);
        throw context;
        context;
        if (true) goto _L10; else goto _L9
_L9:
        s1;
        if (true) goto _L12; else goto _L11
_L11:
    }

    public void onCreate()
    {
        super.onCreate();
        com.facebook.base.a.g.a(this);
        t t1 = t.a(this);
        e = (com.facebook.orca.push.b)t1.a(com/facebook/orca/push/b);
        c = (bq)t1.a(com/facebook/orca/sms/bq);
        d = (com.facebook.orca.push.a.b)t1.a(com/facebook/orca/push/a/b);
        f = (d)t1.a(com/facebook/prefs/shared/d);
        g = (bn)t1.a(com/facebook/orca/sms/bn);
        h = (y)t1.a(com/facebook/orca/sms/y);
        i = ((Boolean)t1.a(java/lang/Boolean, com/facebook/orca/annotations/IsSmsNotifyEnabled)).booleanValue();
        j = (af)t1.a(com/facebook/orca/sms/af);
    }

    public final void onHandleIntent(Intent intent)
    {
        b(this, intent);
        c.a.b();
        return;
        intent;
        c.a.b();
        throw intent;
    }

}
