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

final class a extends a
{

    final AdWebView a;

    static AdWebView a(a a1)
    {
        return a1.a;
    }

    public final void onClick(View view)
    {
        run();
    }

    public final void run()
    {
        Runnable runnable = new Runnable() {

            final AdWebView._cls2 a;

            public final void run()
            {
                AdWebView.c(AdWebView._cls2.a(a));
                if (AdWebView.u() != null)
                {
                    AdWebView.u().b();
                    ((ViewGroup)((Activity)AdWebView._cls2.a(a).getContext()).getWindow().getDecorView()).removeView(AdWebView.u());
                    AdWebView.v();
                    if (!AdWebView._cls2.a(a).o())
                    {
                        AdWebView.d(AdWebView._cls2.a(a));
                    }
                    AdWebView._cls2.a(a).requestLayout();
                }
            }

            
            {
                a = AdWebView._cls2.this;
                super();
            }
        };
        if (Looper.myLooper() != Looper.getMainLooper())
        {
            AdWebView.e(a).post(runnable);
            return;
        } else
        {
            runnable.run();
            return;
        }
    }

    _cls1.a(AdWebView adwebview)
    {
        a = adwebview;
        super();
    }
}
