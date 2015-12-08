// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.pin.view;

import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.pinterest.ui.imageview.WebImageView;

// Referenced classes of package com.pinterest.activity.pin.view:
//            PinCloseupImageView

class this._cls0 extends WebViewClient
{

    final PinCloseupImageView this$0;

    public void onLoadResource(WebView webview, String s)
    {
        PinCloseupImageView.access$300(PinCloseupImageView.this);
    }

    public void onPageFinished(WebView webview, String s)
    {
        PinCloseupImageView.access$300(PinCloseupImageView.this);
        class _cls1
            implements Runnable
        {

            final PinCloseupImageView._cls3 this$1;

            public void run()
            {
                PinCloseupImageView.access$400(this$0);
                if (PinCloseupImageView.access$000(this$0) != null)
                {
                    removeView(PinCloseupImageView.access$000(this$0));
                    PinCloseupImageView.access$000(this$0).setBitmap(null, false);
                    PinCloseupImageView.access$002(this$0, null);
                }
            }

            _cls1()
            {
                this$1 = PinCloseupImageView._cls3.this;
                super();
            }
        }

        if (PinCloseupImageView.access$000(PinCloseupImageView.this) != null)
        {
            PinCloseupImageView.access$000(PinCloseupImageView.this).postDelayed(new _cls1(), 500L);
        }
    }

    _cls1()
    {
        this$0 = PinCloseupImageView.this;
        super();
    }
}
