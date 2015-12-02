// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.sms.receiver;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.telephony.SmsMessage;
import com.facebook.base.a.g;
import com.facebook.c.b;
import com.facebook.c.c;
import com.facebook.inject.t;
import com.google.common.a.hq;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class a
    implements b
{

    private static final Class a = com/facebook/sms/receiver/a;
    private final Class b;
    private Set c;

    public a(Class class1)
    {
        b = class1;
    }

    private void a(Context context)
    {
        if (c == null)
        {
            g.a(context);
            c = t.a(context).c(com/facebook/sms/a/a, b);
        }
    }

    public void a(Context context, Intent intent, c c1)
    {
        a(context);
        com.facebook.debug.log.b.b(a, "SMS received");
        Object obj = intent.getExtras();
        if (obj == null)
        {
            return;
        }
        Object aobj[] = (Object[])(Object[])((Bundle) (obj)).get("pdus");
        obj = hq.a();
        int i = 0;
        while (i < aobj.length) 
        {
            SmsMessage smsmessage = SmsMessage.createFromPdu((byte[])(byte[])aobj[i]);
            if (smsmessage != null && smsmessage.getMessageBody() != null)
            {
                ((List) (obj)).add(smsmessage);
            }
            i++;
        }
        if (c != null && c.size() > 0)
        {
            for (Iterator iterator = c.iterator(); iterator.hasNext(); ((com.facebook.sms.a.a)iterator.next()).a(context, intent, c1, ((List) (obj)))) { }
        }
        c1.setResult(-1, null, null);
    }

}
