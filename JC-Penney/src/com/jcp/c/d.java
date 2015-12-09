// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.c;

import android.content.Context;
import android.util.Log;
import com.jcp.JCP;
import com.jcp.b.b;
import com.jcp.e.j;
import com.jcp.util.ae;
import java.util.Map;

// Referenced classes of package com.jcp.c:
//            b

public class d extends com.jcp.c.b
{

    private static final String a = com/jcp/c/d.getName();
    private final String b;
    private Map c;

    public d(Context context, j j1, String s)
    {
        a(context);
        a(j1);
        b = s;
        JCP.d().x();
    }

    private String a(int k)
    {
        return b().getString(k);
    }

    private boolean a(String s)
    {
        return s.endsWith(a(0x7f0702e7)) || s.endsWith(a(0x7f0702e8));
    }

    private boolean b(String s)
    {
        return s.contains(a(0x7f070259)) || s.endsWith(a(0x7f0702e9)) || s.endsWith(a(0x7f0702ea)) || s.endsWith(a(0x7f0702eb));
    }

    private boolean c(String s)
    {
        return s.contains(a(0x7f070258)) || s.endsWith(a(0x7f0702ec));
    }

    private void d()
    {
label0:
        {
            if (c() != null)
            {
                if (!a(b))
                {
                    break label0;
                }
                ((j)c()).u();
            }
            return;
        }
        if (b(b))
        {
            ((j)c()).v();
            return;
        }
        if (c(b))
        {
            ((j)c()).w();
            return;
        }
        if (d(b))
        {
            ((j)c()).x();
            return;
        } else
        {
            f();
            return;
        }
    }

    private boolean d(String s)
    {
        return s.contains(a(0x7f07025c)) || s.endsWith(a(0x7f0702ed)) || s.endsWith(a(0x7f0702ee));
    }

    private void e()
    {
        if (j())
        {
            h();
            return;
        }
        if (i())
        {
            g();
            return;
        } else
        {
            f();
            return;
        }
    }

    private void f()
    {
        Log.e(a, "Could not handle deep link");
    }

    private void g()
    {
        if (c() != null)
        {
            ((j)c()).d((String)c.get("id"));
        }
    }

    private void h()
    {
        if (c() != null)
        {
            ((j)c()).f((String)c.get("ppId"));
        }
    }

    private boolean i()
    {
        return c.containsKey("id");
    }

    private boolean j()
    {
        return c.containsKey("ppId");
    }

    public void a()
    {
        ae.d(a, (new StringBuilder()).append("Deep Link: ").append(b).toString());
        c = com.jcp.b.b.y(b);
        if (c.isEmpty())
        {
            d();
            return;
        } else
        {
            e();
            return;
        }
    }

}
