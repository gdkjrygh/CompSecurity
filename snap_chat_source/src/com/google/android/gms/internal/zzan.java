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
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.google.android.gms.internal:
//            zzca, zzbx, zzam, zzhx, 
//            zzgh, zzak, zzic, zzal, 
//            zzme

public class zzan extends Thread
{
    class zza
    {

        final zzan zzos;
        final int zzox;
        final int zzoy;

        zza(int i, int j)
        {
            zzos = zzan.this;
            super();
            zzox = i;
            zzoy = j;
        }
    }


    private boolean mStarted;
    private final int zznW;
    private final int zznY;
    private final Object zznh = new Object();
    private boolean zzoj;
    private boolean zzok;
    private final zzam zzol;
    private final zzal zzom;
    private final zzgh zzon;
    private final int zzoo;
    private final int zzop;
    private final int zzoq;

    public zzan(zzam zzam1, zzal zzal1, zzgh zzgh1)
    {
        mStarted = false;
        zzoj = false;
        zzok = false;
        zzol = zzam1;
        zzom = zzal1;
        zzon = zzgh1;
        zznW = ((Integer)zzca.zzqC.get()).intValue();
        zzop = ((Integer)zzca.zzqD.get()).intValue();
        zznY = ((Integer)zzca.zzqE.get()).intValue();
        zzoq = ((Integer)zzca.zzqF.get()).intValue();
        zzoo = ((Integer)zzca.zzqG.get()).intValue();
        setName("ContentFetchTask");
    }

    public void run()
    {
_L11:
        if (zzok)
        {
            break; /* Loop/switch isn't completed */
        }
        if (!zzbu()) goto _L2; else goto _L1
_L1:
        Object obj = zzol.getActivity();
        if (obj != null) goto _L4; else goto _L3
_L3:
        try
        {
            zzhx.zzY("ContentFetchThread: no activity");
            continue; /* Loop/switch isn't completed */
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            zzhx.zzb("Error in ContentFetchTask", ((Throwable) (obj)));
            zzon.zzb(((Throwable) (obj)));
        }
_L8:
        obj = zznh;
        obj;
        JVM INSTR monitorenter ;
_L7:
        boolean flag = zzoj;
        if (!flag) goto _L6; else goto _L5
_L5:
        Exception exception;
        try
        {
            zzhx.zzY("ContentFetchTask: waiting");
            zznh.wait();
        }
        catch (InterruptedException interruptedexception) { }
        finally { }
        if (true) goto _L7; else goto _L6
_L4:
        zza(((Activity) (obj)));
_L9:
        Thread.sleep(zzoo * 1000);
          goto _L8
_L2:
        zzhx.zzY("ContentFetchTask: sleeping");
        zzbw();
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
        synchronized (zznh)
        {
            zzoj = false;
            zznh.notifyAll();
            zzhx.zzY("ContentFetchThread: wakeup");
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    zza zza(View view, zzak zzak1)
    {
        int i = 0;
        if (view == null)
        {
            return new zza(0, 0);
        }
        if ((view instanceof TextView) && !(view instanceof EditText))
        {
            view = ((TextView)view).getText();
            if (!TextUtils.isEmpty(view))
            {
                zzak1.zzi(view.toString());
                return new zza(1, 0);
            } else
            {
                return new zza(0, 0);
            }
        }
        if ((view instanceof WebView) && !(view instanceof zzic))
        {
            zzak1.zzbp();
            if (zza((WebView)view, zzak1))
            {
                return new zza(0, 1);
            } else
            {
                return new zza(0, 0);
            }
        }
        if (view instanceof ViewGroup)
        {
            view = (ViewGroup)view;
            int j = 0;
            int k = 0;
            for (; i < view.getChildCount(); i++)
            {
                zza zza1 = zza(view.getChildAt(i), zzak1);
                k += zza1.zzox;
                j += zza1.zzoy;
            }

            return new zza(k, j);
        } else
        {
            return new zza(0, 0);
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

    void zza(zzak zzak1, WebView webview, String s)
    {
        zzak1.zzbo();
        if (!TextUtils.isEmpty(s))
        {
            s = (new JSONObject(s)).optString("text");
            if (TextUtils.isEmpty(webview.getTitle()))
            {
                break MISSING_BLOCK_LABEL_83;
            }
            zzak1.zzh((new StringBuilder()).append(webview.getTitle()).append("\n").append(s).toString());
        }
_L2:
        if (zzak1.zzbl())
        {
            zzom.zzb(zzak1);
            return;
        }
        break MISSING_BLOCK_LABEL_115;
        zzak1.zzh(s);
        if (true) goto _L2; else goto _L1
_L1:
        zzak1;
        zzhx.zzY("Json string may be malformed.");
        return;
        zzak1;
        zzhx.zza("Failed to get webview content.", zzak1);
        zzon.zzb(zzak1);
    }

    boolean zza(WebView webview, zzak zzak1)
    {
        if (!zzme.zzkj())
        {
            return false;
        } else
        {
            zzak1.zzbp();
            webview.post(new Runnable(zzak1, webview) {

                final zzan zzos;
                ValueCallback zzot;
                final zzak zzou;
                final WebView zzov;

                public void run()
                {
                    if (!zzov.getSettings().getJavaScriptEnabled())
                    {
                        break MISSING_BLOCK_LABEL_26;
                    }
                    zzov.evaluateJavascript("(function() { return  {text:document.body.innerText}})();", zzot);
                    return;
                    Throwable throwable;
                    throwable;
                    zzot.onReceiveValue("");
                    return;
                }

            
            {
                zzos = zzan.this;
                zzou = zzak1;
                zzov = webview;
                super();
                zzot = new _cls1(this);
            }
            });
            return true;
        }
    }

    public void zzbt()
    {
label0:
        {
            synchronized (zznh)
            {
                if (!mStarted)
                {
                    break label0;
                }
                zzhx.zzY("Content hash thread already started, quiting...");
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

    boolean zzbu()
    {
        Context context;
        KeyguardManager keyguardmanager;
        Object obj;
        android.app.ActivityManager.RunningAppProcessInfo runningappprocessinfo;
        boolean flag;
        try
        {
            context = zzol.getContext();
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
            break MISSING_BLOCK_LABEL_132;
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
                break MISSING_BLOCK_LABEL_127;
            }
            runningappprocessinfo = (android.app.ActivityManager.RunningAppProcessInfo)((Iterator) (obj)).next();
        } while (Process.myPid() != runningappprocessinfo.pid);
        if (runningappprocessinfo.importance != 100 || keyguardmanager.inKeyguardRestrictedInputMode())
        {
            break MISSING_BLOCK_LABEL_127;
        }
        flag = zzk(context);
        if (flag)
        {
            return true;
        }
        return false;
        return false;
    }

    public zzak zzbv()
    {
        return zzom.zzbs();
    }

    public void zzbw()
    {
        synchronized (zznh)
        {
            zzoj = true;
            zzhx.zzY((new StringBuilder("ContentFetchThread: paused, mPause = ")).append(zzoj).toString());
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public boolean zzbx()
    {
        return zzoj;
    }

    boolean zzf(View view)
    {
        if (view == null)
        {
            return false;
        } else
        {
            view.post(new Runnable(view) {

                final View zzor;
                final zzan zzos;

                public void run()
                {
                    zzos.zzg(zzor);
                }

            
            {
                zzos = zzan.this;
                zzor = view;
                super();
            }
            });
            return true;
        }
    }

    void zzg(View view)
    {
        zzak zzak1;
        zzak1 = new zzak(zznW, zzop, zznY, zzoq);
        view = zza(view, zzak1);
        zzak1.zzbq();
        if (((zza) (view)).zzox == 0 && ((zza) (view)).zzoy == 0)
        {
            return;
        }
        try
        {
            if ((((zza) (view)).zzoy != 0 || zzak1.zzbr() != 0) && (((zza) (view)).zzoy != 0 || !zzom.zza(zzak1)))
            {
                zzom.zzc(zzak1);
                return;
            }
        }
        // Misplaced declaration of an exception variable
        catch (View view)
        {
            zzhx.zzb("Exception in fetchContentOnUIThread", view);
            zzon.zzb(view);
        }
        return;
    }

    boolean zzk(Context context)
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

    // Unreferenced inner class com/google/android/gms/internal/zzan$2$1

/* anonymous class */
    class _cls1
        implements ValueCallback
    {

        final _cls2 zzow;

        public void onReceiveValue(Object obj)
        {
            zzk((String)obj);
        }

        public void zzk(String s)
        {
            zzow.zzos.zza(zzow.zzou, zzow.zzov, s);
        }

            
            {
                zzow = _pcls2;
                super();
            }
    }

}
