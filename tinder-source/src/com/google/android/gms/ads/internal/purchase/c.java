// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.internal.purchase;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.ContentValues;
import android.content.Context;
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
import android.text.TextUtils;
import com.google.android.gms.ads.internal.d;
import com.google.android.gms.ads.internal.util.client.b;
import com.google.android.gms.internal.bu;
import com.google.android.gms.internal.cl;
import com.google.android.gms.internal.cm;
import java.lang.reflect.Method;

// Referenced classes of package com.google.android.gms.ads.internal.purchase:
//            e, GInAppPurchaseManagerInfoParcel, b, f, 
//            h, i, d, g

public final class c extends com.google.android.gms.internal.bw.a
    implements ServiceConnection
{

    e a;
    private final Activity b;
    private Context c;
    private bu d;
    private com.google.android.gms.ads.internal.purchase.b e;
    private com.google.android.gms.ads.internal.purchase.d f;
    private g g;
    private h h;
    private String i;

    public c(Activity activity)
    {
        i = null;
        b = activity;
        a = com.google.android.gms.ads.internal.purchase.e.a(b.getApplicationContext());
    }

    public final void a()
    {
        Object obj = GInAppPurchaseManagerInfoParcel.a(b.getIntent());
        g = ((GInAppPurchaseManagerInfoParcel) (obj)).e;
        h = ((GInAppPurchaseManagerInfoParcel) (obj)).b;
        d = ((GInAppPurchaseManagerInfoParcel) (obj)).c;
        e = new com.google.android.gms.ads.internal.purchase.b(b.getApplicationContext());
        c = ((GInAppPurchaseManagerInfoParcel) (obj)).d;
        if (b.getResources().getConfiguration().orientation == 2)
        {
            b.setRequestedOrientation(com.google.android.gms.ads.internal.d.e().a());
        } else
        {
            b.setRequestedOrientation(com.google.android.gms.ads.internal.d.e().b());
        }
        obj = new Intent("com.android.vending.billing.InAppBillingService.BIND");
        ((Intent) (obj)).setPackage("com.android.vending");
        b.bindService(((Intent) (obj)), this, 1);
    }

    public final void a(int j, int k, Intent intent)
    {
        if (j != 1001) goto _L2; else goto _L1
_L1:
        com.google.android.gms.ads.internal.d.j();
        if (intent != null) goto _L4; else goto _L3
_L3:
        j = 5;
_L10:
        if (k != -1) goto _L6; else goto _L5
_L5:
        com.google.android.gms.ads.internal.d.j();
        if (j != 0) goto _L6; else goto _L7
_L7:
        Object obj1;
        String s;
        obj1 = h;
        s = i;
        if (s != null && intent != null) goto _L9; else goto _L8
_L23:
        d.b(j);
        b.finish();
        d.a();
        i = null;
_L2:
        return;
_L4:
        Object obj = intent.getExtras().get("RESPONSE_CODE");
        if (obj != null)
        {
            break MISSING_BLOCK_LABEL_113;
        }
        com.google.android.gms.ads.internal.util.client.b.e("Intent with no response code, assuming OK (known issue)");
        j = 0;
          goto _L10
label0:
        {
            if (!(obj instanceof Integer))
            {
                break label0;
            }
            j = ((Integer)obj).intValue();
        }
          goto _L10
label1:
        {
            if (!(obj instanceof Long))
            {
                break label1;
            }
            j = (int)((Long)obj).longValue();
        }
          goto _L10
        com.google.android.gms.ads.internal.util.client.b.e((new StringBuilder("Unexpected type for intent response code. ")).append(obj.getClass().getName()).toString());
        j = 5;
          goto _L10
_L9:
        com.google.android.gms.ads.internal.d.j();
        if (intent != null) goto _L12; else goto _L11
_L11:
        obj = null;
_L16:
        com.google.android.gms.ads.internal.d.j();
        if (intent != null) goto _L14; else goto _L13
_L13:
        intent = null;
          goto _L15
_L12:
        obj = intent.getStringExtra("INAPP_PURCHASE_DATA");
          goto _L16
_L14:
        intent = intent.getStringExtra("INAPP_DATA_SIGNATURE");
          goto _L15
_L25:
        com.google.android.gms.ads.internal.d.j();
        if (s.equals(com.google.android.gms.ads.internal.purchase.f.a(((String) (obj))))) goto _L18; else goto _L17
_L17:
        com.google.android.gms.ads.internal.util.client.b.e("Developer payload not match.");
        k = 0;
          goto _L19
_L18:
        if (((h) (obj1)).a == null)
        {
            break MISSING_BLOCK_LABEL_398;
        }
        obj1 = ((h) (obj1)).a;
        if (!TextUtils.isEmpty(((CharSequence) (obj))) && !TextUtils.isEmpty(((CharSequence) (obj1))) && !TextUtils.isEmpty(intent)) goto _L21; else goto _L20
_L20:
        com.google.android.gms.ads.internal.util.client.b.b("Purchase verification failed: missing data.");
        boolean flag = false;
_L22:
        if (flag)
        {
            break MISSING_BLOCK_LABEL_398;
        }
        com.google.android.gms.ads.internal.util.client.b.e("Fail to verify signature.");
        k = 0;
        break; /* Loop/switch isn't completed */
_L21:
        flag = com.google.android.gms.ads.internal.purchase.i.a(com.google.android.gms.ads.internal.purchase.i.a(((String) (obj1))), ((String) (obj)), intent);
        if (true) goto _L22; else goto _L19
_L6:
        a.a(f);
          goto _L23
        intent;
        com.google.android.gms.ads.internal.util.client.b.e("Fail to process purchase result.");
        b.finish();
        i = null;
        return;
        intent;
        i = null;
        throw intent;
_L8:
        k = 0;
_L19:
        if (k == 0);
          goto _L23
_L15:
        if (obj != null && intent != null) goto _L25; else goto _L24
_L24:
        k = 0;
          goto _L19
        k = 1;
          goto _L19
    }

    public final void b()
    {
        b.unbindService(this);
        e.a = null;
    }

    public final void onServiceConnected(ComponentName componentname, IBinder ibinder)
    {
        PendingIntent pendingintent;
        int j;
        componentname = e;
        try
        {
            componentname.a = ((com.google.android.gms.ads.internal.purchase.b) (componentname)).b.getClassLoader().loadClass("com.android.vending.billing.IInAppBillingService$Stub").getDeclaredMethod("asInterface", new Class[] {
                android/os/IBinder
            }).invoke(null, new Object[] {
                ibinder
            });
        }
        // Misplaced declaration of an exception variable
        catch (IBinder ibinder)
        {
            if (((com.google.android.gms.ads.internal.purchase.b) (componentname)).c)
            {
                com.google.android.gms.ads.internal.util.client.b.e("IInAppBillingService is not available, please add com.android.vending.billing.IInAppBillingService to project.");
            }
        }
        com.google.android.gms.ads.internal.d.c();
        i = cl.a();
        componentname = e.a(b.getPackageName(), d.a(), i);
        pendingintent = (PendingIntent)componentname.getParcelable("BUY_INTENT");
        if (pendingintent != null)
        {
            break MISSING_BLOCK_LABEL_246;
        }
        com.google.android.gms.ads.internal.d.j();
        componentname = ((ComponentName) (componentname.get("RESPONSE_CODE")));
        if (componentname != null) goto _L2; else goto _L1
_L1:
        com.google.android.gms.ads.internal.util.client.b.e("Bundle with null response code, assuming OK (known issue)");
        j = 0;
        break MISSING_BLOCK_LABEL_130;
_L2:
label0:
        {
            if (!(componentname instanceof Integer))
            {
                break label0;
            }
            j = ((Integer)componentname).intValue();
        }
          goto _L3
label1:
        {
            if (!(componentname instanceof Long))
            {
                break label1;
            }
            j = (int)((Long)componentname).longValue();
        }
          goto _L3
        com.google.android.gms.ads.internal.util.client.b.e((new StringBuilder("Unexpected type for intent response code. ")).append(componentname.getClass().getName()).toString());
        j = 5;
          goto _L3
        e e1;
        f = new com.google.android.gms.ads.internal.purchase.d(d.a(), i);
        e1 = a;
        componentname = f;
        if (componentname == null) goto _L5; else goto _L4
_L4:
        obj = e.a;
        obj;
        JVM INSTR monitorenter ;
        ibinder = e1.a();
        if (ibinder != null) goto _L7; else goto _L6
_L6:
        obj;
        JVM INSTR monitorexit ;
_L5:
        b.startIntentSenderForResult(pendingintent.getIntentSender(), 1001, new Intent(), Integer.valueOf(0).intValue(), Integer.valueOf(0).intValue(), Integer.valueOf(0).intValue());
        return;
_L3:
        Object obj1;
        ContentValues contentvalues;
        Object obj;
        try
        {
            d.b(j);
            d.a();
            b.finish();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (ComponentName componentname) { }
        // Misplaced declaration of an exception variable
        catch (ComponentName componentname) { }
        com.google.android.gms.ads.internal.util.client.b.c("Error when connecting in-app billing service", componentname);
        b.finish();
        return;
_L7:
        contentvalues = new ContentValues();
        contentvalues.put("product_id", ((com.google.android.gms.ads.internal.purchase.d) (componentname)).c);
        contentvalues.put("developer_payload", ((com.google.android.gms.ads.internal.purchase.d) (componentname)).b);
        contentvalues.put("record_time", Long.valueOf(SystemClock.elapsedRealtime()));
        componentname.a = ibinder.insert("InAppPurchase", null, contentvalues);
        if ((long)e1.b() <= 20000L) goto _L9; else goto _L8
_L8:
        obj1 = e.a;
        obj1;
        JVM INSTR monitorenter ;
        componentname = e1.a();
        if (componentname != null) goto _L11; else goto _L10
_L10:
        obj1;
        JVM INSTR monitorexit ;
_L9:
        obj;
        JVM INSTR monitorexit ;
          goto _L5
        componentname;
        obj;
        JVM INSTR monitorexit ;
        throw componentname;
_L11:
        ibinder = componentname.query("InAppPurchase", null, null, null, null, null, "record_time ASC", "1");
        if (ibinder == null) goto _L13; else goto _L12
_L12:
        componentname = ibinder;
        if (!ibinder.moveToFirst()) goto _L13; else goto _L14
_L14:
        if (ibinder != null) goto _L16; else goto _L15
_L15:
        com.google.android.gms.ads.internal.purchase.d d1 = null;
_L17:
        componentname = ibinder;
        e1.a(d1);
_L13:
        if (ibinder == null)
        {
            break MISSING_BLOCK_LABEL_530;
        }
        ibinder.close();
_L19:
        obj1;
        JVM INSTR monitorexit ;
          goto _L9
        componentname;
        obj1;
        JVM INSTR monitorexit ;
        throw componentname;
_L16:
        componentname = ibinder;
        d1 = new com.google.android.gms.ads.internal.purchase.d(ibinder.getLong(0), ibinder.getString(1), ibinder.getString(2));
          goto _L17
        SQLiteException sqliteexception;
        sqliteexception;
_L21:
        componentname = ibinder;
        com.google.android.gms.ads.internal.util.client.b.e((new StringBuilder("Error remove oldest record")).append(sqliteexception.getMessage()).toString());
        if (ibinder == null) goto _L19; else goto _L18
_L18:
        ibinder.close();
          goto _L19
_L20:
        if (componentname == null)
        {
            break MISSING_BLOCK_LABEL_625;
        }
        componentname.close();
        throw ibinder;
        ibinder;
          goto _L20
        sqliteexception;
        ibinder = null;
          goto _L21
        ibinder;
        componentname = null;
          goto _L20
    }

    public final void onServiceDisconnected(ComponentName componentname)
    {
        com.google.android.gms.ads.internal.util.client.b.c("In-app billing service disconnected.");
        e.a = null;
    }
}
