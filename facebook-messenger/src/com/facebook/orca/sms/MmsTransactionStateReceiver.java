// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.sms;

import android.app.IntentService;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android_src.c.f;
import com.facebook.inject.t;
import com.facebook.messages.model.threads.Message;
import com.facebook.messages.model.threads.ParticipantInfo;
import com.facebook.messages.model.threads.e;
import com.facebook.orca.f.o;
import com.facebook.orca.push.b;
import com.facebook.push.g;

// Referenced classes of package com.facebook.orca.sms:
//            r, af, bm

public class MmsTransactionStateReceiver extends IntentService
{

    private static final Class a = com/facebook/orca/sms/MmsTransactionStateReceiver;
    private bm b;
    private r c;
    private b d;
    private af e;
    private o f;

    public MmsTransactionStateReceiver()
    {
        super("MmsTransactionStateReceiver");
    }

    private void a(long l)
    {
        Message message = c.a(l);
        e.a(message.e(), l, true);
        if (message != null)
        {
            f.a(message.e(), message.s() - 1L);
            String s = (new StringBuilder()).append(message.i().d()).append(": ").append(message.k()).toString();
            Message message1 = (new e()).a(message).d(message.f()).B();
            d.a(s, message.e(), message1, g.MMS);
            return;
        } else
        {
            com.facebook.debug.log.b.e(a, (new StringBuilder()).append("Could not find specified Mms Message with the id: ").append(l).toString());
            return;
        }
    }

    static void a(Context context, Intent intent)
    {
        ((bm)t.a(context).a(com/facebook/orca/sms/bm)).a.a();
        intent.setClassName(context, com/facebook/orca/sms/MmsTransactionStateReceiver.getName());
        context.startService(intent);
    }

    private boolean a(Uri uri, Uri uri1)
    {
        return uri.toString().startsWith(uri1.toString());
    }

    private void b(long l)
    {
        Message message = c.a(l);
        e.a(message.e(), l, false);
    }

    private void b(Context context, Intent intent)
    {
        com.facebook.debug.log.b.b(a, "Received onMessage");
        context = (Uri)intent.getParcelableExtra("uri");
        long l = Long.parseLong(context.getLastPathSegment());
        int i = intent.getIntExtra("state", 0);
        if (context != null)
        {
            if (i == 1)
            {
                if (a(context, f.a))
                {
                    a(l);
                }
            } else
            if (i == 2 && a(context, f.a))
            {
                b(l);
                return;
            }
        }
    }

    public void onCreate()
    {
        super.onCreate();
        com.facebook.base.a.g.a(this);
        t t1 = t.a(this);
        b = (bm)t1.a(com/facebook/orca/sms/bm);
        c = (r)t1.a(com/facebook/orca/sms/r);
        d = (b)t1.a(com/facebook/orca/push/b);
        e = (af)t1.a(com/facebook/orca/sms/af);
        f = (o)t1.a(com/facebook/orca/f/o);
    }

    public final void onHandleIntent(Intent intent)
    {
        b(this, intent);
        b.a.b();
        return;
        intent;
        b.a.b();
        throw intent;
    }

}
