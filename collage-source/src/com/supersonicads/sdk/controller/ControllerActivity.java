// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.supersonicads.sdk.controller;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.media.AudioManager;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.Display;
import android.view.KeyEvent;
import android.view.OrientationEventListener;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.supersonicads.sdk.agent.b;
import com.supersonicads.sdk.b.c;
import com.supersonicads.sdk.b.d;
import com.supersonicads.sdk.b.f;
import com.supersonicads.sdk.data.AdUnitsState;

// Referenced classes of package com.supersonicads.sdk.controller:
//            a, SupersonicWebView

public class ControllerActivity extends Activity
    implements SupersonicWebView.d, com.supersonicads.sdk.controller.a
{
    private class a extends OrientationEventListener
    {

        public int a;
        public int b;
        final ControllerActivity c;

        public void onOrientationChanged(int i1)
        {
            if (i1 != -1) goto _L2; else goto _L1
_L1:
            c.setRequestedOrientation(ControllerActivity.a(c));
_L21:
            return;
_L2:
            if (i1 > 45 && i1 <= 315) goto _L4; else goto _L3
_L3:
            c.b;
            JVM INSTR tableswitch 0 2: default 68
        //                       0 83
        //                       1 116
        //                       2 128;
               goto _L5 _L6 _L7 _L8
_L5:
            c.setRequestedOrientation(ControllerActivity.a(c));
            return;
_L6:
            if (a == 2)
            {
                ControllerActivity.a(c, 9);
            } else
            {
                ControllerActivity.a(c, 1);
            }
            continue; /* Loop/switch isn't completed */
_L7:
            ControllerActivity.a(c, 0);
            continue; /* Loop/switch isn't completed */
_L8:
            if (a == 2)
            {
                if (b == 2)
                {
                    ControllerActivity.a(c, 0);
                } else
                {
                    ControllerActivity.a(c, 0);
                }
            } else
            {
                ControllerActivity.a(c, 1);
            }
            if (true) goto _L5; else goto _L4
_L4:
            if (i1 <= 45 || i1 > 135) goto _L10; else goto _L9
_L9:
            c.b;
            JVM INSTR tableswitch 0 2: default 228
        //                       0 243
        //                       1 255
        //                       2 268;
               goto _L11 _L12 _L13 _L14
_L11:
            c.setRequestedOrientation(ControllerActivity.a(c));
            return;
_L12:
            ControllerActivity.a(c, 1);
            continue; /* Loop/switch isn't completed */
_L13:
            ControllerActivity.a(c, 8);
            continue; /* Loop/switch isn't completed */
_L14:
            if (a == 2)
            {
                ControllerActivity.a(c, 1);
            } else
            {
                ControllerActivity.a(c, 8);
            }
            if (true) goto _L11; else goto _L10
_L10:
            if (i1 <= 135 || i1 > 225)
            {
                continue; /* Loop/switch isn't completed */
            }
            c.b;
            JVM INSTR tableswitch 0 2: default 348
        //                       0 363
        //                       1 396
        //                       2 409;
               goto _L15 _L16 _L17 _L18
_L15:
            c.setRequestedOrientation(ControllerActivity.a(c));
            return;
_L16:
            if (a == 2)
            {
                ControllerActivity.a(c, 9);
            } else
            {
                ControllerActivity.a(c, 1);
            }
            continue; /* Loop/switch isn't completed */
_L17:
            ControllerActivity.a(c, 8);
            continue; /* Loop/switch isn't completed */
_L18:
            if (a == 2)
            {
                if (b == 2)
                {
                    ControllerActivity.a(c, 8);
                } else
                {
                    ControllerActivity.a(c, 8);
                }
            } else
            {
                ControllerActivity.a(c, 9);
            }
            if (true) goto _L15; else goto _L19
_L19:
            if (i1 <= 225 || i1 > 315) goto _L21; else goto _L20
_L20:
            c.b;
            JVM INSTR tableswitch 0 2: default 512
        //                       0 527
        //                       1 540
        //                       2 552;
               goto _L22 _L23 _L24 _L25
_L22:
            c.setRequestedOrientation(ControllerActivity.a(c));
            return;
_L23:
            ControllerActivity.a(c, 9);
            continue; /* Loop/switch isn't completed */
_L24:
            ControllerActivity.a(c, 0);
            continue; /* Loop/switch isn't completed */
_L25:
            if (a == 2)
            {
                if (b == 2)
                {
                    ControllerActivity.a(c, 9);
                } else
                {
                    ControllerActivity.a(c, 9);
                }
            } else
            {
                ControllerActivity.a(c, 0);
            }
            if (true) goto _L22; else goto _L26
_L26:
        }

        public a(Context context, int i1)
        {
            c = ControllerActivity.this;
            super(context, i1);
            a = 1;
            b = 1;
            a = com.supersonicads.sdk.b.d.b(context);
            b = context.getResources().getConfiguration().orientation;
        }
    }


    private static final String e = com/supersonicads/sdk/controller/ControllerActivity.getSimpleName();
    final android.widget.RelativeLayout.LayoutParams a = new android.widget.RelativeLayout.LayoutParams(-1, -1);
    public int b;
    public int c;
    public int d;
    private a f;
    private int g;
    private SupersonicWebView h;
    private RelativeLayout i;
    private FrameLayout j;
    private boolean k;
    private String l;
    private AdUnitsState m;

    public ControllerActivity()
    {
        b = -1;
        c = -1;
        d = -1;
        k = false;
    }

    static int a(ControllerActivity controlleractivity)
    {
        return controlleractivity.g;
    }

    static int a(ControllerActivity controlleractivity, int i1)
    {
        controlleractivity.g = i1;
        return i1;
    }

    private void a(int i1)
    {
        b = i1;
        com.supersonicads.sdk.b.c.a(e, (new StringBuilder()).append("setOrientationEventListener(").append(i1).append(")").toString());
    }

    private void b(String s, int i1)
    {
        if (s != null)
        {
            if ("landscape".equalsIgnoreCase(s))
            {
                n();
                a(1);
            } else
            {
                if ("portrait".equalsIgnoreCase(s))
                {
                    o();
                    a(0);
                    return;
                }
                if ("application".equalsIgnoreCase(s))
                {
                    a(2);
                    return;
                }
                if ("device".equalsIgnoreCase(s))
                {
                    if (m())
                    {
                        setRequestedOrientation(1);
                        return;
                    } else
                    {
                        a(2);
                        return;
                    }
                }
            }
        }
    }

    private void g()
    {
        f = new a(this, 3);
        Intent intent = getIntent();
        b(intent.getStringExtra("orientation_set_flag"), intent.getIntExtra("rotation_set_flag", 0));
    }

    private void h()
    {
        if (i != null)
        {
            ViewGroup viewgroup = (ViewGroup)j.getParent();
            if (viewgroup.findViewById(1) != null)
            {
                viewgroup.removeView(j);
            }
        }
    }

    private void i()
    {
        requestWindowFeature(1);
    }

    private void j()
    {
        getWindow().setFlags(1024, 1024);
    }

    private void k()
    {
        runOnUiThread(new Runnable() {

            final ControllerActivity a;

            public void run()
            {
                a.getWindow().addFlags(128);
            }

            
            {
                a = ControllerActivity.this;
                super();
            }
        });
    }

    private void l()
    {
        runOnUiThread(new Runnable() {

            final ControllerActivity a;

            public void run()
            {
                a.getWindow().clearFlags(128);
            }

            
            {
                a = ControllerActivity.this;
                super();
            }
        });
    }

    private boolean m()
    {
        return android.provider.Settings.System.getInt(getContentResolver(), "accelerometer_rotation", 0) != 1;
    }

    private void n()
    {
        int i1 = ((WindowManager)getSystemService("window")).getDefaultDisplay().getRotation();
        com.supersonicads.sdk.b.c.a(e, "setInitiateLandscapeOrientation");
        if (i1 == 0)
        {
            com.supersonicads.sdk.b.c.a(e, "ROTATION_0");
            g = 0;
            setRequestedOrientation(0);
            return;
        }
        if (i1 == 2)
        {
            com.supersonicads.sdk.b.c.a(e, "ROTATION_180");
            g = 8;
            setRequestedOrientation(8);
            return;
        }
        if (i1 == 3)
        {
            com.supersonicads.sdk.b.c.a(e, "ROTATION_270 Right Landscape");
            g = 8;
            setRequestedOrientation(8);
            return;
        }
        if (i1 == 1)
        {
            com.supersonicads.sdk.b.c.a(e, "ROTATION_90 Left Landscape");
            g = 0;
            setRequestedOrientation(0);
            return;
        } else
        {
            com.supersonicads.sdk.b.c.a(e, "No Rotation");
            return;
        }
    }

    private void o()
    {
        int i1 = com.supersonicads.sdk.b.d.d(this);
        com.supersonicads.sdk.b.c.a(e, "setInitiatePortraitOrientation");
        if (i1 == 0)
        {
            com.supersonicads.sdk.b.c.a(e, "ROTATION_0");
            g = 1;
            setRequestedOrientation(1);
            return;
        }
        if (i1 == 2)
        {
            com.supersonicads.sdk.b.c.a(e, "ROTATION_180");
            g = 9;
            setRequestedOrientation(9);
            return;
        }
        if (i1 == 1)
        {
            com.supersonicads.sdk.b.c.a(e, "ROTATION_270 Right Landscape");
            g = 1;
            setRequestedOrientation(1);
            return;
        }
        if (i1 == 3)
        {
            com.supersonicads.sdk.b.c.a(e, "ROTATION_90 Left Landscape");
            g = 1;
            setRequestedOrientation(1);
            return;
        } else
        {
            com.supersonicads.sdk.b.c.a(e, "No Rotation");
            return;
        }
    }

    public void a()
    {
        runOnUiThread(new Runnable() {

            final ControllerActivity a;

            public void run()
            {
                a.finish();
            }

            
            {
                a = ControllerActivity.this;
                super();
            }
        });
    }

    public void a(String s, int i1)
    {
        b(s, i1);
    }

    public void a(boolean flag)
    {
        if (flag)
        {
            k();
            return;
        } else
        {
            l();
            return;
        }
    }

    public void b()
    {
        a(true);
    }

    public void c()
    {
        a(false);
    }

    public void d()
    {
        a(true);
    }

    public void e()
    {
        a(false);
    }

    public void f()
    {
        a(false);
    }

    public void onBackPressed()
    {
        com.supersonicads.sdk.data.c.a a1;
        com.supersonicads.sdk.b.c.a(e, "onBackPressed");
        a1 = com.supersonicads.sdk.b.f.a().c();
        static class _cls4
        {

            static final int a[];

            static 
            {
                a = new int[com.supersonicads.sdk.data.c.a.values().length];
                try
                {
                    a[com.supersonicads.sdk.data.c.a.a.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    a[com.supersonicads.sdk.data.c.a.b.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[com.supersonicads.sdk.data.c.a.c.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        _cls4.a[a1.ordinal()];
        JVM INSTR tableswitch 1 3: default 48
    //                   1 48
    //                   2 49
    //                   3 54;
           goto _L1 _L1 _L2 _L3
_L1:
        return;
_L2:
        super.onBackPressed();
        return;
_L3:
        if (h != null)
        {
            h.a("back");
            return;
        }
        if (true) goto _L1; else goto _L4
_L4:
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        com.supersonicads.sdk.b.c.a(e, "onCreate");
        i();
        j();
        h = com.supersonicads.sdk.agent.b.d(this).d();
        h.setId(1);
        h.setOnWebViewControllerChangeListener(this);
        l = getIntent().getStringExtra("productType");
        if (!TextUtils.isEmpty(l) && com.supersonicads.sdk.data.c.d.b.toString().equalsIgnoreCase(l))
        {
            if (bundle != null)
            {
                bundle = (AdUnitsState)bundle.getParcelable("state");
                if (bundle != null)
                {
                    m = bundle;
                    h.a(bundle);
                }
                finish();
            } else
            {
                m = h.getSavedState();
            }
        }
        if (!TextUtils.isEmpty(l) && com.supersonicads.sdk.data.c.d.a.toString().equalsIgnoreCase(l))
        {
            h.setVideoEventsListener(this);
        }
        i = new RelativeLayout(this);
        setContentView(i, a);
        j = h.getLayout();
        if (i.findViewById(1) == null && j.getParent() != null)
        {
            k = true;
            finish();
        }
        g();
    }

    protected void onDestroy()
    {
        super.onDestroy();
        com.supersonicads.sdk.b.c.a(e, "onDestroy");
        if (k)
        {
            h();
        }
        if (h != null)
        {
            h.setState(com.supersonicads.sdk.controller.SupersonicWebView.e.b);
            h.b();
        }
    }

    public boolean onKeyDown(int i1, KeyEvent keyevent)
    {
        if (i1 == 4 && h.l())
        {
            h.m();
            return true;
        } else
        {
            return super.onKeyDown(i1, keyevent);
        }
    }

    protected void onPause()
    {
        super.onPause();
        com.supersonicads.sdk.b.c.a(e, "onPause");
        ((AudioManager)getSystemService("audio")).abandonAudioFocus(null);
        if (h != null)
        {
            h.b(this);
            h.j();
            h.a(false, "main");
        }
        h();
        if (f != null)
        {
            f.disable();
        }
    }

    protected void onResume()
    {
        super.onResume();
        com.supersonicads.sdk.b.c.a(e, "onResume");
        i.addView(j, a);
        if (h != null)
        {
            h.a(this);
            h.k();
            h.a(true, "main");
        }
        if (f != null && f.canDetectOrientation())
        {
            f.enable();
        }
        ((AudioManager)getSystemService("audio")).requestAudioFocus(null, 3, 2);
    }

    public void onSaveInstanceState(Bundle bundle)
    {
        super.onSaveInstanceState(bundle);
        if (!TextUtils.isEmpty(l) && com.supersonicads.sdk.data.c.d.b.toString().equalsIgnoreCase(l))
        {
            m.d(true);
            bundle.putParcelable("state", m);
        }
    }

    protected void onUserLeaveHint()
    {
        super.onUserLeaveHint();
        com.supersonicads.sdk.b.c.a(e, "onUserLeaveHint");
    }

    public void setRequestedOrientation(int i1)
    {
        if (d != i1)
        {
            com.supersonicads.sdk.b.c.a(e, (new StringBuilder()).append("Rotation: Req = ").append(i1).append(" Curr = ").append(d).toString());
            d = i1;
            super.setRequestedOrientation(i1);
        }
    }

}
