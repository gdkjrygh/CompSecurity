// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.ui.result;

import android.content.Context;
import android.webkit.WebSettings;
import com.qihoo.security.widget.CommonWebView;

// Referenced classes of package com.qihoo.security.ui.result:
//            b

public class e
{

    public Context a;
    public String b;
    private CommonWebView c;

    public e(Context context, String s, String s1, String s2)
    {
        a = null;
        b = null;
        a = context;
        b = s;
        c = new CommonWebView(context);
        c.setWebViewClient(new b(s1, s2));
        c.getSettings().setJavaScriptEnabled(true);
    }

    public void a()
    {
        c.loadUrl(b);
    }
}
