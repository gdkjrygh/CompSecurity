// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.KeyguardManager;
import android.content.Context;
import android.os.PowerManager;
import android.os.Process;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.webkit.WebView;
import android.widget.EditText;
import android.widget.TextView;
import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.ads.internal.zzp;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.google.android.gms.internal:
//            cy, cx, cc, bv, 
//            ry, wn, ca, bx, 
//            bw, ng, bz

public final class by extends Thread
{

    private boolean a;
    private boolean b;
    private boolean c;
    private final Object d = new Object();
    private final bx e;
    private final bw f;
    private final ng g;
    private final int h;
    private final int i;
    private final int j;
    private final int k;
    private final int l;

    public by(bx bx1, bw bw1, ng ng1)
    {
        a = false;
        b = false;
        c = false;
        e = bx1;
        f = bw1;
        g = ng1;
        bx1 = cy.K;
        i = ((Integer)zzp.zzbE().a(bx1)).intValue();
        bx1 = cy.L;
        j = ((Integer)zzp.zzbE().a(bx1)).intValue();
        bx1 = cy.M;
        k = ((Integer)zzp.zzbE().a(bx1)).intValue();
        bx1 = cy.N;
        l = ((Integer)zzp.zzbE().a(bx1)).intValue();
        bx1 = cy.O;
        h = ((Integer)zzp.zzbE().a(bx1)).intValue();
        setName("ContentFetchTask");
    }

    private cc a(View view, bv bv1)
    {
        int i1 = 0;
        if (view == null)
        {
            return new cc(this, 0, 0);
        }
        if ((view instanceof TextView) && !(view instanceof EditText))
        {
            view = ((TextView)view).getText();
            if (!TextUtils.isEmpty(view))
            {
                bv1.b(view.toString());
                return new cc(this, 1, 0);
            } else
            {
                return new cc(this, 0, 0);
            }
        }
        if ((view instanceof WebView) && !(view instanceof ry))
        {
            bv1.e();
            view = (WebView)view;
            if (!wn.g())
            {
                i1 = 0;
            } else
            {
                bv1.e();
                view.post(new ca(this, bv1, view));
                i1 = 1;
            }
            if (i1 != 0)
            {
                return new cc(this, 0, 1);
            } else
            {
                return new cc(this, 0, 0);
            }
        }
        if (view instanceof ViewGroup)
        {
            view = (ViewGroup)view;
            int j1 = 0;
            int k1 = 0;
            for (; i1 < view.getChildCount(); i1++)
            {
                cc cc1 = a(view.getChildAt(i1), bv1);
                k1 += cc1.a;
                j1 += cc1.b;
            }

            return new cc(this, k1, j1);
        } else
        {
            return new cc(this, 0, 0);
        }
    }

    private boolean e()
    {
        boolean flag;
        boolean flag1;
        Object obj;
        KeyguardManager keyguardmanager;
        Object obj1;
        android.app.ActivityManager.RunningAppProcessInfo runningappprocessinfo;
        try
        {
            obj = e.b();
        }
        catch (Throwable throwable)
        {
            return false;
        }
        if (obj == null)
        {
            return false;
        }
        obj1 = (ActivityManager)((Context) (obj)).getSystemService("activity");
        keyguardmanager = (KeyguardManager)((Context) (obj)).getSystemService("keyguard");
        if (obj1 != null && keyguardmanager != null) goto _L2; else goto _L1
_L2:
        obj1 = ((ActivityManager) (obj1)).getRunningAppProcesses();
        if (obj1 == null)
        {
            return false;
        }
        obj1 = ((List) (obj1)).iterator();
_L6:
        if (!((Iterator) (obj1)).hasNext()) goto _L4; else goto _L3
_L3:
        runningappprocessinfo = (android.app.ActivityManager.RunningAppProcessInfo)((Iterator) (obj1)).next();
        if (Process.myPid() != runningappprocessinfo.pid) goto _L6; else goto _L5
_L5:
        if (runningappprocessinfo.importance == 100)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (!flag) goto _L4; else goto _L7
_L7:
        if (keyguardmanager.inKeyguardRestrictedInputMode()) goto _L4; else goto _L8
_L8:
        obj = (PowerManager)((Context) (obj)).getSystemService("power");
        if (obj != null) goto _L10; else goto _L9
_L9:
        flag1 = false;
          goto _L11
_L10:
        flag1 = ((PowerManager) (obj)).isScreenOn();
          goto _L11
_L4:
        return false;
_L1:
        return false;
_L11:
        if (!flag1) goto _L4; else goto _L12
_L12:
        return true;
    }

    public final void a()
    {
label0:
        {
            synchronized (d)
            {
                if (!a)
                {
                    break label0;
                }
                zzb.zzaF("Content hash thread already started, quiting...");
            }
            return;
        }
        a = true;
        obj;
        JVM INSTR monitorexit ;
        start();
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    final void a(View view)
    {
        bv bv1;
        bv1 = new bv(i, j, k, l);
        view = a(view, bv1);
        bv1.f();
        if (((cc) (view)).a == 0 && ((cc) (view)).b == 0)
        {
            return;
        }
        try
        {
            if ((((cc) (view)).b != 0 || bv1.h() != 0) && (((cc) (view)).b != 0 || !f.a(bv1)))
            {
                f.c(bv1);
                return;
            }
        }
        // Misplaced declaration of an exception variable
        catch (View view)
        {
            zzb.zzb("Exception in fetchContentOnUIThread", view);
            g.a(view, true);
        }
        return;
    }

    final void a(bv bv1, WebView webview, String s)
    {
        bv1.d();
        if (!TextUtils.isEmpty(s))
        {
            s = (new JSONObject(s)).optString("text");
            if (TextUtils.isEmpty(webview.getTitle()))
            {
                break MISSING_BLOCK_LABEL_84;
            }
            bv1.a((new StringBuilder()).append(webview.getTitle()).append("\n").append(s).toString());
        }
_L2:
        if (bv1.a())
        {
            f.b(bv1);
            return;
        }
        break MISSING_BLOCK_LABEL_117;
        bv1.a(s);
        if (true) goto _L2; else goto _L1
_L1:
        bv1;
        zzb.zzaF("Json string may be malformed.");
        return;
        bv1;
        zzb.zza("Failed to get webview content.", bv1);
        g.a(bv1, true);
    }

    public final bv b()
    {
        return f.a();
    }

    public final void c()
    {
        synchronized (d)
        {
            b = false;
            d.notifyAll();
            zzb.zzaF("ContentFetchThread: wakeup");
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final boolean d()
    {
        return b;
    }

    public final void run()
    {
_L15:
        if (c)
        {
            break; /* Loop/switch isn't completed */
        }
        if (!e()) goto _L2; else goto _L1
_L1:
        Activity activity = e.a();
        if (activity != null) goto _L4; else goto _L3
_L3:
        Throwable throwable;
        zzb.zzaF("ContentFetchThread: no activity");
        continue; /* Loop/switch isn't completed */
_L13:
        obj = d;
        obj;
        JVM INSTR monitorenter ;
_L6:
        boolean flag = b;
        Exception exception1;
        if (!flag)
        {
            break; /* Loop/switch isn't completed */
        }
        Object obj1;
        try
        {
            zzb.zzaF("ContentFetchTask: waiting");
            d.wait();
        }
        catch (InterruptedException interruptedexception) { }
        finally { }
        if (true) goto _L6; else goto _L5
_L4:
        if (activity == null) goto _L8; else goto _L7
_L7:
        obj1 = null;
        obj = obj1;
        if (activity.getWindow() == null) goto _L10; else goto _L9
_L9:
        obj = obj1;
        if (activity.getWindow().getDecorView() != null)
        {
            obj = activity.getWindow().getDecorView().findViewById(0x1020002);
        }
_L10:
        if (obj == null || obj == null) goto _L8; else goto _L11
_L11:
        ((View) (obj)).post(new bz(this, ((View) (obj))));
_L8:
        Thread.sleep(h * 1000);
        continue; /* Loop/switch isn't completed */
_L2:
        zzb.zzaF("ContentFetchTask: sleeping");
        synchronized (d)
        {
            b = true;
            zzb.zzaF((new StringBuilder("ContentFetchThread: paused, mPause = ")).append(b).toString());
        }
        if (true) goto _L8; else goto _L12
_L12:
        exception;
        obj;
        JVM INSTR monitorexit ;
        try
        {
            throw exception;
        }
        // Misplaced declaration of an exception variable
        catch (Throwable throwable)
        {
            zzb.zzb("Error in ContentFetchTask", throwable);
            g.a(throwable, true);
        }
        if (true) goto _L13; else goto _L5
_L5:
        obj;
        JVM INSTR monitorexit ;
        if (true) goto _L15; else goto _L14
        obj;
        JVM INSTR monitorexit ;
        throw exception1;
_L14:
    }
}
