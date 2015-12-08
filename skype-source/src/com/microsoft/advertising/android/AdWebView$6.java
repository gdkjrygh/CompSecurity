// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.microsoft.advertising.android;

import android.view.KeyEvent;
import android.view.View;

// Referenced classes of package com.microsoft.advertising.android:
//            AdWebView

final class b
    implements android.view.stener
{

    final AdWebView a;
    private final AdWebView b;

    public final boolean onKey(View view, int i, KeyEvent keyevent)
    {
        if (i == 4)
        {
            AdWebView.a(a, b);
            return true;
        } else
        {
            return false;
        }
    }

    (AdWebView adwebview, AdWebView adwebview1)
    {
        a = adwebview;
        b = adwebview1;
        super();
    }
}
