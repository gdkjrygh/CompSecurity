// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.microsoft.advertising.android;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;

// Referenced classes of package com.microsoft.advertising.android:
//            AdWebView, ax

final class a
    implements Runnable
{

    final estLayout a;

    public final void run()
    {
        AdWebView.c(a(a));
        if (AdWebView.u() != null)
        {
            AdWebView.u().b();
            ((ViewGroup)((Activity)a(a).getContext()).getWindow().getDecorView()).removeView(AdWebView.u());
            AdWebView.v();
            if (!ontext(a).o())
            {
                AdWebView.d(a(a));
            }
            a(a).requestLayout();
        }
    }

    ( )
    {
        a = ;
        super();
    }

    // Unreferenced inner class com/microsoft/advertising/android/AdWebView$2

/* anonymous class */
    final class AdWebView._cls2 extends by.b
    {

        final AdWebView a;

        static AdWebView a(AdWebView._cls2 _pcls2)
        {
            return _pcls2.a;
        }

        public final void onClick(View view)
        {
            run();
        }

        public final void run()
        {
            AdWebView._cls2._cls1 _lcls1 = new AdWebView._cls2._cls1(this);
            if (Looper.myLooper() != Looper.getMainLooper())
            {
                AdWebView.e(a).post(_lcls1);
                return;
            } else
            {
                _lcls1.run();
                return;
            }
        }

            
            {
                a = adwebview;
                super();
            }
    }

}
