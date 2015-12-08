// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package crittercism.android;

import android.content.Context;
import android.content.SharedPreferences;
import java.io.File;
import java.io.IOException;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package crittercism.android:
//            da, dx, i, au, 
//            dt, dj, cu, dc, 
//            db, h, az, bh, 
//            br, cz, cy

public final class ct extends da
{
    public static final class a
        implements cz
    {

        public final cy a(br br, br br1, String s, Context context, au au1)
        {
            return new ct(br, br1, s, context, au1);
        }

        public a()
        {
        }
    }


    private au a;
    private Context b;
    private String c;
    private JSONObject d;
    private JSONObject e;
    private boolean f;

    public ct(br br, br br1, String s, Context context, au au1)
    {
        super(br, br1);
        c = s;
        b = context;
        a = au1;
    }

    public final void a(boolean flag, int j, JSONObject jsonobject)
    {
        super.a(flag, j, jsonobject);
        if (jsonobject == null) goto _L2; else goto _L1
_L1:
        Object obj;
        Object obj1;
        if (jsonobject.optBoolean("internalExceptionReporting", false))
        {
            dx.a = dx.a.b;
            i.d();
        } else
        {
            dx.a = dx.a.c;
        }
        obj = a.m();
        if (obj == null) goto _L4; else goto _L3
_L3:
        obj1 = jsonobject.optJSONObject("rateMyApp");
        if (obj1 != null) goto _L6; else goto _L5
_L5:
        ((dt) (obj)).a(false);
_L4:
        if (jsonobject.optInt("needPkg", 0) == 1)
        {
            String s;
            int k;
            try
            {
                (new dj((new cu(a)).a("device_name", a.i()).a("pkg", b.getPackageName()), new dc((new db(c, "/android_v2/update_package_name")).a()), null)).run();
            }
            catch (IOException ioexception)
            {
                (new StringBuilder("IOException in handleResponse(): ")).append(ioexception.getMessage());
                dx.b();
                dx.c();
            }
            f = true;
        }
        d = jsonobject.optJSONObject("apm");
        if (d != null)
        {
            obj = new h(d);
            obj1 = b;
            if (((h) (obj)).c)
            {
                h.b(((Context) (obj1)));
            } else
            {
                File file = h.a(((Context) (obj1)));
                if (!file.delete() && file.exists())
                {
                    dx.b("Crittercism", "Unable to reenable OPTMZ instrumentation");
                }
            }
            obj1 = ((Context) (obj1)).getSharedPreferences("com.crittercism.optmz.config", 0).edit();
            if (((h) (obj)).b)
            {
                ((android.content.SharedPreferences.Editor) (obj1)).putBoolean("enabled", ((h) (obj)).a);
                ((android.content.SharedPreferences.Editor) (obj1)).putBoolean("kill", ((h) (obj)).c);
                ((android.content.SharedPreferences.Editor) (obj1)).putBoolean("persist", ((h) (obj)).b);
                ((android.content.SharedPreferences.Editor) (obj1)).putInt("interval", ((h) (obj)).d);
            } else
            {
                ((android.content.SharedPreferences.Editor) (obj1)).clear();
            }
            ((android.content.SharedPreferences.Editor) (obj1)).commit();
            az.A().a(((h) (obj)));
        }
        e = jsonobject.optJSONObject("txnConfig");
        if (e != null)
        {
            jsonobject = new bh(e);
            obj = b.getSharedPreferences("com.crittercism.txn.config", 0).edit();
            ((android.content.SharedPreferences.Editor) (obj)).putBoolean("enabled", ((bh) (jsonobject)).a);
            ((android.content.SharedPreferences.Editor) (obj)).putInt("interval", ((bh) (jsonobject)).b);
            ((android.content.SharedPreferences.Editor) (obj)).putInt("defaultTimeout", ((bh) (jsonobject)).c);
            ((android.content.SharedPreferences.Editor) (obj)).putString("transactions", ((bh) (jsonobject)).d.toString());
            ((android.content.SharedPreferences.Editor) (obj)).commit();
            az.A().a(jsonobject);
        }
_L2:
        return;
_L6:
        k = ((JSONObject) (obj1)).getInt("rateAfterLoadNum");
        j = k;
        if (k < 0)
        {
            j = 0;
        }
        ((dt) (obj)).a.edit().putInt("rateAfterNumLoads", j).commit();
        k = ((JSONObject) (obj1)).getInt("remindAfterLoadNum");
        j = k;
        if (k <= 0)
        {
            j = 1;
        }
        try
        {
            ((dt) (obj)).a.edit().putInt("remindAfterNumLoads", j).commit();
            s = ((JSONObject) (obj1)).getString("message");
            ((dt) (obj)).a.edit().putString("rateAppMessage", s).commit();
            obj1 = ((JSONObject) (obj1)).getString("title");
            ((dt) (obj)).a.edit().putString("rateAppTitle", ((String) (obj1))).commit();
            ((dt) (obj)).a(true);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj1)
        {
            ((dt) (obj)).a(false);
        }
          goto _L4
    }
}
