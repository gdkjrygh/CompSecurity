// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.amazon.device.associates;

import android.content.Context;
import android.webkit.WebView;
import java.util.Set;

// Referenced classes of package com.amazon.device.associates:
//            LinkService, ab, an, OpenRetailPageRequest

public class ba
    implements LinkService
{

    private ab a;

    protected ba(Context context, String s, Set set)
    {
        a = ab.a(context, s, set);
    }

    public void openRetailPage(OpenRetailPageRequest openretailpagerequest)
    {
        an.a(openretailpagerequest, "request");
        a.a(openretailpagerequest);
    }

    public boolean overrideLinkInvocation(WebView webview, String s)
    {
        an.a(webview, "webView");
        an.a(s, "url");
        a.a(webview, s);
        return true;
    }
}
