// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.MutableContextWrapper;
import android.content.res.Resources;
import android.net.Uri;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.MotionEvent;
import android.view.WindowManager;
import android.webkit.DownloadListener;
import android.webkit.WebSettings;
import android.webkit.WebView;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.google.android.gms.internal:
//            ev, eo, er, fa, 
//            fb, eq, ey, ez, 
//            al, eu, k, cf

public class ex extends WebView
    implements DownloadListener
{
    private static class a extends MutableContextWrapper
    {

        private Context lz;
        private Activity sG;

        public Context cf()
        {
            return sG;
        }

        public void setBaseContext(Context context)
        {
            lz = context.getApplicationContext();
            if (context instanceof Activity)
            {
                context = (Activity)context;
            } else
            {
                context = null;
            }
            sG = context;
            super.setBaseContext(lz);
        }

        public void startActivity(Intent intent)
        {
            if (sG != null)
            {
                sG.startActivity(intent);
                return;
            } else
            {
                intent.setFlags(0x10000000);
                lz.startActivity(intent);
                return;
            }
        }

        public a(Context context)
        {
            super(context);
            setBaseContext(context);
        }
    }


    private final WindowManager lC = (WindowManager)getContext().getSystemService("window");
    private final Object ls = new Object();
    private al nF;
    private final ev nG;
    private final k pA;
    private final ey sA;
    private final a sB;
    private cf sC;
    private boolean sD;
    private boolean sE;
    private boolean sF;

    private ex(a a1, al al1, boolean flag, boolean flag1, k k1, ev ev1)
    {
        super(a1);
        sB = a1;
        nF = al1;
        sD = flag;
        pA = k1;
        nG = ev1;
        setBackgroundColor(0);
        al1 = getSettings();
        al1.setJavaScriptEnabled(true);
        al1.setSavePassword(false);
        al1.setSupportMultipleWindows(true);
        al1.setJavaScriptCanOpenWindowsAutomatically(true);
        eo.a(a1, ev1.sw, al1);
        if (android.os.Build.VERSION.SDK_INT >= 17)
        {
            er.a(getContext(), al1);
        } else
        if (android.os.Build.VERSION.SDK_INT >= 11)
        {
            eq.a(getContext(), al1);
        }
        setDownloadListener(this);
        if (android.os.Build.VERSION.SDK_INT >= 11)
        {
            sA = new fa(this, flag1);
        } else
        {
            sA = new ey(this, flag1);
        }
        setWebViewClient(sA);
        if (android.os.Build.VERSION.SDK_INT >= 14)
        {
            setWebChromeClient(new fb(this));
        } else
        if (android.os.Build.VERSION.SDK_INT >= 11)
        {
            setWebChromeClient(new ez(this));
        }
        cg();
    }

    public static ex a(Context context, al al1, boolean flag, boolean flag1, k k1, ev ev1)
    {
        return new ex(new a(context), al1, flag, flag1, k1, ev1);
    }

    private void cg()
    {
        Object obj = ls;
        obj;
        JVM INSTR monitorenter ;
        if (!sD && !nF.mf) goto _L2; else goto _L1
_L1:
        if (android.os.Build.VERSION.SDK_INT >= 14) goto _L4; else goto _L3
_L3:
        eu.z("Disabling hardware acceleration on an overlay.");
        ch();
_L5:
        return;
_L4:
        eu.z("Enabling hardware acceleration on an overlay.");
        ci();
          goto _L5
        Exception exception;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
_L2:
label0:
        {
            if (android.os.Build.VERSION.SDK_INT >= 18)
            {
                break label0;
            }
            eu.z("Disabling hardware acceleration on an AdView.");
            ch();
        }
          goto _L5
        eu.z("Enabling hardware acceleration on an AdView.");
        ci();
          goto _L5
    }

    private void ch()
    {
        synchronized (ls)
        {
            if (!sE && android.os.Build.VERSION.SDK_INT >= 11)
            {
                eq.d(this);
            }
            sE = true;
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    private void ci()
    {
        synchronized (ls)
        {
            if (sE && android.os.Build.VERSION.SDK_INT >= 11)
            {
                eq.e(this);
            }
            sE = false;
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    protected void E(String s)
    {
        Object obj = ls;
        obj;
        JVM INSTR monitorenter ;
        if (isDestroyed())
        {
            break MISSING_BLOCK_LABEL_22;
        }
        loadUrl(s);
_L2:
        return;
        eu.D("The webview is destroyed. Ignoring action.");
        if (true) goto _L2; else goto _L1
_L1:
        s;
        obj;
        JVM INSTR monitorexit ;
        throw s;
    }

    public al V()
    {
        al al1;
        synchronized (ls)
        {
            al1 = nF;
        }
        return al1;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void a(Context context, al al1)
    {
        synchronized (ls)
        {
            sB.setBaseContext(context);
            sC = null;
            nF = al1;
            sD = false;
            eo.b(this);
            loadUrl("about:blank");
            sA.reset();
        }
        return;
        context;
        obj;
        JVM INSTR monitorexit ;
        throw context;
    }

    public void a(al al1)
    {
        synchronized (ls)
        {
            nF = al1;
            requestLayout();
        }
        return;
        al1;
        obj;
        JVM INSTR monitorexit ;
        throw al1;
    }

    public void a(cf cf1)
    {
        synchronized (ls)
        {
            sC = cf1;
        }
        return;
        cf1;
        obj;
        JVM INSTR monitorexit ;
        throw cf1;
    }

    public void a(String s, Map map)
    {
        try
        {
            map = eo.o(map);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            eu.D("Could not convert parameters to JSON.");
            return;
        }
        b(s, map);
    }

    public void a(String s, JSONObject jsonobject)
    {
        Object obj = jsonobject;
        if (jsonobject == null)
        {
            obj = new JSONObject();
        }
        jsonobject = ((JSONObject) (obj)).toString();
        obj = new StringBuilder();
        ((StringBuilder) (obj)).append((new StringBuilder()).append("javascript:").append(s).append("(").toString());
        ((StringBuilder) (obj)).append(jsonobject);
        ((StringBuilder) (obj)).append(");");
        E(((StringBuilder) (obj)).toString());
    }

    public void b(String s, JSONObject jsonobject)
    {
        Object obj = jsonobject;
        if (jsonobject == null)
        {
            obj = new JSONObject();
        }
        jsonobject = ((JSONObject) (obj)).toString();
        obj = new StringBuilder();
        ((StringBuilder) (obj)).append("javascript:AFMA_ReceiveMessage('");
        ((StringBuilder) (obj)).append(s);
        ((StringBuilder) (obj)).append("'");
        ((StringBuilder) (obj)).append(",");
        ((StringBuilder) (obj)).append(jsonobject);
        ((StringBuilder) (obj)).append(");");
        eu.C((new StringBuilder()).append("Dispatching AFMA event: ").append(obj).toString());
        E(((StringBuilder) (obj)).toString());
    }

    public void bX()
    {
        if (!cb().cj())
        {
            return;
        }
        DisplayMetrics displaymetrics = new DisplayMetrics();
        Display display = lC.getDefaultDisplay();
        display.getMetrics(displaymetrics);
        int j = eo.p(getContext());
        float f = 160F / (float)displaymetrics.densityDpi;
        int i = (int)((float)displaymetrics.widthPixels * f);
        j = (int)((float)(displaymetrics.heightPixels - j) * f);
        try
        {
            b("onScreenInfoChanged", (new JSONObject()).put("width", i).put("height", j).put("density", displaymetrics.density).put("rotation", display.getRotation()));
            return;
        }
        catch (JSONException jsonexception)
        {
            eu.b("Error occured while obtaining screen information.", jsonexception);
        }
    }

    public void bY()
    {
        HashMap hashmap = new HashMap(1);
        hashmap.put("version", nG.sw);
        a("onhide", hashmap);
    }

    public void bZ()
    {
        HashMap hashmap = new HashMap(1);
        hashmap.put("version", nG.sw);
        a("onshow", hashmap);
    }

    public cf ca()
    {
        cf cf1;
        synchronized (ls)
        {
            cf1 = sC;
        }
        return cf1;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public ey cb()
    {
        return sA;
    }

    public k cc()
    {
        return pA;
    }

    public ev cd()
    {
        return nG;
    }

    public boolean ce()
    {
        boolean flag;
        synchronized (ls)
        {
            flag = sD;
        }
        return flag;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public Context cf()
    {
        return sB.cf();
    }

    public void destroy()
    {
        synchronized (ls)
        {
            super.destroy();
            sF = true;
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public boolean isDestroyed()
    {
        boolean flag;
        synchronized (ls)
        {
            flag = sF;
        }
        return flag;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void onDownloadStart(String s, String s1, String s2, String s3, long l)
    {
        try
        {
            s1 = new Intent("android.intent.action.VIEW");
            s1.setDataAndType(Uri.parse(s), s3);
            getContext().startActivity(s1);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s1)
        {
            eu.z((new StringBuilder()).append("Couldn't find an Activity to view url/mimetype: ").append(s).append(" / ").append(s3).toString());
        }
    }

    protected void onMeasure(int i, int j)
    {
        int i1;
label0:
        {
            i1 = 0x7fffffff;
            synchronized (ls)
            {
                if (!isInEditMode() && !sD)
                {
                    break label0;
                }
                super.onMeasure(i, j);
            }
            return;
        }
        int l;
        int j1;
        int k1;
        int l1;
        l1 = android.view.View.MeasureSpec.getMode(i);
        l = android.view.View.MeasureSpec.getSize(i);
        k1 = android.view.View.MeasureSpec.getMode(j);
        j1 = android.view.View.MeasureSpec.getSize(j);
        break MISSING_BLOCK_LABEL_62;
_L3:
        if (nF.widthPixels <= i && nF.heightPixels <= j)
        {
            break MISSING_BLOCK_LABEL_238;
        }
        float f = sB.getResources().getDisplayMetrics().density;
        eu.D((new StringBuilder()).append("Not enough space to show ad. Needs ").append((int)((float)nF.widthPixels / f)).append("x").append((int)((float)nF.heightPixels / f)).append(" dp, but only has ").append((int)((float)l / f)).append("x").append((int)((float)j1 / f)).append(" dp.").toString());
        if (getVisibility() != 8)
        {
            setVisibility(4);
        }
        setMeasuredDimension(0, 0);
_L1:
        obj;
        JVM INSTR monitorexit ;
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
        if (getVisibility() != 8)
        {
            setVisibility(0);
        }
        setMeasuredDimension(nF.widthPixels, nF.heightPixels);
          goto _L1
        if (l1 != 0x80000000 && l1 != 0x40000000)
        {
            i = 0x7fffffff;
        } else
        {
            i = l;
        }
        if (k1 != 0x80000000)
        {
            j = i1;
            if (k1 != 0x40000000)
            {
                continue; /* Loop/switch isn't completed */
            }
        }
        j = j1;
        if (true) goto _L3; else goto _L2
_L2:
    }

    public boolean onTouchEvent(MotionEvent motionevent)
    {
        if (pA != null)
        {
            pA.a(motionevent);
        }
        return super.onTouchEvent(motionevent);
    }

    public void q(boolean flag)
    {
        synchronized (ls)
        {
            sD = flag;
            cg();
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void setContext(Context context)
    {
        sB.setBaseContext(context);
    }
}
