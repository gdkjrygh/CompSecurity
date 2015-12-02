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
import android.webkit.WebView;
import android.widget.EditText;
import android.widget.TextView;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

public final class aav extends Thread
{

    private boolean a;
    private boolean b;
    private boolean c;
    private final Object d = new Object();
    private final aau e;
    private final aat f;
    private final ahm g;
    private final int h;
    private final int i;
    private final int j;
    private final int k;
    private final int l;

    public aav(aau aau1, aat aat1, ahm ahm1)
    {
        a = false;
        b = false;
        c = false;
        e = aau1;
        f = aat1;
        g = ahm1;
        i = ((Integer)abn.B.c()).intValue();
        j = ((Integer)abn.C.c()).intValue();
        k = ((Integer)abn.D.c()).intValue();
        l = ((Integer)abn.E.c()).intValue();
        h = ((Integer)abn.F.c()).intValue();
        setName("ContentFetchTask");
    }

    private aaw a(View view, aas aas1)
    {
        int i1 = 0;
        if (view == null)
        {
            return new aaw(this, 0, 0);
        }
        if ((view instanceof TextView) && !(view instanceof EditText))
        {
            view = ((TextView)view).getText();
            if (!TextUtils.isEmpty(view))
            {
                aas1.b(view.toString());
                return new aaw(this, 1, 0);
            } else
            {
                return new aaw(this, 0, 0);
            }
        }
        if ((view instanceof WebView) && !(view instanceof akk))
        {
            aas1.e();
            if (a((WebView)view, aas1))
            {
                return new aaw(this, 0, 1);
            } else
            {
                return new aaw(this, 0, 0);
            }
        }
        if (view instanceof ViewGroup)
        {
            view = (ViewGroup)view;
            int j1 = 0;
            int k1 = 0;
            for (; i1 < view.getChildCount(); i1++)
            {
                aaw aaw1 = a(view.getChildAt(i1), aas1);
                k1 += aaw1.a;
                j1 += aaw1.b;
            }

            return new aaw(this, k1, j1);
        } else
        {
            return new aaw(this, 0, 0);
        }
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
                b(view);
                return;
            }
        }
    }

    private static boolean a(android.app.ActivityManager.RunningAppProcessInfo runningappprocessinfo)
    {
        return runningappprocessinfo.importance == 100;
    }

    private static boolean a(Context context)
    {
        context = (PowerManager)context.getSystemService("power");
        if (context == null)
        {
            return false;
        } else
        {
            return context.isScreenOn();
        }
    }

    private boolean a(WebView webview, aas aas1)
    {
        if (!alv.f())
        {
            return false;
        } else
        {
            aas1.e();
            webview.post(new _cls2(aas1, webview));
            return true;
        }
    }

    private boolean b(View view)
    {
        if (view == null)
        {
            return false;
        } else
        {
            view.post(new _cls1(view));
            return true;
        }
    }

    private boolean e()
    {
        Context context;
        KeyguardManager keyguardmanager;
        Object obj;
        android.app.ActivityManager.RunningAppProcessInfo runningappprocessinfo;
        boolean flag;
        try
        {
            context = e.b();
        }
        catch (Throwable throwable)
        {
            return false;
        }
        if (context == null)
        {
            return false;
        }
        obj = (ActivityManager)context.getSystemService("activity");
        keyguardmanager = (KeyguardManager)context.getSystemService("keyguard");
        if (obj == null || keyguardmanager == null)
        {
            break MISSING_BLOCK_LABEL_127;
        }
        obj = ((ActivityManager) (obj)).getRunningAppProcesses();
        if (obj == null)
        {
            return false;
        }
        obj = ((List) (obj)).iterator();
        do
        {
            if (!((Iterator) (obj)).hasNext())
            {
                break MISSING_BLOCK_LABEL_122;
            }
            runningappprocessinfo = (android.app.ActivityManager.RunningAppProcessInfo)((Iterator) (obj)).next();
        } while (Process.myPid() != runningappprocessinfo.pid);
        if (!a(runningappprocessinfo) || keyguardmanager.inKeyguardRestrictedInputMode())
        {
            break MISSING_BLOCK_LABEL_122;
        }
        flag = a(context);
        if (flag)
        {
            return true;
        }
        return false;
        return false;
    }

    private void f()
    {
        synchronized (d)
        {
            b = true;
            of.a((new StringBuilder("ContentFetchThread: paused, mPause = ")).append(b).toString());
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
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
                of.a("Content hash thread already started, quiting...");
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

    final void a(aas aas1, WebView webview, String s)
    {
        aas1.d();
        if (!TextUtils.isEmpty(s))
        {
            s = (new JSONObject(s)).optString("text");
            if (TextUtils.isEmpty(webview.getTitle()))
            {
                break MISSING_BLOCK_LABEL_84;
            }
            aas1.a((new StringBuilder()).append(webview.getTitle()).append("\n").append(s).toString());
        }
_L2:
        if (aas1.a())
        {
            f.b(aas1);
            return;
        }
        break MISSING_BLOCK_LABEL_117;
        aas1.a(s);
        if (true) goto _L2; else goto _L1
_L1:
        aas1;
        of.a("Json string may be malformed.");
        return;
        aas1;
        of.a("Failed to get webview content.", aas1);
        g.a(aas1, true);
    }

    final void a(View view)
    {
        aas aas1;
        aas1 = new aas(i, j, k, l);
        view = a(view, aas1);
        aas1.f();
        if (((aaw) (view)).a == 0 && ((aaw) (view)).b == 0)
        {
            return;
        }
        try
        {
            if ((((aaw) (view)).b != 0 || aas1.h() != 0) && (((aaw) (view)).b != 0 || !f.a(aas1)))
            {
                f.c(aas1);
                return;
            }
        }
        // Misplaced declaration of an exception variable
        catch (View view)
        {
            of.b("Exception in fetchContentOnUIThread", view);
            g.a(view, true);
        }
        return;
    }

    public final aas b()
    {
        return f.a();
    }

    public final void c()
    {
        synchronized (d)
        {
            b = false;
            d.notifyAll();
            of.a("ContentFetchThread: wakeup");
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
_L11:
        if (c)
        {
            break; /* Loop/switch isn't completed */
        }
        if (!e()) goto _L2; else goto _L1
_L1:
        Object obj = e.a();
        if (obj != null) goto _L4; else goto _L3
_L3:
        try
        {
            of.a("ContentFetchThread: no activity");
            continue; /* Loop/switch isn't completed */
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            of.b("Error in ContentFetchTask", ((Throwable) (obj)));
            g.a(((Throwable) (obj)), true);
        }
_L8:
        obj = d;
        obj;
        JVM INSTR monitorenter ;
_L7:
        boolean flag = b;
        if (!flag) goto _L6; else goto _L5
_L5:
        Exception exception;
        try
        {
            of.a("ContentFetchTask: waiting");
            d.wait();
        }
        catch (InterruptedException interruptedexception) { }
        finally { }
        if (true) goto _L7; else goto _L6
_L4:
        a(((Activity) (obj)));
_L9:
        Thread.sleep(h * 1000);
          goto _L8
_L2:
        of.a("ContentFetchTask: sleeping");
        f();
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

    /* member class not found */
    class _cls2 {}


    /* member class not found */
    class _cls1 {}

}
