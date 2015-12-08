// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.io.EOFException;

public final class jkh
{

    private final jkd a[];
    private final jkf b;
    private jkd c;

    public jkh(jkd ajkd[], jkf jkf)
    {
        a = ajkd;
        b = jkf;
    }

    public final jkd a(jke jke1)
    {
        jkd ajkd[];
        int i;
        int j;
        if (c != null)
        {
            return c;
        }
        ajkd = a;
        j = ajkd.length;
        i = 0;
_L2:
        jkd jkd1;
        if (i >= j)
        {
            break MISSING_BLOCK_LABEL_51;
        }
        jkd1 = ajkd[i];
        if (!jkd1.a(jke1))
        {
            break MISSING_BLOCK_LABEL_71;
        }
        c = jkd1;
        EOFException eofexception;
        if (c == null)
        {
            throw new jkj(a);
        } else
        {
            c.a(b);
            return c;
        }
        eofexception;
        jke1.a();
        i++;
        if (true) goto _L2; else goto _L1
_L1:
    }
}
