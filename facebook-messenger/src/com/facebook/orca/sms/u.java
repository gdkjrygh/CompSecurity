// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.sms;

import android.content.ContentUris;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android_src.c.g;
import android_src.mms.transaction.TransactionService;
import com.facebook.debug.log.b;
import com.facebook.debug.log.l;
import com.facebook.messages.model.threads.Message;
import com.facebook.messages.model.threads.c;
import com.facebook.messages.model.threads.e;
import com.facebook.orca.threads.m;
import java.util.Set;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.facebook.orca.sms:
//            r, w, v

public class u
{

    private static final Class a = com/facebook/orca/sms/u;
    private static final l b = new l();
    private final Context c;
    private final r d;
    private final ConnectivityManager e;

    public u(Context context, r r1, ConnectivityManager connectivitymanager)
    {
        c = context;
        d = r1;
        e = connectivitymanager;
    }

    private void a(long l1)
    {
        d.b(l1);
    }

    private boolean a()
    {
        NetworkInfo networkinfo = e.getNetworkInfo(2);
        if (networkinfo == null)
        {
            return false;
        } else
        {
            return networkinfo.isAvailable();
        }
    }

    Message a(Message message, Set set)
    {
        long l1 = d.a(message, set);
        Object obj = new Semaphore(0);
        Object obj1 = new w(null);
        Object obj2 = new v(this, l1, ((w) (obj1)), ((Semaphore) (obj)));
        c.registerReceiver(((android.content.BroadcastReceiver) (obj2)), new IntentFilter("android.intent.action.TRANSACTION_COMPLETED_ACTION"));
        obj2 = ContentUris.withAppendedId(g.a, l1);
        Intent intent = new Intent(c, android_src/mms/transaction/TransactionService);
        intent.putExtra("uri", ((Uri) (obj2)).toString());
        intent.putExtra("type", 2);
        if (!a())
        {
            a(l1);
            throw new Exception("Network isn't availible to send Mms");
        }
        c.startService(intent);
        if (!((Semaphore) (obj)).tryAcquire(120L, TimeUnit.SECONDS))
        {
            a(l1);
            message = new Exception("Semaphore could not acquire requested permits");
            com.facebook.debug.log.b.a(b, a, "Send message timed out", message);
            throw message;
        }
        if (w.a(((w) (obj1))) != 1)
        {
            a(l1);
            throw new Exception("Mms send failed");
        }
        obj2 = m.c(l1);
        obj1 = message.e();
        obj = obj1;
        if (obj1 == null)
        {
            obj = m.a(android_src.c.m.a(c, set));
        }
        return (new e()).a(message).a(false).f("mms").a(c.MMS).a(0).a(((String) (obj2))).b(((String) (obj))).a(null).d(System.currentTimeMillis()).B();
    }

}
