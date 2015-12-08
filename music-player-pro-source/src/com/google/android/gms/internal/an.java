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
//            bn, iy, ll, ak, 
//            am, gu, al, gr, 
//            ex

public class an extends Thread
{
    class a
    {

        final an nL;
        final int nQ;
        final int nR;

        a(int i, int j)
        {
            nL = an.this;
            super();
            nQ = i;
            nR = j;
        }
    }


    private final Object mH = new Object();
    private boolean mStarted;
    private boolean nC;
    private boolean nD;
    private final am nE;
    private final al nF;
    private final ex nG;
    private final int nH;
    private final int nI;
    private final int nJ;
    private final int np;
    private final int nr;

    public an(am am1, al al1, Bundle bundle, ex ex1)
    {
        mStarted = false;
        nC = false;
        nD = false;
        nE = am1;
        nF = al1;
        nG = ex1;
        np = bundle.getInt(bn.pq.getKey());
        nI = bundle.getInt(bn.pr.getKey());
        nr = bundle.getInt(bn.ps.getKey());
        nJ = bundle.getInt(bn.pt.getKey());
        nH = bundle.getInt(bn.pu.getKey(), 10);
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
        if (!ll.im())
        {
            return false;
        } else
        {
            ak1.aW();
            webview.post(new Runnable(ak1, webview) {

                final an nL;
                ValueCallback nM;
                final ak nN;
                final WebView nO;

                public void run()
                {
                    if (nO.getSettings().getJavaScriptEnabled())
                    {
                        nO.evaluateJavascript("(function() { return  {text:document.body.innerText}})();", nM);
                    }
                }

            
            {
                nL = an.this;
                nN = ak1;
                nO = webview;
                super();
                nM = new _cls1(this);
            }
            });
            return true;
        }
    }

    private boolean bb()
    {
        KeyguardManager keyguardmanager;
        Object obj;
        Object obj1;
        android.app.ActivityManager.RunningAppProcessInfo runningappprocessinfo;
        boolean flag;
        try
        {
            obj = nE.getContext();
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
        if ((view instanceof WebView) && !(view instanceof gu))
        {
            ak1.aW();
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
                k += a1.nQ;
                j += a1.nR;
            }

            return new a(k, j);
        } else
        {
            return new a(0, 0);
        }
    }

    void a(ak ak1, WebView webview, String s)
    {
        ak1.aV();
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
        if (ak1.aS())
        {
            nF.b(ak1);
            return;
        }
        break MISSING_BLOCK_LABEL_116;
        ak1.h(s);
        if (true) goto _L2; else goto _L1
_L1:
        ak1;
        gr.S("Json string may be malformed.");
        return;
        ak1;
        gr.a("Failed to get webview content.", ak1);
        nG.b(ak1);
    }

    public void ba()
    {
label0:
        {
            synchronized (mH)
            {
                if (!mStarted)
                {
                    break label0;
                }
                gr.S("Content hash thread already started, quiting...");
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

    public ak bc()
    {
        return nF.aZ();
    }

    public void bd()
    {
        synchronized (mH)
        {
            nC = true;
            gr.S((new StringBuilder()).append("ContentFetchThread: paused, mPause = ").append(nC).toString());
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public boolean be()
    {
        return nC;
    }

    boolean g(View view)
    {
        if (view == null)
        {
            return false;
        } else
        {
            view.post(new Runnable(view) {

                final View nK;
                final an nL;

                public void run()
                {
                    nL.h(nK);
                }

            
            {
                nL = an.this;
                nK = view;
                super();
            }
            });
            return true;
        }
    }

    void h(View view)
    {
        ak ak1;
        ak1 = new ak(np, nI, nr, nJ);
        view = a(view, ak1);
        ak1.aX();
        if (((a) (view)).nQ == 0 && ((a) (view)).nR == 0)
        {
            return;
        }
        try
        {
            if ((((a) (view)).nR != 0 || ak1.aY() != 0) && (((a) (view)).nR != 0 || !nF.a(ak1)))
            {
                nF.c(ak1);
                return;
            }
        }
        // Misplaced declaration of an exception variable
        catch (View view)
        {
            gr.b("Exception in fetchContentOnUIThread", view);
            nG.b(view);
        }
        return;
    }

    public void run()
    {
_L11:
        if (nD)
        {
            break; /* Loop/switch isn't completed */
        }
        if (!bb()) goto _L2; else goto _L1
_L1:
        Object obj = nE.getActivity();
        if (obj != null) goto _L4; else goto _L3
_L3:
        try
        {
            gr.S("ContentFetchThread: no activity");
            continue; /* Loop/switch isn't completed */
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            gr.b("Error in ContentFetchTask", ((Throwable) (obj)));
            nG.b(((Throwable) (obj)));
        }
_L8:
        obj = mH;
        obj;
        JVM INSTR monitorenter ;
_L7:
        boolean flag = nC;
        if (!flag) goto _L6; else goto _L5
_L5:
        Exception exception;
        try
        {
            gr.S("ContentFetchTask: waiting");
            mH.wait();
        }
        catch (InterruptedException interruptedexception) { }
        finally { }
        if (true) goto _L7; else goto _L6
_L4:
        a(((Activity) (obj)));
_L9:
        Thread.sleep(nH * 1000);
          goto _L8
_L2:
        gr.S("ContentFetchTask: sleeping");
        bd();
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
        synchronized (mH)
        {
            nC = false;
            mH.notifyAll();
            gr.S("ContentFetchThread: wakeup");
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

        final _cls2 nP;

        public void k(String s)
        {
            nP.nL.a(nP.nN, nP.nO, s);
        }

        public void onReceiveValue(Object obj)
        {
            k((String)obj);
        }

            
            {
                nP = _pcls2;
                super();
            }
    }

}
