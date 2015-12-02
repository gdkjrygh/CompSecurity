// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.c;

import android.net.Uri;
import android.webkit.WebView;
import com.facebook.debug.log.b;
import com.google.common.a.fi;
import java.util.Set;

public class u
{

    public static final Class a = com/facebook/c/u;
    public static final Set b = fi.a("http", "https");

    public u()
    {
    }

    private final boolean a(String s)
    {
        Uri uri = Uri.parse(s);
        if (!b.contains(uri.getScheme()))
        {
            com.facebook.debug.log.b.b(a, (new StringBuilder()).append(s).append(" contains disallowed scheme").toString());
            return false;
        } else
        {
            return true;
        }
    }

    public void a(WebView webview, String s)
    {
        if (a(s))
        {
            webview.loadUrl(s);
        }
    }

}
