// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Arrays;

public final class aeP extends aeT
{

    public static final aeP a;
    int b;
    private int c[];
    private boolean d;

    public aeP()
    {
        this(4);
    }

    public aeP(int i)
    {
        super(true);
        try
        {
            c = new int[i];
        }
        catch (NegativeArraySizeException negativearraysizeexception)
        {
            throw new IllegalArgumentException("size < 0");
        }
        b = 0;
        d = true;
    }

    public final int a(int i)
    {
        if (i >= b)
        {
            throw new IndexOutOfBoundsException("n >= size()");
        }
        try
        {
            i = c[i];
        }
        catch (ArrayIndexOutOfBoundsException arrayindexoutofboundsexception)
        {
            throw new IndexOutOfBoundsException("n < 0");
        }
        return i;
    }

    public final void a()
    {
        f();
        if (!d)
        {
            Arrays.sort(c, 0, b);
            d = true;
        }
    }

    public final void a(int i, int j)
    {
        f();
        if (i >= b)
        {
            throw new IndexOutOfBoundsException("n >= size()");
        }
        c[i] = j;
        d = false;
_L1:
        return;
        ArrayIndexOutOfBoundsException arrayindexoutofboundsexception;
        arrayindexoutofboundsexception;
        if (i < 0)
        {
            throw new IllegalArgumentException("n < 0");
        }
          goto _L1
    }

    public final void b(int i)
    {
        boolean flag = true;
        f();
        if (b == c.length)
        {
            int ai[] = new int[(b * 3) / 2 + 10];
            System.arraycopy(c, 0, ai, 0, b);
            c = ai;
        }
        int ai1[] = c;
        int j = b;
        b = j + 1;
        ai1[j] = i;
        if (d && b > 1)
        {
            if (i < c[b - 2])
            {
                flag = false;
            }
            d = flag;
        }
    }

    public final boolean c(int i)
    {
        int j;
        int i1;
        boolean flag;
        flag = false;
        i1 = b;
        if (d)
        {
            break MISSING_BLOCK_LABEL_62;
        }
        j = 0;
_L5:
        if (j >= i1) goto _L2; else goto _L1
_L1:
        if (c[j] != i) goto _L4; else goto _L3
_L3:
        int k;
        int l;
        if (j < 0)
        {
            j = -1;
        }
        if (j >= 0)
        {
            flag = true;
        }
        return flag;
_L4:
        j++;
          goto _L5
_L2:
        j = -i1;
          goto _L3
        k = i1;
        for (j = -1; k > j + 1;)
        {
            l = (k - j >> 1) + j;
            if (i <= c[l])
            {
                k = l;
            } else
            {
                j = l;
            }
        }

        if (k != i1)
        {
            j = k;
            if (i != c[k])
            {
                j = -k - 1;
            }
        } else
        {
            j = -i1 - 1;
        }
          goto _L3
    }

    public final boolean equals(Object obj)
    {
        boolean flag1 = false;
        if (obj != this) goto _L2; else goto _L1
_L1:
        boolean flag = true;
_L4:
        return flag;
_L2:
        flag = flag1;
        if (obj instanceof aeP)
        {
            obj = (aeP)obj;
            flag = flag1;
            if (d == ((aeP) (obj)).d)
            {
                flag = flag1;
                if (b == ((aeP) (obj)).b)
                {
                    int i = 0;
label0:
                    do
                    {
label1:
                        {
                            if (i >= b)
                            {
                                break label1;
                            }
                            flag = flag1;
                            if (c[i] != ((aeP) (obj)).c[i])
                            {
                                break label0;
                            }
                            i++;
                        }
                    } while (true);
                }
            }
        }
        if (true) goto _L4; else goto _L3
_L3:
        return true;
    }

    public final int hashCode()
    {
        int i = 0;
        int j = 0;
        for (; i < b; i++)
        {
            j = j * 31 + c[i];
        }

        return j;
    }

    public final String toString()
    {
        StringBuffer stringbuffer = new StringBuffer(b * 5 + 10);
        stringbuffer.append('{');
        for (int i = 0; i < b; i++)
        {
            if (i != 0)
            {
                stringbuffer.append(", ");
            }
            stringbuffer.append(c[i]);
        }

        stringbuffer.append('}');
        return stringbuffer.toString();
    }

    static 
    {
        aeP aep = new aeP(0);
        a = aep;
        aep.L = false;
    }
}
