// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kik.cards.browser;

import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;
import org.c.b;
import org.c.c;

// Referenced classes of package com.kik.cards.browser:
//            f, g

public class SamsungCanvasWitchcraft extends WebView
{

    private static final b a = c.a("CanvasFix");
    private static boolean b = false;

    public SamsungCanvasWitchcraft(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public SamsungCanvasWitchcraft(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        postDelayed(new f(this), 500L);
    }

    static boolean a(SamsungCanvasWitchcraft samsungcanvaswitchcraft)
    {
        return samsungcanvaswitchcraft.b();
    }

    static boolean a(boolean flag)
    {
        b = flag;
        return flag;
    }

    private boolean b()
    {
        android.view.ViewParent viewparent = getParent();
        if (viewparent != null && (viewparent instanceof ViewGroup))
        {
            boolean flag = ((ViewGroup)viewparent).isShown();
            ((ViewGroup)viewparent).removeView(this);
            return flag;
        } else
        {
            return false;
        }
    }

    public final void a()
    {
        boolean flag;
        if (!b && android.os.Build.VERSION.SDK_INT >= 14 && Build.MANUFACTURER != null && Build.MANUFACTURER.toLowerCase().contains("samsung"))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (!flag)
        {
            b();
            return;
        } else
        {
            getSettings().setJavaScriptEnabled(true);
            loadData("<!DOCTYPE html><html><body><canvas id=\"canvas\"></canvas><script>var c=document.getElementById('canvas'), ctx=c.getContext('2d'), width=window.innerWidth, height=window.innerHeight, i=0;c.width=width;c.height=height;var timeout=setInterval(function (){var x=0.5*width, y=0.5*height;ctx.fillStyle='#FF0000';ctx.beginPath();ctx.moveTo(x+1, y+1);ctx.arc(x+1, y+1, 10, 0, Math.PI*2, false);ctx.fill();i++;if (i > 1000){clearInterval(timeout);}}, 5);</script></body></html>", "text/html", "UTF-8");
            postDelayed(new g(this), 5000L);
            return;
        }
    }

}
