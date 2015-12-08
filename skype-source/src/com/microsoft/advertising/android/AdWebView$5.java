// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.microsoft.advertising.android;

import android.view.View;

// Referenced classes of package com.microsoft.advertising.android:
//            AdWebView

final class b
    implements android.view.Listener
{

    final AdWebView a;
    private final AdWebView b;

    public final void onClick(View view)
    {
        AdWebView.a(a, b);
    }

    (AdWebView adwebview, AdWebView adwebview1)
    {
        a = adwebview;
        b = adwebview1;
        super();
    }
}
