// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Arrays;

public final class clz
    implements cmf
{

    private final byte a[];
    private final cmb b;
    private final cmi c;
    private final cmd d;

    public clz(byte abyte0[], cmb cmb1, cmi cmi1, cmd cmd)
    {
        a = abyte0;
        b = (cmb)b.a(cmb1, "generalMetrics", null);
        c = (cmi)b.a(cmi1, "pointMetrics", null);
        d = cmd;
    }

    public static cma a(cmf cmf1)
    {
        return new cma(cmf1);
    }

    public static cma f()
    {
        return new cma();
    }

    public final boolean a()
    {
        return a != null;
    }

    public final byte[] b()
    {
        if (a == null)
        {
            return null;
        } else
        {
            return Arrays.copyOf(a, a.length);
        }
    }

    public final cmb c()
    {
        return b;
    }

    public final cmi d()
    {
        return c;
    }

    public final cmd e()
    {
        return d;
    }
}
