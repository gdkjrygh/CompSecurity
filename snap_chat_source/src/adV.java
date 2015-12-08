// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class adV extends aeT
{

    final adS a[];
    private int b;

    public adV(int i)
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
        a = new adS[i];
        b = 0;
    }

    public final int a()
    {
        int j = 0;
        int k = b;
        int i = k;
        if (k < 0)
        {
            int i1 = a.length;
            int l;
            for (i = 0; j < i1; i = l)
            {
                l = i;
                if (a[j] != null)
                {
                    l = i + 1;
                }
                j++;
            }

            b = i;
        }
        return i;
    }

    public final adS a(int i)
    {
        adS ads;
        try
        {
            ads = a[i];
        }
        catch (ArrayIndexOutOfBoundsException arrayindexoutofboundsexception)
        {
            throw new IllegalArgumentException("bogus reg");
        }
        return ads;
    }

    public final void a(adS ads)
    {
        try
        {
            a[ads.a] = null;
            b = -1;
            return;
        }
        // Misplaced declaration of an exception variable
        catch (adS ads)
        {
            throw new IllegalArgumentException("bogus reg");
        }
    }

    public final void a(adV adv)
    {
        int j = adv.a.length;
        for (int i = 0; i < j; i++)
        {
            adS ads = adv.a(i);
            if (ads != null)
            {
                b(ads);
            }
        }

    }

    public final adV b(int i)
    {
        int k = a.length;
        adV adv = new adV(k + i);
        for (int j = 0; j < k; j++)
        {
            adS ads = a[j];
            if (ads != null)
            {
                adv.b(ads.b(i));
            }
        }

        adv.b = b;
        if (e())
        {
            adv.L = false;
        }
        return adv;
    }

    public final void b(adS ads)
    {
        f();
        if (ads == null)
        {
            throw new NullPointerException("spec == null");
        }
        b = -1;
        adS ads1;
        int i;
        int j;
        try
        {
            i = ads.a;
            a[i] = ads;
        }
        // Misplaced declaration of an exception variable
        catch (adS ads)
        {
            throw new IllegalArgumentException("spec.getReg() out of range");
        }
        if (i <= 0)
        {
            break MISSING_BLOCK_LABEL_72;
        }
        j = i - 1;
        ads1 = a[j];
        if (ads1 == null)
        {
            break MISSING_BLOCK_LABEL_72;
        }
        if (ads1.e() == 2)
        {
            a[j] = null;
        }
        if (ads.e() == 2)
        {
            a[i + 1] = null;
        }
        return;
    }

    public final boolean equals(Object obj)
    {
        if (obj instanceof adV) goto _L2; else goto _L1
_L1:
        return false;
_L2:
        adV adv = (adV)obj;
        obj = adv.a;
        int j = a.length;
        if (j == obj.length && a() == adv.a())
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
                    adS ads = a[i];
                    adS ads1 = obj[i];
                    if (ads != ads1 && (ads == null || !ads.equals(ads1)))
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
        int l = a.length;
        int i = 0;
        int j = 0;
        while (i < l) 
        {
            adS ads = a[i];
            int k;
            if (ads == null)
            {
                k = 0;
            } else
            {
                k = ads.hashCode();
            }
            j = j * 31 + k;
            i++;
        }
        return j;
    }

    public final String toString()
    {
        boolean flag = false;
        int j = a.length;
        StringBuffer stringbuffer = new StringBuffer(j * 25);
        stringbuffer.append('{');
        int i = 0;
        while (i < j) 
        {
            adS ads = a[i];
            boolean flag1 = flag;
            if (ads != null)
            {
                if (flag)
                {
                    stringbuffer.append(", ");
                } else
                {
                    flag = true;
                }
                stringbuffer.append(ads);
                flag1 = flag;
            }
            i++;
            flag = flag1;
        }
        stringbuffer.append('}');
        return stringbuffer.toString();
    }

    static 
    {
        new adV(0);
    }
}
