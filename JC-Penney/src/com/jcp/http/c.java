// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.http;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.AsyncTask;
import android.support.v4.f.a;
import android.text.TextUtils;
import com.jcp.JCP;
import com.jcp.activities.MainActivity;
import com.jcp.b.b;
import com.jcp.c.ad;
import com.jcp.c.l;
import com.jcp.e.w;
import com.jcp.errorstatus.ErrorMessageEntityContainer;
import com.jcp.fragments.SignInFragment;
import com.jcp.fragments.et;
import com.jcp.fragments.t;
import com.jcp.pojo.Profile;
import com.jcp.pojo.Response;
import com.jcp.util.ae;
import com.jcp.util.af;
import com.jcp.util.bk;
import com.squareup.okhttp.Call;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import java.lang.ref.WeakReference;
import java.util.Map;
import org.json.JSONObject;

// Referenced classes of package com.jcp.http:
//            b

public class c extends AsyncTask
{

    private static final String b = com/jcp/http/c.getName();
    private static SharedPreferences c;
    private int a;
    private WeakReference d;
    private String e;
    private Map f;
    private w g;
    private int h;
    private boolean i;
    private JSONObject j;
    private byte k[];
    private Call l;
    private String m;
    private String n;
    private String o;

    public c(Context context, w w1)
    {
        a = 0;
        d = new WeakReference(null);
        d = new WeakReference(context);
        g = w1;
        l = null;
        com/jcp/http/c;
        JVM INSTR monitorenter ;
        if (e() != null)
        {
            a(e());
        }
        com/jcp/http/c;
        JVM INSTR monitorexit ;
        return;
        context;
        com/jcp/http/c;
        JVM INSTR monitorexit ;
        throw context;
    }

    public static void a()
    {
        JCP.g();
    }

    private static void a(Context context)
    {
        c = context.getSharedPreferences("com.jcp.activities", 0);
    }

    private void a(Response response, String s)
    {
        if (isCancelled())
        {
            com.jcp.http.b.a(response, h);
            return;
        } else
        {
            com.jcp.http.b.a(response, e(), s);
            return;
        }
    }

    private void b(Map map)
    {
        if (!TextUtils.isEmpty(o))
        {
            map.put("Accept", o);
        }
    }

    private Request c(String s)
    {
        a a1 = new a();
        a1.put("Content-type", d());
        b(a1);
        return com.jcp.http.b.a(s, a1);
    }

    private Request d(String s)
    {
        a a1;
        a1 = new a();
        a1.put("Content-type", d());
        b(a1);
        if (k != null)
        {
            return com.jcp.http.b.a(s, a1, k, a);
        }
        if (f == null) goto _L2; else goto _L1
_L1:
        String s1 = (new JSONObject(f)).toString();
_L5:
        ae.d(b, (new StringBuilder()).append("HTTP POST request params :").append(s1).toString());
        return com.jcp.http.b.a(s, a1, s1, a);
_L2:
        if (j == null) goto _L4; else goto _L3
_L3:
        s1 = j.toString();
          goto _L5
_L4:
        try
        {
            if (m == null)
            {
                break MISSING_BLOCK_LABEL_154;
            }
            s1 = m;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            ae.a(b, "Exception building post request:", s);
            s.printStackTrace();
            return null;
        }
          goto _L5
        s1 = null;
          goto _L5
    }

    private Context e()
    {
        return (Context)d.get();
    }

    private Request e(String s)
    {
        return com.jcp.http.b.b(s, null).delete().build();
    }

    private void f()
    {
        Object obj = new SignInFragment();
        if (c == null || e() == null) goto _L2; else goto _L1
_L1:
        if (!c.contains("keep_me_signin")) goto _L4; else goto _L3
_L3:
        Profile profile;
        boolean flag;
        flag = c.getBoolean("keep_me_signin", false);
        profile = bk.a(e());
        if (!flag || profile == null) goto _L6; else goto _L5
_L5:
        obj = new l(e());
        ((l) (obj)).a(true);
        ((l) (obj)).a(com.jcp.b.b.x(), ad.a(profile.getUsername(), profile.getPassword()), 1);
_L2:
        return;
_L6:
        et.U();
        if (!com.jcp.g.a.j())
        {
            a(((SignInFragment) (obj)));
            return;
        }
        continue; /* Loop/switch isn't completed */
_L4:
        et.U();
        if (!com.jcp.g.a.j())
        {
            a(((SignInFragment) (obj)));
            return;
        }
        if (true) goto _L2; else goto _L7
_L7:
    }

    protected transient Response a(String as[])
    {
        Response response;
        as = null;
        response = new Response();
        OkHttpClient okhttpclient;
        response.setReJcpRequestTypes(h);
        response.setStatusCode(-1);
        okhttpclient = JCP.k();
        e = e.replaceAll(" ", "%20");
        ae.d(b, (new StringBuilder()).append("URL : ").append(e).toString());
        a;
        JVM INSTR tableswitch 0 3: default 360
    //                   0 125
    //                   1 146
    //                   2 167
    //                   3 188;
           goto _L1 _L2 _L3 _L4 _L5
_L1:
        if (!isCancelled()) goto _L7; else goto _L6
_L6:
        com.jcp.http.b.a(response, h);
        return response;
_L2:
        try
        {
            ae.d(b, "HTTP RequestType: GET");
            as = c(e);
        }
        // Misplaced declaration of an exception variable
        catch (String as[])
        {
            a(response, as.getMessage());
            return response;
        }
          goto _L1
_L3:
        ae.d(b, "HTTP RequestType: POST");
        as = d(e);
          goto _L1
_L4:
        ae.d(b, "HTTP RequestType: PUT");
        as = d(e);
          goto _L1
_L5:
        ae.d(b, "HTTP RequestType: DELETE");
        as = e(e);
          goto _L1
_L7:
        l = okhttpclient.newCall(as);
        as = l.execute();
        if (!isCancelled()) goto _L9; else goto _L8
_L8:
        com.jcp.http.b.a(response, h);
        return response;
_L9:
        if (as == null) goto _L11; else goto _L10
_L10:
        int i1 = as.code();
        String s = com.jcp.http.b.a(as);
        ae.d(b, (new StringBuilder()).append("Response : ").append(s).toString());
        ae.d(b, (new StringBuilder()).append("Status Code: ").append(i1).toString());
        response.setReJcpRequestTypes(h);
        response.setStatusCode(i1);
        response.setResponseBoday(s);
        response.setOptionalMsg(as.message());
        return response;
_L11:
        a(response, null);
        return response;
    }

    public void a(int i1)
    {
        h = i1;
    }

    public void a(SignInFragment signinfragment)
    {
        Context context;
label0:
        {
            context = e();
            if (context != null && (context instanceof t))
            {
                if (signinfragment == null)
                {
                    break label0;
                }
                JCP.s().a(false, false);
                com.jcp.g.a.e(true);
                ((t)context).b(signinfragment, "SignInFragment");
            }
            return;
        }
        signinfragment = new Intent(context, com/jcp/activities/MainActivity);
        signinfragment.addFlags(0x10000000);
        signinfragment.putExtra("forSessionInvalidLaunch", true);
        context.startActivity(signinfragment);
    }

    protected void a(Response response)
    {
        if (!i && (e() instanceof Activity) && !((Activity)e()).isFinishing())
        {
            com.jcp.b.a.i();
        }
        if (!com.jcp.http.b.b(response.getStatusCode())) goto _L2; else goto _L1
_L1:
        ErrorMessageEntityContainer errormessageentitycontainer = com.jcp.f.a.a(response.getResponseBody());
        if (errormessageentitycontainer == null) goto _L4; else goto _L3
_L3:
        ae.d(b, (new StringBuilder()).append("Service request received an error : ").append(errormessageentitycontainer.getErrorCode()).toString());
        if (!"SRV_SESSION_INVALID".equalsIgnoreCase(errormessageentitycontainer.getErrorCode())) goto _L6; else goto _L5
_L5:
        f();
        g.a(response);
_L8:
        super.onPostExecute(response);
        return;
_L6:
        if (g != null)
        {
            g.a(response);
        }
        continue; /* Loop/switch isn't completed */
_L4:
        if (g != null)
        {
            g.a(response);
        }
        continue; /* Loop/switch isn't completed */
_L2:
        if (g != null)
        {
            if (!TextUtils.isEmpty(response.getErrorMsg()))
            {
                g.a(response);
            } else
            {
                if (e() != null)
                {
                    response.setErrorMsg(e().getString(0x7f0702b7));
                }
                g.a(response);
            }
        }
        if (true) goto _L8; else goto _L7
_L7:
    }

    public void a(String s)
    {
        m = s;
    }

    public void a(Map map)
    {
        f = map;
    }

    public void a(JSONObject jsonobject)
    {
        j = jsonobject;
    }

    public void a(boolean flag)
    {
        i = flag;
    }

    public void b()
    {
        if (l != null)
        {
            l.cancel();
        }
        cancel(true);
    }

    public void b(int i1)
    {
        a = i1;
    }

    public void b(String s)
    {
        e = s;
    }

    public int c()
    {
        return h;
    }

    public String d()
    {
        if (n != null)
        {
            return n;
        } else
        {
            return "application/json";
        }
    }

    protected Object doInBackground(Object aobj[])
    {
        return a((String[])aobj);
    }

    protected void onPostExecute(Object obj)
    {
        a((Response)obj);
    }

    protected void onPreExecute()
    {
        if (!i && (h != 40 || !com.jcp.b.a.c()))
        {
            Context context = e();
            if (context != null && (context instanceof Activity) && !((Activity)context).isFinishing())
            {
                com.jcp.b.a.a(context, 0x7f070317);
            }
        }
        super.onPreExecute();
    }

}
