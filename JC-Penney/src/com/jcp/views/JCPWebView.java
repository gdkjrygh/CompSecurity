// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.views;

import android.content.Context;
import android.util.AttributeSet;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.jcp.JCP;

public class JCPWebView extends WebView
{

    public JCPWebView(Context context)
    {
        super(context);
        a();
    }

    public JCPWebView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        a();
    }

    public JCPWebView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        a();
    }

    private void a()
    {
        if (isInEditMode())
        {
            return;
        } else
        {
            getSettings().setUserAgentString(String.format("%s;%s", new Object[] {
                getSettings().getUserAgentString(), JCP.l()
            }));
            b();
            return;
        }
    }

    private void b()
    {
        if (android.os.Build.VERSION.SDK_INT >= 21)
        {
            getSettings().setMixedContentMode(2);
        }
    }
}
