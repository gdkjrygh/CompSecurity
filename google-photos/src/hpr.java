// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class hpr
{

    public final String a;
    private final hps b;

    private hpr(hps hps1, String s)
    {
        b = hps1;
        a = s;
    }

    public static hpr a(nxx nxx1)
    {
        p.b(nxx1.l());
        if (nxx.a(nxx1.n))
        {
            return new hpr(hps.a, "Error with the network connection");
        }
        int i = nxx1.l;
        if (i == 0 || i < 600 && i > 499 || i == 408)
        {
            return new hpr(hps.c, nxx1.m);
        } else
        {
            return new hpr(hps.b, nxx1.m);
        }
    }

    public static hpr a(pxc pxc1)
    {
        switch (pxc1.a.intValue())
        {
        default:
            return new hpr(hps.b, pxc1.c);

        case 0: // '\0'
            throw new IllegalArgumentException("code was OK - not an error");

        case 13: // '\r'
        case 14: // '\016'
            return new hpr(hps.c, pxc1.c);
        }
    }

    public final String toString()
    {
        String s = String.valueOf(b);
        String s1 = a;
        return (new StringBuilder(String.valueOf(s).length() + 15 + String.valueOf(s1).length())).append("RPC Error [").append(s).append("] : ").append(s1).toString();
    }
}
