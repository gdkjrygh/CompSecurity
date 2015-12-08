// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class krt
    implements Cloneable
{

    private static final kru c = new kru();
    kru a[];
    int b;
    private boolean d;
    private int e[];

    public krt()
    {
        this(10);
    }

    private krt(int i)
    {
        d = false;
        i = a(i << 2) / 4;
        e = new int[i];
        a = new kru[i];
        b = 0;
    }

    private static int a(int i)
    {
        int j = 4;
        do
        {
label0:
            {
                int k = i;
                if (j < 32)
                {
                    if (i > (1 << j) - 12)
                    {
                        break label0;
                    }
                    k = (1 << j) - 12;
                }
                return k;
            }
            j++;
        } while (true);
    }

    public final boolean a()
    {
        return b == 0;
    }

    public final krt b()
    {
        int i = 0;
        int j = b;
        krt krt1 = new krt(j);
        System.arraycopy(e, 0, krt1.e, 0, j);
        for (; i < j; i++)
        {
            if (a[i] != null)
            {
                krt1.a[i] = a[i].b();
            }
        }

        krt1.b = j;
        return krt1;
    }

    public final Object clone()
    {
        return b();
    }

    public final boolean equals(Object obj)
    {
        if (obj != this) goto _L2; else goto _L1
_L1:
        return true;
_L2:
        Object aobj[];
        int ai[];
        int i;
        int j;
        if (!(obj instanceof krt))
        {
            return false;
        }
        obj = (krt)obj;
        if (b != ((krt) (obj)).b)
        {
            return false;
        }
        aobj = e;
        ai = ((krt) (obj)).e;
        j = b;
        i = 0;
_L10:
        if (i >= j) goto _L4; else goto _L3
_L3:
        if (aobj[i] == ai[i]) goto _L6; else goto _L5
_L5:
        i = 0;
_L11:
        if (i == 0)
        {
            break; /* Loop/switch isn't completed */
        }
        aobj = a;
        obj = ((krt) (obj)).a;
        j = b;
        i = 0;
_L12:
        if (i >= j)
        {
            break MISSING_BLOCK_LABEL_153;
        }
        if (aobj[i].equals(obj[i])) goto _L8; else goto _L7
_L7:
        i = 0;
_L13:
        if (i != 0) goto _L1; else goto _L9
_L9:
        return false;
_L6:
        i++;
          goto _L10
_L4:
        i = 1;
          goto _L11
_L8:
        i++;
          goto _L12
        i = 1;
          goto _L13
    }

    public final int hashCode()
    {
        int j = 17;
        for (int i = 0; i < b; i++)
        {
            j = (j * 31 + e[i]) * 31 + a[i].hashCode();
        }

        return j;
    }

}
