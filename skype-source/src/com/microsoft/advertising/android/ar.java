// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.microsoft.advertising.android;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import java.lang.ref.WeakReference;
import java.util.Locale;

// Referenced classes of package com.microsoft.advertising.android:
//            b, by, aq, g, 
//            j, r, AdWebView, ad, 
//            d

final class ar extends b
{
    static final class a extends Handler
    {

        private final WeakReference a;
        private final WeakReference b;

        public final void handleMessage(Message message)
        {
            ar ar1;
label0:
            {
                message = (Bitmap)message.obj;
                ImageView imageview = (ImageView)a.get();
                ar1 = (ar)b.get();
                if (imageview != null && ar1 != null)
                {
                    if (message == null)
                    {
                        break label0;
                    }
                    imageview.setImageBitmap(message);
                    ar1.r();
                }
                return;
            }
            ar1.a(null, 2);
        }

        a(ImageView imageview, ar ar1)
        {
            super(Looper.getMainLooper());
            a = new WeakReference(imageview);
            b = new WeakReference(ar1);
        }
    }


    private AdWebView e;
    private final j f;
    private by.c g;

    public ar(Context context, g g1, j j1)
    {
        super(context, g1, null);
        e = null;
        f = j1;
        setLayoutParams(by.a());
        g = new by.c(context, j1) {

            final ar a;
            private final j b;

            public final boolean onSingleTapUp(MotionEvent motionevent)
            {
                return b.c(a.a);
            }

            
            {
                a = ar.this;
                b = j1;
                super(context);
            }
        };
        setOnTouchListener(g);
    }

    public final boolean a(d d, b.a a1)
    {
        if (d == null || !(d instanceof aq))
        {
            return false;
        }
        super.setAdLoadedListener(a1);
        a = d;
        d = ((aq)d).h();
        a1 = new LinearLayout(getContext());
        a1.setLayoutParams(new android.view.ViewGroup.LayoutParams(b.e().intValue(), b.f().intValue()));
        a1.setOrientation(1);
        a1.setBackgroundColor(-1);
        a1.setGravity(17);
        a1.setPadding(0, 0, 0, 0);
        if (d.toLowerCase(Locale.ENGLISH).endsWith(".gif"))
        {
            e = f.i().a();
            e.a();
            e.setId(0);
            e.setVerticalScrollBarEnabled(false);
            e.setHorizontalScrollBarEnabled(false);
            d = "<html><style>*{margin:0;padding:0;background-color:transparent}</style><head><script language =\"javascript\">function scaleSize(){var window_height = document.body.clientHeight;var window_width = document.body.clientWidth;var image_width = document.getElementById('animatedGIF').naturalWidth;var image_height = document.getElementById('animatedGIF').naturalHeight;var height_ratio = image_height / window_height;var width_ratio = image_width / window_width;if(height_ratio>width_ratio){document.getElementById('animatedGIF').style.width = \"auto\";document.getElementById('animatedGIF').style.height = window_height}else{document.getElementById('animatedGIF').style.width = window_width;document.getElementById('animatedGIF').style.height = \"auto\"}};</script></head><body onload=\"javascript:scaleSize()\" onresize=\"javascript:scaleSize()\" style=\"padding:0;margin:0;background-color:transparent\"><table cellpadding=0 cellspacing=0 id=\"tableGIF_ID\" cellpadding=\"0\" style=\"border=0;padding:0;margin-top:0;width:100%%;height:100%%;\"><tr style=\"border=0;padding:0\"><td style=\"border=0;padding:0;valign:middle\"><center><img id=\"animatedGIF\" src=\"$(GIFIMAGE)\"/></center></td></tr></table></body></html>".replace("$(GIFIMAGE)", d);
            e.c(d);
            e.setBackgroundColor(-1);
            addView(e);
            super.r();
            return true;
        } else
        {
            Object obj = new ImageView(getContext());
            ((ImageView) (obj)).setLayoutParams(new android.widget.FrameLayout.LayoutParams(-1, -1));
            ((ImageView) (obj)).setVerticalScrollBarEnabled(false);
            ((ImageView) (obj)).setHorizontalScrollBarEnabled(false);
            a1.addView(((android.view.View) (obj)));
            obj = new a(((ImageView) (obj)), this);
            b.d().a(((Handler) (obj)), d, a);
            addView(a1);
            return true;
        }
    }

    public final void t()
    {
        if (e != null)
        {
            e.c();
            ViewGroup viewgroup = (ViewGroup)e.getParent();
            if (viewgroup != null)
            {
                viewgroup.removeView(e);
            }
            f.i().a(e);
        }
    }
}
