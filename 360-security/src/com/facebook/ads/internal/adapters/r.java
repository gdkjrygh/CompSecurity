// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.ads.internal.adapters;

import android.content.Context;
import android.webkit.WebView;
import com.facebook.ads.internal.util.p;
import com.facebook.ads.internal.util.t;
import java.util.Collections;
import java.util.Map;

// Referenced classes of package com.facebook.ads.internal.adapters:
//            j, q, k

public class r extends j
{

    private final WebView b;
    private q c;

    public r(Context context, WebView webview, k k)
    {
        super(context, k);
        b = webview;
    }

    private void a(Map map)
    {
        String s;
        if (c != null)
        {
            if (!t.a(s = c.e()))
            {
                (new p(map)).execute(new String[] {
                    s
                });
                return;
            }
        }
    }

    public void a(q q1)
    {
        c = q1;
    }

    protected void b()
    {
        if (c == null)
        {
            return;
        }
        if (b != null && !t.a(c.f()))
        {
            b.loadUrl((new StringBuilder()).append("javascript:").append(c.f()).toString());
        }
        a(Collections.singletonMap("evt", "native_imp"));
    }

    public void c()
    {
        a(Collections.singletonMap("evt", "interstitial_displayed"));
    }
}
