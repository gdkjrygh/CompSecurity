// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.sms.a;

import android.database.ContentObserver;
import com.facebook.messages.model.threads.Message;
import com.facebook.messages.model.threads.ParticipantInfo;
import com.facebook.orca.g.b;
import com.facebook.orca.sms.af;
import com.facebook.orca.sms.bn;
import com.facebook.push.g;
import javax.inject.a;

public class c extends ContentObserver
{

    private final bn a;
    private final b b;
    private final com.facebook.orca.push.b c;
    private final af d;
    private final a e;
    private final a f;

    public c(bn bn1, b b1, com.facebook.orca.push.b b2, af af1, a a1, a a2)
    {
        super(null);
        b = b1;
        a = bn1;
        c = b2;
        d = af1;
        e = a1;
        f = a2;
    }

    private Message a()
    {
        Message message = a.a();
        if (message != null && !b.a(message.d()))
        {
            return message;
        } else
        {
            return null;
        }
    }

    public boolean deliverSelfNotifications()
    {
        return false;
    }

    public void onChange(boolean flag)
    {
        Message message;
        if (!flag && ((Boolean)e.b()).booleanValue() && ((Boolean)f.b()).booleanValue())
        {
            if ((message = a()) != null)
            {
                String s = message.e();
                String s1 = (new StringBuilder()).append(message.i().d()).append(": ").append(message.k()).toString();
                c.a(s1, s, message, g.SMS);
                d.b(s);
                return;
            }
        }
    }
}
