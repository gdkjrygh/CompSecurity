// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tealium.library;

import android.app.Activity;
import android.webkit.WebSettings;
import android.webkit.WebView;
import java.io.File;
import java.util.Locale;

// Referenced classes of package com.tealium.library:
//            H, JSInterface, d

final class b
    implements Runnable
{

    final H a;
    private Activity b;

    public final void run()
    {
        H.a(a, new WebView(b));
        WebSettings websettings = H.a(a).getSettings();
        websettings.setAppCacheEnabled(true);
        websettings.setDatabaseEnabled(true);
        websettings.setJavaScriptEnabled(true);
        websettings.setDomStorageEnabled(true);
        String s = String.format(Locale.ROOT, "%s%stealium%s", new Object[] {
            b.getCacheDir().getAbsolutePath(), File.separator, File.separator
        });
        websettings.setAppCachePath(s);
        if (android.os.d.VERSION.SDK_INT < 19)
        {
            websettings.setDatabasePath(s);
        }
        H.a(a).addJavascriptInterface(new JSInterface(H.b(a)), "WCC");
        H.a(a).setWebChromeClient(H.b(a));
        H.a(a).setWebViewClient(H.c(a));
        class _cls1
            implements Runnable
        {

            private H._cls1 a;

            public final void run()
            {
                H.d(a.a);
            }

            _cls1()
            {
                a = H._cls1.this;
                super();
            }
        }

        d.a(new _cls1());
    }

    _cls1(H h, Activity activity)
    {
        a = h;
        b = activity;
        super();
    }
}
