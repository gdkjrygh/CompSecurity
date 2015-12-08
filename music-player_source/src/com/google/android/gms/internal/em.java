// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.DownloadListener;
import android.webkit.WebSettings;
import android.webkit.WebView;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.google.android.gms.internal:
//            db, ea, ed, fd, 
//            ff, eo, er, en, 
//            ab, ek, kz, bp

public final class em extends WebView
    implements DownloadListener
{

    private final eo a;
    private final en b;
    private final Object c = new Object();
    private final kz d;
    private final db e;
    private bp f;
    private ab g;
    private boolean h;
    private boolean i;

    private em(en en1, ab ab1, boolean flag, boolean flag1, kz kz1, db db1)
    {
        super(en1);
        b = en1;
        g = ab1;
        h = flag;
        d = kz1;
        e = db1;
        setBackgroundColor(0);
        ab1 = getSettings();
        ab1.setJavaScriptEnabled(true);
        ab1.setSavePassword(false);
        ab1.setSupportMultipleWindows(true);
        ab1.setJavaScriptCanOpenWindowsAutomatically(true);
        ea.a(en1, db1.c, ab1);
        if (android.os.Build.VERSION.SDK_INT >= 17)
        {
            ed.a(getContext(), ab1);
            ab1.setMediaPlaybackRequiresUserGesture(false);
        } else
        if (android.os.Build.VERSION.SDK_INT >= 11)
        {
            ed.a(getContext(), ab1);
        }
        setDownloadListener(this);
        if (android.os.Build.VERSION.SDK_INT >= 11)
        {
            a = new fd(this, flag1);
        } else
        {
            a = new eo(this, flag1);
        }
        setWebViewClient(a);
        if (android.os.Build.VERSION.SDK_INT >= 14)
        {
            setWebChromeClient(new ff(this));
        } else
        if (android.os.Build.VERSION.SDK_INT >= 11)
        {
            setWebChromeClient(new er(this));
        }
        i();
    }

    public static em a(Context context, ab ab1, boolean flag, boolean flag1, kz kz1, db db1)
    {
        return new em(new en(context), ab1, flag, flag1, kz1, db1);
    }

    private void i()
    {
        Object obj = c;
        obj;
        JVM INSTR monitorenter ;
        if (!h && !g.f) goto _L2; else goto _L1
_L1:
        if (android.os.Build.VERSION.SDK_INT >= 14) goto _L4; else goto _L3
_L3:
        ek.a("Disabling hardware acceleration on an overlay.");
        j();
_L5:
        return;
_L4:
        ek.a("Enabling hardware acceleration on an overlay.");
        k();
          goto _L5
        Exception exception;
        exception;
        throw exception;
_L2:
label0:
        {
            if (android.os.Build.VERSION.SDK_INT >= 18)
            {
                break label0;
            }
            ek.a("Disabling hardware acceleration on an AdView.");
            j();
        }
          goto _L5
        ek.a("Enabling hardware acceleration on an AdView.");
        k();
          goto _L5
    }

    private void j()
    {
        synchronized (c)
        {
            if (!i && android.os.Build.VERSION.SDK_INT >= 11)
            {
                setLayerType(1, null);
            }
            i = true;
        }
    }

    private void k()
    {
        synchronized (c)
        {
            if (i && android.os.Build.VERSION.SDK_INT >= 11)
            {
                setLayerType(0, null);
            }
            i = false;
        }
    }

    public final void a()
    {
        HashMap hashmap = new HashMap(1);
        hashmap.put("version", e.c);
        a("onhide", ((Map) (hashmap)));
    }

    public final void a(Context context)
    {
        b.setBaseContext(context);
    }

    public final void a(Context context, ab ab1)
    {
        synchronized (c)
        {
            b.setBaseContext(context);
            f = null;
            g = ab1;
            h = false;
            ea.b(this);
            loadUrl("about:blank");
            a.b();
        }
    }

    public final void a(ab ab1)
    {
        synchronized (c)
        {
            g = ab1;
            requestLayout();
        }
    }

    public final void a(bp bp)
    {
        synchronized (c)
        {
            f = bp;
        }
    }

    public final void a(String s, Map map)
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append("javascript:AFMA_ReceiveMessage('");
        stringbuilder.append(s);
        stringbuilder.append("'");
        if (map != null)
        {
            try
            {
                s = ea.a(map).toString();
                stringbuilder.append(",");
                stringbuilder.append(s);
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                ek.d("Could not convert AFMA event parameters to JSON.");
                return;
            }
        }
        stringbuilder.append(");");
        ek.c((new StringBuilder("Dispatching AFMA event: ")).append(stringbuilder).toString());
        loadUrl(stringbuilder.toString());
    }

    public final void a(boolean flag)
    {
        synchronized (c)
        {
            h = flag;
            i();
        }
    }

    public final void b()
    {
        HashMap hashmap = new HashMap(1);
        hashmap.put("version", e.c);
        a("onshow", hashmap);
    }

    public final bp c()
    {
        bp bp;
        synchronized (c)
        {
            bp = f;
        }
        return bp;
    }

    public final ab d()
    {
        ab ab1;
        synchronized (c)
        {
            ab1 = g;
        }
        return ab1;
    }

    public final eo e()
    {
        return a;
    }

    public final kz f()
    {
        return d;
    }

    public final db g()
    {
        return e;
    }

    public final boolean h()
    {
        boolean flag;
        synchronized (c)
        {
            flag = h;
        }
        return flag;
    }

    public final void onDownloadStart(String s, String s1, String s2, String s3, long l)
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
            ek.a((new StringBuilder("Couldn't find an Activity to view url/mimetype: ")).append(s).append(" / ").append(s3).toString());
        }
    }

    protected final void onMeasure(int l, int i1)
    {
        int j1;
        int k1;
        int l1;
        int i2;
label0:
        {
            k1 = 0x7fffffff;
            int j2;
            synchronized (c)
            {
                if (!isInEditMode() && !h)
                {
                    break label0;
                }
                super.onMeasure(l, i1);
            }
            return;
        }
        j2 = android.view.View.MeasureSpec.getMode(l);
        j1 = android.view.View.MeasureSpec.getSize(l);
        i2 = android.view.View.MeasureSpec.getMode(i1);
        l1 = android.view.View.MeasureSpec.getSize(i1);
        break MISSING_BLOCK_LABEL_59;
_L3:
        if (g.h <= l && g.e <= i1)
        {
            break MISSING_BLOCK_LABEL_200;
        }
        ek.d((new StringBuilder("Not enough space to show ad. Needs ")).append(g.h).append("x").append(g.e).append(" pixels, but only has ").append(j1).append("x").append(l1).append(" pixels.").toString());
        if (getVisibility() != 8)
        {
            setVisibility(4);
        }
        setMeasuredDimension(0, 0);
_L1:
        obj;
        JVM INSTR monitorexit ;
        return;
        if (getVisibility() != 8)
        {
            setVisibility(0);
        }
        setMeasuredDimension(g.h, g.e);
          goto _L1
        if (j2 != 0x80000000 && j2 != 0x40000000)
        {
            l = 0x7fffffff;
        } else
        {
            l = j1;
        }
        if (i2 != 0x80000000)
        {
            i1 = k1;
            if (i2 != 0x40000000)
            {
                continue; /* Loop/switch isn't completed */
            }
        }
        i1 = l1;
        if (true) goto _L3; else goto _L2
_L2:
    }

    public final boolean onTouchEvent(MotionEvent motionevent)
    {
        if (d != null)
        {
            d.a(motionevent);
        }
        return super.onTouchEvent(motionevent);
    }
}
