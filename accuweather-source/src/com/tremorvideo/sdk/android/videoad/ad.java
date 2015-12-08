// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tremorvideo.sdk.android.videoad;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.KeyguardManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Process;
import android.util.DisplayMetrics;
import android.view.KeyEvent;
import android.view.Window;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.tremorvideo.sdk.android.d.a;
import com.tremorvideo.sdk.android.d.d;
import com.tremorvideo.sdk.android.d.v;
import com.tremorvideo.sdk.android.richmedia.n;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileReader;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.tremorvideo.sdk.android.videoad:
//            a, eb, bh, ct, 
//            ae, af, ag, ea, 
//            co, ah, ai

public class ad extends com.tremorvideo.sdk.android.videoad.a
    implements com.tremorvideo.sdk.android.richmedia.o.a, eb.b
{

    eb c;
    int d;
    int e;
    boolean f;
    private bh g;
    private v h;
    private ImageView i;
    private RelativeLayout j;

    public ad(a.a a1, Activity activity, bh bh1)
    {
        super(a1, activity);
        d = 0;
        e = -1;
        f = false;
        g = bh1;
        c = new eb(activity, a1, g.r());
        c.a(this);
        g.B().a(c);
        a1 = g.C();
        if (a1 != null)
        {
            c.a(a1);
        }
        if (!bh1.E())
        {
            a(((n) (null)), true);
            return;
        } else
        {
            a.requestWindowFeature(1);
            a.getWindow().setFlags(1024, 1024);
            com.tremorvideo.sdk.android.videoad.ct.a(a.getWindow());
            h = b(this);
            j = new RelativeLayout(a);
            a1 = new android.widget.RelativeLayout.LayoutParams(-1, -2);
            a1.addRule(13);
            j.addView(h, a1);
            a.setContentView(j);
            return;
        }
    }

    static v a(ad ad1)
    {
        return ad1.h;
    }

    private String a(File file)
    {
        StringBuilder stringbuilder = new StringBuilder();
        file = new BufferedReader(new FileReader(file));
_L1:
        String s = file.readLine();
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_69;
        }
        stringbuilder.append(s);
        stringbuilder.append(System.getProperty("line.separator"));
          goto _L1
        Exception exception;
        exception;
        try
        {
            file.close();
            throw exception;
        }
        // Misplaced declaration of an exception variable
        catch (File file)
        {
            com.tremorvideo.sdk.android.videoad.ct.a(file);
        }
_L2:
        return stringbuilder.toString();
        file.close();
          goto _L2
    }

    private v b(ad ad1)
    {
        h = new v(a, com.tremorvideo.sdk.android.d.v.a.a, com.tremorvideo.sdk.android.d.v.e.c, com.tremorvideo.sdk.android.d.v.l.b, g.A());
        h.a(ad1);
        h.a(new ae(this));
        h.a(new af(this));
        h.a(new ag(this));
        ad1 = a(new File((new StringBuilder()).append(g.A()).append(g.l).toString()));
        h.a(ad1);
        if (g.m == 1)
        {
            e = 0;
            a.setRequestedOrientation(0);
            b.b(e);
        } else
        if (g.m == 2)
        {
            e = 1;
            a.setRequestedOrientation(1);
            b.b(e);
        } else
        {
            e = -1;
            a.setRequestedOrientation(-1);
            b.b(e);
        }
        return h;
    }

    public bb.a a()
    {
        ea ea1 = g.a(ea.b.H);
        if (ea1 == null)
        {
            return bb.a.f;
        }
        int i1 = ea1.a("location", -1);
        if (i1 == -1)
        {
            return bb.a.f;
        } else
        {
            return bb.a.values()[i1];
        }
    }

    public void a(Configuration configuration)
    {
    }

    public void a(n n1, boolean flag)
    {
        c.a();
        g.B().a(null);
        f = flag;
        if (!f)
        {
            n1 = g.D();
            if (n1 != null)
            {
                c.a(n1);
            }
        }
        b.a(this);
    }

    public void a(ea ea1)
    {
        if (ea1 != null)
        {
            if (ea1.a() == ea.b.w)
            {
                d = d + 1;
            } else
            if (ea1.a() == com.tremorvideo.sdk.android.videoad.ea.b.v)
            {
                b.a(this);
                return;
            }
        }
    }

    public void a(ea ea1, int i1)
    {
label0:
        {
            if (ea1 != null)
            {
                if (!ea1.n())
                {
                    break label0;
                }
                c.b(ea1, i1);
            }
            return;
        }
        ea1 = new co(a, g.r(), com.tremorvideo.sdk.android.videoad.co.a.a, new ah(this));
        ea1.setTitle("Unsupported Feature");
        ea1.a("Sorry, that feature is not supported on your device.");
        ea1.a("OK", "");
        ea1.show();
    }

    public void a(String s)
    {
        if (s == "adchoices")
        {
            s = g.a(ea.b.H);
        } else
        {
            s = g.c(s);
        }
        if (s != null)
        {
            a(((ea) (s)), -1);
        }
    }

    public boolean a(int i1, KeyEvent keyevent)
    {
        if (i1 == 4)
        {
            if (!h.b())
            {
                keyevent = g.o();
                if (keyevent == null)
                {
                    b.a(this);
                } else
                {
                    c.a(keyevent);
                    b.a(this);
                }
            }
            return true;
        } else
        {
            return super.a(i1, keyevent);
        }
    }

    public void a_()
    {
    }

    public void c()
    {
        if (c.b())
        {
            c.e();
            c.g();
        }
    }

    public void d()
    {
        h.f();
        super.d();
    }

    public void e()
    {
        super.e();
        if (!((KeyguardManager)a.getSystemService("keyguard")).inKeyguardRestrictedInputMode())
        {
            h.g();
        }
    }

    public void h()
    {
        super.h();
        Iterator iterator = ((ActivityManager)a.getSystemService("activity")).getRunningAppProcesses().iterator();
_L4:
        if (!iterator.hasNext()) goto _L2; else goto _L1
_L1:
        android.app.ActivityManager.RunningAppProcessInfo runningappprocessinfo = (android.app.ActivityManager.RunningAppProcessInfo)iterator.next();
        if (runningappprocessinfo.pid != Process.myPid()) goto _L4; else goto _L3
_L3:
        int i1 = runningappprocessinfo.importance;
        if (i1 != 100) goto _L2; else goto _L5
_L5:
        boolean flag = true;
_L7:
        if (flag)
        {
            h.g();
        }
        return;
        Exception exception;
        exception;
        com.tremorvideo.sdk.android.videoad.ct.a(exception);
_L2:
        flag = false;
        if (true) goto _L7; else goto _L6
_L6:
    }

    public boolean i()
    {
        return !c.d();
    }

    public long j()
    {
        return 0L;
    }

    public int k()
    {
        return d;
    }

    public a.b l()
    {
        if (f)
        {
            return com.tremorvideo.sdk.android.videoad.a.b.d;
        } else
        {
            return com.tremorvideo.sdk.android.videoad.a.b.d;
        }
    }

    public void m()
    {
        if (h != null)
        {
            h.e();
        }
        if (g != null)
        {
            g.z();
        }
    }

    public void n()
    {
        a.setContentView(j);
    }

    public void o()
    {
        if (g.m == 2)
        {
            a.setRequestedOrientation(1);
            return;
        } else
        {
            a.setRequestedOrientation(0);
            return;
        }
    }

    public void p()
    {
        a.setRequestedOrientation(e);
    }

    protected void q()
    {
        float f1 = 1.0F;
        if (i == null)
        {
            Drawable drawable = Drawable.createFromStream(new ByteArrayInputStream(d.a), "closeImage");
            StateListDrawable statelistdrawable = new StateListDrawable();
            statelistdrawable.addState(new int[] {
                0xfefeff59
            }, drawable);
            statelistdrawable.addState(new int[] {
                0x10100a7
            }, drawable);
            i = new ImageButton(a);
            i.setImageDrawable(statelistdrawable);
            i.setBackgroundDrawable(null);
            i.setOnClickListener(new ai(this));
        }
        float f2 = a.getResources().getDisplayMetrics().density;
        android.widget.RelativeLayout.LayoutParams layoutparams;
        int i1;
        int j1;
        if (f2 >= 1.0F)
        {
            f1 = f2;
        }
        i1 = (int)(32F * f1);
        j1 = (int)(f1 * 2.0F + 0.5F);
        layoutparams = new android.widget.RelativeLayout.LayoutParams(i1, i1);
        layoutparams.addRule(11);
        layoutparams.setMargins(j1, j1, j1, j1);
        j.removeView(i);
        j.addView(i, layoutparams);
    }

    protected void r()
    {
        j.removeView(i);
    }
}
