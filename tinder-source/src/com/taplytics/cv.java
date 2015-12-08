// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.taplytics;

import android.app.Activity;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.graphics.Rect;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ImageView;
import android.widget.TextView;
import com.taplytics.a.d;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.taplytics:
//            turkey, ci, gs, hk, 
//            dj, shelduck, hi, dd, 
//            de, dg, cx, cz, 
//            db, gh, fz

public class cv
{

    private static cv u;
    boolean a;
    boolean b;
    HashMap c;
    turkey d;
    String e;
    String f;
    JSONObject g;
    JSONObject h;
    gh i;
    ViewGroup j;
    Map k;
    boolean l;
    long m;
    long n;
    int o;
    private boolean p;
    private boolean q;
    private boolean r;
    private ImageView s;
    private fz t;
    private int v;
    private d w;

    public cv()
    {
        r = false;
        b = true;
        c = new HashMap();
        d = turkey.a;
        j = null;
        k = new HashMap();
        l = false;
        m = -1L;
        n = -1L;
        v = 500;
        try
        {
            o = ci.b().u.getPackageManager().getApplicationInfo(ci.b().u.getPackageName(), 128).icon;
            return;
        }
        catch (android.content.pm.PackageManager.NameNotFoundException namenotfoundexception)
        {
            gs.b("Name not found", namenotfoundexception);
        }
    }

    public static cv a()
    {
        if (u != null)
        {
            return u;
        } else
        {
            cv cv1 = new cv();
            u = cv1;
            return cv1;
        }
    }

    static fz a(cv cv1, fz fz)
    {
        cv1.t = fz;
        return fz;
    }

    static gh a(cv cv1, gh gh)
    {
        cv1.i = gh;
        return gh;
    }

    static turkey a(cv cv1, turkey turkey1)
    {
        cv1.d = turkey1;
        return turkey1;
    }

    static String a(cv cv1, String s1)
    {
        cv1.e = s1;
        return s1;
    }

    static JSONArray a(float f1, float f2, ViewGroup viewgroup)
    {
        return b(f1, f2, viewgroup);
    }

    static void a(cv cv1)
    {
        try
        {
            if (cv1.m == -1L)
            {
                Rect rect = new Rect();
                ci.b().v.getWindow().getDecorView().getWindowVisibleDisplayFrame(rect);
                cv1.m = rect.top;
            }
            return;
        }
        // Misplaced declaration of an exception variable
        catch (cv cv1)
        {
            gs.b("Error setting statusbar offset", cv1);
        }
    }

    static boolean a(cv cv1, boolean flag)
    {
        cv1.p = flag;
        return flag;
    }

    static d b(cv cv1)
    {
        return cv1.w;
    }

    static String b(cv cv1, String s1)
    {
        cv1.f = s1;
        return s1;
    }

    private static JSONArray b(float f1, float f2, ViewGroup viewgroup)
    {
        JSONArray jsonarray = new JSONArray();
        try
        {
            for (viewgroup = hk.a(f1, f2, viewgroup).iterator(); viewgroup.hasNext(); jsonarray.put(hk.a((View)viewgroup.next()))) { }
        }
        // Misplaced declaration of an exception variable
        catch (ViewGroup viewgroup)
        {
            gs.b("Err: vw jsn. ", viewgroup);
        }
        return jsonarray;
    }

    static boolean b(cv cv1, boolean flag)
    {
        cv1.q = flag;
        return flag;
    }

    static d c(cv cv1)
    {
        cv1.w = null;
        return null;
    }

    static ViewGroup d(cv cv1)
    {
        return cv1.j;
    }

    static String e(cv cv1)
    {
        return cv1.e;
    }

    static String f(cv cv1)
    {
        return cv1.f;
    }

    static boolean g(cv cv1)
    {
        cv1.b = true;
        return true;
    }

    static turkey h(cv cv1)
    {
        return cv1.d;
    }

    static fz i(cv cv1)
    {
        return cv1.t;
    }

    static android.view.View.OnTouchListener j(cv cv1)
    {
        return new dj(cv1);
    }

    static void k(cv cv1)
    {
        cv1.c();
    }

    static gh l(cv cv1)
    {
        return cv1.i;
    }

    static boolean m(cv cv1)
    {
        return cv1.p;
    }

    static boolean n(cv cv1)
    {
        return cv1.q;
    }

    static ImageView o(cv cv1)
    {
        cv1.s = null;
        return null;
    }

    static ImageView p(cv cv1)
    {
        return cv1.s;
    }

    static int q(cv cv1)
    {
        return cv1.v;
    }

    static boolean r(cv cv1)
    {
        cv1.r = true;
        return true;
    }

    static boolean s(cv cv1)
    {
        return cv1.a;
    }

    public final void b()
    {
        if (ci.b().g && hk.a(j) && f != null && ci.b().j && !hi.a(shelduck.m))
        {
            c();
        }
        hk.c(j);
        if (SystemClock.elapsedRealtime() < n && !r)
        {
            r = true;
            Executors.newSingleThreadScheduledExecutor().schedule(new dd(this), n - SystemClock.elapsedRealtime(), TimeUnit.MILLISECONDS);
            return;
        }
        try
        {
            if (!r)
            {
                if (w != null)
                {
                    w = null;
                    r = true;
                }
                h();
                return;
            }
        }
        catch (JSONException jsonexception)
        {
            gs.b("Err: setprp", jsonexception);
        }
        return;
    }

    final void c()
    {
        try
        {
            if (ci.b().g && ci.b().v != null && ci.b().l)
            {
                ci.b().v.runOnUiThread(new de(this));
            }
            return;
        }
        catch (Exception exception)
        {
            gs.b(getClass().toString(), exception);
        }
    }

    public final void d()
    {
        try
        {
            if (ci.b().g && ci.b().v != null && ci.b().l && b)
            {
                ci.b().v.runOnUiThread(new dg(this));
                if (d.equals(turkey.a))
                {
                    a = true;
                }
            }
            return;
        }
        catch (Exception exception)
        {
            gs.b("app bd", exception);
        }
    }

    public final void e()
    {
        d = turkey.e;
        d();
    }

    public final void f()
    {
        try
        {
            if (ci.b().g && ci.b().v != null && ci.b().l)
            {
                ci.b().v.runOnUiThread(new cx(this));
            }
            return;
        }
        catch (Exception exception)
        {
            gs.b("rem bd", exception);
        }
    }

    public final Map g()
    {
        HashMap hashmap = new HashMap(k);
        k.clear();
        return hashmap;
    }

    public final void h()
    {
        if (ci.b().v != null && ci.b().l)
        {
            ci.b().v.runOnUiThread(new cz(this));
        }
    }

    public final void i()
    {
        TextView textview;
        String s1;
        try
        {
            if (!ci.b().g || !ci.b().l || !hk.a(j) || d != turkey.a || !a)
            {
                break MISSING_BLOCK_LABEL_132;
            }
            textview = (TextView)j.findViewById(0x17ccbc34);
        }
        catch (Exception exception)
        {
            gs.b("error updating border text", exception);
            return;
        }
        if (textview == null)
        {
            break MISSING_BLOCK_LABEL_132;
        }
        if (!textview.getText().toString().contains("(updated)"))
        {
            s1 = textview.getText().toString();
            textview.setText((new StringBuilder()).append(s1).append(" (updated)").toString());
            textview.postDelayed(new db(this, s1), 2000L);
        }
    }
}
