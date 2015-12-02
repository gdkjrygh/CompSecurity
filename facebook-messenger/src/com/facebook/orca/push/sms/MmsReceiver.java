// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.push.sms;

import android.app.IntentService;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.database.DatabaseUtils;
import android.net.Uri;
import android_src.mms.c;
import android_src.mms.e.d;
import android_src.mms.e.e;
import android_src.mms.e.f;
import android_src.mms.e.h;
import android_src.mms.e.r;
import android_src.mms.e.v;
import android_src.mms.g.o;
import android_src.mms.transaction.TransactionService;
import com.facebook.base.a.g;
import com.facebook.debug.log.b;
import com.facebook.debug.log.l;
import com.facebook.inject.t;
import com.facebook.orca.prefs.n;
import com.facebook.orca.sms.af;
import com.facebook.orca.sms.y;
import com.facebook.orca.threads.m;
import java.util.Iterator;
import java.util.Set;

public class MmsReceiver extends IntentService
{

    private static final Class a = com/facebook/orca/push/sms/MmsReceiver;
    private static final l b = new l();
    private com.facebook.orca.sms.t c;
    private com.facebook.prefs.shared.d d;
    private af e;
    private y f;
    private com.facebook.orca.f.o g;

    public MmsReceiver()
    {
        super("MmsReceiver");
    }

    private long a(f f1, int i)
    {
        Object obj;
        Uri uri;
        long l1;
        if (i == 134)
        {
            f1 = new String(((d)f1).b());
        } else
        {
            f1 = new String(((v)f1).b());
        }
        obj = new StringBuilder(40);
        ((StringBuilder) (obj)).append("m_id");
        ((StringBuilder) (obj)).append('=');
        ((StringBuilder) (obj)).append(DatabaseUtils.sqlEscapeString(f1));
        ((StringBuilder) (obj)).append(" AND ");
        ((StringBuilder) (obj)).append("m_type");
        ((StringBuilder) (obj)).append('=');
        ((StringBuilder) (obj)).append(128);
        f1 = getContentResolver();
        uri = android_src.c.d.a;
        obj = ((StringBuilder) (obj)).toString();
        f1 = o.a(this, f1, uri, new String[] {
            "thread_id"
        }, ((String) (obj)), null, null);
        if (f1 == null)
        {
            break MISSING_BLOCK_LABEL_184;
        }
        if (f1.getCount() != 1 || !f1.moveToFirst())
        {
            break MISSING_BLOCK_LABEL_178;
        }
        l1 = f1.getLong(0);
        f1.close();
        return l1;
        f1.close();
        return -1L;
        Exception exception;
        exception;
        f1.close();
        throw exception;
    }

    private String a(f f1)
    {
        StringBuilder stringbuilder;
        stringbuilder = new StringBuilder();
        stringbuilder.append("\n     Message Type: ").append(f1.f());
        stringbuilder.append("\n      Mms Version: ").append(f1.g());
        stringbuilder.append("\n             From: ").append(f1.h().c());
        f1.f();
        JVM INSTR lookupswitch 3: default 92
    //                   130: 123
    //                   134: 97
    //                   136: 110;
           goto _L1 _L2 _L3 _L4
_L1:
        return stringbuilder.toString();
_L3:
        a((d)f1, stringbuilder);
        continue; /* Loop/switch isn't completed */
_L4:
        a((v)f1, stringbuilder);
        continue; /* Loop/switch isn't completed */
_L2:
        a((h)f1, stringbuilder);
        if (true) goto _L1; else goto _L5
_L5:
    }

    private StringBuilder a(d d1, StringBuilder stringbuilder)
    {
        stringbuilder.append("\n             Date:").append(d1.a());
        stringbuilder.append("\n       Message Id:").append(new String(d1.b()));
        stringbuilder.append("\n           Status:").append(d1.c());
        d1 = d1.d();
        int j = d1.length;
        for (int i = 0; i < j; i++)
        {
            e e1 = d1[i];
            if (e1 != null)
            {
                stringbuilder.append("\n               To:").append(e1.c());
            }
        }

        return stringbuilder;
    }

    private StringBuilder a(h h1, StringBuilder stringbuilder)
    {
        stringbuilder.append("\n    Content Class: ").append(h1.a());
        stringbuilder.append("\n Content Location: ").append(new String(h1.b()));
        stringbuilder.append("\n           Expiry: ").append(h1.c());
        stringbuilder.append("\n    Message Class: ").append(new String(h1.d()));
        stringbuilder.append("\n     Message Size: ").append(h1.i());
        stringbuilder.append("\n          Subject: ").append(h1.j());
        stringbuilder.append("\n   Transaction Id: ").append(new String(h1.k()));
        stringbuilder.append("\n  Delivery Report: ").append(h1.l());
        return stringbuilder;
    }

    private StringBuilder a(v v1, StringBuilder stringbuilder)
    {
        stringbuilder.append("\n             Date: ").append(v1.a());
        stringbuilder.append("\n       Message Id: ").append(new String(v1.b()));
        stringbuilder.append("\n      Read Status: ").append(v1.c());
        v1 = v1.d();
        int j = v1.length;
        for (int i = 0; i < j; i++)
        {
            e e1 = v1[i];
            if (e1 != null)
            {
                stringbuilder.append("\n               To:").append(e1.c());
            }
        }

        return stringbuilder;
    }

    static void a(Context context, Intent intent)
    {
        ((com.facebook.orca.sms.t)t.a(context).a(com/facebook/orca/sms/t)).a.a();
        intent.setClassName(context, com/facebook/orca/push/sms/MmsReceiver.getName());
        context.startService(intent);
    }

    private void a(Intent intent)
    {
        Object obj;
        Object obj1;
        int i;
        intent = (new r(intent.getByteArrayExtra("data"))).a();
        if (intent == null)
        {
            com.facebook.debug.log.b.e(a, "Invalid PUSH data");
            return;
        }
        if (com.facebook.debug.log.b.b(2))
        {
            com.facebook.debug.log.b.a(a, "Received MMS msg: \n%s", new Object[] {
                a(((f) (intent)))
            });
        }
        obj = android_src.mms.e.t.a(this);
        obj1 = getContentResolver();
        i = intent.f();
        i;
        JVM INSTR lookupswitch 3: default 112
    //                   130: 223
    //                   134: 131
    //                   136: 131;
           goto _L1 _L2 _L3 _L3
_L1:
        long l1;
        try
        {
            com.facebook.debug.log.b.e(a, "Received unrecognized PDU.");
        }
        // Misplaced declaration of an exception variable
        catch (Intent intent)
        {
            com.facebook.debug.log.b.e(a, (new StringBuilder()).append("Failed to save the data from PUSH: type=").append(i).toString(), intent);
        }
        // Misplaced declaration of an exception variable
        catch (Intent intent)
        {
            com.facebook.debug.log.b.e(a, "Unexpected Exception.", intent);
        }
_L6:
        com.facebook.debug.log.b.a(a, "PUSH Intent processed.");
        return;
_L3:
        l1 = a(((f) (intent)), i);
        if (l1 == -1L)
        {
            break MISSING_BLOCK_LABEL_121;
        }
        intent = ((android_src.mms.e.t) (obj)).a(intent, android_src.c.f.a);
        obj = new ContentValues(1);
        ((ContentValues) (obj)).put("thread_id", Long.valueOf(l1));
        o.a(this, ((android.content.ContentResolver) (obj1)), intent, ((ContentValues) (obj)), null, null);
        break MISSING_BLOCK_LABEL_121;
_L2:
        e.a();
        obj1 = (h)intent;
        if (android_src.mms.c.c())
        {
            byte abyte0[] = ((h) (obj1)).b();
            if (61 == abyte0[abyte0.length - 1])
            {
                byte abyte1[] = ((h) (obj1)).k();
                byte abyte2[] = new byte[abyte0.length + abyte1.length];
                System.arraycopy(abyte0, 0, abyte2, 0, abyte0.length);
                System.arraycopy(abyte1, 0, abyte2, abyte0.length, abyte1.length);
                ((h) (obj1)).a(abyte2);
            }
        }
        if (a(((h) (obj1)))) goto _L5; else goto _L4
_L4:
        String s;
        for (obj1 = f.b().iterator(); ((Iterator) (obj1)).hasNext(); g.a(s, -1L))
        {
            s = m.a(((Long)((Iterator) (obj1)).next()).longValue());
        }

        intent = ((android_src.mms.e.t) (obj)).a(intent, android_src.c.f.a);
        obj = new Intent(this, android_src/mms/transaction/TransactionService);
        ((Intent) (obj)).putExtra("uri", intent.toString());
        ((Intent) (obj)).putExtra("type", 0);
        startService(((Intent) (obj)));
          goto _L6
_L5:
        com.facebook.debug.log.b.a(a, (new StringBuilder()).append("Skip downloading duplicate message: ").append(new String(((h) (obj1)).b())).toString());
          goto _L6
    }

    private boolean a(h h1)
    {
        h1 = h1.b();
        if (h1 == null)
        {
            break MISSING_BLOCK_LABEL_81;
        }
        h1 = new String(h1);
        h1 = o.a(this, getContentResolver(), android_src.c.d.a, new String[] {
            "_id"
        }, "ct_l = ?", new String[] {
            h1
        }, null);
        if (h1 == null)
        {
            break MISSING_BLOCK_LABEL_81;
        }
        int i = h1.getCount();
        if (i > 0)
        {
            h1.close();
            return true;
        }
        h1.close();
        return false;
        Exception exception;
        exception;
        h1.close();
        throw exception;
    }

    private void b(Context context, Intent intent)
    {
        com.facebook.debug.log.b.b(a, "Received onMessage");
        a(intent);
        context = d.b();
        context.a(n.d, System.currentTimeMillis());
        context.a();
    }

    public void onCreate()
    {
        super.onCreate();
        com.facebook.base.a.g.a(this);
        t t1 = t.a(this);
        c = (com.facebook.orca.sms.t)t1.a(com/facebook/orca/sms/t);
        d = (com.facebook.prefs.shared.d)t1.a(com/facebook/prefs/shared/d);
        e = (af)t1.a(com/facebook/orca/sms/af);
        f = (y)t1.a(com/facebook/orca/sms/y);
        g = (com.facebook.orca.f.o)t1.a(com/facebook/orca/f/o);
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
