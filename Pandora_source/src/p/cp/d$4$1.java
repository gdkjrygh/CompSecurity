// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.cp;

import android.os.Handler;
import android.webkit.WebView;
import java.util.HashMap;

// Referenced classes of package p.cp:
//            d

class bject
    implements Runnable
{

    final String a;
    final tring b;

    public void run()
    {
        HashMap hashmap1 = d.a(b.b, "responseText", a);
        HashMap hashmap;
        boolean flag;
        if (a != null && !a.equalsIgnoreCase("false"))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        hashmap = hashmap1;
        if (hashmap1 == null)
        {
            hashmap = new HashMap();
        }
        if (flag)
        {
            hashmap.put("success", String.valueOf(true));
        } else
        {
            hashmap.put("success", String.valueOf(false));
        }
        b.b.a(b.b, b.b, b.b, hashmap);
    }

    tring(tring tring, String s)
    {
        b = tring;
        a = s;
        super();
    }

    // Unreferenced inner class p/cp/d$4

/* anonymous class */
    class d._cls4
        implements p.cm.r.a
    {

        final WebView a;
        final String b;
        final String c;
        final d d;

        public void a(String s, String s1)
        {
            p.cp.d.a(d).post(new d._cls4._cls1(this, s1));
        }

            
            {
                d = d1;
                a = webview;
                b = s;
                c = s1;
                super();
            }
    }

}
