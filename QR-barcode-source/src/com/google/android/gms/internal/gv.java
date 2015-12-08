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
import android.webkit.ValueCallback;
import android.webkit.WebSettings;
import android.webkit.WebView;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.google.android.gms.internal:
//            gt, gj, gp, gy, 
//            gz, gn, gw, gx, 
//            ay, gs, dk, k

public class gv extends WebView
    implements DownloadListener
{
    protected static class a extends MutableContextWrapper
    {

        private Context mD;
        private Activity wO;

        public Context dz()
        {
            return wO;
        }

        public void setBaseContext(Context context)
        {
            mD = context.getApplicationContext();
            if (context instanceof Activity)
            {
                context = (Activity)context;
            } else
            {
                context = null;
            }
            wO = context;
            super.setBaseContext(mD);
        }

        public void startActivity(Intent intent)
        {
            if (wO != null)
            {
                wO.startActivity(intent);
                return;
            } else
            {
                intent.setFlags(0x10000000);
                mD.startActivity(intent);
                return;
            }
        }

        public a(Context context)
        {
            super(context);
            setBaseContext(context);
        }
    }


    private final WindowManager mG = (WindowManager)getContext().getSystemService("window");
    private final Object mw = new Object();
    private ay qr;
    private final gt qs;
    private final k sX;
    private final gw wH;
    private final a wI;
    private dk wJ;
    private boolean wK;
    private boolean wL;
    private boolean wM;
    private boolean wN;

    protected gv(a a1, ay ay1, boolean flag, boolean flag1, k k1, gt gt1)
    {
        super(a1);
        wI = a1;
        qr = ay1;
        wK = flag;
        sX = k1;
        qs = gt1;
        setBackgroundColor(0);
        ay1 = getSettings();
        ay1.setJavaScriptEnabled(true);
        ay1.setSavePassword(false);
        ay1.setSupportMultipleWindows(true);
        ay1.setJavaScriptCanOpenWindowsAutomatically(true);
        gj.a(a1, gt1.wD, ay1);
        if (android.os.Build.VERSION.SDK_INT >= 17)
        {
            gp.a(getContext(), ay1);
        } else
        if (android.os.Build.VERSION.SDK_INT >= 11)
        {
            gn.a(getContext(), ay1);
        }
        setDownloadListener(this);
        if (android.os.Build.VERSION.SDK_INT >= 11)
        {
            wH = new gy(this, flag1);
        } else
        {
            wH = new gw(this, flag1);
        }
        setWebViewClient(wH);
        if (android.os.Build.VERSION.SDK_INT >= 14)
        {
            setWebChromeClient(new gz(this));
        } else
        if (android.os.Build.VERSION.SDK_INT >= 11)
        {
            setWebChromeClient(new gx(this));
        }
        dA();
    }

    public static gv a(Context context, ay ay1, boolean flag, boolean flag1, k k1, gt gt1)
    {
        return new gv(new a(context), ay1, flag, flag1, k1, gt1);
    }

    private void dA()
    {
        Object obj = mw;
        obj;
        JVM INSTR monitorenter ;
        if (!wK && !qr.og) goto _L2; else goto _L1
_L1:
        if (android.os.Build.VERSION.SDK_INT >= 14) goto _L4; else goto _L3
_L3:
        gs.S("Disabling hardware acceleration on an overlay.");
        dB();
_L5:
        return;
_L4:
        gs.S("Enabling hardware acceleration on an overlay.");
        dC();
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
            gs.S("Disabling hardware acceleration on an AdView.");
            dB();
        }
          goto _L5
        gs.S("Enabling hardware acceleration on an AdView.");
        dC();
          goto _L5
    }

    private void dB()
    {
        synchronized (mw)
        {
            if (!wL && android.os.Build.VERSION.SDK_INT >= 11)
            {
                gn.i(this);
            }
            wL = true;
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    private void dC()
    {
        synchronized (mw)
        {
            if (wL && android.os.Build.VERSION.SDK_INT >= 11)
            {
                gn.j(this);
            }
            wL = false;
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    protected void X(String s)
    {
        Object obj = mw;
        obj;
        JVM INSTR monitorenter ;
        if (isDestroyed())
        {
            break MISSING_BLOCK_LABEL_22;
        }
        loadUrl(s);
_L2:
        return;
        gs.W("The webview is destroyed. Ignoring action.");
        if (true) goto _L2; else goto _L1
_L1:
        s;
        obj;
        JVM INSTR monitorexit ;
        throw s;
    }

    public ay Y()
    {
        ay ay1;
        synchronized (mw)
        {
            ay1 = qr;
        }
        return ay1;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void a(Context context, ay ay1)
    {
        synchronized (mw)
        {
            wI.setBaseContext(context);
            wJ = null;
            qr = ay1;
            wK = false;
            wN = false;
            gj.b(this);
            loadUrl("about:blank");
            wH.reset();
            setOnTouchListener(null);
            setOnClickListener(null);
        }
        return;
        context;
        obj;
        JVM INSTR monitorexit ;
        throw context;
    }

    public void a(ay ay1)
    {
        synchronized (mw)
        {
            qr = ay1;
            requestLayout();
        }
        return;
        ay1;
        obj;
        JVM INSTR monitorexit ;
        throw ay1;
    }

    public void a(dk dk1)
    {
        synchronized (mw)
        {
            wJ = dk1;
        }
        return;
        dk1;
        obj;
        JVM INSTR monitorexit ;
        throw dk1;
    }

    public void a(String s, Map map)
    {
        try
        {
            map = gj.t(map);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            gs.W("Could not convert parameters to JSON.");
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
        X(((StringBuilder) (obj)).toString());
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
        gs.V((new StringBuilder()).append("Dispatching AFMA event: ").append(obj).toString());
        X(((StringBuilder) (obj)).toString());
    }

    public void bS()
    {
        if (!du().dE())
        {
            return;
        }
        DisplayMetrics displaymetrics = new DisplayMetrics();
        Display display = mG.getDefaultDisplay();
        display.getMetrics(displaymetrics);
        int j = gj.s(getContext());
        float f = 160F / (float)displaymetrics.densityDpi;
        int i = Math.round((float)displaymetrics.widthPixels * f);
        j = Math.round((float)(displaymetrics.heightPixels - j) * f);
        try
        {
            b("onScreenInfoChanged", (new JSONObject()).put("width", i).put("height", j).put("density", displaymetrics.density).put("rotation", display.getRotation()));
            return;
        }
        catch (JSONException jsonexception)
        {
            gs.b("Error occured while obtaining screen information.", jsonexception);
        }
    }

    public void bZ()
    {
        HashMap hashmap = new HashMap(1);
        hashmap.put("version", qs.wD);
        a("onshow", hashmap);
    }

    public void ca()
    {
        HashMap hashmap = new HashMap(1);
        hashmap.put("version", qs.wD);
        a("onhide", hashmap);
    }

    public void destroy()
    {
        synchronized (mw)
        {
            super.destroy();
            wM = true;
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public dk dt()
    {
        dk dk1;
        synchronized (mw)
        {
            dk1 = wJ;
        }
        return dk1;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public gw du()
    {
        return wH;
    }

    public boolean dv()
    {
        return wN;
    }

    public k dw()
    {
        return sX;
    }

    public gt dx()
    {
        return qs;
    }

    public boolean dy()
    {
        boolean flag;
        synchronized (mw)
        {
            flag = wK;
        }
        return flag;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public Context dz()
    {
        return wI.dz();
    }

    public void evaluateJavascript(String s, ValueCallback valuecallback)
    {
        Object obj = mw;
        obj;
        JVM INSTR monitorenter ;
        if (!isDestroyed())
        {
            break MISSING_BLOCK_LABEL_33;
        }
        gs.W("The webview is destroyed. Ignoring action.");
        if (valuecallback == null)
        {
            break MISSING_BLOCK_LABEL_30;
        }
        valuecallback.onReceiveValue(null);
        obj;
        JVM INSTR monitorexit ;
        return;
        super.evaluateJavascript(s, valuecallback);
        obj;
        JVM INSTR monitorexit ;
        return;
        s;
        obj;
        JVM INSTR monitorexit ;
        throw s;
    }

    public boolean isDestroyed()
    {
        boolean flag;
        synchronized (mw)
        {
            flag = wM;
        }
        return flag;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void o(boolean flag)
    {
        Object obj = mw;
        obj;
        JVM INSTR monitorenter ;
        if (wJ == null)
        {
            break MISSING_BLOCK_LABEL_25;
        }
        wJ.o(flag);
_L2:
        return;
        wN = flag;
        if (true) goto _L2; else goto _L1
_L1:
        Exception exception;
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
            gs.S((new StringBuilder()).append("Couldn't find an Activity to view url/mimetype: ").append(s).append(" / ").append(s3).toString());
        }
    }

    protected void onMeasure(int i, int j)
    {
        int i1;
label0:
        {
            i1 = 0x7fffffff;
            synchronized (mw)
            {
                if (!isInEditMode() && !wK)
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
        if (qr.widthPixels <= i && qr.heightPixels <= j)
        {
            break MISSING_BLOCK_LABEL_238;
        }
        float f = wI.getResources().getDisplayMetrics().density;
        gs.W((new StringBuilder()).append("Not enough space to show ad. Needs ").append((int)((float)qr.widthPixels / f)).append("x").append((int)((float)qr.heightPixels / f)).append(" dp, but only has ").append((int)((float)l / f)).append("x").append((int)((float)j1 / f)).append(" dp.").toString());
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
        setMeasuredDimension(qr.widthPixels, qr.heightPixels);
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
        if (sX != null)
        {
            sX.a(motionevent);
        }
        return super.onTouchEvent(motionevent);
    }

    public void setContext(Context context)
    {
        wI.setBaseContext(context);
    }

    public void x(boolean flag)
    {
        synchronized (mw)
        {
            wK = flag;
            dA();
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }
}
