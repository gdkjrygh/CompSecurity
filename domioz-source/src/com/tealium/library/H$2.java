// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tealium.library;

import android.webkit.WebView;

// Referenced classes of package com.tealium.library:
//            H

final class a
    implements Runnable
{

    private H a;

    public final void run()
    {
        Object obj = (new StringBuilder()).append(H.e(a));
        char c;
        if (H.e(a).contains("?"))
        {
            c = '&';
        } else
        {
            c = '?';
        }
        obj = ((StringBuilder) (obj)).append(c).append("timestamp_unix=").append(System.currentTimeMillis() / 1000L).toString();
        H.a(a).loadUrl(((String) (obj)));
    }

    (H h)
    {
        a = h;
        super();
    }
}
