// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android_src.mms.g;

import android.content.BroadcastReceiver;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.database.Cursor;
import android_src.c.h;
import com.facebook.debug.log.b;

// Referenced classes of package android_src.mms.g:
//            m, o

public class l
{

    private static l a;
    private static boolean b;
    private final Context c;
    private int d;
    private final BroadcastReceiver e = new m(this);

    private l(Context context)
    {
        c = context;
    }

    static int a(l l1, int i)
    {
        l1.d = i;
        return i;
    }

    public static l a()
    {
        if (a == null)
        {
            throw new IllegalStateException("Uninitialized.");
        } else
        {
            return a;
        }
    }

    public static void a(Context context)
    {
        if (a != null)
        {
            com.facebook.debug.log.b.d("RateController", "Already initialized.");
        }
        a = new l(context);
    }

    private int e()
    {
        this;
        JVM INSTR monitorenter ;
        int i = 0;
_L3:
        int j = d;
        if (j != 0 || i >= 20000) goto _L2; else goto _L1
_L1:
        Exception exception;
        try
        {
            wait(1000L);
        }
        catch (InterruptedException interruptedexception) { }
        finally
        {
            this;
        }
        i += 1000;
        if (true) goto _L3; else goto _L2
_L2:
        i = d;
        this;
        JVM INSTR monitorexit ;
        return i;
        throw exception;
    }

    public final void b()
    {
        ContentValues contentvalues = new ContentValues(1);
        contentvalues.put("sent_time", Long.valueOf(System.currentTimeMillis()));
        o.a(c, c.getContentResolver(), h.a, contentvalues);
    }

    public final boolean c()
    {
        Object obj;
        long l1 = System.currentTimeMillis();
        obj = c;
        android.content.ContentResolver contentresolver = c.getContentResolver();
        android.net.Uri uri = h.a;
        String s = (new StringBuilder()).append("sent_time>").append(l1 - 0x36ee80L).toString();
        obj = o.a(((Context) (obj)), contentresolver, uri, new String[] {
            "COUNT(*) AS rate"
        }, s, null, null);
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_121;
        }
        int i;
        if (!((Cursor) (obj)).moveToFirst())
        {
            break MISSING_BLOCK_LABEL_115;
        }
        i = ((Cursor) (obj)).getInt(0);
        boolean flag;
        if (i >= 100)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        ((Cursor) (obj)).close();
        return flag;
        ((Cursor) (obj)).close();
        return false;
        Exception exception;
        exception;
        ((Cursor) (obj)).close();
        throw exception;
    }

    public boolean d()
    {
        boolean flag = true;
        this;
        JVM INSTR monitorenter ;
_L3:
        boolean flag1 = b;
        if (!flag1) goto _L2; else goto _L1
_L1:
        Exception exception;
        int i;
        try
        {
            wait();
        }
        catch (InterruptedException interruptedexception) { }
        finally
        {
            this;
        }
        if (true) goto _L3; else goto _L2
_L2:
        b = true;
        c.registerReceiver(e, new IntentFilter("com.android.mms.RATE_LIMIT_CONFIRMED"));
        d = 0;
        Intent intent = new Intent("com.android.mms.RATE_LIMIT_SURPASSED");
        intent.addFlags(0x10000000);
        c.startActivity(intent);
        i = e();
        if (i != 1)
        {
            flag = false;
        }
        c.unregisterReceiver(e);
        b = false;
        notifyAll();
        this;
        JVM INSTR monitorexit ;
        return flag;
        exception;
        c.unregisterReceiver(e);
        b = false;
        notifyAll();
        throw exception;
        throw exception;
    }
}
