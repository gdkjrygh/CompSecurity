// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class hqa
    implements hpp
{

    private final hpy a;

    public hqa(hpy hpy1)
    {
        a = hpy1;
    }

    public final hpt a(hpo hpo1)
    {
        nxx nxx1;
        int i;
        int j;
        long l;
        nxx1 = null;
        j = 0;
        i = 0;
        l = 0L;
_L5:
        if (j >= 3) goto _L2; else goto _L1
_L1:
        if (l <= 0L) goto _L4; else goto _L3
_L3:
        a.a(l);
        l <<= 1;
_L6:
        nxx1 = hpo1.a();
        nxx1.d();
        i++;
        if (!nxx1.l())
        {
            break MISSING_BLOCK_LABEL_173;
        }
        Exception exception = nxx1.n;
        int k;
        if (exception instanceof nzb)
        {
            k = ((nzb)exception).a;
        } else
        {
            k = 0;
        }
        if (nxx.a(exception) || k > 499 && k < 600 || k == 408)
        {
            k = 1;
        } else
        {
            k = 0;
        }
        if (k == 0)
        {
            break MISSING_BLOCK_LABEL_173;
        }
        j++;
          goto _L5
        hpo1;
        hpo1 = nxx1;
_L7:
        return new hpt(hpo1, i);
_L4:
        l = a.a();
          goto _L6
_L2:
        hpo1 = nxx1;
          goto _L7
        hpo1 = nxx1;
          goto _L7
    }
}
