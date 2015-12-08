// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.ads.internal.view;

import android.content.Context;
import android.webkit.WebView;

public class e extends WebView
{

    private boolean a;

    public e(Context context)
    {
        super(context);
    }

    public boolean b()
    {
        return a;
    }

    public void destroy()
    {
        a = true;
        super.destroy();
    }
}
