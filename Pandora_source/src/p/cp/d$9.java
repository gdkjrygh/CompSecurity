// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.cp;

import android.webkit.WebView;
import com.pandora.android.util.s;
import java.util.HashMap;
import p.cq.a;

// Referenced classes of package p.cp:
//            d, c

class .Object
    implements a
{

    final WebView a;
    final c b;
    final d c;

    public void a(boolean flag, String s1)
    {
        if (flag)
        {
            s1 = p.cp.d.a(c, "success", "true");
        } else
        {
            HashMap hashmap = p.cp.d.a(c, "success", "false");
            String s2 = s1;
            if (s.a(s1))
            {
                s2 = "Fail to add Calendar Event";
            }
            hashmap.put("error", s2);
            s1 = hashmap;
        }
        c.a(a, b, s1);
    }

    ebkit.WebView(d d1, WebView webview, c c1)
    {
        c = d1;
        a = webview;
        b = c1;
        super();
    }
}
