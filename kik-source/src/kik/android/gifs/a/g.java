// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.gifs.a;

import android.content.Context;
import android.net.Uri;
import com.android.volley.toolbox.o;
import com.kik.g.p;
import java.util.Locale;
import kik.android.util.cq;

// Referenced classes of package kik.android.gifs.a:
//            b, j, i, h, 
//            k, l, m

public final class g extends b
{

    private static final String b = (new StringBuilder()).append(String.format("https://api.riffsy.com/v1/%s?key=FJETZPXGPKBE", new Object[] {
        "search"
    })).append("&tag=%s&limit=%d&pos=%s&&safesearch=%s&locale=%s&type=silent").toString();
    private static final String c = (new StringBuilder()).append(String.format("https://api.riffsy.com/v1/%s?key=FJETZPXGPKBE", new Object[] {
        "tags"
    })).append("&type=explore&preview=true").toString();
    private static final String d = (new StringBuilder()).append(String.format("https://api.riffsy.com/v1/%s?key=FJETZPXGPKBE", new Object[] {
        "tags"
    })).append("&type=emoji&locale=%s").toString();
    private static final String e = (new StringBuilder()).append(String.format("https://api.riffsy.com/v1/%s?key=FJETZPXGPKBE", new Object[] {
        "suggestpreview"
    })).append("&tag=%s&locale=%s&limit=%s&type=silent").toString();

    protected g(Context context)
    {
        super(context);
    }

    private com.android.volley.r.a a(p p1)
    {
        return new j(this, p1);
    }

    public final p a()
    {
        p p1 = new p();
        o o1 = new o("https://api.riffsy.com/v1/trending?type=silent", new i(this, p1), a(p1), (byte)0);
        o1.a("GIF_TRENDING_KEY");
        a.a(o1);
        return p1;
    }

    public final p a(String s, int i1, Locale locale)
    {
        String s1;
        p p1;
        String s2;
        String s3;
        s1 = null;
        p1 = new p();
        s2 = Uri.encode(s);
        s3 = b;
        if (cq.c(null))
        {
            s1 = "0";
        }
        static final class _cls1
        {

            static final int a[];

            static 
            {
                a = new int[kik.android.gifs.a.b.a.a().length];
                try
                {
                    a[b.a.a - 1] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror4) { }
                try
                {
                    a[b.a.b - 1] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    a[b.a.c - 1] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    a[b.a.d - 1] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[b.a.e - 1] = 5;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        _cls1.a[i1 - 1];
        JVM INSTR tableswitch 4 5: default 64
    //                   4 145
    //                   5 151;
           goto _L1 _L2 _L3
_L1:
        s = "strict";
_L5:
        s = new o(String.format(s3, new Object[] {
            s2, Integer.valueOf(50), s1, s, locale
        }), new h(this, p1), a(p1), (byte)0);
        s.a("GIF_RESULT_KEY");
        a.a(s);
        return p1;
_L2:
        s = "moderate";
        continue; /* Loop/switch isn't completed */
_L3:
        s = "off";
        if (true) goto _L5; else goto _L4
_L4:
    }

    public final p a(Locale locale)
    {
        p p1 = new p();
        locale = new o(String.format(d, new Object[] {
            locale
        }), new k(this, p1), a(p1), (byte)0);
        locale.a("GIF_EMOJI_KEY");
        a.a(locale);
        return p1;
    }

    public final void a(String s, String s1, int i1)
    {
        s = new o(String.format("http://api.riffsy.com/v1/registershare?key=FJETZPXGPKBE&id=%s&tag=%s&index=%s", new Object[] {
            s, s1, Integer.toString(i1)
        }), new l(this), new m(this), (byte)0);
        a.a(s);
    }

}
