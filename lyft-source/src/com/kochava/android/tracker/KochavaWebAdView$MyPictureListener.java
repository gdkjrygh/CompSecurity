// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kochava.android.tracker;

import android.app.ProgressDialog;
import android.graphics.Picture;
import android.webkit.WebView;

// Referenced classes of package com.kochava.android.tracker:
//            KochavaWebAdView

class <init>
    implements android.webkit.tureListener
{

    final KochavaWebAdView a;

    public void onNewPicture(WebView webview, Picture picture)
    {
        if (a.b.isShowing())
        {
            a.b.dismiss();
        }
    }

    private (KochavaWebAdView kochavawebadview)
    {
        a = kochavawebadview;
        super();
    }

    a(KochavaWebAdView kochavawebadview, a a1)
    {
        this(kochavawebadview);
    }
}
