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
import com.google.android.gms.ads.internal.util.client.b;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.google.android.gms.internal:
//            j, h, cw, el, 
//            cc, i

public final class k extends Thread
{
    final class a
    {

        final int a;
        final int b;
        final k c;

        a(int l, int i1)
        {
            c = k.this;
            super();
            a = l;
            b = i1;
        }
    }


    final i a;
    final cc b;
    final int c;
    final int d;
    final int e;
    final int f;
    private boolean g;
    private boolean h;
    private final Object i;
    private final j j;
    private final int k;

    private boolean a()
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

    final a a(View view, h h1)
    {
        int l = 0;
        if (view == null)
        {
            return new a(0, 0);
        }
        if ((view instanceof TextView) && !(view instanceof EditText))
        {
            view = ((TextView)view).getText();
            if (!TextUtils.isEmpty(view))
            {
                h1.b(view.toString());
                return new a(1, 0);
            } else
            {
                return new a(0, 0);
            }
        }
        if ((view instanceof WebView) && !(view instanceof cw))
        {
            h1.b();
            view = (WebView)view;
            if (!el.a(19))
            {
                l = 0;
            } else
            {
                h1.b();
                view.post(new Runnable(h1, view) {

                    ValueCallback a;
                    final h b;
                    final WebView c;
                    final k d;

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
                d = k.this;
                b = h1;
                c = webview;
                super();
                a = new _cls1(this);
            }
                });
                l = 1;
            }
            if (l != 0)
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
            int i1 = 0;
            int j1 = 0;
            for (; l < view.getChildCount(); l++)
            {
                a a1 = a(view.getChildAt(l), h1);
                j1 += a1.a;
                i1 += a1.b;
            }

            return new a(j1, i1);
        } else
        {
            return new a(0, 0);
        }
    }

    public final void run()
    {
_L15:
        if (h)
        {
            break; /* Loop/switch isn't completed */
        }
        if (!a()) goto _L2; else goto _L1
_L1:
        Activity activity = j.a;
        if (activity != null) goto _L4; else goto _L3
_L3:
        Throwable throwable;
        com.google.android.gms.ads.internal.util.client.b.a("ContentFetchThread: no activity");
        continue; /* Loop/switch isn't completed */
_L13:
        obj = i;
        obj;
        JVM INSTR monitorenter ;
_L6:
        boolean flag = g;
        Exception exception1;
        if (!flag)
        {
            break; /* Loop/switch isn't completed */
        }
        Object obj1;
        try
        {
            com.google.android.gms.ads.internal.util.client.b.a("ContentFetchTask: waiting");
            i.wait();
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
            final k b;

            public final void run()
            {
                k k1;
                Object obj2;
                k1 = b;
                obj2 = a;
                h h1;
                h1 = new h(k1.c, k1.d, k1.e, k1.f);
                obj2 = k1.a(((View) (obj2)), h1);
                h1.c();
                if (((a) (obj2)).a == 0 && ((a) (obj2)).b == 0)
                {
                    return;
                }
                i l;
                if (((a) (obj2)).b == 0 && h1.b == 0 || ((a) (obj2)).b == 0 && k1.a.a(h1))
                {
                    break MISSING_BLOCK_LABEL_219;
                }
                l = k1.a;
                synchronized (l.a)
                {
                    if (l.c.size() >= 10)
                    {
                        com.google.android.gms.ads.internal.util.client.b.a((new StringBuilder("Queue is full, current size = ")).append(l.c.size()).toString());
                        l.c.remove(0);
                    }
                    int i1 = l.b;
                    l.b = i1 + 1;
                    h1.c = i1;
                    l.c.add(h1);
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
                    com.google.android.gms.ads.internal.util.client.b.b("Exception in fetchContentOnUIThread", exception3);
                    k1.b.a(exception3, true);
                }
            }

            
            {
                b = k.this;
                a = view;
                super();
            }
        });
_L8:
        Thread.sleep(k * 1000);
        continue; /* Loop/switch isn't completed */
_L2:
        com.google.android.gms.ads.internal.util.client.b.a("ContentFetchTask: sleeping");
        synchronized (i)
        {
            g = true;
            com.google.android.gms.ads.internal.util.client.b.a((new StringBuilder("ContentFetchThread: paused, mPause = ")).append(g).toString());
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
            com.google.android.gms.ads.internal.util.client.b.b("Error in ContentFetchTask", throwable);
            b.a(throwable, true);
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

    // Unreferenced inner class com/google/android/gms/internal/k$2$1

/* anonymous class */
    final class _cls1
        implements ValueCallback
    {

        final _cls2 a;

        public final void onReceiveValue(Object obj)
        {
            h h1;
            WebView webview;
            String s;
            s = (String)obj;
            obj = a.d;
            h1 = a.b;
            webview = a.c;
            synchronized (h1.a)
            {
                h1.d = h1.d - 1;
            }
            if (!TextUtils.isEmpty(s))
            {
                obj1 = (new JSONObject(s)).optString("text");
                if (TextUtils.isEmpty(webview.getTitle()))
                {
                    break MISSING_BLOCK_LABEL_140;
                }
                h1.a((new StringBuilder()).append(webview.getTitle()).append("\n").append(((String) (obj1))).toString());
            }
_L1:
            if (h1.a())
            {
                ((k) (obj)).a.b(h1);
            }
            return;
            obj;
            obj1;
            JVM INSTR monitorexit ;
            throw obj;
            try
            {
                h1.a(((String) (obj1)));
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                com.google.android.gms.ads.internal.util.client.b.a("Json string may be malformed.");
                return;
            }
            catch (Throwable throwable)
            {
                com.google.android.gms.ads.internal.util.client.b.a("Failed to get webview content.", throwable);
                ((k) (obj)).b.a(throwable, true);
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
