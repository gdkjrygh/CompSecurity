// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.user.a;

import java.util.Arrays;
import java.util.Iterator;

// Referenced classes of package com.facebook.user.a:
//            a, j, n, l

public abstract class i
{

    private static int f[] = {
        4352, 4353, 0, 4354, 0, 0, 4355, 4356, 4357, 0, 
        0, 0, 0, 0, 0, 0, 4358, 4359, 4360, 0, 
        4361, 4362, 4363, 4364, 4365, 4366, 4367, 4368, 4369, 4370
    };
    private static int g = 30;
    private final l a;
    private final n b;
    private String c[][];
    private StringBuilder d;
    private String e[];

    public i(l l, n n1)
    {
        c = new String[4][];
        d = new StringBuilder();
        e = new String[10];
        a = l;
        b = n1;
    }

    private void a(String s, int k)
    {
        int l = 0;
        d.setLength(0);
        for (; l < k; l++)
        {
            d.append(e[l]);
        }

        a(s, 2, d.toString());
    }

    private void a(String s, int k, int l)
    {
        for (; k < l; k++)
        {
            String as[] = c[k];
            if (as == null)
            {
                continue;
            }
            String s1 = e[k];
            for (int i1 = 0; i1 < as.length; i1++)
            {
                e[k] = as[i1];
                a(s, 0, l, false, false);
                a(s, k + 1, l);
            }

            e[k] = s1;
        }

    }

    private void a(String s, int k, int l, boolean flag)
    {
        int i1 = 0;
        d.setLength(0);
        for (; i1 < k; i1++)
        {
            if (i1 != 0)
            {
                d.append('.');
            }
            d.append(e[i1]);
        }

        a(s, l, d.toString());
        if (flag)
        {
            a(s, k);
        }
    }

    private void a(String s, int k, int l, boolean flag, boolean flag1)
    {
        if (k == l)
        {
            if (flag)
            {
                k = 0;
            } else
            {
                k = 1;
            }
            a(s, l, k, flag1);
        } else
        {
            String s1 = e[k];
            int i1 = k;
            while (i1 < l) 
            {
                e[k] = e[i1];
                e[i1] = s1;
                boolean flag2;
                if (flag && i1 == k)
                {
                    flag2 = true;
                } else
                {
                    flag2 = false;
                }
                a(s, k + 1, l, flag2, flag1);
                e[i1] = e[k];
                e[k] = s1;
                i1++;
            }
        }
    }

    private void a(String s, String s1)
    {
        int k;
        int l;
        int k1;
        k = 0;
        k1 = s1.length();
        d.setLength(0);
        l = 0;
_L17:
        int i1;
        int j1;
        i1 = l + 1;
        j1 = s1.codePointAt(l);
        if (j1 != 32) goto _L2; else goto _L1
_L1:
        if (i1 < k1)
        {
            break MISSING_BLOCK_LABEL_226;
        }
        l = k;
_L4:
        if (l > 1)
        {
            a(s, 7, c(d.toString()));
        }
        return;
_L2:
        l = k;
        if (j1 < 4352) goto _L4; else goto _L3
_L3:
        if (j1 <= 4370) goto _L6; else goto _L5
_L5:
        l = k;
        if (j1 < 12593) goto _L4; else goto _L6
_L6:
        if (j1 <= 12622) goto _L8; else goto _L7
_L7:
        l = k;
        if (j1 < 44032) goto _L4; else goto _L8
_L8:
        l = k;
        if (j1 > 55203) goto _L4; else goto _L9
_L9:
        if (j1 < 44032) goto _L11; else goto _L10
_L10:
        l = (j1 - 44032) / 588 + 4352;
_L13:
        d.appendCodePoint(l);
        k++;
          goto _L1
_L11:
        l = j1;
        if (j1 < 12593) goto _L13; else goto _L12
_L12:
        l = k;
        if (j1 - 12593 >= g) goto _L4; else goto _L14
_L14:
        j1 = f[j1 - 12593];
        l = j1;
        if (j1 != 0) goto _L13; else goto _L15
_L15:
        l = k;
          goto _L4
        l = i1;
        if (true) goto _L17; else goto _L16
_L16:
    }

    private void a(String s, String s1, int k)
    {
        if (k == 5)
        {
            a(s, s1);
        }
    }

    private void b(String s, String s1, int k)
    {
        s1 = com.facebook.user.a.a.a().a(s1, k);
        if (s1 != null)
        {
            for (; s1.hasNext(); a(s, 6, c((String)s1.next()))) { }
        }
    }

    protected abstract void a(String s, int k, String s1);

    public void a(String s, String s1, String as[], int k, int l)
    {
        byte byte0 = 4;
        e = as;
        for (int i1 = 0; i1 < k; i1++)
        {
            e[i1] = c(e[i1]);
        }

        boolean flag;
        if (k > 4)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            a(s, k, 0, true);
            Arrays.sort(e, 0, k, new j(this));
            as = e[0];
            for (int j1 = 4; j1 < k; j1++)
            {
                e[0] = e[j1];
                a(s, 4);
            }

            e[0] = as;
            k = byte0;
        }
        for (int k1 = 0; k1 < k; k1++)
        {
            c[k1] = b(e[k1]);
        }

        boolean flag1;
        if (!flag)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        a(s, 0, k, flag1, true);
        a(s, 0, k);
        b(s, s1, l);
        a(s, s1, l);
    }

    protected abstract String[] b(String s);

    protected String c(String s)
    {
        return b.a(s);
    }

}
