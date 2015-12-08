// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


static final class  extends 
{

    public final int a(anp anp, String s, int i)
    {
        int l = super.a(anp, s, i);
        if (l >= 0) goto _L2; else goto _L1
_L1:
        int k;
        return l;
_L2:
        int j;
label0:
        {
            if (l == (k = b + i))
            {
                continue; /* Loop/switch isn't completed */
            }
            j = k;
            if (!c)
            {
                break label0;
            }
            i = s.charAt(i);
            if (i != 45)
            {
                j = k;
                if (i != 43)
                {
                    break label0;
                }
            }
            j = k + 1;
        }
        if (l > j)
        {
            return ~(j + 1);
        }
        if (l < j)
        {
            return ~l;
        }
        if (true) goto _L1; else goto _L3
_L3:
    }

    protected (alu alu, int i)
    {
        super(alu, i, false, i);
    }
}
