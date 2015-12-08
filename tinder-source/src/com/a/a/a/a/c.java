// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.a.a.a.a;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.IBinder;
import android.text.TextUtils;
import android.util.Log;
import com.android.a.a.a;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.a.a.a.a:
//            a, b, d, g, 
//            e, f

public final class c extends com.a.a.a.a.a
{
    public static interface a
    {

        public abstract void a();

        public abstract void a(int k, Throwable throwable);

        public abstract void a(String s, g g1);

        public abstract void b();
    }


    private static final Date c = new Date(2012, 12, 5);
    private static final Date d = new Date(2015, 7, 20);
    public b a;
    public b b;
    private com.android.a.a.a e;
    private String f;
    private String g;
    private a h;
    private String i;
    private ServiceConnection j = new ServiceConnection() {

        final c a;

        public final void onServiceConnected(ComponentName componentname, IBinder ibinder)
        {
            com.a.a.a.a.c.a(a, com.android.a.a.a.a.a(ibinder));
            if (!com.a.a.a.a.c.a(a) && a.f())
            {
                a.g();
                if (c.b(a) != null)
                {
                    c.b(a).a();
                }
            }
            if (c.b(a) != null)
            {
                c.b(a).b();
            }
        }

        public final void onServiceDisconnected(ComponentName componentname)
        {
            com.a.a.a.a.c.a(a, null);
        }

            
            {
                a = c.this;
                super();
            }
    };

    public c(Context context, String s, a a1)
    {
        this(context, s, a1, (byte)0);
    }

    private c(Context context, String s, a a1, byte byte0)
    {
        super(context);
        g = s;
        h = a1;
        f = context.getApplicationContext().getPackageName();
        a = new b(context, ".products.cache.v2_6");
        b = new b(context, ".subscriptions.cache.v2_6");
        i = null;
        try
        {
            context = new Intent("com.android.vending.billing.InAppBillingService.BIND");
            context.setPackage("com.android.vending");
            super.a().bindService(context, j, 1);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            Log.e("iabv3", context.toString());
        }
    }

    static com.android.a.a.a a(c c1, com.android.a.a.a a1)
    {
        c1.e = a1;
        return a1;
    }

    static boolean a(c c1)
    {
        boolean flag = false;
        String s = (new StringBuilder()).append(c1.b()).append(".products.restored.v2_6").toString();
        c1 = c1.com.a.a.a.a.a.c();
        if (c1 != null)
        {
            flag = c1.getBoolean(s, false);
        }
        return flag;
    }

    private boolean a(String s, b b1)
    {
        if (!e())
        {
            return false;
        }
        s = e.a(3, f, s, null);
        if (s.getInt("RESPONSE_CODE") != 0) goto _L2; else goto _L1
_L1:
        ArrayList arraylist;
        ArrayList arraylist1;
        b1.e();
        arraylist = s.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
        arraylist1 = s.getStringArrayList("INAPP_DATA_SIGNATURE_LIST");
        if (arraylist == null) goto _L2; else goto _L3
_L3:
        int k = 0;
_L7:
        if (k >= arraylist.size()) goto _L2; else goto _L4
_L4:
        String s1;
        JSONObject jsonobject;
        s1 = (String)arraylist.get(k);
        jsonobject = new JSONObject(s1);
        if (arraylist1 == null)
        {
            break MISSING_BLOCK_LABEL_141;
        }
        if (arraylist1.size() <= k)
        {
            break MISSING_BLOCK_LABEL_141;
        }
        s = (String)arraylist1.get(k);
_L5:
        b1.a(jsonobject.getString("productId"), s1, s);
        k++;
        continue; /* Loop/switch isn't completed */
        s = null;
          goto _L5
_L2:
        return true;
        s;
        if (h != null)
        {
            h.a(100, s);
        }
        Log.e("iabv3", s.toString());
        return false;
        if (true) goto _L7; else goto _L6
_L6:
    }

    static a b(c c1)
    {
        return c1.h;
    }

    private static g b(String s, b b1)
    {
        b1.f();
        if (b1.a.containsKey(s))
        {
            b1 = (d)b1.a.get(s);
        } else
        {
            b1 = null;
        }
        if (b1 == null || TextUtils.isEmpty(((d) (b1)).a))
        {
            break MISSING_BLOCK_LABEL_80;
        }
        b1 = new g(b1);
        return b1;
        b1;
        Log.e("iabv3", (new StringBuilder("Failed to load saved purchase details for ")).append(s).toString());
        return null;
    }

    private boolean c(String s, String s1)
    {
        boolean flag1 = false;
        String s2;
        if (TextUtils.isEmpty(g))
        {
            break MISSING_BLOCK_LABEL_75;
        }
        s2 = g;
        if (!TextUtils.isEmpty(s) && !TextUtils.isEmpty(s2) && !TextUtils.isEmpty(s1))
        {
            break MISSING_BLOCK_LABEL_53;
        }
        Log.e("IABUtil/Security", "Purchase verification failed: missing data.");
        boolean flag;
        flag = false;
        break MISSING_BLOCK_LABEL_70;
        try
        {
            flag = com.a.a.a.a.e.a(com.a.a.a.a.e.a(s2), s, s1);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return false;
        }
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_78;
        }
        flag1 = true;
        return flag1;
    }

    public final volatile Context a()
    {
        return super.a();
    }

    public final g a(String s)
    {
        return b(s, b);
    }

    public final List a(ArrayList arraylist, String s)
    {
        if (e == null || arraylist == null || arraylist.size() <= 0) goto _L2; else goto _L1
_L1:
        int k;
        Bundle bundle = new Bundle();
        bundle.putStringArrayList("ITEM_ID_LIST", arraylist);
        s = e.a(3, f, s, bundle);
        k = s.getInt("RESPONSE_CODE");
        if (k != 0) goto _L4; else goto _L3
_L3:
        arraylist = new ArrayList();
        s = s.getStringArrayList("DETAILS_LIST");
        if (s == null) goto _L6; else goto _L5
_L5:
        for (s = s.iterator(); s.hasNext(); arraylist.add(new f(new JSONObject((String)s.next())))) { }
          goto _L6
_L2:
        return null;
_L6:
        return arraylist;
_L4:
        try
        {
            if (h != null)
            {
                h.a(k, null);
            }
            Log.e("iabv3", String.format("Failed to retrieve info for %d products, %d", new Object[] {
                Integer.valueOf(arraylist.size()), Integer.valueOf(k)
            }));
        }
        // Misplaced declaration of an exception variable
        catch (ArrayList arraylist)
        {
            Log.e("iabv3", String.format("Failed to call getSkuDetails %s", new Object[] {
                arraylist.toString()
            }));
        }
        if (true) goto _L2; else goto _L7
_L7:
    }

    public final boolean a(int k, int l, Intent intent)
    {
        String s1;
        String s2;
        String s4;
        if (k != 0x1f76a0)
        {
            return false;
        }
        if (intent == null)
        {
            Log.e("iabv3", "handleActivityResult: data is null!");
            return false;
        }
        k = intent.getIntExtra("RESPONSE_CODE", 0);
        Log.d("iabv3", String.format("resultCode = %d, responseCode = %d", new Object[] {
            Integer.valueOf(l), Integer.valueOf(k)
        }));
        s4 = b((new StringBuilder()).append(b()).append(".purchase.last.v2_6").toString(), null);
        if (l != -1 || k != 0 || TextUtils.isEmpty(s4))
        {
            break MISSING_BLOCK_LABEL_374;
        }
        s1 = intent.getStringExtra("INAPP_PURCHASE_DATA");
        s2 = intent.getStringExtra("INAPP_DATA_SIGNATURE");
        String s;
        String s3;
        intent = new JSONObject(s1);
        s3 = intent.getString("productId");
        s = intent.getString("developerPayload");
        intent = s;
        if (s == null)
        {
            intent = "";
        }
        boolean flag;
        flag = s4.startsWith("subs");
        if (!s4.equals(intent))
        {
            break MISSING_BLOCK_LABEL_327;
        }
        if (!c(s1, s2)) goto _L2; else goto _L1
_L1:
        if (!flag) goto _L4; else goto _L3
_L3:
        intent = b;
_L5:
        intent.a(s3, s1, s2);
        if (h != null)
        {
            h.a(s3, new g(new d(s1, s2)));
        }
        break MISSING_BLOCK_LABEL_392;
_L4:
        intent = a;
        if (true) goto _L5; else goto _L2
_L2:
        try
        {
            Log.e("iabv3", "Public key signature doesn't match!");
            if (h != null)
            {
                h.a(102, null);
            }
        }
        // Misplaced declaration of an exception variable
        catch (Intent intent)
        {
            Log.e("iabv3", intent.toString());
            if (h != null)
            {
                h.a(110, null);
            }
        }
        break MISSING_BLOCK_LABEL_392;
        Log.e("iabv3", String.format("Payload mismatch: %s != %s", new Object[] {
            s4, intent
        }));
        if (h != null)
        {
            h.a(102, null);
        }
        break MISSING_BLOCK_LABEL_392;
        if (h != null)
        {
            h.a(k, null);
        }
        return true;
    }

    public final boolean a(Activity activity, String s, String s1)
    {
        int k;
        if (!e() || TextUtils.isEmpty(s) || TextUtils.isEmpty(s1))
        {
            return false;
        }
        try
        {
            String s2 = (new StringBuilder()).append(s1).append(":").append(UUID.randomUUID().toString()).toString();
            a((new StringBuilder()).append(b()).append(".purchase.last.v2_6").toString(), s2);
            s1 = e.a(3, f, s, s1, s2);
        }
        // Misplaced declaration of an exception variable
        catch (Activity activity)
        {
            Log.e("iabv3", activity.toString());
            return false;
        }
        if (s1 == null) goto _L2; else goto _L1
_L1:
        k = s1.getInt("RESPONSE_CODE");
        if (k != 0) goto _L4; else goto _L3
_L3:
        s = (PendingIntent)s1.getParcelable("BUY_INTENT");
        if (activity == null || s == null) goto _L6; else goto _L5
_L5:
        activity.startIntentSenderForResult(s.getIntentSender(), 0x1f76a0, new Intent(), 0, 0, 0);
          goto _L2
_L6:
        if (h != null)
        {
            h.a(103, null);
        }
          goto _L2
_L4:
        if (k != 7) goto _L8; else goto _L7
_L7:
        if (!a.a(s) && !b.a(s))
        {
            f();
        }
        s1 = b(s, a);
        if (i != null) goto _L10; else goto _L9
_L9:
        k = 1;
_L20:
        if (k != 0) goto _L12; else goto _L11
_L11:
        Log.i("iabv3", "Invalid or tampered merchant id!");
        if (h != null)
        {
            h.a(104, null);
        }
          goto _L13
_L10:
        if (((g) (s1)).d.before(c))
        {
            k = 1;
            continue; /* Loop/switch isn't completed */
        }
        if (((g) (s1)).d.after(d))
        {
            k = 1;
            continue; /* Loop/switch isn't completed */
        }
        if (((g) (s1)).b != null && ((g) (s1)).b.trim().length() != 0) goto _L15; else goto _L14
_L15:
        k = ((g) (s1)).b.indexOf('.');
        if (k <= 0) goto _L17; else goto _L16
_L16:
        if (((g) (s1)).b.substring(0, k).compareTo(i) == 0)
        {
            k = 1;
            continue; /* Loop/switch isn't completed */
        }
          goto _L17
_L12:
        if (h == null) goto _L2; else goto _L18
_L18:
        activity = s1;
        if (s1 != null)
        {
            break MISSING_BLOCK_LABEL_409;
        }
        activity = a(s);
        h.a(s, activity);
          goto _L2
_L8:
        if (h != null)
        {
            h.a(101, null);
        }
_L2:
        return true;
_L13:
        return false;
_L14:
        k = 0;
        continue; /* Loop/switch isn't completed */
_L17:
        k = 0;
        if (true) goto _L20; else goto _L19
_L19:
    }

    public final void d()
    {
        if (j != null && super.a() != null)
        {
            try
            {
                super.a().unbindService(j);
            }
            catch (Exception exception)
            {
                Log.e("iabv3", exception.toString());
            }
            e = null;
        }
        a.d();
        super.d();
    }

    public final boolean e()
    {
        return e != null;
    }

    public final boolean f()
    {
        return e() && a("inapp", a) && a("subs", b);
    }

    public final void g()
    {
        String s = (new StringBuilder()).append(b()).append(".products.restored.v2_6").toString();
        Object obj = super.c();
        if (obj != null)
        {
            obj = ((SharedPreferences) (obj)).edit();
            ((android.content.SharedPreferences.Editor) (obj)).putBoolean(s, Boolean.valueOf(true).booleanValue());
            ((android.content.SharedPreferences.Editor) (obj)).commit();
        }
    }

}
