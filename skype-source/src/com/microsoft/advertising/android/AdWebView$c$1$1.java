// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.microsoft.advertising.android;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.widget.RelativeLayout;

// Referenced classes of package com.microsoft.advertising.android:
//            AdWebView

final class c
    implements Runnable
{

    final en a;
    private final RelativeLayout b;
    private final android.webkit.CustomViewCallback c;

    public final void run()
    {
        b.setVisibility(8);
        c.onCustomViewHidden();
    }

    ( , RelativeLayout relativelayout, android.webkit.CustomViewCallback customviewcallback)
    {
        a = ;
        b = relativelayout;
        c = customviewcallback;
        super();
    }

    // Unreferenced inner class com/microsoft/advertising/android/AdWebView$c$1

/* anonymous class */
    final class AdWebView.c._cls1
        implements android.view.View.OnClickListener
    {

        final AdWebView.c a;
        private final RelativeLayout b;
        private final android.webkit.WebChromeClient.CustomViewCallback c;

        public final void onClick(View view)
        {
            view = new AdWebView.c._cls1._cls1(this, b, c);
            if (Looper.myLooper() != Looper.getMainLooper())
            {
                AdWebView.e(AdWebView.c.a(a)).post(view);
                return;
            } else
            {
                view.run();
                return;
            }
        }

            
            {
                a = c1;
                b = relativelayout;
                c = customviewcallback;
                super();
            }
    }

}
