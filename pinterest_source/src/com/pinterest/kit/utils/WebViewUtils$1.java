// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.kit.utils;

import android.webkit.WebView;

final class val.webVw
    implements Runnable
{

    final WebView val$webVw;

    public final void run()
    {
        val$webVw.destroy();
    }

    ()
    {
        val$webVw = webview;
        super();
    }
}
