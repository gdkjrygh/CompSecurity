// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package b.a;


// Referenced classes of package b.a:
//            pn, nh

public final class nk extends pn
{

    public static final nk a = new nk(0);
    private final nh b[];
    private int c;

    public nk(int i)
    {
        boolean flag;
        if (i != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        super(flag);
        b = new nh[i];
        c = 0;
    }

    public final int a()
    {
        return b.length;
    }

    public final nh a(int i)
    {
        nh nh1;
        try
        {
            nh1 = b[i];
        }
        catch (ArrayIndexOutOfBoundsException arrayindexoutofboundsexception)
        {
            throw new IllegalArgumentException("bogus reg");
        }
        return nh1;
    }

    public final nh a(nh nh1)
    {
        int j = b.length;
        for (int i = 0; i < j; i++)
        {
            nh nh2 = b[i];
            if (nh2 != null && nh1.b(nh2))
            {
                return nh2;
            }
        }

        return null;
    }

    public final void a(nk nk1)
    {
        int j = nk1.b.length;
        for (int i = 0; i < j; i++)
        {
            nh nh1 = nk1.a(i);
            if (nh1 != null)
            {
                c(nh1);
            }
        }

    }

    public final int b()
    {
        int j = 0;
        int k = c;
        int i = k;
        if (k < 0)
        {
            int i1 = b.length;
            int l;
            for (i = 0; j < i1; i = l)
            {
                l = i;
                if (b[j] != null)
                {
                    l = i + 1;
                }
                j++;
            }

            c = i;
        }
        return i;
    }

    public final nk b(int i)
    {
        int k = b.length;
        nk nk1 = new nk(k + i);
        for (int j = 0; j < k; j++)
        {
            nh nh1 = b[j];
            if (nh1 != null)
            {
                nk1.c(nh1.b(i));
            }
        }

        nk1.c = c;
        if (e())
        {
            nk1.L = false;
        }
        return nk1;
    }

    public final void b(nh nh1)
    {
        try
        {
            b[nh1.e()] = null;
            c = -1;
            return;
        }
        // Misplaced declaration of an exception variable
        catch (nh nh1)
        {
            throw new IllegalArgumentException("bogus reg");
        }
    }

    public final void c(nh nh1)
    {
        f();
        if (nh1 == null)
        {
            throw new NullPointerException("spec == null");
        }
        c = -1;
        nh nh2;
        int i;
        int j;
        try
        {
            i = nh1.e();
            b[i] = nh1;
        }
        // Misplaced declaration of an exception variable
        catch (nh nh1)
        {
            throw new IllegalArgumentException("spec.getReg() out of range");
        }
        if (i <= 0)
        {
            break MISSING_BLOCK_LABEL_72;
        }
        j = i - 1;
        nh2 = b[j];
        if (nh2 == null)
        {
            break MISSING_BLOCK_LABEL_72;
        }
        if (nh2.i() == 2)
        {
            b[j] = null;
        }
        if (nh1.i() == 2)
        {
            b[i + 1] = null;
        }
        return;
    }

    public final boolean equals(Object obj)
    {
        if (obj instanceof nk) goto _L2; else goto _L1
_L1:
        return false;
_L2:
        nk nk1 = (nk)obj;
        obj = nk1.b;
        int j = b.length;
        if (j == obj.length && b() == nk1.b())
        {
            int i = 0;
label0:
            do
            {
label1:
                {
                    if (i >= j)
                    {
                        break label1;
                    }
                    nh nh1 = b[i];
                    nh nh2 = obj[i];
                    if (nh1 != nh2 && (nh1 == null || !nh1.equals(nh2)))
                    {
                        break label0;
                    }
                    i++;
                }
            } while (true);
        }
        if (true) goto _L1; else goto _L3
_L3:
        return true;
    }

    public final int hashCode()
    {
        int l = b.length;
        int i = 0;
        int j = 0;
        while (i < l) 
        {
            nh nh1 = b[i];
            int k;
            if (nh1 == null)
            {
                k = 0;
            } else
            {
                k = nh1.hashCode();
            }
            j = j * 31 + k;
            i++;
        }
        return j;
    }

    public final String toString()
    {
        boolean flag = false;
        int j = b.length;
        StringBuffer stringbuffer = new StringBuffer(j * 25);
        stringbuffer.append('{');
        int i = 0;
        while (i < j) 
        {
            nh nh1 = b[i];
            boolean flag1 = flag;
            if (nh1 != null)
            {
                if (flag)
                {
                    stringbuffer.append(", ");
                } else
                {
                    flag = true;
                }
                stringbuffer.append(nh1);
                flag1 = flag;
            }
            i++;
            flag = flag1;
        }
        stringbuffer.append('}');
        return stringbuffer.toString();
    }

}
