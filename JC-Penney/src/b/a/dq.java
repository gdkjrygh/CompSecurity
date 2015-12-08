// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package b.a;

import android.content.Context;
import android.content.SharedPreferences;
import java.io.File;
import java.io.IOException;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package b.a:
//            dz, ev, eu, ne, 
//            l, eq, el, ds, 
//            ec, eb, kl, q, 
//            ap, be

public final class dq extends dz
{

    private l a;
    private Context b;
    private String c;
    private JSONObject d;
    private JSONObject e;
    private boolean f;

    public dq(be be, be be1, String s, Context context, l l1)
    {
        super(be, be1);
        c = s;
        b = context;
        a = l1;
    }

    public final void a(boolean flag, int i, JSONObject jsonobject)
    {
        super.a(flag, i, jsonobject);
        if (jsonobject == null) goto _L2; else goto _L1
_L1:
        Object obj;
        Object obj1;
        if (jsonobject.optBoolean("internalExceptionReporting", false))
        {
            eu.a = ev.b;
            ne.b();
        } else
        {
            eu.a = ev.c;
        }
        obj = a.m();
        if (obj == null) goto _L4; else goto _L3
_L3:
        obj1 = jsonobject.optJSONObject("rateMyApp");
        if (obj1 != null) goto _L6; else goto _L5
_L5:
        ((eq) (obj)).a(false);
_L4:
        if (jsonobject.optInt("needPkg", 0) == 1)
        {
            String s;
            int j;
            try
            {
                (new el((new ds(a)).a("device_name", a.i()).a("pkg", b.getPackageName()), new ec((new eb(c, "/android_v2/update_package_name")).a()), null)).run();
            }
            catch (IOException ioexception)
            {
                (new StringBuilder("IOException in handleResponse(): ")).append(ioexception.getMessage());
                eu.b();
                eu.c();
            }
            f = true;
        }
        d = jsonobject.optJSONObject("apm");
        if (d != null)
        {
            obj = new kl(d);
            obj1 = b;
            if (((kl) (obj)).c)
            {
                kl.b(((Context) (obj1)));
            } else
            {
                File file = kl.a(((Context) (obj1)));
                if (!file.delete() && file.exists())
                {
                    eu.b("Unable to reenable OPTMZ instrumentation");
                }
            }
            obj1 = ((Context) (obj1)).getSharedPreferences("com.crittercism.optmz.config", 0).edit();
            if (((kl) (obj)).b)
            {
                ((android.content.SharedPreferences.Editor) (obj1)).putBoolean("enabled", ((kl) (obj)).a);
                ((android.content.SharedPreferences.Editor) (obj1)).putBoolean("kill", ((kl) (obj)).c);
                ((android.content.SharedPreferences.Editor) (obj1)).putBoolean("persist", ((kl) (obj)).b);
                ((android.content.SharedPreferences.Editor) (obj1)).putInt("interval", ((kl) (obj)).d);
            } else
            {
                ((android.content.SharedPreferences.Editor) (obj1)).clear();
            }
            ((android.content.SharedPreferences.Editor) (obj1)).commit();
            q.A().a(((kl) (obj)));
        }
        e = jsonobject.optJSONObject("txnConfig");
        if (e != null)
        {
            jsonobject = new ap(e);
            obj = b.getSharedPreferences("com.crittercism.txn.config", 0).edit();
            ((android.content.SharedPreferences.Editor) (obj)).putBoolean("enabled", ((ap) (jsonobject)).a);
            ((android.content.SharedPreferences.Editor) (obj)).putInt("interval", ((ap) (jsonobject)).b);
            ((android.content.SharedPreferences.Editor) (obj)).putInt("defaultTimeout", ((ap) (jsonobject)).c);
            ((android.content.SharedPreferences.Editor) (obj)).putString("transactions", ((ap) (jsonobject)).d.toString());
            ((android.content.SharedPreferences.Editor) (obj)).commit();
            q.A().a(jsonobject);
        }
_L2:
        return;
_L6:
        j = ((JSONObject) (obj1)).getInt("rateAfterLoadNum");
        i = j;
        if (j < 0)
        {
            i = 0;
        }
        ((eq) (obj)).a.edit().putInt("rateAfterNumLoads", i).commit();
        j = ((JSONObject) (obj1)).getInt("remindAfterLoadNum");
        i = j;
        if (j <= 0)
        {
            i = 1;
        }
        try
        {
            ((eq) (obj)).a.edit().putInt("remindAfterNumLoads", i).commit();
            s = ((JSONObject) (obj1)).getString("message");
            ((eq) (obj)).a.edit().putString("rateAppMessage", s).commit();
            obj1 = ((JSONObject) (obj1)).getString("title");
            ((eq) (obj)).a.edit().putString("rateAppTitle", ((String) (obj1))).commit();
            ((eq) (obj)).a(true);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj1)
        {
            ((eq) (obj)).a(false);
        }
          goto _L4
    }
}
