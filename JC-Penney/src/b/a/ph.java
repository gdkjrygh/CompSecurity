// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package b.a;

import java.util.Arrays;

// Referenced classes of package b.a:
//            pn

public final class ph extends pn
{

    public static final ph a;
    private int b[];
    private int c;
    private boolean d;

    public ph()
    {
        this(4);
    }

    public ph(int i)
    {
        super(true);
        try
        {
            b = new int[i];
        }
        catch (NegativeArraySizeException negativearraysizeexception)
        {
            throw new IllegalArgumentException("size < 0");
        }
        c = 0;
        d = true;
    }

    public final int a()
    {
        return c;
    }

    public final int a(int i)
    {
        if (i >= c)
        {
            throw new IndexOutOfBoundsException("n >= size()");
        }
        try
        {
            i = b[i];
        }
        catch (ArrayIndexOutOfBoundsException arrayindexoutofboundsexception)
        {
            throw new IndexOutOfBoundsException("n < 0");
        }
        return i;
    }

    public final void a(int i, int j)
    {
        f();
        if (i >= c)
        {
            throw new IndexOutOfBoundsException("n >= size()");
        }
        b[i] = j;
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

    public final void b()
    {
        f();
        if (!d)
        {
            Arrays.sort(b, 0, c);
            d = true;
        }
    }

    public final void b(int i)
    {
        boolean flag = true;
        f();
        if (c == b.length)
        {
            int ai[] = new int[(c * 3) / 2 + 10];
            System.arraycopy(b, 0, ai, 0, c);
            b = ai;
        }
        int ai1[] = b;
        int j = c;
        c = j + 1;
        ai1[j] = i;
        if (d && c > 1)
        {
            if (i < b[c - 2])
            {
                flag = false;
            }
            d = flag;
        }
    }

    public final void c(int i)
    {
        if (i < 0)
        {
            throw new IllegalArgumentException("newSize < 0");
        }
        if (i > c)
        {
            throw new IllegalArgumentException("newSize > size");
        } else
        {
            f();
            c = i;
            return;
        }
    }

    public final boolean d(int i)
    {
        int j;
        int i1;
        boolean flag;
        flag = false;
        i1 = c;
        if (d)
        {
            break MISSING_BLOCK_LABEL_62;
        }
        j = 0;
_L5:
        if (j >= i1) goto _L2; else goto _L1
_L1:
        if (b[j] != i) goto _L4; else goto _L3
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
            if (i <= b[l])
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
            if (i != b[k])
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
        if (obj instanceof ph)
        {
            obj = (ph)obj;
            flag = flag1;
            if (d == ((ph) (obj)).d)
            {
                flag = flag1;
                if (c == ((ph) (obj)).c)
                {
                    int i = 0;
label0:
                    do
                    {
label1:
                        {
                            if (i >= c)
                            {
                                break label1;
                            }
                            flag = flag1;
                            if (b[i] != ((ph) (obj)).b[i])
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
        for (; i < c; i++)
        {
            j = j * 31 + b[i];
        }

        return j;
    }

    public final String toString()
    {
        StringBuffer stringbuffer = new StringBuffer(c * 5 + 10);
        stringbuffer.append('{');
        for (int i = 0; i < c; i++)
        {
            if (i != 0)
            {
                stringbuffer.append(", ");
            }
            stringbuffer.append(b[i]);
        }

        stringbuffer.append('}');
        return stringbuffer.toString();
    }

    static 
    {
        ph ph1 = new ph(0);
        a = ph1;
        ph1.L = false;
    }
}
