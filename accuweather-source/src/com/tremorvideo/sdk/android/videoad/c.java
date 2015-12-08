// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tremorvideo.sdk.android.videoad;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.view.Display;
import android.view.KeyEvent;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.ImageView;
import java.util.Dictionary;

// Referenced classes of package com.tremorvideo.sdk.android.videoad:
//            a, az, cx, ea, 
//            dm, e, bz, d, 
//            gd, h, ct

public class c extends a
{

    gd c;
    private cx d;
    private boolean e;
    private boolean f;
    private boolean g;

    public c(a.a a1, Activity activity, az az1, boolean flag)
    {
        super(a1, activity);
        g = false;
        f = flag;
        d = az1.q();
        e = false;
        c = az1.r();
    }

    static void a(c c1)
    {
        c1.p();
    }

    static void a(c c1, boolean flag)
    {
        c1.a(flag);
    }

    private void a(boolean flag)
    {
        this;
        JVM INSTR monitorenter ;
        if (g || e) goto _L2; else goto _L1
_L1:
        e = true;
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_52;
        }
        if (!f)
        {
            break MISSING_BLOCK_LABEL_65;
        }
        b.a(d.a(ea.b.D));
_L3:
        b.a(this);
_L2:
        this;
        JVM INSTR monitorexit ;
        return;
        b.a(d.a(ea.b.E));
          goto _L3
        Exception exception;
        exception;
        throw exception;
    }

    private boolean a()
    {
        return d.a(ea.b.K) == null;
    }

    static void b(c c1)
    {
        c1.o();
    }

    static boolean b(c c1, boolean flag)
    {
        c1.g = flag;
        return flag;
    }

    static boolean c(c c1)
    {
        return c1.e;
    }

    static boolean d(c c1)
    {
        return c1.f;
    }

    static cx e(c c1)
    {
        return c1.d;
    }

    static boolean f(c c1)
    {
        return c1.a();
    }

    private int n()
    {
        return ((WindowManager)a.getSystemService("window")).getDefaultDisplay().getWidth();
    }

    private void o()
    {
        this;
        JVM INSTR monitorenter ;
        Dictionary dictionary;
        Intent intent;
        f = false;
        ea ea1 = d.a(ea.b.K);
        dictionary = ea1.g();
        if (dictionary.get("subject") == null && dictionary.get("message") == null)
        {
            break MISSING_BLOCK_LABEL_185;
        }
        b.a(ea1);
        intent = new Intent("android.intent.action.SEND");
        if (dictionary.get("subject") != null)
        {
            intent.putExtra("android.intent.extra.SUBJECT", (String)dictionary.get("subject"));
        }
        String s = "";
        if (dictionary.get("message") != null)
        {
            s = (new StringBuilder()).append("").append((String)dictionary.get("message")).toString();
        }
        intent.putExtra("android.intent.extra.TEXT", (new StringBuilder()).append(s).append("\n\n").append(d.c()).toString());
        intent.setType("text/plain");
        a.startActivityForResult(Intent.createChooser(intent, "Share"), 11);
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    private void p()
    {
        this;
        JVM INSTR monitorenter ;
        if (!g)
        {
            f = false;
            g = true;
            b.a(d.a(ea.b.A));
            dm dm1 = dm.a(a);
            dm1.setMessage("Saving...");
            dm1.show();
            (new e(this, dm1)).execute(new Void[0]);
        }
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public boolean a(int i, KeyEvent keyevent)
    {
        if (i == 4)
        {
            a(true);
            return true;
        } else
        {
            return super.a(i, keyevent);
        }
    }

    public void c()
    {
        Object obj;
        if (f)
        {
            b.a(d.a(ea.b.C));
        }
        if (d.a(ea.b.K) != null)
        {
            break MISSING_BLOCK_LABEL_250;
        }
        obj = new ea.b[1];
        obj[0] = ea.b.A;
_L1:
        obj = new bz(a, new d(this), ((ea.b []) (obj)), c, true, "Done", n());
        Bitmap bitmap = gd.a(d.b());
        Object obj1 = new ImageView(a);
        ((ImageView) (obj1)).setImageBitmap(bitmap);
        ((ImageView) (obj1)).setScaleType(android.widget.ImageView.ScaleType.CENTER_INSIDE);
        ((ImageView) (obj1)).setFocusable(false);
        FrameLayout framelayout = new FrameLayout(a);
        framelayout.addView(((android.view.View) (obj1)), new android.widget.FrameLayout.LayoutParams(-1, -1));
        obj1 = new android.widget.FrameLayout.LayoutParams(-2, -2);
        obj1.gravity = 80;
        framelayout.addView(((bz) (obj)).d(), ((android.view.ViewGroup.LayoutParams) (obj1)));
        a.setContentView(framelayout);
        if (d.a() > 0 && f)
        {
            framelayout.postDelayed(new h(this), d.a());
        }
        if (bitmap.getWidth() > bitmap.getHeight())
        {
            a.setRequestedOrientation(0);
            return;
        }
        break MISSING_BLOCK_LABEL_286;
        try
        {
            obj = new ea.b[2];
            obj[0] = ea.b.A;
            obj[1] = ea.b.K;
        }
        catch (Exception exception)
        {
            ct.a(exception);
            b.a(this);
            return;
        }
          goto _L1
        a.setRequestedOrientation(1);
        return;
    }

    public a.b l()
    {
        return a.b.d;
    }
}
