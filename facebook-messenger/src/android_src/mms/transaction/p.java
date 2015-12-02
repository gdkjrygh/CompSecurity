// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android_src.mms.transaction;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.ContentResolver;
import android.content.ContentUris;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android_src.c.f;
import android_src.c.g;
import android_src.c.k;
import android_src.mms.e.t;
import android_src.mms.g.d;
import android_src.mms.g.o;
import com.facebook.debug.log.b;

// Referenced classes of package android_src.mms.transaction:
//            l, b, d, TransactionService, 
//            r, j, o, n, 
//            q, x, k

public class p
    implements l
{

    private static p c;
    private final Context a;
    private final ContentResolver b;

    private p(Context context)
    {
        a = context;
        b = context.getContentResolver();
    }

    private int a(long l1)
    {
        Cursor cursor = o.a(a, b, g.a, null, (new StringBuilder()).append("_id=").append(l1).toString(), null, null);
        if (!cursor.moveToFirst()) goto _L2; else goto _L1
_L1:
        int i = cursor.getInt(cursor.getColumnIndexOrThrow("resp_st"));
_L4:
        cursor.close();
        if (i != 0)
        {
            com.facebook.debug.log.b.e("fb-mms:RetryScheduler", (new StringBuilder()).append("Response status is: ").append(i).toString());
        }
        return i;
        Exception exception;
        exception;
        cursor.close();
        throw exception;
_L2:
        i = 0;
        if (true) goto _L4; else goto _L3
_L3:
    }

    public static p a(Context context)
    {
        if (c == null)
        {
            c = new p(context);
        }
        return c;
    }

    private void a(Uri uri)
    {
        Object obj;
        long l1;
        l1 = ContentUris.parseId(uri);
        obj = k.a.buildUpon();
        ((android.net.Uri.Builder) (obj)).appendQueryParameter("protocol", "mms");
        ((android.net.Uri.Builder) (obj)).appendQueryParameter("message", String.valueOf(l1));
        obj = o.a(a, b, ((android.net.Uri.Builder) (obj)).build(), null, null, null, null);
        if (obj == null) goto _L2; else goto _L1
_L1:
        if (((Cursor) (obj)).getCount() != 1 || !((Cursor) (obj)).moveToFirst()) goto _L4; else goto _L3
_L3:
        int i;
        int i1;
        i = ((Cursor) (obj)).getInt(((Cursor) (obj)).getColumnIndexOrThrow("msg_type"));
        i1 = ((Cursor) (obj)).getInt(((Cursor) (obj)).getColumnIndexOrThrow("retry_index")) + 1;
        boolean flag2 = true;
        ContentValues contentvalues;
        Object obj1;
        long l3;
        obj1 = new android_src.mms.transaction.b(a, i1);
        contentvalues = new ContentValues(4);
        l3 = System.currentTimeMillis();
        boolean flag;
        boolean flag1;
        int j1;
        if (i == 130)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        flag1 = true;
        j1 = a(l1);
        i = 0;
        if (flag) goto _L6; else goto _L5
_L5:
        j1;
        JVM INSTR lookupswitch 6: default 723
    //                   130: 464
    //                   132: 456
    //                   134: 472
    //                   194: 480
    //                   225: 464
    //                   228: 480;
           goto _L7 _L8 _L9 _L10 _L11 _L8 _L11
_L7:
        if (i == 0)
        {
            break MISSING_BLOCK_LABEL_248;
        }
        d.b().a(i);
        flag1 = false;
_L15:
        if (i1 >= ((android_src.mms.transaction.b) (obj1)).a() || !flag1) goto _L13; else goto _L12
_L12:
        l1 = ((android_src.mms.transaction.b) (obj1)).b() + l3;
        if (com.facebook.debug.log.b.b(2))
        {
            com.facebook.debug.log.b.a("fb-mms:RetryScheduler", (new StringBuilder()).append("scheduleRetry: retry for ").append(uri).append(" is scheduled at ").append(l1 - System.currentTimeMillis()).append("ms from now").toString());
        }
        contentvalues.put("due_time", Long.valueOf(l1));
        i = ((flag2) ? 1 : 0);
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_357;
        }
        d.b().a(uri, 130);
        i = ((flag2) ? 1 : 0);
_L16:
        contentvalues.put("err_type", Integer.valueOf(i));
        contentvalues.put("retry_index", Integer.valueOf(i1));
        contentvalues.put("last_try", Long.valueOf(l3));
        l1 = ((Cursor) (obj)).getLong(((Cursor) (obj)).getColumnIndexOrThrow("_id"));
        o.a(a, b, k.a, contentvalues, (new StringBuilder()).append("_id=").append(l1).toString(), null);
_L4:
        ((Cursor) (obj)).close();
_L2:
        return;
_L9:
        i = com.facebook.o.invalid_destination;
          goto _L7
_L8:
        i = com.facebook.o.service_not_activated;
          goto _L7
_L10:
        i = com.facebook.o.service_network_problem;
          goto _L7
_L11:
        i = com.facebook.o.service_message_not_found;
          goto _L7
_L6:
        if (b(l1) != 228) goto _L15; else goto _L14
_L14:
        d.b().a(com.facebook.o.service_message_not_found);
        o.a(a, a.getContentResolver(), uri, null, null);
        ((Cursor) (obj)).close();
        return;
_L13:
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_667;
        }
        obj1 = o.a(a, a.getContentResolver(), uri, new String[] {
            "thread_id"
        }, null, null, null);
        long l2;
        l1 = -1L;
        l2 = l1;
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_613;
        }
        if (((Cursor) (obj1)).moveToFirst())
        {
            l1 = ((Cursor) (obj1)).getLong(0);
        }
        ((Cursor) (obj1)).close();
        l2 = l1;
        if (l2 == -1L)
        {
            break MISSING_BLOCK_LABEL_631;
        }
        d.a(a, l2);
        d.b().a(uri, 135);
        i = 10;
          goto _L16
        uri;
        ((Cursor) (obj1)).close();
        throw uri;
        uri;
        ((Cursor) (obj)).close();
        throw uri;
        ContentValues contentvalues1 = new ContentValues(1);
        contentvalues1.put("read", Integer.valueOf(0));
        o.a(a, a.getContentResolver(), uri, contentvalues1, null, null);
        d.a(a, true);
        i = 10;
          goto _L16
    }

    private boolean a()
    {
        NetworkInfo networkinfo = ((ConnectivityManager)a.getSystemService("connectivity")).getNetworkInfo(2);
        if (networkinfo == null)
        {
            return false;
        } else
        {
            return networkinfo.isConnected();
        }
    }

    private int b(long l1)
    {
        Cursor cursor = o.a(a, b, f.a, null, (new StringBuilder()).append("_id=").append(l1).toString(), null, null);
        if (!cursor.moveToFirst()) goto _L2; else goto _L1
_L1:
        int i = cursor.getInt(cursor.getColumnIndexOrThrow("resp_st"));
_L4:
        cursor.close();
        if (i != 0 && com.facebook.debug.log.b.b(2))
        {
            com.facebook.debug.log.b.a("fb-mms:RetryScheduler", (new StringBuilder()).append("Retrieve status is: ").append(i).toString());
        }
        return i;
        Exception exception;
        exception;
        cursor.close();
        throw exception;
_L2:
        i = 0;
        if (true) goto _L4; else goto _L3
_L3:
    }

    public static void b(Context context)
    {
        Cursor cursor;
        cursor = t.a(context).a(0x7fffffffffffffffL);
        if (cursor == null)
        {
            break MISSING_BLOCK_LABEL_126;
        }
        if (cursor.moveToFirst())
        {
            long l1 = cursor.getLong(cursor.getColumnIndexOrThrow("due_time"));
            PendingIntent pendingintent = PendingIntent.getService(context, 0, new Intent("android.intent.action.ACTION_ONALARM", null, context, android_src/mms/transaction/TransactionService), 0x40000000);
            ((AlarmManager)context.getSystemService("alarm")).set(1, l1, pendingintent);
            if (com.facebook.debug.log.b.b(2))
            {
                com.facebook.debug.log.b.a("fb-mms:RetryScheduler", (new StringBuilder()).append("Next retry is scheduled at").append(l1 - System.currentTimeMillis()).append("ms from now").toString());
            }
        }
        cursor.close();
        return;
        context;
        cursor.close();
        throw context;
    }

    public void a(android_src.mms.transaction.k k1)
    {
        r r1;
        boolean flag;
        r1 = (r)k1;
        if (com.facebook.debug.log.b.b(2))
        {
            com.facebook.debug.log.b.a("fb-mms:RetryScheduler", (new StringBuilder()).append("[RetryScheduler] update ").append(k1).toString());
        }
        if ((r1 instanceof j) || (r1 instanceof android_src.mms.transaction.o) || (r1 instanceof n))
        {
            break MISSING_BLOCK_LABEL_67;
        }
        flag = r1 instanceof q;
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_99;
        }
        k1 = r1.d();
        if (k1.a() != 2)
        {
            break MISSING_BLOCK_LABEL_94;
        }
        k1 = k1.b();
        if (k1 == null)
        {
            break MISSING_BLOCK_LABEL_94;
        }
        a(((Uri) (k1)));
        r1.b(this);
        if (a())
        {
            b(a);
        }
        return;
        k1;
        r1.b(this);
        throw k1;
        k1;
        if (a())
        {
            b(a);
        }
        throw k1;
    }
}
