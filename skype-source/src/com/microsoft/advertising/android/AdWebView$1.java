// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.microsoft.advertising.android;

import android.view.View;
import android.widget.Button;

// Referenced classes of package com.microsoft.advertising.android:
//            AdWebView, an

final class a
    implements android.view.Listener
{

    final AdWebView a;

    public final void onClick(View view)
    {
        if (view == AdWebView.a(a))
        {
            AdWebView.b(a).a();
            AdWebView.a(a).setVisibility(4);
        }
    }

    (AdWebView adwebview)
    {
        a = adwebview;
        super();
    }
}
