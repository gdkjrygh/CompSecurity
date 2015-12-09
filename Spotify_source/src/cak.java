// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

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
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

public final class cak extends Thread
{

    public boolean a;
    public final Object b = new Object();
    public final cai c;
    final cic d;
    final int e;
    final int f;
    final int g;
    final int h;
    private boolean i;
    private final caj j;
    private final int k;

    public cak(caj caj1, cai cai, cic cic1)
    {
        i = false;
        a = false;
        j = caj1;
        c = cai;
        d = cic1;
        caj1 = cbb.y;
        e = ((Integer)bkv.n().a(caj1)).intValue();
        caj1 = cbb.z;
        f = ((Integer)bkv.n().a(caj1)).intValue();
        caj1 = cbb.A;
        g = ((Integer)bkv.n().a(caj1)).intValue();
        caj1 = cbb.B;
        h = ((Integer)bkv.n().a(caj1)).intValue();
        caj1 = cbb.C;
        k = ((Integer)bkv.n().a(caj1)).intValue();
        setName("ContentFetchTask");
    }

    private boolean b()
    {
        boolean flag;
        boolean flag1;
        Object obj;
        KeyguardManager keyguardmanager;
        Object obj1;
        android.app.ActivityManager.RunningAppProcessInfo runningappprocessinfo;
        try
        {
            obj = j.b;
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

    final cal a(View view, cah cah1)
    {
        int l = 0;
        if (view == null)
        {
            return new cal(0, 0);
        }
        if ((view instanceof TextView) && !(view instanceof EditText))
        {
            view = ((TextView)view).getText();
            if (!TextUtils.isEmpty(view))
            {
                cah1.b(view.toString());
                return new cal(1, 0);
            } else
            {
                return new cal(0, 0);
            }
        }
        if ((view instanceof WebView) && !(view instanceof ckw))
        {
            cah1.b();
            view = (WebView)view;
            if (!cnv.a(19))
            {
                l = 0;
            } else
            {
                cah1.b();
                view.post(new Runnable(cah1, view) {

                    final cah a;
                    final WebView b;
                    final cak c;
                    private ValueCallback d;

                    public final void run()
                    {
                        if (!b.getSettings().getJavaScriptEnabled())
                        {
                            break MISSING_BLOCK_LABEL_26;
                        }
                        b.evaluateJavascript("(function() { return  {text:document.body.innerText}})();", d);
                        return;
                        Throwable throwable;
                        throwable;
                        d.onReceiveValue("");
                        return;
                    }

            
            {
                c = cak.this;
                a = cah1;
                b = webview;
                super();
                d = new _cls1(this);
            }
                });
                l = 1;
            }
            if (l != 0)
            {
                return new cal(0, 1);
            } else
            {
                return new cal(0, 0);
            }
        }
        if (view instanceof ViewGroup)
        {
            view = (ViewGroup)view;
            int i1 = 0;
            int j1 = 0;
            for (; l < view.getChildCount(); l++)
            {
                cal cal1 = a(view.getChildAt(l), cah1);
                j1 += cal1.a;
                i1 += cal1.b;
            }

            return new cal(j1, i1);
        } else
        {
            return new cal(0, 0);
        }
    }

    public final void a()
    {
label0:
        {
            synchronized (b)
            {
                if (!i)
                {
                    break label0;
                }
                bka.a("Content hash thread already started, quiting...");
            }
            return;
        }
        i = true;
        obj;
        JVM INSTR monitorexit ;
        start();
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final void run()
    {
_L5:
        if (!b()) goto _L2; else goto _L1
_L1:
        Activity activity = j.a;
        if (activity != null) goto _L4; else goto _L3
_L3:
        Throwable throwable;
        bka.a("ContentFetchThread: no activity");
          goto _L5
_L14:
        obj = b;
        obj;
        JVM INSTR monitorenter ;
_L7:
        boolean flag = a;
        Exception exception1;
        if (!flag)
        {
            break; /* Loop/switch isn't completed */
        }
        Object obj1;
        try
        {
            bka.a("ContentFetchTask: waiting");
            b.wait();
        }
        catch (InterruptedException interruptedexception) { }
        finally { }
        if (true) goto _L7; else goto _L6
_L4:
        if (activity == null) goto _L9; else goto _L8
_L8:
        obj1 = null;
        obj = obj1;
        if (activity.getWindow() == null) goto _L11; else goto _L10
_L10:
        obj = obj1;
        if (activity.getWindow().getDecorView() != null)
        {
            obj = activity.getWindow().getDecorView().findViewById(0x1020002);
        }
_L11:
        if (obj == null || obj == null) goto _L9; else goto _L12
_L12:
        ((View) (obj)).post(new Runnable(((View) (obj))) {

            private View a;
            private cak b;

            public final void run()
            {
                cak cak1;
                Object obj2;
                cak1 = b;
                obj2 = a;
                cah cah1;
                cah1 = new cah(cak1.e, cak1.f, cak1.g, cak1.h);
                obj2 = cak1.a(((View) (obj2)), cah1);
                cah1.c();
                if (((cal) (obj2)).a == 0 && ((cal) (obj2)).b == 0)
                {
                    return;
                }
                cai cai1;
                if (((cal) (obj2)).b == 0 && cah1.b == 0 || ((cal) (obj2)).b == 0 && cak1.c.a(cah1))
                {
                    break MISSING_BLOCK_LABEL_219;
                }
                cai1 = cak1.c;
                synchronized (cai1.a)
                {
                    if (cai1.c.size() >= 10)
                    {
                        bka.a((new StringBuilder("Queue is full, current size = ")).append(cai1.c.size()).toString());
                        cai1.c.remove(0);
                    }
                    int l = cai1.b;
                    cai1.b = l + 1;
                    cah1.c = l;
                    cai1.c.add(cah1);
                }
                return;
                exception2;
                obj3;
                JVM INSTR monitorexit ;
                try
                {
                    throw exception2;
                }
                catch (Exception exception3)
                {
                    bka.b("Exception in fetchContentOnUIThread", exception3);
                    cak1.d.a(exception3, true);
                }
            }

            
            {
                b = cak.this;
                a = view;
                super();
            }
        });
_L9:
        Thread.sleep(k * 1000);
        continue; /* Loop/switch isn't completed */
_L2:
        bka.a("ContentFetchTask: sleeping");
        synchronized (b)
        {
            a = true;
            bka.a((new StringBuilder("ContentFetchThread: paused, mPause = ")).append(a).toString());
        }
        if (true) goto _L9; else goto _L13
_L13:
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
            bka.b("Error in ContentFetchTask", throwable);
            d.a(throwable, true);
        }
        if (true) goto _L14; else goto _L6
_L6:
        obj;
        JVM INSTR monitorexit ;
          goto _L5
        obj;
        JVM INSTR monitorexit ;
        throw exception1;
    }

    // Unreferenced inner class cak$2$1

/* anonymous class */
    final class _cls1
        implements ValueCallback
    {

        private _cls2 a;

        public final void onReceiveValue(Object obj)
        {
            cah cah1;
            WebView webview;
            String s;
            s = (String)obj;
            obj = a.c;
            cah1 = a.a;
            webview = a.b;
            synchronized (cah1.a)
            {
                cah1.d = cah1.d - 1;
            }
            if (!TextUtils.isEmpty(s))
            {
                obj1 = (new JSONObject(s)).optString("text");
                if (TextUtils.isEmpty(webview.getTitle()))
                {
                    break MISSING_BLOCK_LABEL_140;
                }
                cah1.a((new StringBuilder()).append(webview.getTitle()).append("\n").append(((String) (obj1))).toString());
            }
_L1:
            if (cah1.a())
            {
                ((cak) (obj)).c.b(cah1);
            }
            return;
            obj;
            obj1;
            JVM INSTR monitorexit ;
            throw obj;
            try
            {
                cah1.a(((String) (obj1)));
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                bka.a("Json string may be malformed.");
                return;
            }
            catch (Throwable throwable)
            {
                bka.a("Failed to get webview content.", throwable);
                ((cak) (obj)).d.a(throwable, true);
                return;
            }
              goto _L1
        }

            
            {
                a = _pcls2;
                super();
            }
    }

}
