// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.miteksystems.misnap;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.hardware.Camera;
import android.os.Bundle;
import android.os.Handler;
import android.preference.PreferenceManager;
import android.util.Log;
import android.view.Display;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.OrientationEventListener;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageButton;

// Referenced classes of package com.miteksystems.misnap:
//            d, e, f, MiSnapAPI, 
//            r, l, u, i, 
//            MitekAnalyzer, s, am, g, 
//            k, h

public class MiSnap extends Activity
{

    static int h = 599;
    static boolean i;
    static boolean r = false;
    static int u = -1;
    private int A;
    private boolean B;
    private final android.content.DialogInterface.OnClickListener C = new e(this);
    private final android.content.DialogInterface.OnClickListener D = new f(this);
    private boolean E;
    MiSnapAPI a;
    l b;
    MitekAnalyzer c;
    am d;
    s e;
    i f;
    Object g;
    boolean j;
    boolean k;
    boolean l;
    boolean m;
    boolean n;
    Context o;
    boolean p;
    protected int q;
    Camera s;
    int t;
    Handler v;
    boolean w;
    private android.widget.FrameLayout.LayoutParams x;
    private u y;
    private OrientationEventListener z;

    public MiSnap()
    {
        b = null;
        e = null;
        f = null;
        g = new Object();
        p = false;
        z = null;
        q = 360;
        A = 0;
        B = false;
        t = 1;
        v = new d(this);
        E = false;
        w = false;
    }

    private Camera a(Context context)
    {
        int i1;
        i1 = 0;
        if (!context.getPackageManager().hasSystemFeature("android.hardware.camera"))
        {
            Log.e("MiSnapCamera", "No Camera");
            return null;
        }
        s = Camera.open();
        if (a.t() != 1) goto _L2; else goto _L1
_L1:
        context = new android.hardware.Camera.CameraInfo();
        Camera.getCameraInfo(0, context);
        u;
        JVM INSTR tableswitch 0 3: default 225
    //                   0 173
    //                   1 173
    //                   2 173
    //                   3 179;
           goto _L3 _L4 _L4 _L4 _L5
_L3:
        (new StringBuilder("rotation=")).append(u).toString();
        (new StringBuilder("device orientation=")).append(getResources().getConfiguration().orientation).toString();
        if (((android.hardware.Camera.CameraInfo) (context)).facing != 1) goto _L7; else goto _L6
_L6:
        i1 = (360 - (i1 + ((android.hardware.Camera.CameraInfo) (context)).orientation) % 360) % 360;
_L8:
        s.setDisplayOrientation(i1);
_L2:
        return s;
_L4:
        i1 = 90;
          goto _L3
_L7:
        i1 = ((((android.hardware.Camera.CameraInfo) (context)).orientation - i1) + 360) % 360;
          goto _L8
_L5:
        try
        {
            if (android.os.Build.VERSION.SDK_INT >= 9)
            {
                setRequestedOrientation(8);
            }
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            Log.e("MiSnapCamera", "Camera busy or not available");
            return null;
        }
        i1 = 270;
          goto _L3
    }

    private void a(View view)
    {
        if (view != null && view.getBackground() != null)
        {
            view.getBackground().setCallback(null);
        }
        if (!(view instanceof ViewGroup)) goto _L2; else goto _L1
_L1:
        int i1 = 0;
_L6:
        if (i1 < ((ViewGroup)view).getChildCount()) goto _L4; else goto _L3
_L3:
        ((ViewGroup)view).removeAllViews();
_L2:
        return;
_L4:
        a(((ViewGroup)view).getChildAt(i1));
        i1++;
        if (true) goto _L6; else goto _L5
_L5:
    }

    static void a(MiSnap misnap)
    {
        if (misnap.s == null)
        {
            misnap.s = misnap.a(((Context) (misnap)));
            if (misnap.s == null)
            {
                misnap.a(0, null, "CameraNotSufficient");
                return;
            }
        }
        if (misnap.y == null)
        {
            misnap.a(0, null, "VideoCaptureFailed");
            return;
        }
        PreferenceManager.setDefaultValues(misnap, R.xml.settings, false);
        SharedPreferences sharedpreferences = PreferenceManager.getDefaultSharedPreferences(misnap);
        if (r.g)
        {
            i = false;
        } else
        {
            i = sharedpreferences.getBoolean("showAnimationNextTime", false);
        }
        misnap.j = sharedpreferences.getBoolean("cameraSupportCalculated", false);
        if (misnap.j)
        {
            misnap.k = sharedpreferences.getBoolean("supportsAutoFocus", false);
            misnap.l = sharedpreferences.getBoolean("supports1080p", false);
            misnap.m = sharedpreferences.getBoolean("supports720p", false);
            misnap.n = sharedpreferences.getBoolean("supportsVGA", false);
        }
        misnap.b = new l(misnap, misnap.s, misnap.v);
        misnap.b.a(misnap.c);
        misnap.b.a(misnap.y);
        misnap.x = new android.widget.FrameLayout.LayoutParams(-2, -1);
        misnap.x.gravity = 17;
        misnap.setContentView(misnap.b, misnap.x);
        misnap.addContentView(misnap.y, misnap.x);
        if (!i)
        {
            misnap.y.g();
            return;
        } else
        {
            misnap.b.b();
            return;
        }
    }

    static void a(MiSnap misnap, int i1)
    {
        misnap.A = i1;
    }

    static u b(MiSnap misnap)
    {
        return misnap.y;
    }

    static void b(MiSnap misnap, int i1)
    {
        char c1 = '\u0168';
        if ((misnap.f == null || !misnap.f.a()) && i1 != -1 && (340 > i1 || i1 >= 360) && (i1 < 0 || i1 > 20))
        {
            int j1 = c1;
            if (10 < i1)
            {
                j1 = c1;
                if (i1 < 176)
                {
                    j1 = 180;
                }
            }
            if (j1 != misnap.q)
            {
                misnap.q = j1;
                if (misnap.y != null)
                {
                    misnap.y.n();
                }
            }
        }
    }

    static int c(MiSnap misnap)
    {
        return misnap.A;
    }

    static void d(MiSnap misnap)
    {
        misnap.m();
    }

    public static boolean d()
    {
        return !i;
    }

    private void m()
    {
        E = true;
        synchronized (g)
        {
            if (c != null)
            {
                c.b(d);
                c.b(y);
                c = null;
            }
            if (b != null)
            {
                b.k();
                b = null;
            }
            if (z != null)
            {
                z.disable();
                z = null;
            }
            a(y);
            if (y != null)
            {
                y.o();
                y = null;
            }
            d = null;
        }
        a(findViewById(R.id.camera_surface_frame));
        if (e != null)
        {
            e.b();
        }
    }

    private void n()
    {
        Intent intent = new Intent();
        a(R.string.uxp_cancel);
        if (b != null)
        {
            b.a(false);
            b.a();
            intent.putExtra("com.miteksystems.misnap.MIBI_DATA", b.h());
        }
        a(0, intent, "Cancelled");
    }

    private void o()
    {
        getClass().getName();
    }

    final int a()
    {
        return t;
    }

    final void a(int i1)
    {
        if (d != null)
        {
            d.a(getString(i1));
        }
    }

    final void a(int i1, int j1)
    {
        if (d != null)
        {
            d.a(getString(i1), j1);
        }
    }

    final void a(int i1, Intent intent, String s1)
    {
        if (B)
        {
            return;
        }
        (new StringBuilder("exitApp called with code=")).append(i1).toString();
        o();
        B = true;
        Intent intent1 = intent;
        if (intent == null)
        {
            intent1 = new Intent();
        }
        intent1.putExtra("com.miteksystems.misnap.ResultCode", s1);
        setResult(i1, intent1);
        finish();
        v.postAtFrontOfQueue(new g(this));
    }

    final void a(boolean flag, boolean flag1)
    {
        boolean flag2 = true;
        if (!j && k)
        {
            j = true;
            org.json.JSONObject jsonobject = a.aC();
            if (flag)
            {
                if (350D > (new k(2, jsonobject)).a())
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                l = flag;
            }
            if (flag1)
            {
                if (350D > (new k(1, jsonobject)).a())
                {
                    flag = flag2;
                } else
                {
                    flag = false;
                }
                m = flag;
            }
            n = false;
            j();
        }
    }

    final void b()
    {
        t = 10;
    }

    protected final void c()
    {
        s = a(this);
        if (s == null)
        {
            a(0, null, "CameraNotSufficient");
        }
        c = new MitekAnalyzer(a.j(), a.i(), a.g(), a.h(), a.s(), a.n());
        y = new u(this, v, e, f, '\0');
        y.a(a.m());
        d = new am(this, v, '\0');
        c.a(y);
        c.a(d);
        t = 2;
        v.sendEmptyMessage(t);
    }

    final int e()
    {
        if (a.b())
        {
            return a.F();
        } else
        {
            return a.G();
        }
    }

    final boolean f()
    {
        return E;
    }

    final void g()
    {
        if (b != null)
        {
            b.k();
            b = null;
            s = null;
        }
    }

    final void h()
    {
        A = 0;
    }

    final void i()
    {
        a.a();
        a(R.string.uxp_start_still_camera);
        t = 2;
        v.sendEmptyMessage(t);
    }

    final void j()
    {
        android.content.SharedPreferences.Editor editor = PreferenceManager.getDefaultSharedPreferences(this).edit();
        editor.putBoolean("showAnimationNextTime", true);
        if (j)
        {
            editor.putBoolean("cameraSupportCalculated", true);
            editor.putBoolean("supportsAutoFocus", k);
            editor.putBoolean("supports1080p", l);
            editor.putBoolean("supports720p", m);
            editor.putBoolean("supportsVGA", n);
        }
        editor.commit();
    }

    final float k()
    {
        return (float)q;
    }

    final boolean l()
    {
        return q == 360;
    }

    public void onActivityResult(int i1, int j1, Intent intent)
    {
    }

    public void onBackPressed()
    {
        n();
    }

    public void onCancelButton(View view)
    {
        o();
        n();
    }

    public void onCaptureButton(View view)
    {
        o();
        y.e.setClickable(false);
        b.j();
        if (y != null)
        {
            y.f.setClickable(false);
            y.g.setClickable(false);
            y.d.setClickable(false);
        }
    }

    public void onConfigurationChanged(Configuration configuration)
    {
        super.onConfigurationChanged(configuration);
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        u = getWindowManager().getDefaultDisplay().getRotation();
        if (android.os.Build.VERSION.SDK_INT >= 11)
        {
            getWindow().setFlags(8192, 8192);
        }
        if (android.os.Build.VERSION.SDK_INT >= 9)
        {
            setRequestedOrientation(0);
        }
        o = this;
        a = new MiSnapAPI(getIntent());
        if (a.t() == 0)
        {
            z = new h(this, this);
            z.enable();
        }
        f = new i(this);
        if (f != null)
        {
            e = new s(this, a, f.a());
        }
        getWindow().setFlags(1024, 1024);
        requestWindowFeature(1);
        v.sendEmptyMessage(1);
    }

    public void onDestroy()
    {
        super.onDestroy();
        m();
        t = 1;
    }

    public void onFlashToggle(View view)
    {
        boolean flag = true;
        p = true;
        if (w)
        {
            flag = false;
        }
        w = flag;
        b.b(w);
        int i1;
        if (w)
        {
            i1 = R.string.uxp_flash_on;
        } else
        {
            i1 = R.string.uxp_flash_off;
        }
        a(i1);
        if (w)
        {
            i1 = R.drawable.icon_flash_on;
        } else
        {
            i1 = R.drawable.icon_flash_off;
        }
        ((ImageButton)view).setImageResource(i1);
        if (y != null)
        {
            y.postInvalidate();
        }
    }

    public boolean onKeyDown(int i1, KeyEvent keyevent)
    {
        return super.onKeyDown(i1, keyevent);
    }

    public void onPause()
    {
        super.onPause();
        if (!"CREDIT_CARD".equals(a.n()))
        {
            n();
        }
    }

    public void onResume()
    {
        super.onResume();
    }

    public boolean onTouchEvent(MotionEvent motionevent)
    {
        motionevent.getAction();
        JVM INSTR tableswitch 1 1: default 24
    //                   1 26;
           goto _L1 _L2
_L1:
        return false;
_L2:
        if (a.b() && y != null && !y.e())
        {
            v.sendEmptyMessage(11);
        }
        if (true) goto _L1; else goto _L3
_L3:
    }

}
