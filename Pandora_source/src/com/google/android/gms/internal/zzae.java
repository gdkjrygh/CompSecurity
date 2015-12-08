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
import com.google.android.gms.ads.internal.util.client.zzb;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.google.android.gms.internal:
//            zzat, zzap, zzad, zzen, 
//            zzab, zzgd, zzac, zzic

public class zzae extends Thread
{
    class a
    {

        final int a;
        final int b;
        final zzae c;

        a(int i, int j)
        {
            c = zzae.this;
            super();
            a = i;
            b = j;
        }
    }


    private boolean mStarted;
    private final int zzoT;
    private final int zzoV;
    private final Object zzoe = new Object();
    private boolean zzpg;
    private boolean zzph;
    private final zzad zzpi;
    private final zzac zzpj;
    private final zzen zzpk;
    private final int zzpl;
    private final int zzpm;
    private final int zzpn;

    public zzae(zzad zzad1, zzac zzac1, zzen zzen1)
    {
        mStarted = false;
        zzpg = false;
        zzph = false;
        zzpi = zzad1;
        zzpj = zzac1;
        zzpk = zzen1;
        zzoT = ((Integer)zzat.zzrH.get()).intValue();
        zzpm = ((Integer)zzat.zzrI.get()).intValue();
        zzoV = ((Integer)zzat.zzrJ.get()).intValue();
        zzpn = ((Integer)zzat.zzrK.get()).intValue();
        zzpl = ((Integer)zzat.zzrL.get()).intValue();
        setName("ContentFetchTask");
    }

    public void run()
    {
_L11:
        if (zzph)
        {
            break; /* Loop/switch isn't completed */
        }
        if (!zzbA()) goto _L2; else goto _L1
_L1:
        Object obj = zzpi.getActivity();
        if (obj != null) goto _L4; else goto _L3
_L3:
        try
        {
            zzb.zzaj("ContentFetchThread: no activity");
            continue; /* Loop/switch isn't completed */
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            zzb.zzb("Error in ContentFetchTask", ((Throwable) (obj)));
            zzpk.zza(((Throwable) (obj)), true);
        }
_L8:
        obj = zzoe;
        obj;
        JVM INSTR monitorenter ;
_L7:
        boolean flag = zzpg;
        if (!flag) goto _L6; else goto _L5
_L5:
        Exception exception;
        try
        {
            zzb.zzaj("ContentFetchTask: waiting");
            zzoe.wait();
        }
        catch (InterruptedException interruptedexception) { }
        finally { }
        if (true) goto _L7; else goto _L6
_L4:
        zza(((Activity) (obj)));
_L9:
        Thread.sleep(zzpl * 1000);
          goto _L8
_L2:
        zzb.zzaj("ContentFetchTask: sleeping");
        zzbC();
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
        synchronized (zzoe)
        {
            zzpg = false;
            zzoe.notifyAll();
            zzb.zzaj("ContentFetchThread: wakeup");
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    a zza(View view, zzab zzab1)
    {
        int i = 0;
        if (view == null)
        {
            return new a(0, 0);
        }
        if ((view instanceof TextView) && !(view instanceof EditText))
        {
            view = ((TextView)view).getText();
            if (!TextUtils.isEmpty(view))
            {
                zzab1.zzk(view.toString());
                return new a(1, 0);
            } else
            {
                return new a(0, 0);
            }
        }
        if ((view instanceof WebView) && !(view instanceof zzgd))
        {
            zzab1.zzbv();
            if (zza((WebView)view, zzab1))
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
                a a1 = zza(view.getChildAt(i), zzab1);
                k += a1.a;
                j += a1.b;
            }

            return new a(k, j);
        } else
        {
            return new a(0, 0);
        }
    }

    void zza(Activity activity)
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
                zzf(view);
                return;
            }
        }
    }

    void zza(zzab zzab1, WebView webview, String s)
    {
        zzab1.zzbu();
        if (!TextUtils.isEmpty(s))
        {
            s = (new JSONObject(s)).optString("text");
            if (TextUtils.isEmpty(webview.getTitle()))
            {
                break MISSING_BLOCK_LABEL_83;
            }
            zzab1.zzj((new StringBuilder()).append(webview.getTitle()).append("\n").append(s).toString());
        }
_L2:
        if (zzab1.zzbr())
        {
            zzpj.zzb(zzab1);
            return;
        }
        break MISSING_BLOCK_LABEL_116;
        zzab1.zzj(s);
        if (true) goto _L2; else goto _L1
_L1:
        zzab1;
        zzb.zzaj("Json string may be malformed.");
        return;
        zzab1;
        zzb.zza("Failed to get webview content.", zzab1);
        zzpk.zza(zzab1, true);
    }

    boolean zza(android.app.ActivityManager.RunningAppProcessInfo runningappprocessinfo)
    {
        return runningappprocessinfo.importance == 100;
    }

    boolean zza(WebView webview, zzab zzab1)
    {
        if (!zzic.zznk())
        {
            return false;
        } else
        {
            zzab1.zzbv();
            webview.post(new Runnable(zzab1, webview) {

                ValueCallback a;
                final zzab b;
                final WebView c;
                final zzae d;

                public void run()
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
                d = zzae.this;
                b = zzab1;
                c = webview;
                super();
                a = new _cls1(this);
            }
            });
            return true;
        }
    }

    boolean zzbA()
    {
        Context context;
        KeyguardManager keyguardmanager;
        Object obj;
        android.app.ActivityManager.RunningAppProcessInfo runningappprocessinfo;
        boolean flag;
        try
        {
            context = zzpi.getContext();
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
            break MISSING_BLOCK_LABEL_131;
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
                break MISSING_BLOCK_LABEL_126;
            }
            runningappprocessinfo = (android.app.ActivityManager.RunningAppProcessInfo)((Iterator) (obj)).next();
        } while (Process.myPid() != runningappprocessinfo.pid);
        if (!zza(runningappprocessinfo) || keyguardmanager.inKeyguardRestrictedInputMode())
        {
            break MISSING_BLOCK_LABEL_126;
        }
        flag = zzm(context);
        if (flag)
        {
            return true;
        }
        return false;
        return false;
    }

    public zzab zzbB()
    {
        return zzpj.zzby();
    }

    public void zzbC()
    {
        synchronized (zzoe)
        {
            zzpg = true;
            zzb.zzaj((new StringBuilder()).append("ContentFetchThread: paused, mPause = ").append(zzpg).toString());
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public boolean zzbD()
    {
        return zzpg;
    }

    public void zzbz()
    {
label0:
        {
            synchronized (zzoe)
            {
                if (!mStarted)
                {
                    break label0;
                }
                zzb.zzaj("Content hash thread already started, quiting...");
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

    boolean zzf(View view)
    {
        if (view == null)
        {
            return false;
        } else
        {
            view.post(new Runnable(view) {

                final View a;
                final zzae b;

                public void run()
                {
                    b.zzg(a);
                }

            
            {
                b = zzae.this;
                a = view;
                super();
            }
            });
            return true;
        }
    }

    void zzg(View view)
    {
        zzab zzab1;
        zzab1 = new zzab(zzoT, zzpm, zzoV, zzpn);
        view = zza(view, zzab1);
        zzab1.zzbw();
        if (((a) (view)).a == 0 && ((a) (view)).b == 0)
        {
            return;
        }
        try
        {
            if ((((a) (view)).b != 0 || zzab1.zzbx() != 0) && (((a) (view)).b != 0 || !zzpj.zza(zzab1)))
            {
                zzpj.zzc(zzab1);
                return;
            }
        }
        // Misplaced declaration of an exception variable
        catch (View view)
        {
            zzb.zzb("Exception in fetchContentOnUIThread", view);
            zzpk.zza(view, true);
        }
        return;
    }

    boolean zzm(Context context)
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

    // Unreferenced inner class com/google/android/gms/internal/zzae$2$1

/* anonymous class */
    class _cls1
        implements ValueCallback
    {

        final _cls2 a;

        public void a(String s)
        {
            a.d.zza(a.b, a.c, s);
        }

        public void onReceiveValue(Object obj)
        {
            a((String)obj);
        }

            
            {
                a = _pcls2;
                super();
            }
    }

}
