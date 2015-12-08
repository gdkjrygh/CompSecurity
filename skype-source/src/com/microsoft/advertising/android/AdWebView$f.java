// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.microsoft.advertising.android;

import android.content.Context;

// Referenced classes of package com.microsoft.advertising.android:
//            AdWebView

private final class d extends Thread
{

    final AdWebView a;
    private AdWebView b;
    private Context c;
    private String d;

    public final void run()
    {
        AdWebView.a(b, c, d);
    }

    public (AdWebView adwebview, Context context, AdWebView adwebview1, String s)
    {
        a = adwebview;
        super();
        b = adwebview1;
        c = context;
        d = s;
    }
}
