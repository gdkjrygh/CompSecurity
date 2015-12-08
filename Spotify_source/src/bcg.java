// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

final class bcg extends bcf
{

    public final long X;
    public final List Y = new ArrayList();
    public final List Z = new ArrayList();

    public bcg(int i, long l)
    {
        super(i);
        X = l;
    }

    public final bch d(int i)
    {
        int k = Y.size();
        for (int j = 0; j < k; j++)
        {
            bch bch1 = (bch)Y.get(j);
            if (bch1.W == i)
            {
                return bch1;
            }
        }

        return null;
    }

    public final bcg e(int i)
    {
        int k = Z.size();
        for (int j = 0; j < k; j++)
        {
            bcg bcg1 = (bcg)Z.get(j);
            if (bcg1.W == i)
            {
                return bcg1;
            }
        }

        return null;
    }

    public final String toString()
    {
        return (new StringBuilder()).append(c(W)).append(" leaves: ").append(Arrays.toString(Y.toArray(new bch[0]))).append(" containers: ").append(Arrays.toString(Z.toArray(new bcg[0]))).toString();
    }
}
