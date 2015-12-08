// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.microsoft.advertising.android;

import android.view.ViewGroup;

// Referenced classes of package com.microsoft.advertising.android:
//            AdWebView

final class a
    implements Runnable
{

    final AdWebView a;

    public final void run()
    {
        if (AdWebView.w() != null)
        {
            AdWebView.w().setVisibility(0);
        }
    }

    (AdWebView adwebview)
    {
        a = adwebview;
        super();
    }
}
