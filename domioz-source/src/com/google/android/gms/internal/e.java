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
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.google.android.gms.internal:
//            i, b, fl, is, 
//            g, d, c, fj, 
//            ef, f

public final class e extends Thread
{

    private boolean a;
    private boolean b;
    private final Object c;
    private final d d;
    private final c e;
    private final ef f;
    private final int g;
    private final int h;
    private final int i;
    private final int j;
    private final int k;

    private i a(View view, b b1)
    {
        int i1 = 0;
        if (view == null)
        {
            return new i(this, 0, 0);
        }
        if ((view instanceof TextView) && !(view instanceof EditText))
        {
            view = ((TextView)view).getText();
            if (!TextUtils.isEmpty(view))
            {
                b1.b(view.toString());
                return new i(this, 1, 0);
            } else
            {
                return new i(this, 0, 0);
            }
        }
        if ((view instanceof WebView) && !(view instanceof fl))
        {
            b1.d();
            view = (WebView)view;
            if (!is.d())
            {
                i1 = 0;
            } else
            {
                b1.d();
                view.post(new g(this, b1, view));
                i1 = 1;
            }
            if (i1 != 0)
            {
                return new i(this, 0, 1);
            } else
            {
                return new i(this, 0, 0);
            }
        }
        if (view instanceof ViewGroup)
        {
            view = (ViewGroup)view;
            int j1 = 0;
            int k1 = 0;
            for (; i1 < view.getChildCount(); i1++)
            {
                i l = a(view.getChildAt(i1), b1);
                k1 += l.a;
                j1 += l.b;
            }

            return new i(this, k1, j1);
        } else
        {
            return new i(this, 0, 0);
        }
    }

    private boolean a()
    {
        boolean flag;
        Object obj;
        KeyguardManager keyguardmanager;
        Object obj1;
        android.app.ActivityManager.RunningAppProcessInfo runningappprocessinfo;
        try
        {
            obj = d.b();
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
        if (runningappprocessinfo.importance != 100 || keyguardmanager.inKeyguardRestrictedInputMode()) goto _L4; else goto _L7
_L7:
        obj = (PowerManager)((Context) (obj)).getSystemService("power");
        if (obj != null) goto _L9; else goto _L8
_L8:
        flag = false;
          goto _L10
_L9:
        flag = ((PowerManager) (obj)).isScreenOn();
          goto _L10
_L4:
        return false;
_L1:
        return false;
_L10:
        if (!flag) goto _L4; else goto _L11
_L11:
        return true;
    }

    final void a(View view)
    {
        b b1;
        b1 = new b(h, i, j, k);
        view = a(view, b1);
        b1.e();
        if (((i) (view)).a == 0 && ((i) (view)).b == 0)
        {
            return;
        }
        try
        {
            if ((((i) (view)).b != 0 || b1.f() != 0) && (((i) (view)).b != 0 || !e.a(b1)))
            {
                e.c(b1);
                return;
            }
        }
        // Misplaced declaration of an exception variable
        catch (View view)
        {
            fj.b("Exception in fetchContentOnUIThread", view);
            f.a(view);
        }
        return;
    }

    final void a(b b1, WebView webview, String s)
    {
        b1.c();
        if (!TextUtils.isEmpty(s))
        {
            s = (new JSONObject(s)).optString("text");
            if (TextUtils.isEmpty(webview.getTitle()))
            {
                break MISSING_BLOCK_LABEL_82;
            }
            b1.a((new StringBuilder()).append(webview.getTitle()).append("\n").append(s).toString());
        }
_L2:
        if (b1.a())
        {
            e.b(b1);
            return;
        }
        break MISSING_BLOCK_LABEL_112;
        b1.a(s);
        if (true) goto _L2; else goto _L1
_L1:
        b1;
        fj.a("Json string may be malformed.");
        return;
        b1;
        fj.a("Failed to get webview content.", b1);
        f.a(b1);
    }

    public final void run()
    {
_L15:
        if (b)
        {
            break; /* Loop/switch isn't completed */
        }
        if (!a()) goto _L2; else goto _L1
_L1:
        Activity activity = d.a();
        if (activity != null) goto _L4; else goto _L3
_L3:
        Throwable throwable;
        fj.a("ContentFetchThread: no activity");
        continue; /* Loop/switch isn't completed */
_L13:
        obj = c;
        obj;
        JVM INSTR monitorenter ;
_L6:
        boolean flag = a;
        Exception exception1;
        if (!flag)
        {
            break; /* Loop/switch isn't completed */
        }
        Object obj1;
        try
        {
            fj.a("ContentFetchTask: waiting");
            c.wait();
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
        ((View) (obj)).post(new f(this, ((View) (obj))));
_L8:
        Thread.sleep(g * 1000);
        continue; /* Loop/switch isn't completed */
_L2:
        fj.a("ContentFetchTask: sleeping");
        synchronized (c)
        {
            a = true;
            fj.a((new StringBuilder("ContentFetchThread: paused, mPause = ")).append(a).toString());
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
            fj.b("Error in ContentFetchTask", throwable);
            f.a(throwable);
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
