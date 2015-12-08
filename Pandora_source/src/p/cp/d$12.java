// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.cp;

import android.webkit.WebView;
import java.util.HashMap;
import p.cq.b;

// Referenced classes of package p.cp:
//            d, c

class Object
    implements b
{

    final WebView a;
    final c b;
    final d c;

    public void a(boolean flag, HashMap hashmap)
    {
        HashMap hashmap1 = hashmap;
        if (hashmap == null)
        {
            hashmap1 = new HashMap();
        }
        if (flag)
        {
            hashmap1.put("success", "true");
        }
        c.a(a, b, hashmap1);
    }

    bkit.WebView(d d1, WebView webview, c c1)
    {
        c = d1;
        a = webview;
        b = c1;
        super();
    }
}
