// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.microsoft.advertising.android;

import java.io.InputStream;
import org.apache.http.client.methods.HttpGet;

// Referenced classes of package com.microsoft.advertising.android:
//            d, av, l, i, 
//            ae, ai, p, ag, 
//            t, aj, al, by, 
//            IAdFactory

final class n
    implements Runnable
{
    public static interface a
    {

        public abstract void a(n n1, b b1);
    }

    public static final class b
    {

        d a;
        String b;
        i c;
        boolean d;

        public b(d d1, String s, i j, boolean flag)
        {
            a = d1;
            b = s;
            c = j;
            d = flag;
        }
    }


    private final t a;
    private final a b;
    private final ai c;
    private final ad.a d;
    private l e;

    public n(a a1, t t1, ai ai1, ad.a a2)
    {
        a = t1;
        b = a1;
        c = ai1;
        d = a2;
    }

    private void a(b b1)
    {
        if (b1.a != null)
        {
            av.a("AdRequestRunnable", (new StringBuilder("detected ad type: ")).append(b1.a.e()).toString());
            if (b1.a.c() != null)
            {
                b1.a.c().b(com.microsoft.advertising.android.a.a.a.b);
            }
        }
        b.a(this, b1);
    }

    public final ai a()
    {
        return c;
    }

    public final ad.a b()
    {
        return d;
    }

    public final void run()
    {
        av.a("adFetching", "AdRequest.run()");
        if (c != null)
        {
            av.a("adFetching", "firing AD_FETCH_STARTED");
            c.a(null, ae.f);
        }
        e = new l();
        e.b(com.microsoft.advertising.android.a.a.a.a);
        p.a().i();
        ag.a().a(a.a());
        av.a("adFetching", "AdRequest.run() - no hardcoded ad object");
        Object obj2;
        Object obj3;
        Object obj4;
        boolean flag2;
        boolean flag3;
        obj2 = null;
        flag3 = false;
        flag2 = false;
        obj4 = null;
        obj3 = null;
        ag.a().a(a.a());
        Object obj;
        boolean flag1;
        obj = obj4;
        flag1 = flag3;
        a.c = aj.a(p.a().b(), c);
        obj = obj4;
        flag1 = flag3;
        Object obj1 = a.b();
        obj = obj4;
        flag1 = flag3;
        av.a("ArcRequestResponse", ((HttpGet) (obj1)).getRequestLine());
        obj = obj4;
        flag1 = flag3;
        ag.a().d();
        obj = obj4;
        flag1 = flag3;
        al.a a1 = al.a(((HttpGet) (obj1)));
        obj = obj4;
        flag1 = flag3;
        av.a("adFetching", "http response received");
        obj = obj4;
        flag1 = flag3;
        if (Thread.interrupted())
        {
            break MISSING_BLOCK_LABEL_257;
        }
        boolean flag;
        flag = flag2;
        obj1 = obj2;
        if (a1 == null)
        {
            break MISSING_BLOCK_LABEL_322;
        }
        flag = flag2;
        obj1 = obj2;
        obj = obj4;
        flag1 = flag3;
        if (a1.a() != al.a.a)
        {
            break MISSING_BLOCK_LABEL_322;
        }
        obj = obj4;
        flag1 = flag3;
        av.a("adFetching", "AdRequest was cancelled");
        obj2 = "cancelled";
        flag3 = true;
        flag2 = true;
        flag = flag2;
        obj1 = obj2;
        obj = obj4;
        flag1 = flag3;
        if (a1.b() == null)
        {
            break MISSING_BLOCK_LABEL_322;
        }
        obj = obj4;
        flag1 = flag3;
        a1.b().close();
        obj1 = obj2;
        flag = flag2;
        String s;
        obj2 = obj3;
        flag2 = flag;
        s = ((String) (obj1));
        if (flag)
        {
            break MISSING_BLOCK_LABEL_442;
        }
        obj2 = obj3;
        flag2 = flag;
        s = ((String) (obj1));
        if (a1 == null)
        {
            break MISSING_BLOCK_LABEL_442;
        }
        obj2 = obj3;
        flag2 = flag;
        s = ((String) (obj1));
        obj = obj4;
        flag1 = flag;
        if (a1.a() != 200)
        {
            break MISSING_BLOCK_LABEL_442;
        }
        obj2 = obj3;
        flag2 = flag;
        s = ((String) (obj1));
        obj = obj4;
        flag1 = flag;
        if (a1.b() == null)
        {
            break MISSING_BLOCK_LABEL_442;
        }
        obj = obj4;
        flag1 = flag;
        obj2 = by.b(a1.b());
        obj = obj2;
        flag1 = flag;
        a1.b().close();
        s = ((String) (obj1));
        flag2 = flag;
_L1:
        if (flag2)
        {
            break MISSING_BLOCK_LABEL_594;
        }
        ag.a();
        obj1 = ag.b().create(((String) (obj2)), c, e);
        obj = null;
_L2:
        try
        {
            a(new b(((d) (obj1)), s, ((i) (obj)), flag2));
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            av.a("AdRequestRunnable", "unknown exception", ((Throwable) (obj)));
        }
        break MISSING_BLOCK_LABEL_577;
        obj1;
        av.a("adFetching", "ad fetch interrupted by exception");
        av.a("AdRequestRunnable", (new StringBuilder("Unknown exception ")).append(((Exception) (obj1)).getMessage()).toString(), ((Throwable) (obj1)));
        s = (new StringBuilder(String.valueOf(((Exception) (obj1)).toString()))).append(": ").append(((Exception) (obj1)).getMessage()).toString();
        obj2 = obj;
        flag2 = flag1;
          goto _L1
        obj;
        obj1 = null;
          goto _L2
        a(new b(null, "unknown exception", null, false));
        return;
        obj = null;
        obj1 = null;
          goto _L2
    }
}
