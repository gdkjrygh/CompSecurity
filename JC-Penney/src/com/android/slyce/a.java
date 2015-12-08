// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.slyce;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.android.slyce.f.b;
import com.android.slyce.k.g;
import com.android.slyce.k.h;
import com.android.slyce.k.i;
import com.android.slyce.report.mpmetrics.af;
import com.android.slyce.report.mpmetrics.ak;
import com.moodstocks.android.MoodstocksError;
import com.moodstocks.android.Scanner;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.android.slyce:
//            b, e, i, f, 
//            c, d, g

public final class a
{

    private static final String a = com/android/slyce/a.getSimpleName();
    private static a b;
    private final af c;
    private g d;
    private final Context e;
    private AtomicBoolean f;
    private boolean g;
    private boolean h;
    private Scanner i;
    private boolean j;

    private a(Context context)
    {
        f = new AtomicBoolean(false);
        g = true;
        h = true;
        c = af.a(context.getApplicationContext(), "712a9f5c14895edaa8b27dc59ec2af9f");
        e = context.getApplicationContext();
        d = com.android.slyce.k.g.a(context);
    }

    public static a a(Context context)
    {
        if (b != null) goto _L2; else goto _L1
_L1:
        com/android/slyce/a;
        JVM INSTR monitorenter ;
        if (b == null)
        {
            b = new a(context.getApplicationContext());
        }
        com/android/slyce/a;
        JVM INSTR monitorexit ;
_L2:
        return b;
        context;
        com/android/slyce/a;
        JVM INSTR monitorexit ;
        throw context;
    }

    static af a(a a1)
    {
        return a1.c;
    }

    static Scanner a(a a1, Scanner scanner)
    {
        a1.i = scanner;
        return scanner;
    }

    static void a(a a1, b b1)
    {
        a1.a(b1);
    }

    static void a(a a1, JSONObject jsonobject, b b1)
    {
        a1.a(jsonobject, b1);
    }

    private void a(b b1)
    {
        String s = d.j();
        if (!TextUtils.isEmpty(s))
        {
            try
            {
                a(new JSONObject(s), b1);
                return;
            }
            catch (JSONException jsonexception)
            {
                b(b1);
            }
            return;
        } else
        {
            b(b1);
            return;
        }
    }

    private void a(String s)
    {
        String s2 = d.f();
        String s1 = s2;
        if (TextUtils.isEmpty(s2))
        {
            s1 = com.android.slyce.k.i.b();
            d.f(s1);
        }
        try
        {
            JSONObject jsonobject = new JSONObject();
            c.c().a(c.b());
            jsonobject.put("userID", c.b());
            jsonobject.put("clientID", s);
            jsonobject.put("deviceType", com.android.slyce.k.i.c());
            jsonobject.put("systemType", "Android");
            jsonobject.put("systemVersion", com.android.slyce.k.i.a());
            jsonobject.put("hostingAppName", com.android.slyce.k.i.a(e));
            jsonobject.put("hostingAppVersion", com.android.slyce.k.i.b(e));
            jsonobject.put("SDKVersion", i());
            jsonobject.put("created", s1);
            com.android.slyce.k.i.a(e, new com.android.slyce.b(this, jsonobject));
            s = new JSONObject();
            s.put("created", com.android.slyce.k.i.b());
            c.b(s);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return;
        }
    }

    private void a(JSONObject jsonobject, b b1)
    {
        d.a(jsonobject.optString("premium"));
        Object obj = jsonobject.optJSONObject("gui");
        Object obj1;
        if (obj != null)
        {
            obj = ((JSONObject) (obj)).optString("cropImage");
            d.g(((String) (obj)));
        } else
        {
            d.g(String.valueOf(Boolean.FALSE));
        }
        obj1 = jsonobject.optJSONObject("ms");
        if (obj1 != null)
        {
            jsonobject = ((JSONObject) (obj1)).optString("enabled");
            String s = ((JSONObject) (obj1)).optString("key");
            obj1 = ((JSONObject) (obj1)).optString("secret");
            String s1 = d.d();
            String s2 = d.d();
            if (i != null && (!TextUtils.equals(s, s1) || !TextUtils.equals(((CharSequence) (obj1)), s2)))
            {
                try
                {
                    i.close();
                }
                catch (MoodstocksError moodstockserror)
                {
                    com.android.slyce.k.h.b(a, moodstockserror.getMessage());
                }
            }
            d.b(jsonobject);
            d.d(s);
            d.c(((String) (obj1)));
            if (Boolean.valueOf(jsonobject).booleanValue())
            {
                (new Handler(Looper.getMainLooper())).post(new e(this, s, ((String) (obj1))));
            }
        } else
        {
            d.b(String.valueOf(Boolean.FALSE));
        }
        c(b1);
    }

    private transient boolean a(Context context, b b1, String as[])
    {
        com.android.slyce.i l = new com.android.slyce.i(b1);
        if (d(b1))
        {
            return false;
        }
        if (b(context))
        {
            l.obtainMessage(0, "Slyce initiation error: Context can not be null").sendToTarget();
            return false;
        }
        for (int i1 = 0; i1 < as.length; i1++)
        {
            if (TextUtils.isEmpty(as[i1]))
            {
                l.obtainMessage(0, "Slyce initiation error: parameters can not be null or empty").sendToTarget();
                return false;
            }
        }

        return true;
    }

    static boolean a(a a1, boolean flag)
    {
        a1.j = flag;
        return flag;
    }

    static g b(a a1)
    {
        return a1.d;
    }

    private void b(b b1)
    {
        f.set(false);
        (new Handler(Looper.getMainLooper())).post(new f(this, b1));
        c.a("SDK.Init.Failed", null);
    }

    private void b(String s, b b1)
    {
        com.android.slyce.c.a.a(e).a(s, new c(this, b1), new d(this, b1));
    }

    private boolean b(Context context)
    {
        if (context == null)
        {
            com.android.slyce.k.h.b(a, "Slyce initiation error: Context can not be null");
            return true;
        } else
        {
            return false;
        }
    }

    private void c(b b1)
    {
        f.set(true);
        (new Handler(Looper.getMainLooper())).post(new com.android.slyce.g(this, b1));
        c.a("SDK.Init.Succeeded", null);
    }

    static boolean c(a a1)
    {
        return a1.j;
    }

    static Context d(a a1)
    {
        return a1.e;
    }

    private boolean d(b b1)
    {
        if (b1 == null)
        {
            com.android.slyce.k.h.b(a, "Slyce initiation error: OnSlyceOpenListener can not be null");
            return true;
        } else
        {
            return false;
        }
    }

    static Scanner e(a a1)
    {
        return a1.i;
    }

    public static String i()
    {
        return "2.2";
    }

    static String j()
    {
        return a;
    }

    private void k()
    {
        if (!j)
        {
            break MISSING_BLOCK_LABEL_26;
        }
        i.close();
        i.destroy();
        i = null;
        return;
        MoodstocksError moodstockserror;
        moodstockserror;
        moodstockserror.printStackTrace();
        return;
    }

    public void a(String s, b b1)
    {
        if (!a(e, b1, new String[] {
    s
}))
        {
            return;
        } else
        {
            d.e(s);
            a(s);
            b(s, b1);
            return;
        }
    }

    public boolean a()
    {
        return d.a();
    }

    public boolean b()
    {
        return d.b();
    }

    public String c()
    {
        return d.e();
    }

    protected Context d()
    {
        return e;
    }

    public boolean e()
    {
        return f.get();
    }

    public void f()
    {
        k();
    }

    public boolean g()
    {
        return g;
    }

    public boolean h()
    {
        return h;
    }

}
