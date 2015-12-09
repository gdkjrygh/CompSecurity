// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.cp;

import android.webkit.WebView;
import com.pandora.android.util.s;
import java.util.HashMap;
import p.cq.b;

// Referenced classes of package p.cp:
//            d

class .Object
    implements b
{

    final String a;
    final WebView b;
    final String c;
    final d d;

    public void a(boolean flag, HashMap hashmap)
    {
        if (s.a(a))
        {
            return;
        } else
        {
            hashmap = p.cp.d.a(d, "success", Boolean.toString(flag));
            d.a(b, a, c, hashmap);
            return;
        }
    }

    .String(d d1, String s1, WebView webview, String s2)
    {
        d = d1;
        a = s1;
        b = webview;
        c = s2;
        super();
    }
}
