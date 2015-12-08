// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.KeyguardManager;
import android.content.Context;
import android.os.Bundle;
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
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.google.android.gms.internal:
//            bn, iv, kc, ak, 
//            am, gv, al, gs, 
//            ey

public class an extends Thread
{
    class a
    {

        final an nB;
        final int nG;
        final int nH;

        a(int i, int j)
        {
            nB = an.this;
            super();
            nG = i;
            nH = j;
        }
    }


    private boolean mStarted;
    private final Object mw = new Object();
    private final int nf;
    private final int nh;
    private boolean ns;
    private boolean nt;
    private final am nu;
    private final al nv;
    private final ey nw;
    private final int nx;
    private final int ny;
    private final int nz;

    public an(am am1, al al1, Bundle bundle, ey ey1)
    {
        mStarted = false;
        ns = false;
        nt = false;
        nu = am1;
        nv = al1;
        nw = ey1;
        nf = bundle.getInt(bn.pe.getKey());
        ny = bundle.getInt(bn.pf.getKey());
        nh = bundle.getInt(bn.pg.getKey());
        nz = bundle.getInt(bn.ph.getKey());
        nx = bundle.getInt(bn.pi.getKey(), 10);
        setName("ContentFetchTask");
    }

    private void a(Activity activity)
    {
        if (activity != null)
        {
            Object obj = null;
            View view = obj;
            if (activity.getWindow() != null)
            {
                view = obj;
                if (activity.getWindow().getDecorView() != null)
                {
                    view = activity.getWindow().getDecorView().findViewById(0x1020002);
                }
            }
            if (view != null)
            {
                g(view);
                return;
            }
        }
    }

    private boolean a(WebView webview, ak ak1)
    {
        if (!kc.hI())
        {
            return false;
        } else
        {
            ak1.aR();
            webview.post(new Runnable(ak1, webview) {

                final an nB;
                ValueCallback nC;
                final ak nD;
                final WebView nE;

                public void run()
                {
                    if (nE.getSettings().getJavaScriptEnabled())
                    {
                        nE.evaluateJavascript("(function() { return  {text:document.body.innerText}})();", nC);
                    }
                }

            
            {
                nB = an.this;
                nD = ak1;
                nE = webview;
                super();
                nC = new _cls1(this);
            }
            });
            return true;
        }
    }

    private boolean aW()
    {
        KeyguardManager keyguardmanager;
        Object obj;
        Object obj1;
        android.app.ActivityManager.RunningAppProcessInfo runningappprocessinfo;
        boolean flag;
        try
        {
            obj = nu.getContext();
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
        obj = (PowerManager)((Context) (obj)).getSystemService("power");
        if (obj1 == null || keyguardmanager == null || obj == null)
        {
            break MISSING_BLOCK_LABEL_143;
        }
        obj1 = ((ActivityManager) (obj1)).getRunningAppProcesses();
        if (obj1 == null)
        {
            return false;
        }
        obj1 = ((List) (obj1)).iterator();
        do
        {
            if (!((Iterator) (obj1)).hasNext())
            {
                break MISSING_BLOCK_LABEL_138;
            }
            runningappprocessinfo = (android.app.ActivityManager.RunningAppProcessInfo)((Iterator) (obj1)).next();
        } while (Process.myPid() != runningappprocessinfo.pid);
        if (runningappprocessinfo.importance != 100 || keyguardmanager.inKeyguardRestrictedInputMode())
        {
            break MISSING_BLOCK_LABEL_138;
        }
        flag = ((PowerManager) (obj)).isScreenOn();
        if (flag)
        {
            return true;
        }
        return false;
        return false;
    }

    a a(View view, ak ak1)
    {
        int i = 0;
        if (view == null)
        {
            return new a(0, 0);
        }
        if ((view instanceof TextView) && !(view instanceof EditText))
        {
            ak1.i(((TextView)view).getText().toString());
            return new a(1, 0);
        }
        if ((view instanceof WebView) && !(view instanceof gv))
        {
            ak1.aR();
            if (a((WebView)view, ak1))
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
            int j = 0;
            int k = 0;
            for (; i < view.getChildCount(); i++)
            {
                a a1 = a(view.getChildAt(i), ak1);
                k += a1.nG;
                j += a1.nH;
            }

            return new a(k, j);
        } else
        {
            return new a(0, 0);
        }
    }

    void a(ak ak1, WebView webview, String s)
    {
        ak1.aQ();
        if (!TextUtils.isEmpty(s))
        {
            s = (new JSONObject(s)).optString("text");
            if (TextUtils.isEmpty(webview.getTitle()))
            {
                break MISSING_BLOCK_LABEL_84;
            }
            ak1.h((new StringBuilder()).append(webview.getTitle()).append("\n").append(s).toString());
        }
_L2:
        if (ak1.aN())
        {
            nv.b(ak1);
            return;
        }
        break MISSING_BLOCK_LABEL_116;
        ak1.h(s);
        if (true) goto _L2; else goto _L1
_L1:
        ak1;
        gs.S("Json string may be malformed.");
        return;
        ak1;
        gs.a("Failed to get webview content.", ak1);
        nw.b(ak1);
    }

    public void aV()
    {
label0:
        {
            synchronized (mw)
            {
                if (!mStarted)
                {
                    break label0;
                }
                gs.S("Content hash thread already started, quiting...");
            }
            return;
        }
        mStarted = true;
        obj;
        JVM INSTR monitorexit ;
        start();
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public ak aX()
    {
        return nv.aU();
    }

    public void aY()
    {
        synchronized (mw)
        {
            ns = true;
            gs.S((new StringBuilder()).append("ContentFetchThread: paused, mPause = ").append(ns).toString());
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public boolean aZ()
    {
        return ns;
    }

    boolean g(View view)
    {
        if (view == null)
        {
            return false;
        } else
        {
            view.post(new Runnable(view) {

                final View nA;
                final an nB;

                public void run()
                {
                    nB.h(nA);
                }

            
            {
                nB = an.this;
                nA = view;
                super();
            }
            });
            return true;
        }
    }

    void h(View view)
    {
        ak ak1;
        ak1 = new ak(nf, ny, nh, nz);
        view = a(view, ak1);
        ak1.aS();
        if (((a) (view)).nG == 0 && ((a) (view)).nH == 0)
        {
            return;
        }
        try
        {
            if ((((a) (view)).nH != 0 || ak1.aT() != 0) && (((a) (view)).nH != 0 || !nv.a(ak1)))
            {
                nv.c(ak1);
                return;
            }
        }
        // Misplaced declaration of an exception variable
        catch (View view)
        {
            gs.b("Exception in fetchContentOnUIThread", view);
            nw.b(view);
        }
        return;
    }

    public void run()
    {
_L11:
        if (nt)
        {
            break; /* Loop/switch isn't completed */
        }
        if (!aW()) goto _L2; else goto _L1
_L1:
        Object obj = nu.getActivity();
        if (obj != null) goto _L4; else goto _L3
_L3:
        try
        {
            gs.S("ContentFetchThread: no activity");
            continue; /* Loop/switch isn't completed */
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            gs.b("Error in ContentFetchTask", ((Throwable) (obj)));
            nw.b(((Throwable) (obj)));
        }
_L8:
        obj = mw;
        obj;
        JVM INSTR monitorenter ;
_L7:
        boolean flag = ns;
        if (!flag) goto _L6; else goto _L5
_L5:
        Exception exception;
        try
        {
            gs.S("ContentFetchTask: waiting");
            mw.wait();
        }
        catch (InterruptedException interruptedexception) { }
        finally { }
        if (true) goto _L7; else goto _L6
_L4:
        a(((Activity) (obj)));
_L9:
        Thread.sleep(nx * 1000);
          goto _L8
_L2:
        gs.S("ContentFetchTask: sleeping");
        aY();
          goto _L9
_L6:
        obj;
        JVM INSTR monitorexit ;
        if (true) goto _L11; else goto _L10
        obj;
        JVM INSTR monitorexit ;
        throw exception;
_L10:
    }

    public void wakeup()
    {
        synchronized (mw)
        {
            ns = false;
            mw.notifyAll();
            gs.S("ContentFetchThread: wakeup");
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    // Unreferenced inner class com/google/android/gms/internal/an$2$1

/* anonymous class */
    class _cls1
        implements ValueCallback
    {

        final _cls2 nF;

        public void k(String s)
        {
            nF.nB.a(nF.nD, nF.nE, s);
        }

        public void onReceiveValue(Object obj)
        {
            k((String)obj);
        }

            
            {
                nF = _pcls2;
                super();
            }
    }

}
