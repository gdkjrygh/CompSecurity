// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.yume.android.player;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;

// Referenced classes of package com.yume.android.player:
//            B, aA, YuMePlayerInterfaceImpl, J, 
//            aD, aB

final class az
{

    static WebView a;
    private static B e = B.a();
    RelativeLayout b;
    public boolean c;
    ProgressBar d;
    private FrameLayout f;
    private ImageView g;
    private Button h;
    private int i;
    private int j;
    private Bitmap k;
    private TextView l;
    private android.view.View.OnClickListener m;

    public az()
    {
        i = 1000;
        j = 60;
        c = false;
        k = null;
        d = null;
        l = null;
        m = new aA(this);
        k = BitmapFactory.decodeStream(getClass().getResourceAsStream("continue_button.png"));
    }

    public static void c()
    {
        if (a != null)
        {
            a.clearCache(true);
            a = null;
        }
    }

    public final void a()
    {
        if (!c)
        {
            return;
        }
        if (b == null) goto _L2; else goto _L1
_L1:
        if (d != null)
        {
            b.removeView(d);
        }
        if (l != null)
        {
            b.removeView(l);
        }
        if (k != null)
        {
            break MISSING_BLOCK_LABEL_110;
        }
        b.removeView(h);
_L3:
        b.removeView(a);
        f.removeView(b);
        e.b("WebView Closed.");
_L2:
        Exception exception;
        c = false;
        return;
        try
        {
            b.removeView(g);
        }
        // Misplaced declaration of an exception variable
        catch (Exception exception)
        {
            exception.printStackTrace();
            return;
        }
          goto _L3
    }

    public final void a(FrameLayout framelayout)
    {
        f = framelayout;
    }

    public final void a(String s)
    {
        J j1;
        boolean flag2;
        flag2 = false;
        if (c)
        {
            return;
        }
        j1 = YuMePlayerInterfaceImpl.d;
        if (j1.p() <= 0 || j1.q() <= 0)
        {
            e.c("WebView cannot be displayed due to invalid VideoView size.");
            j1.h();
            return;
        }
        if (b != null) goto _L2; else goto _L1
_L1:
        android.content.Context context = J.D();
        if (context != null) goto _L4; else goto _L3
_L3:
        boolean flag = false;
_L9:
        if (!flag)
        {
            e.c("Error creating WebViewLayout.");
            j1.h();
            return;
        }
          goto _L2
_L4:
        d = new ProgressBar(context);
        if (d == null)
        {
            flag = false;
            continue; /* Loop/switch isn't completed */
        }
        d.setVisibility(4);
        l = new TextView(context);
        if (l == null)
        {
            flag = false;
            continue; /* Loop/switch isn't completed */
        }
        l.setBackgroundColor(0xff000000);
        b = new RelativeLayout(context);
        if (b == null)
        {
            flag = false;
            continue; /* Loop/switch isn't completed */
        }
        if (k != null) goto _L6; else goto _L5
_L5:
        h = new Button(context);
        if (h == null)
        {
            flag = false;
            continue; /* Loop/switch isn't completed */
        }
        h.setId(i);
        h.setText("Continue");
        h.setOnClickListener(m);
_L7:
        flag = true;
        continue; /* Loop/switch isn't completed */
_L6:
        g = new ImageView(context);
        if (g == null)
        {
            flag = false;
            continue; /* Loop/switch isn't completed */
        }
        g.setId(i);
        g.setImageBitmap(k);
        g.setOnClickListener(m);
        if (true) goto _L7; else goto _L2
_L2:
        if (a == null)
        {
            Object obj = J.E();
            boolean flag1;
            if (obj == null)
            {
                flag1 = false;
            } else
            {
                obj = new WebView(((android.content.Context) (obj)));
                a = ((WebView) (obj));
                obj = ((WebView) (obj)).getSettings();
                ((WebSettings) (obj)).setJavaScriptEnabled(true);
                ((WebSettings) (obj)).setBuiltInZoomControls(true);
                ((WebSettings) (obj)).setCacheMode(1);
                a.setInitialScale(0);
                a.setWebViewClient(new aD(this));
                a.setWebChromeClient(new aB());
                flag1 = true;
            }
            if (!flag1)
            {
                e.c("Error creating WebView.");
                j1.h();
                return;
            }
        }
        int i1 = ((flag2) ? 1 : 0);
        if (b != null)
        {
            i1 = ((flag2) ? 1 : 0);
            if (a != null)
            {
                if (g == null && h == null)
                {
                    i1 = ((flag2) ? 1 : 0);
                } else
                {
                    Object obj1 = YuMePlayerInterfaceImpl.d;
                    i1 = ((J) (obj1)).p();
                    int k1 = ((J) (obj1)).q();
                    obj1 = new android.widget.RelativeLayout.LayoutParams(i1, k1);
                    b.setLayoutParams(((android.view.ViewGroup.LayoutParams) (obj1)));
                    int l1 = j;
                    obj1 = new android.widget.RelativeLayout.LayoutParams(j, j);
                    ((android.widget.RelativeLayout.LayoutParams) (obj1)).addRule(9);
                    if (d != null)
                    {
                        d.setLayoutParams(((android.view.ViewGroup.LayoutParams) (obj1)));
                    }
                    obj1 = new android.widget.RelativeLayout.LayoutParams(i1, j);
                    ((android.widget.RelativeLayout.LayoutParams) (obj1)).addRule(10);
                    if (l != null)
                    {
                        l.setLayoutParams(((android.view.ViewGroup.LayoutParams) (obj1)));
                    }
                    obj1 = new android.widget.RelativeLayout.LayoutParams(-2, j);
                    ((android.widget.RelativeLayout.LayoutParams) (obj1)).addRule(11);
                    if (k == null)
                    {
                        h.setLayoutParams(((android.view.ViewGroup.LayoutParams) (obj1)));
                    } else
                    if (g != null)
                    {
                        g.setLayoutParams(((android.view.ViewGroup.LayoutParams) (obj1)));
                    }
                    obj1 = new android.widget.RelativeLayout.LayoutParams(i1, k1 - l1);
                    ((android.widget.RelativeLayout.LayoutParams) (obj1)).addRule(3, i);
                    if (a != null)
                    {
                        a.setLayoutParams(((android.view.ViewGroup.LayoutParams) (obj1)));
                    }
                    i1 = 1;
                }
            }
        }
        if (i1 == 0)
        {
            e.c("Error setting WebViewLayout Params.");
            j1.h();
            return;
        }
        c = true;
        a.clearView();
        a.clearHistory();
        a.loadUrl(s);
        if (d != null)
        {
            b.addView(d);
        }
        if (l != null)
        {
            b.addView(l);
        }
        b.addView(a);
        if (k == null)
        {
            b.addView(h);
            b.bringChildToFront(h);
        } else
        {
            b.addView(g);
            b.bringChildToFront(g);
        }
        s = b.getParent();
        if (s != null)
        {
            e.b("Removing webViewLayout from its previous parent.");
            ((ViewGroup)s).removeView(b);
        }
        f.addView(b);
        f.bringChildToFront(b);
        a.requestFocus();
        e.b("WebView displayed.");
        return;
        if (true) goto _L9; else goto _L8
_L8:
    }

    public final void b()
    {
        if (!c)
        {
            return;
        }
        int i1;
        if (b == null || h == null && g == null || a == null)
        {
            i1 = 0;
        } else
        {
            Object obj = YuMePlayerInterfaceImpl.d;
            i1 = ((J) (obj)).p();
            int j1 = ((J) (obj)).q();
            obj = b.getLayoutParams();
            obj.width = i1;
            obj.height = j1;
            b.setLayoutParams(((android.view.ViewGroup.LayoutParams) (obj)));
            obj = (android.widget.RelativeLayout.LayoutParams)a.getLayoutParams();
            obj.width = i1;
            obj.height = j1;
            a.setLayoutParams(((android.view.ViewGroup.LayoutParams) (obj)));
            if (l != null)
            {
                android.widget.RelativeLayout.LayoutParams layoutparams = (android.widget.RelativeLayout.LayoutParams)l.getLayoutParams();
                layoutparams.width = i1;
                layoutparams.height = j;
                l.setLayoutParams(layoutparams);
            }
            i1 = 1;
        }
        if (i1 == 0)
        {
            e.c("Error updating WebView Layout.");
            return;
        } else
        {
            e.b("WebView Layout Updated.");
            return;
        }
    }

    public final void d()
    {
        if (k != null)
        {
            k.recycle();
            k = null;
        }
    }

}
