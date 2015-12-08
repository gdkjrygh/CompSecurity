// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.microsoft.onlineid.internal.ui;

import android.content.Intent;
import android.text.TextUtils;
import android.util.Base64;
import com.microsoft.onlineid.b.b;
import com.microsoft.onlineid.d.d;
import com.microsoft.onlineid.g;
import com.microsoft.onlineid.internal.c;
import com.microsoft.onlineid.internal.e;
import com.microsoft.onlineid.internal.f.a;
import com.microsoft.onlineid.sts.n;

// Referenced classes of package com.microsoft.onlineid.internal.ui:
//            g, WebFlowActivity

public final class f
{

    private final WebFlowActivity a;
    private final com.microsoft.onlineid.internal.ui.g b;
    private boolean c;
    private final n d;
    private final a e;
    private final com.microsoft.onlineid.internal.e.f f;

    public f()
    {
        a = null;
        b = null;
        d = null;
        f = null;
        e = null;
    }

    public f(WebFlowActivity webflowactivity)
    {
        a = webflowactivity;
        b = new com.microsoft.onlineid.internal.ui.g();
        webflowactivity = a.getApplicationContext();
        d = new n(webflowactivity);
        f = new com.microsoft.onlineid.internal.e.f(webflowactivity);
        e = new a(webflowactivity);
        webflowactivity = a.getApplicationContext();
        d d1 = new d(webflowactivity);
        b.a(g.a.l, (new com.microsoft.onlineid.d.a(webflowactivity)).b());
        b.a(g.a.m, d1.a());
        b.a(com.microsoft.onlineid.internal.ui.g.a.n, d1.b());
        b.a(g.a.o, d1.c());
        b.a(g.a.p, d1.d());
        b.a(g.a.q, d1.e());
    }

    static WebFlowActivity a(f f1)
    {
        return f1.a;
    }

    private static g.a a(String s)
    {
        if (s == null)
        {
            com.microsoft.onlineid.internal.e.a(false);
            return null;
        }
        try
        {
            s = g.a.valueOf(s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return null;
        }
        return s;
    }

    private static void a(g.a a1, String s)
        throws b
    {
        if (TextUtils.isEmpty(s))
        {
            a1 = (new StringBuilder("PropertyBag was missing required property: ")).append(a1.name()).toString();
            com.microsoft.onlineid.internal.c.d.c(a1);
            throw new b(a1);
        } else
        {
            return;
        }
    }

    public final void FinalBack()
    {
        a.a(0, null);
    }

    public final void FinalNext()
    {
        Object obj;
        String s;
        s = a.getIntent().getAction();
        obj = b.a(com.microsoft.onlineid.internal.ui.g.a.d);
        Object obj1;
        if (!TextUtils.isEmpty(((CharSequence) (obj))))
        {
            break MISSING_BLOCK_LABEL_597;
        }
        if (!"com.microsoft.onlineid.internal.SIGN_IN".equals(s) && !"com.microsoft.onlineid.internal.SIGN_UP".equals(s))
        {
            break MISSING_BLOCK_LABEL_359;
        }
        Object obj2 = b;
        obj = ((com.microsoft.onlineid.internal.ui.g) (obj2)).a(com.microsoft.onlineid.internal.ui.g.a.b);
        obj1 = ((com.microsoft.onlineid.internal.ui.g) (obj2)).a(com.microsoft.onlineid.internal.ui.g.a.c);
        String s1 = ((com.microsoft.onlineid.internal.ui.g) (obj2)).a(g.a.t);
        String s3 = ((com.microsoft.onlineid.internal.ui.g) (obj2)).a(com.microsoft.onlineid.internal.ui.g.a.a);
        obj2 = ((com.microsoft.onlineid.internal.ui.g) (obj2)).a(g.a.i);
        a(com.microsoft.onlineid.internal.ui.g.a.b, ((String) (obj)));
        a(com.microsoft.onlineid.internal.ui.g.a.c, ((String) (obj1)));
        a(g.a.t, s1);
        obj1 = new com.microsoft.onlineid.sts.b(((String) (obj2)), s3, s1, new com.microsoft.onlineid.sts.f(((String) (obj)), Base64.decode(((String) (obj1)), 2)));
        if (!((com.microsoft.onlineid.sts.b) (obj1)).a())
        {
            break MISSING_BLOCK_LABEL_325;
        }
        if (com.microsoft.onlineid.sts.n.d.a.a().equals(d.b()))
        {
            obj = "ssl.live.com";
        } else
        {
            obj = "ssl.live-int.com";
        }
        obj = new g(((String) (obj)), "mbi_ssl");
        try
        {
            e.a(((com.microsoft.onlineid.sts.b) (obj1)), ((com.microsoft.onlineid.d) (obj)));
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj) { }
        try
        {
            obj = ((com.microsoft.onlineid.internal.b.b) (obj)).a().a();
            ((Intent) (obj)).removeExtra(com.microsoft.onlineid.internal.b.a.f.a());
            ((Intent) (obj)).fillIn(a.getIntent(), 0);
            ((Intent) (obj)).setAction("com.microsoft.onlineid.internal.RESOLVE_INTERRUPT");
            a.runOnUiThread(new Runnable(((Intent) (obj))) {

                final Intent a;
                final f b;

                public final void run()
                {
                    com.microsoft.onlineid.internal.ui.f.a(b).setIntent(a);
                    com.microsoft.onlineid.internal.ui.f.a(b).recreate();
                }

            
            {
                b = f.this;
                a = intent;
                super();
            }
            });
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            com.microsoft.onlineid.a.a.a().a(((Throwable) (obj)));
        }
        com.microsoft.onlineid.internal.c.d.c((new StringBuilder("Web flow with action ")).append(s).append(" failed.").toString(), ((Throwable) (obj)));
        a.a(1, (new c()).a(((Exception) (obj))).a());
        return;
        f.a(((com.microsoft.onlineid.sts.b) (obj1)));
        a.a(-1, (new c()).a(((com.microsoft.onlineid.sts.b) (obj1)).b()).a());
        return;
        if (!"com.microsoft.onlineid.internal.RESOLVE_INTERRUPT".equals(s))
        {
            break MISSING_BLOCK_LABEL_572;
        }
        obj = (new com.microsoft.onlineid.internal.b(null, a.getIntent())).d();
        obj1 = f.a(((String) (obj)));
        if (obj1 != null)
        {
            break MISSING_BLOCK_LABEL_412;
        }
        throw new com.microsoft.onlineid.internal.b.a("Account was deleted before interrupt could be resolved.");
        String s2;
        boolean flag;
        s2 = b.a(com.microsoft.onlineid.internal.ui.g.a.b);
        obj = b.a(com.microsoft.onlineid.internal.ui.g.a.c);
        if (TextUtils.isEmpty(s2))
        {
            break MISSING_BLOCK_LABEL_563;
        }
        flag = TextUtils.isEmpty(((CharSequence) (obj)));
        if (flag)
        {
            break MISSING_BLOCK_LABEL_563;
        }
        ((com.microsoft.onlineid.sts.b) (obj1)).a(new com.microsoft.onlineid.sts.f(s2, Base64.decode(((String) (obj)), 2)));
        f.a(((com.microsoft.onlineid.sts.b) (obj1)));
_L1:
        obj = b.a(g.a.j);
        if (TextUtils.isEmpty(((CharSequence) (obj))))
        {
            com.microsoft.onlineid.internal.c.d.c("Interrupt resolution did not return a flow token.");
            com.microsoft.onlineid.internal.e.a(false);
        }
        a.a(-1, (new c()).b(((String) (obj))).a());
        return;
        IllegalArgumentException illegalargumentexception;
        illegalargumentexception;
        com.microsoft.onlineid.internal.c.d.c((new StringBuilder("Could not decode Base64: ")).append(((String) (obj))).toString());
        throw new b("Session Key from interrupt resolution was invalid.");
        com.microsoft.onlineid.internal.c.d.b("WebWizard property bag did not have DAToken/SessionKey");
          goto _L1
        throw new b((new StringBuilder("Unknown Action: ")).append(s).toString());
        if (c)
        {
            a.a(0, null);
            return;
        }
        illegalargumentexception = b.a(g.a.f);
        if (illegalargumentexception == null)
        {
            break MISSING_BLOCK_LABEL_644;
        }
        if (illegalargumentexception.contains("80048842"))
        {
            FinalBack();
            return;
        }
        throw new com.microsoft.onlineid.sts.a.b(b.a(com.microsoft.onlineid.internal.ui.g.a.e), b.a(com.microsoft.onlineid.internal.ui.g.a.g), ((String) (obj)), illegalargumentexception);
    }

    public final String Property(String s)
    {
        s = a(s);
        if (s != null)
        {
            return b.a(s);
        } else
        {
            return null;
        }
    }

    public final void Property(String s, String s1)
    {
        s = a(s);
        if (s != null)
        {
            b.a(s, s1);
            if (s.equals(g.a.s))
            {
                com.microsoft.onlineid.internal.c.d.a((new StringBuilder()).append(g.a.s).append("=").append(s1).toString());
                com.microsoft.onlineid.a.a.a().a("Authenticator accounts", "Sign up success");
            }
        }
    }

    final void a()
    {
        c = true;
    }
}
