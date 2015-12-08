// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.release;

import android.util.Log;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.widget.ProgressBar;

// Referenced classes of package com.roidapp.photogrid.release:
//            More

final class lk extends WebChromeClient
{

    final More a;

    lk(More more)
    {
        a = more;
        super();
    }

    public final void onProgressChanged(WebView webview, int i)
    {
        Log.i("More", (new StringBuilder("progress:")).append(i).toString());
        if (i == 100)
        {
            More.a(a).setVisibility(8);
            if (More.b(a))
            {
                More.c(a).loadUrl("javascript:show()");
            }
            More.c(a).loadUrl("javascript:showNewer()");
        }
    }
}
