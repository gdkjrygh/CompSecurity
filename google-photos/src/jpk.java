// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Activity;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.os.SystemClock;
import com.google.android.gms.ads.internal.purchase.GInAppPurchaseManagerInfoParcel;
import java.lang.reflect.Method;

public final class jpk extends kwe
    implements ServiceConnection
{

    private final Activity a;
    private jpm b;
    private joh c;
    private jpj d;
    private jpl e;
    private k f;
    private im g;
    private String h;

    public jpk(Activity activity)
    {
        h = null;
        a = activity;
        b = jpm.a(a.getApplicationContext());
    }

    public final void a()
    {
        Object obj = GInAppPurchaseManagerInfoParcel.a(a.getIntent());
        f = ((GInAppPurchaseManagerInfoParcel) (obj)).e;
        g = ((GInAppPurchaseManagerInfoParcel) (obj)).b;
        c = ((GInAppPurchaseManagerInfoParcel) (obj)).c;
        d = new jpj(a.getApplicationContext());
        if (a.getResources().getConfiguration().orientation == 2)
        {
            a.setRequestedOrientation(jqc.e().a());
        } else
        {
            a.setRequestedOrientation(jqc.e().b());
        }
        obj = new Intent("com.android.vending.billing.InAppBillingService.BIND");
        ((Intent) (obj)).setPackage("com.android.vending");
        a.bindService(((Intent) (obj)), this, 1);
    }

    public final void a(int i, int j, Intent intent)
    {
        if (i != 1001) goto _L2; else goto _L1
_L1:
        jqc.j();
        if (intent != null) goto _L4; else goto _L3
_L3:
        i = 5;
_L10:
        if (j != -1) goto _L6; else goto _L5
_L5:
        jqc.j();
        if (i != 0) goto _L6; else goto _L7
_L7:
        if (!g.a(h, intent));
_L8:
        a.finish();
        h = null;
_L2:
        return;
_L4:
        Object obj = intent.getExtras().get("RESPONSE_CODE");
        if (obj != null)
        {
            break MISSING_BLOCK_LABEL_84;
        }
        b.m("Intent with no response code, assuming OK (known issue)");
        i = 0;
        continue; /* Loop/switch isn't completed */
        if (obj instanceof Integer)
        {
            i = ((Integer)obj).intValue();
            continue; /* Loop/switch isn't completed */
        }
        if (obj instanceof Long)
        {
            i = (int)((Long)obj).longValue();
            continue; /* Loop/switch isn't completed */
        }
        b.m((new StringBuilder("Unexpected type for intent response code. ")).append(obj.getClass().getName()).toString());
        i = 5;
        continue; /* Loop/switch isn't completed */
_L6:
        b.a(e);
          goto _L8
        intent;
        b.m("Fail to process purchase result.");
        a.finish();
        h = null;
        return;
        intent;
        h = null;
        throw intent;
        if (true) goto _L10; else goto _L9
_L9:
    }

    public final void b()
    {
        a.unbindService(this);
        d.a = null;
    }

    public final void onServiceConnected(ComponentName componentname, IBinder ibinder)
    {
        componentname = d;
        try
        {
            componentname.a = ((jpj) (componentname)).b.getClassLoader().loadClass("com.android.vending.billing.IInAppBillingService$Stub").getDeclaredMethod("asInterface", new Class[] {
                android/os/IBinder
            }).invoke(null, new Object[] {
                ibinder
            });
        }
        // Misplaced declaration of an exception variable
        catch (IBinder ibinder)
        {
            if (((jpj) (componentname)).c)
            {
                b.m("IInAppBillingService is not available, please add com.android.vending.billing.IInAppBillingService to project.");
            }
        }
_L12:
        jqc.c();
        h = kwz.a();
        ibinder = d.a(a.getPackageName(), c.a(), h);
        componentname = (PendingIntent)ibinder.getParcelable("BUY_INTENT");
        if (componentname != null) goto _L2; else goto _L1
_L1:
        jqc.j();
        componentname = ((ComponentName) (ibinder.get("RESPONSE_CODE")));
        if (componentname != null) goto _L4; else goto _L3
_L3:
        b.m("Bundle with null response code, assuming OK (known issue)");
_L7:
        a.finish();
        return;
_L4:
        if (!(componentname instanceof Integer)) goto _L6; else goto _L5
_L5:
        ((Integer)componentname).intValue();
          goto _L7
_L9:
        ContentValues contentvalues;
        try
        {
            a.startIntentSenderForResult(componentname.getIntentSender(), 1001, new Intent(), Integer.valueOf(0).intValue(), Integer.valueOf(0).intValue(), Integer.valueOf(0).intValue());
            return;
        }
        // Misplaced declaration of an exception variable
        catch (ComponentName componentname) { }
        // Misplaced declaration of an exception variable
        catch (ComponentName componentname) { }
        b.b("Error when connecting in-app billing service", componentname);
        a.finish();
        return;
_L6:
label0:
        {
            if (!(componentname instanceof Long))
            {
                break label0;
            }
            i = (int)((Long)componentname).longValue();
        }
          goto _L7
        b.m((new StringBuilder("Unexpected type for intent response code. ")).append(componentname.getClass().getName()).toString());
          goto _L7
_L2:
        e = new jpl(c.a(), h);
        jpm1 = b;
        jpl1 = e;
        if (jpl1 == null) goto _L9; else goto _L8
_L8:
        ibinder = ((IBinder) (jpm.a));
        ibinder;
        JVM INSTR monitorenter ;
        sqlitedatabase = jpm1.a();
        if (sqlitedatabase != null) goto _L11; else goto _L10
_L10:
        ibinder;
        JVM INSTR monitorexit ;
          goto _L9
_L11:
        contentvalues = new ContentValues();
        contentvalues.put("product_id", jpl1.c);
        contentvalues.put("developer_payload", jpl1.b);
        contentvalues.put("record_time", Long.valueOf(SystemClock.elapsedRealtime()));
        jpl1.a = sqlitedatabase.insert("InAppPurchase", null, contentvalues);
        if ((long)jpm1.b() > 20000L)
        {
            jpm1.c();
        }
        ibinder;
        JVM INSTR monitorexit ;
          goto _L9
        componentname;
        ibinder;
        JVM INSTR monitorexit ;
        throw componentname;
          goto _L12
    }

    public final void onServiceDisconnected(ComponentName componentname)
    {
        b.p(4);
        d.a = null;
    }
}
