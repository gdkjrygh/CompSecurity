// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.cg;

import android.app.Activity;
import android.webkit.WebView;
import p.cx.c;
import p.dm.b;
import p.dm.h;
import p.dm.j;
import p.dm.k;
import p.dm.n;

// Referenced classes of package p.cg:
//            b

public class a
    implements k
{

    private WebView a;
    private Activity b;
    private j c;
    private final h d = new h() {

        final a a;

        public j a(b b1, p.dq.c c1)
        {
            if (b1 == null)
            {
                return new p.cg.b();
            } else
            {
                return new p.cg.b(b1.f(), b1.e(), c1);
            }
        }

            
            {
                a = a.this;
                super();
            }
    };

    public a(Activity activity, WebView webview)
        throws n
    {
        a = webview;
        b = activity;
        c = p.cx.c.a().a(d);
        if (c == null)
        {
            throw new n("Could not initialize interceptor");
        } else
        {
            c.a(this);
            return;
        }
    }

    static WebView a(a a1)
    {
        return a1.a;
    }

    public void a()
    {
        a("onConnectionClosed()");
    }

    public void a(String s)
    {
        if (s == null || s.trim().isEmpty())
        {
            break MISSING_BLOCK_LABEL_30;
        }
        b.runOnUiThread(new Runnable(s) {

            final String a;
            final a b;

            public void run()
            {
                a.a(b).loadUrl((new StringBuilder()).append("javascript:").append(a).toString());
            }

            
            {
                b = a.this;
                a = s;
                super();
            }
        });
        return;
        Exception exception;
        exception;
        p.df.a.c("Bridge", (new StringBuilder()).append("Error executing javascript: ").append(s).toString(), exception);
        return;
    }

    public void a(String s, byte abyte0[])
    {
        StringBuffer stringbuffer = new StringBuffer(abyte0.length * 4);
        int l = abyte0.length;
        for (int i = 0; i < l; i++)
        {
            byte byte0 = abyte0[i];
            if (stringbuffer.length() > 0)
            {
                stringbuffer.append(',');
            }
            stringbuffer.append(byte0 & 0xff);
        }

        a((new StringBuilder()).append(s).append("([").append(stringbuffer).append("])").toString());
    }

    public void a(byte abyte0[])
    {
        StringBuffer stringbuffer = new StringBuffer(abyte0.length * 4);
        int l = abyte0.length;
        for (int i = 0; i < l; i++)
        {
            byte byte0 = abyte0[i];
            if (stringbuffer.length() > 0)
            {
                stringbuffer.append(',');
            }
            stringbuffer.append(byte0 & 0xff);
        }

        c.b(abyte0);
    }

    public void b()
    {
        a("onApplicationDidEnterBackground()");
    }

    public void b(byte abyte0[])
    {
        StringBuffer stringbuffer = new StringBuffer(abyte0.length * 4);
        int l = abyte0.length;
        for (int i = 0; i < l; i++)
        {
            byte byte0 = abyte0[i];
            if (stringbuffer.length() > 0)
            {
                stringbuffer.append(',');
            }
            stringbuffer.append(byte0 & 0xff);
        }

        c.a(abyte0);
    }

    public void c()
    {
        a("onApplicationDidEnterForeground()");
    }

    public void c(byte abyte0[])
    {
        StringBuffer stringbuffer = new StringBuffer(abyte0.length * 4);
        int l = abyte0.length;
        for (int i = 0; i < l; i++)
        {
            byte byte0 = abyte0[i];
            if (stringbuffer.length() > 0)
            {
                stringbuffer.append(',');
            }
            stringbuffer.append(byte0 & 0xff);
        }

        a((new StringBuilder()).append("onDataFromApp([").append(stringbuffer).append("])").toString());
    }

    public void d(byte abyte0[])
    {
        StringBuffer stringbuffer = new StringBuffer(abyte0.length * 4);
        int l = abyte0.length;
        for (int i = 0; i < l; i++)
        {
            byte byte0 = abyte0[i];
            if (stringbuffer.length() > 0)
            {
                stringbuffer.append(',');
            }
            stringbuffer.append(byte0 & 0xff);
        }

        a((new StringBuilder()).append("onDataFromAcc([").append(stringbuffer).append("])").toString());
    }
}
