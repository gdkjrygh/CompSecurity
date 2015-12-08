// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tremorvideo.sdk.android.a;

import android.webkit.WebView;
import java.util.HashMap;
import java.util.Map;

// Referenced classes of package com.tremorvideo.sdk.android.a:
//            d, e, f, a

class c
{
    private static interface a
    {

        public abstract com.tremorvideo.sdk.android.a.a b(Map map, WebView webview);
    }


    private static Map a;

    static com.tremorvideo.sdk.android.a.a a(String s, Map map, WebView webview)
    {
        s = (a)a.get(s);
        if (s != null)
        {
            return s.b(map, webview);
        } else
        {
            return null;
        }
    }

    static 
    {
        a = new HashMap();
        a.put("trigger-event", new d());
        a.put("cancel-auto-skip", new e());
        a.put("validate-complete", new f());
    }
}
