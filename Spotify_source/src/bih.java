// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Activity;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.ContentValues;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.os.SystemClock;
import com.google.android.gms.ads.internal.purchase.GInAppPurchaseManagerInfoParcel;

public final class bih extends cgz
    implements ServiceConnection
{

    private final Activity a;
    private bik b;
    private cgs c;
    private bie d;
    private bii e;
    private bin f;
    private bio g;
    private String h;

    public bih(Activity activity)
    {
        h = null;
        a = activity;
        b = bik.a(a.getApplicationContext());
    }

    private void a(String s, boolean flag, int i, Intent intent)
    {
        if (f != null)
        {
            f.a(s, flag, i, intent, e);
        }
    }

    public final void a()
    {
        Object obj = GInAppPurchaseManagerInfoParcel.a(a.getIntent());
        f = ((GInAppPurchaseManagerInfoParcel) (obj)).e;
        g = ((GInAppPurchaseManagerInfoParcel) (obj)).b;
        c = ((GInAppPurchaseManagerInfoParcel) (obj)).c;
        d = new bie(a.getApplicationContext());
        obj = ((GInAppPurchaseManagerInfoParcel) (obj)).d;
        if (a.getResources().getConfiguration().orientation == 2)
        {
            a.setRequestedOrientation(bkv.g().a());
        } else
        {
            a.setRequestedOrientation(bkv.g().b());
        }
        obj = new Intent("com.android.vending.billing.InAppBillingService.BIND");
        ((Intent) (obj)).setPackage("com.android.vending");
        a.bindService(((Intent) (obj)), this, 1);
    }

    public final void a(int i, int j, Intent intent)
    {
        if (i != 1001) goto _L2; else goto _L1
_L1:
        boolean flag = false;
        bkv.o();
        i = bim.a(intent);
        if (j != -1)
        {
            break MISSING_BLOCK_LABEL_90;
        }
        bkv.o();
        if (i != 0)
        {
            break MISSING_BLOCK_LABEL_90;
        }
        if (g.a(h, intent))
        {
            flag = true;
        }
_L3:
        c.b(i);
        a.finish();
        a(c.a(), flag, j, intent);
        h = null;
_L2:
        return;
        b.a(e);
          goto _L3
        intent;
        bka.e("Fail to process purchase result.");
        a.finish();
        h = null;
        return;
        intent;
        h = null;
        throw intent;
    }

    public final void b()
    {
        a.unbindService(this);
        d.a = null;
    }

    public final void onServiceConnected(ComponentName componentname, IBinder ibinder)
    {
        d.a(ibinder);
        PendingIntent pendingintent;
        bkv.e();
        h = cjj.a();
        componentname = d.a(a.getPackageName(), c.a(), h);
        pendingintent = (PendingIntent)componentname.getParcelable("BUY_INTENT");
        bik bik1;
        Object obj1;
        if (pendingintent == null)
        {
            Object obj;
            try
            {
                bkv.o();
                int i = bim.a(componentname);
                c.b(i);
                a(c.a(), false, i, null);
                a.finish();
                return;
            }
            // Misplaced declaration of an exception variable
            catch (ComponentName componentname) { }
            // Misplaced declaration of an exception variable
            catch (ComponentName componentname) { }
            bka.c("Error when connecting in-app billing service", componentname);
            a.finish();
            return;
        }
        e = new bii(c.a(), h);
        bik1 = b;
        componentname = e;
        if (componentname == null) goto _L2; else goto _L1
_L1:
        obj = bik.a;
        obj;
        JVM INSTR monitorenter ;
        ibinder = bik1.a();
        if (ibinder != null) goto _L4; else goto _L3
_L3:
        obj;
        JVM INSTR monitorexit ;
_L2:
        a.startIntentSenderForResult(pendingintent.getIntentSender(), 1001, new Intent(), Integer.valueOf(0).intValue(), Integer.valueOf(0).intValue(), Integer.valueOf(0).intValue());
        return;
_L4:
        obj1 = new ContentValues();
        ((ContentValues) (obj1)).put("product_id", ((bii) (componentname)).c);
        ((ContentValues) (obj1)).put("developer_payload", ((bii) (componentname)).b);
        ((ContentValues) (obj1)).put("record_time", Long.valueOf(SystemClock.elapsedRealtime()));
        componentname.a = ibinder.insert("InAppPurchase", null, ((ContentValues) (obj1)));
        if ((long)bik1.c() <= 20000L) goto _L6; else goto _L5
_L5:
        obj1 = bik.a;
        obj1;
        JVM INSTR monitorenter ;
        componentname = bik1.a();
        if (componentname != null) goto _L8; else goto _L7
_L7:
        obj1;
        JVM INSTR monitorexit ;
_L6:
        obj;
        JVM INSTR monitorexit ;
          goto _L2
        componentname;
        obj;
        JVM INSTR monitorexit ;
        throw componentname;
_L8:
        ibinder = componentname.query("InAppPurchase", null, null, null, null, null, "record_time ASC", "1");
        if (ibinder == null)
        {
            break MISSING_BLOCK_LABEL_378;
        }
        componentname = ibinder;
        if (!ibinder.moveToFirst())
        {
            break MISSING_BLOCK_LABEL_378;
        }
        componentname = ibinder;
        bik1.a(bik.a(ibinder));
        if (ibinder == null)
        {
            break MISSING_BLOCK_LABEL_388;
        }
        ibinder.close();
_L10:
        obj1;
        JVM INSTR monitorexit ;
          goto _L6
        componentname;
        obj1;
        JVM INSTR monitorexit ;
        throw componentname;
        SQLiteException sqliteexception;
        sqliteexception;
        ibinder = null;
_L12:
        componentname = ibinder;
        bka.e((new StringBuilder("Error remove oldest record")).append(sqliteexception.getMessage()).toString());
        if (ibinder == null) goto _L10; else goto _L9
_L9:
        ibinder.close();
          goto _L10
_L11:
        if (componentname == null)
        {
            break MISSING_BLOCK_LABEL_451;
        }
        componentname.close();
        throw ibinder;
        ibinder;
          goto _L11
        sqliteexception;
          goto _L12
        ibinder;
        componentname = null;
          goto _L11
    }

    public final void onServiceDisconnected(ComponentName componentname)
    {
        bka.c("In-app billing service disconnected.");
        d.a = null;
    }
}
