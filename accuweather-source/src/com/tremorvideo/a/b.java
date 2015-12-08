// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tremorvideo.a;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.Signature;
import android.os.Bundle;
import android.text.TextUtils;
import android.webkit.CookieSyncManager;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.MalformedURLException;

// Referenced classes of package com.tremorvideo.a:
//            c, i, e, a, 
//            d

public class b
{
    public static interface a
    {

        public abstract void a();

        public abstract void a(Bundle bundle);

        public abstract void a(com.tremorvideo.a.a a1);

        public abstract void a(d d1);
    }


    protected static String a = "https://m.facebook.com/dialog/";
    protected static String b = "https://graph.facebook.com/";
    protected static String c = "https://api.facebook.com/restserver.php";
    private String d;
    private long e;
    private String f;
    private Activity g;
    private String h[];
    private int i;
    private a j;

    public b(String s)
    {
        d = null;
        e = 0L;
        if (s == null)
        {
            throw new IllegalArgumentException("You must specify your application ID when instantiating a Facebook object. See README for details.");
        } else
        {
            f = s;
            return;
        }
    }

    static a a(b b1)
    {
        return b1.j;
    }

    private void a(Activity activity, String as[])
    {
        Bundle bundle = new Bundle();
        if (as.length > 0)
        {
            bundle.putString("scope", TextUtils.join(",", as));
        }
        CookieSyncManager.createInstance(activity);
        a(((Context) (activity)), "oauth", bundle, ((a) (new c(this))));
    }

    private boolean a(Activity activity, Intent intent)
    {
        intent = activity.getPackageManager().resolveActivity(intent, 0);
        if (intent != null)
        {
            intent = ((ResolveInfo) (intent)).activityInfo.packageName;
            int k;
            int l;
            try
            {
                activity = activity.getPackageManager().getPackageInfo(intent, 64);
            }
            // Misplaced declaration of an exception variable
            catch (Activity activity)
            {
                return false;
            }
            activity = ((PackageInfo) (activity)).signatures;
            l = activity.length;
            k = 0;
            while (k < l) 
            {
                if (activity[k].toCharsString().equals("30820268308201d102044a9c4610300d06092a864886f70d0101040500307a310b3009060355040613025553310b3009060355040813024341311230100603550407130950616c6f20416c746f31183016060355040a130f46616365626f6f6b204d6f62696c653111300f060355040b130846616365626f6f6b311d301b0603550403131446616365626f6f6b20436f72706f726174696f6e3020170d3039303833313231353231365a180f32303530303932353231353231365a307a310b3009060355040613025553310b3009060355040813024341311230100603550407130950616c6f20416c746f31183016060355040a130f46616365626f6f6b204d6f62696c653111300f060355040b130846616365626f6f6b311d301b0603550403131446616365626f6f6b20436f72706f726174696f6e30819f300d06092a864886f70d010101050003818d0030818902818100c207d51df8eb8c97d93ba0c8c1002c928fab00dc1b42fca5e66e99cc3023ed2d214d822bc59e8e35ddcf5f44c7ae8ade50d7e0c434f500e6c131f4a2834f987fc46406115de2018ebbb0d5a3c261bd97581ccfef76afc7135a6d59e8855ecd7eacc8f8737e794c60a761c536b72b11fac8e603f5da1a2d54aa103b8a13c0dbc10203010001300d06092a864886f70d0101040500038181005ee9be8bcbb250648d3b741290a82a1c9dc2e76a0af2f2228f1d9f9c4007529c446a70175c5a900d5141812866db46be6559e2141616483998211f4a673149fb2232a10d247663b26a9031e15f84bc1c74d141ff98a02d76f85b2c8ab2571b6469b232d8e768a7f7ca04f7abe4a775615916c07940656b58717457b42bd928a2"))
                {
                    return true;
                }
                k++;
            }
        }
        return false;
    }

    private boolean a(Activity activity, String s, String as[], int k)
    {
        boolean flag = true;
        Intent intent = new Intent();
        intent.setClassName("com.facebook.katana", "com.facebook.katana.ProxyAuth");
        intent.putExtra("client_id", s);
        if (as.length > 0)
        {
            intent.putExtra("scope", TextUtils.join(",", as));
        }
        if (!a(activity, intent))
        {
            return false;
        }
        g = activity;
        h = as;
        i = k;
        try
        {
            activity.startActivityForResult(intent, k);
        }
        // Misplaced declaration of an exception variable
        catch (Activity activity)
        {
            flag = false;
        }
        return flag;
    }

    public String a(Context context)
        throws MalformedURLException, IOException
    {
        com.tremorvideo.a.i.a(context);
        context = new Bundle();
        context.putString("method", "auth.expireSession");
        context = a(((Bundle) (context)));
        a(((String) (null)));
        a(0L);
        return context;
    }

    public String a(Bundle bundle)
        throws MalformedURLException, IOException
    {
        if (!bundle.containsKey("method"))
        {
            throw new IllegalArgumentException("API method must be specified. (parameters must contain key \"method\" and value). See http://developers.facebook.com/docs/reference/rest/");
        } else
        {
            return a(null, bundle, "GET");
        }
    }

    public String a(String s, Bundle bundle, String s1)
        throws FileNotFoundException, MalformedURLException, IOException
    {
        bundle.putString("format", "json");
        if (a())
        {
            bundle.putString("access_token", b());
        }
        if (s != null)
        {
            s = (new StringBuilder()).append(b).append(s).toString();
        } else
        {
            s = c;
        }
        return com.tremorvideo.a.i.a(s, s1, bundle);
    }

    public void a(long l)
    {
        e = l;
    }

    public void a(Activity activity, String as[], int k, a a1)
    {
        boolean flag = false;
        j = a1;
        if (k >= 0)
        {
            flag = a(activity, f, as, k);
        }
        if (!flag)
        {
            a(activity, as);
        }
    }

    public void a(Context context, String s, Bundle bundle, a a1)
    {
        String s1 = (new StringBuilder()).append(a).append(s).toString();
        bundle.putString("display", "touch");
        bundle.putString("redirect_uri", "fbconnect://success");
        if (s.equals("oauth"))
        {
            bundle.putString("type", "user_agent");
            bundle.putString("client_id", f);
        } else
        {
            bundle.putString("app_id", f);
        }
        if (a())
        {
            bundle.putString("access_token", b());
        }
        s = (new StringBuilder()).append(s1).append("?").append(com.tremorvideo.a.i.a(bundle)).toString();
        if (context.checkCallingOrSelfPermission("android.permission.INTERNET") != 0)
        {
            com.tremorvideo.a.i.a(context, "Error", "Application requires permission to access the Internet");
            return;
        } else
        {
            com.tremorvideo.a.e.a(context, s, a1).a();
            return;
        }
    }

    public void a(String s)
    {
        d = s;
    }

    public boolean a()
    {
        return b() != null && (c() == 0L || System.currentTimeMillis() < c());
    }

    public String b()
    {
        return d;
    }

    public void b(String s)
    {
        if (s != null && !s.equals("0"))
        {
            a(System.currentTimeMillis() + (long)(Integer.parseInt(s) * 1000));
        }
    }

    public long c()
    {
        return e;
    }

}
