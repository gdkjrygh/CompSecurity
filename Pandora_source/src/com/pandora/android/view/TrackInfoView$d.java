// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.android.view;

import android.webkit.WebView;
import p.cp.a;
import p.cp.b;

// Referenced classes of package com.pandora.android.view:
//            TrackInfoView

private static class <init> extends a
{

    private TrackInfoView a;

    public void onReceivedTitle(WebView webview, String s)
    {
label0:
        {
            webview = a.getOnTitleChangeListener();
            if (webview != null)
            {
                if (!"Webpage not available".equalsIgnoreCase(s))
                {
                    break label0;
                }
                webview.a("");
            }
            return;
        }
        if (b.h(s))
        {
            webview.a("");
            return;
        } else
        {
            webview.a(s);
            return;
        }
    }

    private (TrackInfoView trackinfoview)
    {
        a = trackinfoview;
    }

    a(TrackInfoView trackinfoview, a a1)
    {
        this(trackinfoview);
    }
}
