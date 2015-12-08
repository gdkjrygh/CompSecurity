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
//            gs, gi, go, gx, 
//            gy, gm, gv, gw, 
//            ay, gr, dp, k

public class gu extends WebView
    implements DownloadListener
{
    protected static class a extends MutableContextWrapper
    {

        private Context mO;
        private Activity xd;

        public Context dI()
        {
            return xd;
        }

        public void setBaseContext(Context context)
        {
            mO = context.getApplicationContext();
            if (context instanceof Activity)
            {
                context = (Activity)context;
            } else
            {
                context = null;
            }
            xd = context;
            super.setBaseContext(mO);
        }

        public void startActivity(Intent intent)
        {
            if (xd != null)
            {
                xd.startActivity(intent);
                return;
            } else
            {
                intent.setFlags(0x10000000);
                mO.startActivity(intent);
                return;
            }
        }

        public a(Context context)
        {
            super(context);
            setBaseContext(context);
        }
    }


    private final Object mH = new Object();
    private final WindowManager mR = (WindowManager)getContext().getSystemService("window");
    private ay qI;
    private final gs qJ;
    private final k tl;
    private final gv wW;
    private final a wX;
    private dp wY;
    private boolean wZ;
    private boolean xa;
    private boolean xb;
    private boolean xc;

    protected gu(a a1, ay ay1, boolean flag, boolean flag1, k k1, gs gs1)
    {
        super(a1);
        wX = a1;
        qI = ay1;
        wZ = flag;
        tl = k1;
        qJ = gs1;
        setBackgroundColor(0);
        ay1 = getSettings();
        ay1.setJavaScriptEnabled(true);
        ay1.setSavePassword(false);
        ay1.setSupportMultipleWindows(true);
        ay1.setJavaScriptCanOpenWindowsAutomatically(true);
        gi.a(a1, gs1.wS, ay1);
        if (android.os.Build.VERSION.SDK_INT >= 17)
        {
            go.a(getContext(), ay1);
        } else
        if (android.os.Build.VERSION.SDK_INT >= 11)
        {
            gm.a(getContext(), ay1);
        }
        setDownloadListener(this);
        if (android.os.Build.VERSION.SDK_INT >= 11)
        {
            wW = new gx(this, flag1);
        } else
        {
            wW = new gv(this, flag1);
        }
        setWebViewClient(wW);
        if (android.os.Build.VERSION.SDK_INT >= 14)
        {
            setWebChromeClient(new gy(this));
        } else
        if (android.os.Build.VERSION.SDK_INT >= 11)
        {
            setWebChromeClient(new gw(this));
        }
        dJ();
    }

    public static gu a(Context context, ay ay1, boolean flag, boolean flag1, k k1, gs gs1)
    {
        return new gu(new a(context), ay1, flag, flag1, k1, gs1);
    }

    private void dJ()
    {
        Object obj = mH;
        obj;
        JVM INSTR monitorenter ;
        if (!wZ && !qI.oq) goto _L2; else goto _L1
_L1:
        if (android.os.Build.VERSION.SDK_INT >= 14) goto _L4; else goto _L3
_L3:
        gr.S("Disabling hardware acceleration on an overlay.");
        dK();
_L5:
        return;
_L4:
        gr.S("Enabling hardware acceleration on an overlay.");
        dL();
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
            gr.S("Disabling hardware acceleration on an AdView.");
            dK();
        }
          goto _L5
        gr.S("Enabling hardware acceleration on an AdView.");
        dL();
          goto _L5
    }

    private void dK()
    {
        synchronized (mH)
        {
            if (!xa && android.os.Build.VERSION.SDK_INT >= 11)
            {
                gm.i(this);
            }
            xa = true;
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    private void dL()
    {
        synchronized (mH)
        {
            if (xa && android.os.Build.VERSION.SDK_INT >= 11)
            {
                gm.j(this);
            }
            xa = false;
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    protected void X(String s)
    {
        Object obj = mH;
        obj;
        JVM INSTR monitorenter ;
        if (isDestroyed())
        {
            break MISSING_BLOCK_LABEL_22;
        }
        loadUrl(s);
_L2:
        return;
        gr.W("The webview is destroyed. Ignoring action.");
        if (true) goto _L2; else goto _L1
_L1:
        s;
        obj;
        JVM INSTR monitorexit ;
        throw s;
    }

    public void a(Context context, ay ay1)
    {
        synchronized (mH)
        {
            wX.setBaseContext(context);
            wY = null;
            qI = ay1;
            wZ = false;
            xc = false;
            gi.b(this);
            loadUrl("about:blank");
            wW.reset();
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
        synchronized (mH)
        {
            qI = ay1;
            requestLayout();
        }
        return;
        ay1;
        obj;
        JVM INSTR monitorexit ;
        throw ay1;
    }

    public void a(dp dp1)
    {
        synchronized (mH)
        {
            wY = dp1;
        }
        return;
        dp1;
        obj;
        JVM INSTR monitorexit ;
        throw dp1;
    }

    public void a(String s, Map map)
    {
        try
        {
            map = gi.t(map);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            gr.W("Could not convert parameters to JSON.");
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

    public ay ac()
    {
        ay ay1;
        synchronized (mH)
        {
            ay1 = qI;
        }
        return ay1;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
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
        gr.V((new StringBuilder()).append("Dispatching AFMA event: ").append(obj).toString());
        X(((StringBuilder) (obj)).toString());
    }

    public void cb()
    {
        if (!dD().dN())
        {
            return;
        }
        DisplayMetrics displaymetrics = new DisplayMetrics();
        Display display = mR.getDefaultDisplay();
        display.getMetrics(displaymetrics);
        int j = gi.s(getContext());
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
            gr.b("Error occured while obtaining screen information.", jsonexception);
        }
    }

    public void ci()
    {
        HashMap hashmap = new HashMap(1);
        hashmap.put("version", qJ.wS);
        a("onshow", hashmap);
    }

    public void cj()
    {
        HashMap hashmap = new HashMap(1);
        hashmap.put("version", qJ.wS);
        a("onhide", hashmap);
    }

    public dp dC()
    {
        dp dp1;
        synchronized (mH)
        {
            dp1 = wY;
        }
        return dp1;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public gv dD()
    {
        return wW;
    }

    public boolean dE()
    {
        return xc;
    }

    public k dF()
    {
        return tl;
    }

    public gs dG()
    {
        return qJ;
    }

    public boolean dH()
    {
        boolean flag;
        synchronized (mH)
        {
            flag = wZ;
        }
        return flag;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public Context dI()
    {
        return wX.dI();
    }

    public void destroy()
    {
        synchronized (mH)
        {
            if (wY != null)
            {
                wY.close();
            }
            xb = true;
            super.destroy();
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void evaluateJavascript(String s, ValueCallback valuecallback)
    {
        Object obj = mH;
        obj;
        JVM INSTR monitorenter ;
        if (!isDestroyed())
        {
            break MISSING_BLOCK_LABEL_33;
        }
        gr.W("The webview is destroyed. Ignoring action.");
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
        synchronized (mH)
        {
            flag = xb;
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
            gr.S((new StringBuilder()).append("Couldn't find an Activity to view url/mimetype: ").append(s).append(" / ").append(s3).toString());
        }
    }

    protected void onMeasure(int i, int j)
    {
        int i1;
label0:
        {
            i1 = 0x7fffffff;
            synchronized (mH)
            {
                if (!isInEditMode() && !wZ)
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
        if (qI.widthPixels <= i && qI.heightPixels <= j)
        {
            break MISSING_BLOCK_LABEL_238;
        }
        float f = wX.getResources().getDisplayMetrics().density;
        gr.W((new StringBuilder()).append("Not enough space to show ad. Needs ").append((int)((float)qI.widthPixels / f)).append("x").append((int)((float)qI.heightPixels / f)).append(" dp, but only has ").append((int)((float)l / f)).append("x").append((int)((float)j1 / f)).append(" dp.").toString());
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
        setMeasuredDimension(qI.widthPixels, qI.heightPixels);
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
        if (tl != null)
        {
            tl.a(motionevent);
        }
        return super.onTouchEvent(motionevent);
    }

    public void q(boolean flag)
    {
        Object obj = mH;
        obj;
        JVM INSTR monitorenter ;
        if (wY == null)
        {
            break MISSING_BLOCK_LABEL_25;
        }
        wY.q(flag);
_L2:
        return;
        xc = flag;
        if (true) goto _L2; else goto _L1
_L1:
        Exception exception;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void setContext(Context context)
    {
        wX.setBaseContext(context);
    }

    public void z(boolean flag)
    {
        synchronized (mH)
        {
            wZ = flag;
            dJ();
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }
}
