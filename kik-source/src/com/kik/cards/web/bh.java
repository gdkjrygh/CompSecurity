// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kik.cards.web;

import android.webkit.WebView;
import com.kik.g.as;
import kik.android.util.cq;
import org.json.JSONObject;

// Referenced classes of package com.kik.cards.web:
//            WebViewBrowserMetadataPlugin, bf

final class bh
    implements as
{

    final String a;
    final String b;
    final WebViewBrowserMetadataPlugin c;

    bh(WebViewBrowserMetadataPlugin webviewbrowsermetadataplugin, String s, String s1)
    {
        c = webviewbrowsermetadataplugin;
        a = s;
        b = s1;
        super();
    }

    public final Object a(Object obj)
    {
        JSONObject jsonobject = (JSONObject)obj;
        String s = jsonobject.optString("app-icon");
        String s1 = jsonobject.optString("preview-image");
        obj = s;
        if (!cq.c(s))
        {
            obj = bf.a(s, WebViewBrowserMetadataPlugin.b(c).getUrl());
        }
        s = s1;
        if (!cq.c(s1))
        {
            s = bf.a(s1, WebViewBrowserMetadataPlugin.b(c).getUrl());
        }
        return new av.a(jsonobject.optString("title"), jsonobject.optString("description"), s, jsonobject.optString("layout"), jsonobject.optString("url"), jsonobject.optString("app-name"), ((String) (obj)), a, b);
    }
}
