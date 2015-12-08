// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.MutableContextWrapper;
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
//            dx, dq, dt, ec, 
//            ed, ds, ea, eb, 
//            ak, dw, l, cc

public class dz extends WebView
    implements DownloadListener
{
    private static class a extends MutableContextWrapper
    {

        private Context lp;
        private Activity rz;

        public void setBaseContext(Context context)
        {
            lp = context.getApplicationContext();
            if (context instanceof Activity)
            {
                context = (Activity)context;
            } else
            {
                context = null;
            }
            rz = context;
            super.setBaseContext(lp);
        }

        public void startActivity(Intent intent)
        {
            if (rz != null)
            {
                rz.startActivity(intent);
                return;
            } else
            {
                intent.setFlags(0x10000000);
                lp.startActivity(intent);
                return;
            }
        }

        public a(Context context)
        {
            super(context);
            setBaseContext(context);
        }
    }


    private final Object li = new Object();
    private final WindowManager ls = (WindowManager)getContext().getSystemService("window");
    private ak nq;
    private final dx nr;
    private final l oJ;
    private final ea ru;
    private final a rv;
    private cc rw;
    private boolean rx;
    private boolean ry;

    private dz(a a1, ak ak1, boolean flag, boolean flag1, l l1, dx dx1)
    {
        super(a1);
        rv = a1;
        nq = ak1;
        rx = flag;
        oJ = l1;
        nr = dx1;
        setBackgroundColor(0);
        ak1 = getSettings();
        ak1.setJavaScriptEnabled(true);
        ak1.setSavePassword(false);
        ak1.setSupportMultipleWindows(true);
        ak1.setJavaScriptCanOpenWindowsAutomatically(true);
        dq.a(a1, dx1.rq, ak1);
        if (android.os.Build.VERSION.SDK_INT >= 17)
        {
            dt.a(getContext(), ak1);
        } else
        if (android.os.Build.VERSION.SDK_INT >= 11)
        {
            ds.a(getContext(), ak1);
        }
        setDownloadListener(this);
        if (android.os.Build.VERSION.SDK_INT >= 11)
        {
            ru = new ec(this, flag1);
        } else
        {
            ru = new ea(this, flag1);
        }
        setWebViewClient(ru);
        if (android.os.Build.VERSION.SDK_INT >= 14)
        {
            setWebChromeClient(new ed(this));
        } else
        if (android.os.Build.VERSION.SDK_INT >= 11)
        {
            setWebChromeClient(new eb(this));
        }
        bM();
    }

    public static dz a(Context context, ak ak1, boolean flag, boolean flag1, l l1, dx dx1)
    {
        return new dz(new a(context), ak1, flag, flag1, l1, dx1);
    }

    private void bM()
    {
        Object obj = li;
        obj;
        JVM INSTR monitorenter ;
        if (!rx && !nq.lT) goto _L2; else goto _L1
_L1:
        if (android.os.Build.VERSION.SDK_INT >= 14) goto _L4; else goto _L3
_L3:
        dw.v("Disabling hardware acceleration on an overlay.");
        bN();
_L5:
        return;
_L4:
        dw.v("Enabling hardware acceleration on an overlay.");
        bO();
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
            dw.v("Disabling hardware acceleration on an AdView.");
            bN();
        }
          goto _L5
        dw.v("Enabling hardware acceleration on an AdView.");
        bO();
          goto _L5
    }

    private void bN()
    {
        synchronized (li)
        {
            if (!ry && android.os.Build.VERSION.SDK_INT >= 11)
            {
                ds.d(this);
            }
            ry = true;
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    private void bO()
    {
        synchronized (li)
        {
            if (ry && android.os.Build.VERSION.SDK_INT >= 11)
            {
                ds.e(this);
            }
            ry = false;
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public ak R()
    {
        ak ak1;
        synchronized (li)
        {
            ak1 = nq;
        }
        return ak1;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void a(Context context, ak ak1)
    {
        synchronized (li)
        {
            rv.setBaseContext(context);
            rw = null;
            nq = ak1;
            rx = false;
            dq.b(this);
            loadUrl("about:blank");
            ru.reset();
        }
        return;
        context;
        obj;
        JVM INSTR monitorexit ;
        throw context;
    }

    public void a(ak ak1)
    {
        synchronized (li)
        {
            nq = ak1;
            requestLayout();
        }
        return;
        ak1;
        obj;
        JVM INSTR monitorexit ;
        throw ak1;
    }

    public void a(cc cc)
    {
        synchronized (li)
        {
            rw = cc;
        }
        return;
        cc;
        obj;
        JVM INSTR monitorexit ;
        throw cc;
    }

    public void a(String s, Map map)
    {
        try
        {
            map = dq.p(map);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            dw.z("Could not convert parameters to JSON.");
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
        loadUrl(((StringBuilder) (obj)).toString());
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
        dw.y((new StringBuilder()).append("Dispatching AFMA event: ").append(obj).toString());
        loadUrl(((StringBuilder) (obj)).toString());
    }

    public void bE()
    {
        if (!bI().bP())
        {
            return;
        }
        DisplayMetrics displaymetrics = new DisplayMetrics();
        Display display = ls.getDefaultDisplay();
        display.getMetrics(displaymetrics);
        try
        {
            b("onScreenInfoChanged", (new JSONObject()).put("width", displaymetrics.widthPixels).put("height", displaymetrics.heightPixels).put("density", displaymetrics.density).put("rotation", display.getRotation()));
            return;
        }
        catch (JSONException jsonexception)
        {
            dw.b("Error occured while obtaining screen information.", jsonexception);
        }
    }

    public void bF()
    {
        HashMap hashmap = new HashMap(1);
        hashmap.put("version", nr.rq);
        a("onhide", hashmap);
    }

    public void bG()
    {
        HashMap hashmap = new HashMap(1);
        hashmap.put("version", nr.rq);
        a("onshow", hashmap);
    }

    public cc bH()
    {
        cc cc;
        synchronized (li)
        {
            cc = rw;
        }
        return cc;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public ea bI()
    {
        return ru;
    }

    public l bJ()
    {
        return oJ;
    }

    public dx bK()
    {
        return nr;
    }

    public boolean bL()
    {
        boolean flag;
        synchronized (li)
        {
            flag = rx;
        }
        return flag;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void onDownloadStart(String s, String s1, String s2, String s3, long l1)
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
            dw.v((new StringBuilder()).append("Couldn't find an Activity to view url/mimetype: ").append(s).append(" / ").append(s3).toString());
        }
    }

    protected void onMeasure(int i, int j)
    {
        int i1;
label0:
        {
            i1 = 0x7fffffff;
            synchronized (li)
            {
                if (!isInEditMode() && !rx)
                {
                    break label0;
                }
                super.onMeasure(i, j);
            }
            return;
        }
        int k;
        int j1;
        int k1;
        int l1;
        l1 = android.view.View.MeasureSpec.getMode(i);
        k = android.view.View.MeasureSpec.getSize(i);
        k1 = android.view.View.MeasureSpec.getMode(j);
        j1 = android.view.View.MeasureSpec.getSize(j);
        break MISSING_BLOCK_LABEL_59;
_L3:
        if (nq.widthPixels <= i && nq.heightPixels <= j)
        {
            break MISSING_BLOCK_LABEL_203;
        }
        dw.z((new StringBuilder()).append("Not enough space to show ad. Needs ").append(nq.widthPixels).append("x").append(nq.heightPixels).append(" pixels, but only has ").append(k).append("x").append(j1).append(" pixels.").toString());
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
        setMeasuredDimension(nq.widthPixels, nq.heightPixels);
          goto _L1
        if (l1 != 0x80000000 && l1 != 0x40000000)
        {
            i = 0x7fffffff;
        } else
        {
            i = k;
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
        if (oJ != null)
        {
            oJ.a(motionevent);
        }
        return super.onTouchEvent(motionevent);
    }

    public void p(boolean flag)
    {
        synchronized (li)
        {
            rx = flag;
            bM();
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void setContext(Context context)
    {
        rv.setBaseContext(context);
    }
}
