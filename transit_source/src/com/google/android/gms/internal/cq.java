// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.MutableContextWrapper;
import android.net.Uri;
import android.view.MotionEvent;
import android.webkit.DownloadListener;
import android.webkit.WebSettings;
import android.webkit.WebView;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.google.android.gms.internal:
//            co, ci, ck, ct, 
//            cu, cj, cr, cs, 
//            x, cn, h, bf

public final class cq extends WebView
    implements DownloadListener
{

    private final Object eJ = new Object();
    private x fg;
    private final h go;
    private final cr hT;
    private final MutableContextWrapper hU;
    private final co hV;
    private bf hW;
    private boolean hX;
    private boolean hY;

    private cq(MutableContextWrapper mutablecontextwrapper, x x1, boolean flag, boolean flag1, h h1, co co1)
    {
        super(mutablecontextwrapper);
        hU = mutablecontextwrapper;
        fg = x1;
        hX = flag;
        go = h1;
        hV = co1;
        setBackgroundColor(0);
        x1 = getSettings();
        x1.setJavaScriptEnabled(true);
        x1.setSavePassword(false);
        ci.a(mutablecontextwrapper, co1.hP, x1);
        if (android.os.Build.VERSION.SDK_INT >= 17)
        {
            ck.a(getContext(), x1);
        } else
        if (android.os.Build.VERSION.SDK_INT >= 11)
        {
            cj.a(getContext(), x1);
        }
        setDownloadListener(this);
        if (android.os.Build.VERSION.SDK_INT >= 11)
        {
            hT = new ct(this, flag1);
        } else
        {
            hT = new cr(this, flag1);
        }
        setWebViewClient(hT);
        if (android.os.Build.VERSION.SDK_INT >= 14)
        {
            setWebChromeClient(new cu(this));
        } else
        if (android.os.Build.VERSION.SDK_INT >= 11)
        {
            setWebChromeClient(new cs(this));
        }
        aA();
    }

    public static cq a(Context context, x x1, boolean flag, boolean flag1, h h1, co co1)
    {
        return new cq(new MutableContextWrapper(context), x1, flag, flag1, h1, co1);
    }

    private void aA()
    {
        Object obj = eJ;
        obj;
        JVM INSTR monitorenter ;
        if (!hX && !fg.ex) goto _L2; else goto _L1
_L1:
        if (android.os.Build.VERSION.SDK_INT >= 14) goto _L4; else goto _L3
_L3:
        cn.m("Disabling hardware acceleration on an overlay.");
        aB();
_L5:
        return;
_L4:
        cn.m("Enabling hardware acceleration on an overlay.");
        aC();
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
            cn.m("Disabling hardware acceleration on an AdView.");
            aB();
        }
          goto _L5
        cn.m("Enabling hardware acceleration on an AdView.");
        aC();
          goto _L5
    }

    private void aB()
    {
        synchronized (eJ)
        {
            if (!hY && android.os.Build.VERSION.SDK_INT >= 11)
            {
                cj.c(this);
            }
            hY = true;
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    private void aC()
    {
        synchronized (eJ)
        {
            if (hY && android.os.Build.VERSION.SDK_INT >= 11)
            {
                cj.d(this);
            }
            hY = false;
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void a(Context context, x x1)
    {
        synchronized (eJ)
        {
            hU.setBaseContext(context);
            hW = null;
            fg = x1;
            hX = false;
            ci.b(this);
            loadUrl("about:blank");
            hT.reset();
        }
        return;
        context;
        obj;
        JVM INSTR monitorexit ;
        throw context;
    }

    public void a(bf bf)
    {
        synchronized (eJ)
        {
            hW = bf;
        }
        return;
        bf;
        obj;
        JVM INSTR monitorexit ;
        throw bf;
    }

    public void a(String s, Map map)
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append("javascript:AFMA_ReceiveMessage('");
        stringbuilder.append(s);
        stringbuilder.append("'");
        if (map != null)
        {
            try
            {
                s = ci.l(map).toString();
                stringbuilder.append(",");
                stringbuilder.append(s);
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                cn.q("Could not convert AFMA event parameters to JSON.");
                return;
            }
        }
        stringbuilder.append(");");
        cn.p((new StringBuilder()).append("Dispatching AFMA event: ").append(stringbuilder).toString());
        loadUrl(stringbuilder.toString());
    }

    public void as()
    {
        HashMap hashmap = new HashMap(1);
        hashmap.put("version", hV.hP);
        a("onhide", hashmap);
    }

    public void at()
    {
        HashMap hashmap = new HashMap(1);
        hashmap.put("version", hV.hP);
        a("onshow", hashmap);
    }

    public bf au()
    {
        bf bf;
        synchronized (eJ)
        {
            bf = hW;
        }
        return bf;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public x av()
    {
        x x1;
        synchronized (eJ)
        {
            x1 = fg;
        }
        return x1;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public cr aw()
    {
        return hT;
    }

    public h ax()
    {
        return go;
    }

    public co ay()
    {
        return hV;
    }

    public boolean az()
    {
        boolean flag;
        synchronized (eJ)
        {
            flag = hX;
        }
        return flag;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void i(boolean flag)
    {
        synchronized (eJ)
        {
            hX = flag;
            aA();
        }
        return;
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
            cn.m((new StringBuilder()).append("Couldn't find an Activity to view url/mimetype: ").append(s).append(" / ").append(s3).toString());
        }
    }

    protected void onMeasure(int j, int k)
    {
        int i1;
label0:
        {
            i1 = 0x7fffffff;
            synchronized (eJ)
            {
                if (!isInEditMode() && !hX)
                {
                    break label0;
                }
                super.onMeasure(j, k);
            }
            return;
        }
        int l;
        int j1;
        int k1;
        int l1;
        l1 = android.view.View.MeasureSpec.getMode(j);
        l = android.view.View.MeasureSpec.getSize(j);
        k1 = android.view.View.MeasureSpec.getMode(k);
        j1 = android.view.View.MeasureSpec.getSize(k);
        break MISSING_BLOCK_LABEL_59;
_L3:
        if (fg.widthPixels <= j && fg.heightPixels <= k)
        {
            break MISSING_BLOCK_LABEL_197;
        }
        cn.q((new StringBuilder()).append("Not enough space to show ad. Needs ").append(fg.widthPixels).append("x").append(fg.heightPixels).append(", but only has ").append(l).append("x").append(j1).toString());
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
        setMeasuredDimension(fg.widthPixels, fg.heightPixels);
          goto _L1
        if (l1 != 0x80000000 && l1 != 0x40000000)
        {
            j = 0x7fffffff;
        } else
        {
            j = l;
        }
        if (k1 != 0x80000000)
        {
            k = i1;
            if (k1 != 0x40000000)
            {
                continue; /* Loop/switch isn't completed */
            }
        }
        k = j1;
        if (true) goto _L3; else goto _L2
_L2:
    }

    public boolean onTouchEvent(MotionEvent motionevent)
    {
        if (go != null)
        {
            go.a(motionevent);
        }
        return super.onTouchEvent(motionevent);
    }

    public void setContext(Context context)
    {
        hU.setBaseContext(context);
    }
}
