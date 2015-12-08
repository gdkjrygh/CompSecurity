// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.dm;

import p.dn.a;

// Referenced classes of package p.dm:
//            f, g

public class d extends f
{

    private final a d;
    private final boolean e;

    public d(byte byte0, a a1)
    {
        a = byte0;
        d = a1;
        b = a1.b();
        e = false;
    }

    public d(byte byte0, byte abyte0[])
    {
        a = byte0;
        d = p.dn.a.c(abyte0);
        b = abyte0;
        e = false;
    }

    public d(byte abyte0[])
    {
        a = 0;
        d = p.dn.a.c(abyte0);
        b = abyte0;
        e = true;
    }

    public String a()
    {
        return "DATA";
    }

    public String a(g g1)
    {
        StringBuffer stringbuffer = new StringBuffer();
        if (g1 != g.b && d != null && "DATA".equals(a())) goto _L2; else goto _L1
_L1:
        stringbuffer.append("DATA : ");
        if (d != null)
        {
            stringbuffer.append(d.a());
        }
        stringbuffer.append("[");
        stringbuffer.append(super.toString());
        stringbuffer.append("]");
_L4:
        return stringbuffer.toString();
_L2:
        if (g1 == g.c)
        {
            if (!e)
            {
                stringbuffer.append("[");
                stringbuffer.append(a);
                stringbuffer.append("] ");
            }
            stringbuffer.append(d.a(g1));
        } else
        if (g1 == g.d)
        {
            stringbuffer.append(d.a());
            stringbuffer.append(" ");
            if (!e)
            {
                stringbuffer.append("seq:");
                stringbuffer.append(a);
                stringbuffer.append(" ");
            }
            stringbuffer.append("len:");
            stringbuffer.append(d.b().length);
            stringbuffer.append(" ");
            stringbuffer.append(d.a(g1));
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public a b()
    {
        return d;
    }

    public Object clone()
    {
        Object obj = new byte[b.length];
        System.arraycopy(b, 0, obj, 0, obj.length);
        byte abyte0[];
        if (e)
        {
            obj = new d(((byte []) (obj)));
        } else
        {
            obj = new d(a, ((byte []) (obj)));
        }
        abyte0 = new byte[c.length];
        System.arraycopy(c, 0, abyte0, 0, abyte0.length);
        obj.c = abyte0;
        return obj;
    }

    public String toString()
    {
        return a(g.c);
    }
}
