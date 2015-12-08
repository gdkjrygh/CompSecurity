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
    implements android.view.stener
{

    final a a;
    private final RelativeLayout b;
    private final android.webkit.t.CustomViewCallback c;

    public final void onClick(View view)
    {
        view = new Runnable(b, c) {

            final AdWebView.c._cls1 a;
            private final RelativeLayout b;
            private final android.webkit.WebChromeClient.CustomViewCallback c;

            public final void run()
            {
                b.setVisibility(8);
                c.onCustomViewHidden();
            }

            
            {
                a = AdWebView.c._cls1.this;
                b = relativelayout;
                c = customviewcallback;
                super();
            }
        };
        if (Looper.myLooper() != Looper.getMainLooper())
        {
            AdWebView.e(k(a)).post(view);
            return;
        } else
        {
            view.run();
            return;
        }
    }

    k(k k, RelativeLayout relativelayout, android.webkit.t.CustomViewCallback customviewcallback)
    {
        a = k;
        b = relativelayout;
        c = customviewcallback;
        super();
    }
}
