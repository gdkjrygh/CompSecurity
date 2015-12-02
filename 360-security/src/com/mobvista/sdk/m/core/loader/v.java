// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mobvista.sdk.m.core.loader;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import android.webkit.URLUtil;
import com.mobvista.sdk.m.a.e.c;
import java.util.concurrent.Semaphore;

// Referenced classes of package com.mobvista.sdk.m.core.loader:
//            w, i, u, j, 
//            n, t

final class v extends c
{

    final u a;
    private final Semaphore b = new Semaphore(0);
    private final Context f;
    private String g;
    private t h;

    public v(u u1, Context context, String s)
    {
        a = u1;
        super();
        h = new w(this);
        f = context;
        g = s;
    }

    private JumpLoader.JumpLoaderResult a(String s)
    {
        Object obj;
        JumpLoader.JumpLoaderResult jumploaderresult;
        i k;
        int l;
        obj = null;
        Log.e("302", "startJavaHTTPSpider");
        jumploaderresult = new JumpLoader.JumpLoaderResult();
        k = new i();
        l = 0;
_L7:
        if (l >= 10) goto _L2; else goto _L1
_L1:
        j j1;
        if (!u.b(a))
        {
            return null;
        }
        j1 = k.a(s);
        if (j1 != null) goto _L4; else goto _L3
_L3:
        jumploaderresult.setSuccess(false);
_L2:
        return jumploaderresult;
_L4:
        jumploaderresult.setSuccess(true);
        if (c(j1.f))
        {
            if (TextUtils.isEmpty(j1.a))
            {
                jumploaderresult.setjumpDone(true);
                jumploaderresult.setUrl(s);
                continue; /* Loop/switch isn't completed */
            }
            s = j1.a;
            if (!c(s) && !e(s) && !d(s))
            {
                break; /* Loop/switch isn't completed */
            }
            jumploaderresult.setjumpDone(true);
            jumploaderresult.setUrl(s);
        } else
        if (b(j1.f))
        {
            jumploaderresult.setjumpDone(true);
            jumploaderresult.setUrl(s);
            if (j1.g == null)
            {
                s = obj;
            } else
            {
                s = j1.g;
            }
            jumploaderresult.setContent(s);
        } else
        {
            jumploaderresult.setjumpDone(false);
            jumploaderresult.setUrl(s);
        }
        if (true) goto _L2; else goto _L5
_L5:
        l++;
        if (true) goto _L7; else goto _L6
_L6:
    }

    static void a(v v1)
    {
        v1.d();
    }

    static boolean a(v v1, String s)
    {
        return v1.b(s);
    }

    private static boolean b(int k)
    {
        return k == 200;
    }

    private boolean b(String s)
    {
        if (d(s))
        {
            u.a(a).setCode(1);
            u.a(a).setUrl(s);
            u.a(a).setjumpDone(true);
            return true;
        }
        if (e(s))
        {
            u.a(a).setCode(3);
            u.a(a).setUrl(s);
            u.a(a).setjumpDone(true);
            return true;
        } else
        {
            u.a(a).setCode(2);
            u.a(a).setUrl(s);
            return false;
        }
    }

    private void c()
    {
        b.acquireUninterruptibly();
    }

    private static boolean c(int k)
    {
        return k == 301 || k == 302 || k == 307;
    }

    private static boolean c(String s)
    {
        return !URLUtil.isNetworkUrl(s);
    }

    private void d()
    {
        b.release();
    }

    private static boolean d(String s)
    {
        return !TextUtils.isEmpty(s) && (s.toLowerCase().startsWith("market:/") || s.toLowerCase().contains("play.google.com"));
    }

    private static boolean e(String s)
    {
        return !TextUtils.isEmpty(s) && s.toLowerCase().endsWith(".apk");
    }

    public final void a()
    {
        u.a(a, new JumpLoader.JumpLoaderResult());
        u.a(a).setUrl(g);
        u.a(a, a(g));
        while (!u.b(a) || !u.a(a).isSuccess()) 
        {
            return;
        }
        if (!e(u.a(a).getUrl()) && !d(u.a(a).getUrl()) && !c(u.a(a).getUrl()))
        {
            if (!TextUtils.isEmpty(u.a(a).getContent()))
            {
                Log.e("302", "startWebViewHtmlParser");
                (new n()).a(f, u.a(a).getUrl(), u.a(a).getContent(), h);
            } else
            {
                Log.e("302", "startWebViewSpider");
                (new n()).a(f, u.a(a).getUrl(), h);
            }
            c();
            return;
        } else
        {
            b(u.a(a).getUrl());
            return;
        }
    }
}
