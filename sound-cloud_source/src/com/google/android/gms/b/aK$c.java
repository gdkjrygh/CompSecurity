// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.b;

import java.io.IOException;
import java.util.Arrays;

// Referenced classes of package com.google.android.gms.b:
//            aB, aK, aJ, aA, 
//            aF

public static final class n extends aB
{

    public byte a[];
    public byte b[][];
    public boolean c;

    protected final int a()
    {
        boolean flag = false;
        int j = super.a();
        int i = j;
        if (!Arrays.equals(a, aJ.h))
        {
            i = j + aA.b(1, a);
        }
        j = i;
        if (b != null)
        {
            j = i;
            if (b.length > 0)
            {
                int k = 0;
                int l = 0;
                for (j = ((flag) ? 1 : 0); j < b.length;)
                {
                    byte abyte0[] = b[j];
                    int j1 = k;
                    int i1 = l;
                    if (abyte0 != null)
                    {
                        i1 = l + 1;
                        j1 = k + aA.a(abyte0);
                    }
                    j++;
                    k = j1;
                    l = i1;
                }

                j = i + k + l * 1;
            }
        }
        i = j;
        if (c)
        {
            i = j + (aA.b(3) + 1);
        }
        return i;
    }

    public final void a(aA aa)
        throws IOException
    {
        if (!Arrays.equals(a, aJ.h))
        {
            aa.a(1, a);
        }
        if (b != null && b.length > 0)
        {
            for (int i = 0; i < b.length; i++)
            {
                byte abyte0[] = b[i];
                if (abyte0 != null)
                {
                    aa.a(2, abyte0);
                }
            }

        }
        if (c)
        {
            aa.a(3, c);
        }
        super.a(aa);
    }

    public final boolean equals(Object obj)
    {
        boolean flag1 = false;
        boolean flag;
        if (obj == this)
        {
            flag = true;
        } else
        {
            flag = flag1;
            if (obj instanceof c)
            {
                obj = (c)obj;
                flag = flag1;
                if (Arrays.equals(a, ((a) (obj)).a))
                {
                    flag = flag1;
                    if (aF.a(b, ((b) (obj)).b))
                    {
                        flag = flag1;
                        if (c == ((c) (obj)).c)
                        {
                            return a(((aB) (obj)));
                        }
                    }
                }
            }
        }
        return flag;
    }

    public final int hashCode()
    {
        int i = Arrays.hashCode(a);
        int j = aF.a(b);
        char c1;
        if (c)
        {
            c1 = '\u04CF';
        } else
        {
            c1 = '\u04D5';
        }
        return (c1 + ((i + 527) * 31 + j) * 31) * 31 + b();
    }

    public ()
    {
        a = aJ.h;
        b = aJ.g;
        c = false;
        m = null;
        n = -1;
    }
}
