// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.util.Log;
import java.nio.ByteBuffer;

public class nyt extends nxx
{

    private final String a;
    private final String b;
    private boolean c;
    public final qlw q;

    protected nyt(Context context, nyg nyg1, String s1, String s2, qlw qlw1, String s3, String s4)
    {
        nxq nxq = nyg1.d;
        if (nxq != null)
        {
            s4 = new nyw(context, nyg1.a, s4, nxq);
        } else
        {
            String s5;
            if (nyg1.c)
            {
                s5 = nyg1.b;
            } else
            {
                s5 = null;
            }
            s4 = new nyq(context, nyg1.a, s5, s4, s1);
        }
        super(context, nyg1, s1, s4);
        a = s2;
        q = qlw1;
        b = s3;
    }

    public final void a(ByteBuffer bytebuffer)
    {
        b(bytebuffer);
        if (r())
        {
            b(bytebuffer, b.b(q));
        }
        b(q);
    }

    public void a(ByteBuffer bytebuffer, String s1)
    {
        super.a(bytebuffer, s1);
        if (Log.isLoggable("HttpOperation", 5))
        {
            bytebuffer = String.valueOf(new String(b.j(bytebuffer), "UTF-8"));
            if (bytebuffer.length() != 0)
            {
                bytebuffer = "HttpOperation error: Response follows: \n".concat(bytebuffer);
            } else
            {
                bytebuffer = new String("HttpOperation error: Response follows: \n");
            }
            Log.w("HttpOperation", bytebuffer);
        }
    }

    public qlw b(ByteBuffer bytebuffer)
    {
        if (q != null)
        {
            if (bytebuffer.hasArray())
            {
                bytebuffer = qlo.a(bytebuffer.array(), bytebuffer.arrayOffset(), bytebuffer.limit());
            } else
            {
                bytebuffer = b.j(bytebuffer);
                bytebuffer = qlo.a(bytebuffer, 0, bytebuffer.length);
            }
            q.a(bytebuffer);
            c = true;
            return q;
        } else
        {
            return null;
        }
    }

    public void b(qlw qlw1)
    {
    }

    public final boolean c(String s1)
    {
        return super.j.b(s1);
    }

    public final String f()
    {
        return a;
    }

    public final String g()
    {
        return b.a(g, b, s(), false, null);
    }

    public final String k()
    {
        return "application/x-protobuf";
    }

    public String s()
    {
        return a;
    }

    public final qlw t()
    {
        if (c)
        {
            return q;
        } else
        {
            return null;
        }
    }
}
