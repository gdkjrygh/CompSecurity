// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


static final class b
    implements ano
{

    private final ano a[];
    private final int b;

    public final int a(anp anp1, String s, int i)
    {
        Object obj;
        ano aano[];
        Object obj1;
        int j;
        int k;
        int l;
        int j1;
        aano = a;
        j1 = aano.length;
        obj1 = anp1.a();
        obj = null;
        l = 0;
        k = i;
        j = i;
_L3:
        ano ano1;
        if (l >= j1)
        {
            break MISSING_BLOCK_LABEL_206;
        }
        ano1 = aano[l];
        if (ano1 != null) goto _L2; else goto _L1
_L1:
        if (j <= i)
        {
            return i;
        }
        l = 1;
_L4:
        int i1;
        if (j > i || j == i && l != 0)
        {
            if (obj != null)
            {
                anp1.a(obj);
            }
            return j;
        } else
        {
            return ~k;
        }
_L2:
        i1 = ano1.a(anp1, s, i);
        if (i1 >= i)
        {
            if (i1 > j)
            {
                if (i1 >= s.length() || l + 1 >= j1 || aano[l + 1] == null)
                {
                    return i1;
                }
                obj = anp1.a();
                j = i1;
            }
        } else
        if (i1 < 0)
        {
            i1 = ~i1;
            if (i1 > k)
            {
                k = i1;
            }
        }
        anp1.a(obj1);
        l++;
          goto _L3
        l = 0;
          goto _L4
    }

    public final int b()
    {
        return b;
    }

    (ano aano[])
    {
        a = aano;
        int i = 0;
        int j = aano.length;
        do
        {
            j--;
            if (j < 0)
            {
                break;
            }
            ano ano1 = aano[j];
            if (ano1 != null)
            {
                int k = ano1.b();
                if (k > i)
                {
                    i = k;
                }
            }
        } while (true);
        b = i;
    }
}
