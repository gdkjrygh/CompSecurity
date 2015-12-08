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

    private String a;
    private H b;

    public final void run()
    {
        H.a(b).loadUrl(a);
    }

    (H h, String s)
    {
        b = h;
        a = s;
        super();
    }
}
