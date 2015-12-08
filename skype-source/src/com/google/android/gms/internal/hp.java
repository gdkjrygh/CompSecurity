// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.text.TextUtils;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.android.gms.ads.internal.util.client.b;
import com.google.android.gms.common.internal.x;
import java.net.URI;
import java.net.URISyntaxException;

// Referenced classes of package com.google.android.gms.internal:
//            ey, hi, hj

public final class hp extends WebViewClient
{

    private final String a;
    private boolean b;
    private final hi c;
    private final ey d;

    public hp(ey ey1, hi hi1, String s)
    {
        a = b(s);
        b = false;
        c = hi1;
        d = ey1;
    }

    private boolean a(String s)
    {
        s = b(s);
        if (!TextUtils.isEmpty(s)) goto _L2; else goto _L1
_L1:
        return false;
_L2:
        String s1;
        Object obj;
        Object obj1;
        try
        {
            obj = new URI(s);
            if (!"passback".equals(((URI) (obj)).getScheme()))
            {
                continue; /* Loop/switch isn't completed */
            }
            com.google.android.gms.ads.internal.util.client.b.a(3);
            d.b();
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            com.google.android.gms.ads.internal.util.client.b.a(s.getMessage());
            return false;
        }
        return true;
        if (TextUtils.isEmpty(a)) goto _L1; else goto _L3
_L3:
        obj1 = new URI(a);
        s = ((URI) (obj1)).getHost();
        s1 = ((URI) (obj)).getHost();
        obj1 = ((URI) (obj1)).getPath();
        obj = ((URI) (obj)).getPath();
        if (!x.a(s, s1) || !x.a(obj1, obj)) goto _L1; else goto _L4
_L4:
        com.google.android.gms.ads.internal.util.client.b.a(3);
        d.b();
        return true;
    }

    private static String b(String s)
    {
        if (!TextUtils.isEmpty(s)) goto _L2; else goto _L1
_L1:
        return s;
_L2:
        if (!s.endsWith("/")) goto _L1; else goto _L3
_L3:
        String s1 = s.substring(0, s.length() - 1);
        return s1;
        IndexOutOfBoundsException indexoutofboundsexception;
        indexoutofboundsexception;
        com.google.android.gms.ads.internal.util.client.b.a(indexoutofboundsexception.getMessage());
        return s;
    }

    public final void onLoadResource(WebView webview, String s)
    {
        com.google.android.gms.ads.internal.util.client.b.a(3);
        if (!a(s))
        {
            c.j().onLoadResource(c.a(), s);
        }
    }

    public final void onPageFinished(WebView webview, String s)
    {
        com.google.android.gms.ads.internal.util.client.b.a(3);
        if (!b)
        {
            d.a();
            b = true;
        }
    }

    public final boolean shouldOverrideUrlLoading(WebView webview, String s)
    {
        com.google.android.gms.ads.internal.util.client.b.a(3);
        if (a(s))
        {
            com.google.android.gms.ads.internal.util.client.b.a(3);
            return true;
        } else
        {
            return c.j().shouldOverrideUrlLoading(c.a(), s);
        }
    }
}
