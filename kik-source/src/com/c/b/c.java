// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.c.b;


// Referenced classes of package com.c.b:
//            bk, aq, be, b, 
//            av, bx, g, f

public abstract class c
    implements bk
{

    private static final aq a = aq.d();

    public c()
    {
    }

    private static be a(be be1)
    {
        if (be1 != null && !be1.a())
        {
            bx bx1;
            if (be1 instanceof b)
            {
                bx1 = ((b)be1).c();
            } else
            {
                bx1 = new bx();
            }
            throw (new av(bx1.getMessage())).a(be1);
        } else
        {
            return be1;
        }
    }

    private be a(byte abyte0[], int i, aq aq1)
    {
        try
        {
            abyte0 = g.a(abyte0, i);
            aq1 = (be)a(((g) (abyte0)), aq1);
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            throw abyte0;
        }
        abyte0.a(0);
        return aq1;
        abyte0;
        throw abyte0.a(aq1);
    }

    private be b(f f1, aq aq1)
    {
        try
        {
            f1 = f1.h();
            aq1 = (be)a(f1, aq1);
        }
        // Misplaced declaration of an exception variable
        catch (f f1)
        {
            throw f1;
        }
        f1.a(0);
        return aq1;
        f1;
        throw f1.a(aq1);
    }

    public final Object a(f f1, aq aq1)
    {
        return a(b(f1, aq1));
    }

    public final volatile Object a(byte abyte0[])
    {
        aq aq1 = a;
        return a(a(abyte0, abyte0.length, aq1));
    }

}
