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
import android.webkit.ValueCallback;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.EditText;
import android.widget.TextView;
import com.google.android.gms.ads.internal.p;
import com.google.android.gms.ads.internal.util.client.b;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.google.android.gms.internal:
//            ay, ax, ah, hi, 
//            it, aj, ai, fl

public final class ak extends Thread
{
    final class a
    {

        final int a;
        final int b;
        final ak c;

        a(int i1, int j1)
        {
            c = ak.this;
            super();
            a = i1;
            b = j1;
        }
    }


    private boolean a;
    private boolean b;
    private boolean c;
    private final Object d = new Object();
    private final aj e;
    private final ai f;
    private final fl g;
    private final int h;
    private final int i;
    private final int j;
    private final int k;
    private final int l;

    public ak(aj aj1, ai ai1, fl fl1)
    {
        a = false;
        b = false;
        c = false;
        e = aj1;
        f = ai1;
        g = fl1;
        aj1 = ay.K;
        i = ((Integer)p.n().a(aj1)).intValue();
        aj1 = ay.L;
        j = ((Integer)p.n().a(aj1)).intValue();
        aj1 = ay.M;
        k = ((Integer)p.n().a(aj1)).intValue();
        aj1 = ay.N;
        l = ((Integer)p.n().a(aj1)).intValue();
        aj1 = ay.O;
        h = ((Integer)p.n().a(aj1)).intValue();
        setName("ContentFetchTask");
    }

    private a a(View view, ah ah1)
    {
        int i1 = 0;
        if (view == null)
        {
            return new a(0, 0);
        }
        if ((view instanceof TextView) && !(view instanceof EditText))
        {
            view = ((TextView)view).getText();
            if (!TextUtils.isEmpty(view))
            {
                ah1.b(view.toString());
                return new a(1, 0);
            } else
            {
                return new a(0, 0);
            }
        }
        if ((view instanceof WebView) && !(view instanceof hi))
        {
            ah1.e();
            view = (WebView)view;
            if (!it.f())
            {
                i1 = 0;
            } else
            {
                ah1.e();
                view.post(new Runnable(ah1, view) {

                    ValueCallback a;
                    final ah b;
                    final WebView c;
                    final ak d;

                    public final void run()
                    {
                        if (!c.getSettings().getJavaScriptEnabled())
                        {
                            break MISSING_BLOCK_LABEL_26;
                        }
                        c.evaluateJavascript("(function() { return  {text:document.body.innerText}})();", a);
                        return;
                        Throwable throwable;
                        throwable;
                        a.onReceiveValue("");
                        return;
                    }

            
            {
                d = ak.this;
                b = ah1;
                c = webview;
                super();
                a = new _cls1(this);
            }
                });
                i1 = 1;
            }
            if (i1 != 0)
            {
                return new a(0, 1);
            } else
            {
                return new a(0, 0);
            }
        }
        if (view instanceof ViewGroup)
        {
            view = (ViewGroup)view;
            int j1 = 0;
            int k1 = 0;
            for (; i1 < view.getChildCount(); i1++)
            {
                a a1 = a(view.getChildAt(i1), ah1);
                k1 += a1.a;
                j1 += a1.b;
            }

            return new a(k1, j1);
        } else
        {
            return new a(0, 0);
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
                com.google.android.gms.ads.internal.util.client.b.a(3);
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
        ah ah1;
        ah1 = new ah(i, j, k, l);
        view = a(view, ah1);
        ah1.f();
        if (((a) (view)).a == 0 && ((a) (view)).b == 0)
        {
            return;
        }
        try
        {
            if ((((a) (view)).b != 0 || ah1.h() != 0) && (((a) (view)).b != 0 || !f.a(ah1)))
            {
                f.c(ah1);
                return;
            }
        }
        // Misplaced declaration of an exception variable
        catch (View view)
        {
            com.google.android.gms.ads.internal.util.client.b.a("Exception in fetchContentOnUIThread", view);
            g.a(view, true);
        }
        return;
    }

    final void a(ah ah1, WebView webview, String s)
    {
        ah1.d();
        if (!TextUtils.isEmpty(s))
        {
            s = (new JSONObject(s)).optString("text");
            if (TextUtils.isEmpty(webview.getTitle()))
            {
                break MISSING_BLOCK_LABEL_84;
            }
            ah1.a((new StringBuilder()).append(webview.getTitle()).append("\n").append(s).toString());
        }
_L2:
        if (ah1.a())
        {
            f.b(ah1);
            return;
        }
        break MISSING_BLOCK_LABEL_114;
        ah1.a(s);
        if (true) goto _L2; else goto _L1
_L1:
        ah1;
        com.google.android.gms.ads.internal.util.client.b.a(3);
        return;
        ah1;
        com.google.android.gms.ads.internal.util.client.b.a(3);
        g.a(ah1, true);
    }

    public final ah b()
    {
        return f.a();
    }

    public final void c()
    {
        synchronized (d)
        {
            b = false;
            d.notifyAll();
            com.google.android.gms.ads.internal.util.client.b.a(3);
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
        com.google.android.gms.ads.internal.util.client.b.a(3);
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
            com.google.android.gms.ads.internal.util.client.b.a(3);
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
        ((View) (obj)).post(new Runnable(((View) (obj))) {

            final View a;
            final ak b;

            public final void run()
            {
                b.a(a);
            }

            
            {
                b = ak.this;
                a = view;
                super();
            }
        });
_L8:
        Thread.sleep(h * 1000);
        continue; /* Loop/switch isn't completed */
_L2:
        com.google.android.gms.ads.internal.util.client.b.a(3);
        synchronized (d)
        {
            b = true;
            (new StringBuilder("ContentFetchThread: paused, mPause = ")).append(b);
            com.google.android.gms.ads.internal.util.client.b.a(3);
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
            com.google.android.gms.ads.internal.util.client.b.a("Error in ContentFetchTask", throwable);
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

    // Unreferenced inner class com/google/android/gms/internal/ak$2$1

/* anonymous class */
    final class _cls1
        implements ValueCallback
    {

        final _cls2 a;

        public final void onReceiveValue(Object obj)
        {
            obj = (String)obj;
            a.d.a(a.b, a.c, ((String) (obj)));
        }

            
            {
                a = _pcls2;
                super();
            }
    }

}
