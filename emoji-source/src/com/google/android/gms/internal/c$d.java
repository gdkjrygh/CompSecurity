// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.io.IOException;
import java.util.List;

// Referenced classes of package com.google.android.gms.internal:
//            ma, c, lz, ly, 
//            mh, mc, me

public static final class h extends ma
{

    public amX eR[];
    public amX eS[];
    public amX eT[];

    public void a(lz lz1)
        throws IOException
    {
        boolean flag = false;
        if (eR != null && eR.length > 0)
        {
            for (int i = 0; i < eR.length; i++)
            {
                h h1 = eR[i];
                if (h1 != null)
                {
                    lz1.a(1, h1);
                }
            }

        }
        if (eS != null && eS.length > 0)
        {
            for (int j = 0; j < eS.length; j++)
            {
                h h2 = eS[j];
                if (h2 != null)
                {
                    lz1.a(2, h2);
                }
            }

        }
        if (eT != null && eT.length > 0)
        {
            for (int k = ((flag) ? 1 : 0); k < eT.length; k++)
            {
                h h3 = eT[k];
                if (h3 != null)
                {
                    lz1.a(3, h3);
                }
            }

        }
        super.a(lz1);
    }

    public me b(ly ly1)
        throws IOException
    {
        return e(ly1);
    }

    protected int c()
    {
        boolean flag = false;
        int i = super.c();
        int j = i;
        if (eR != null)
        {
            j = i;
            if (eR.length > 0)
            {
                for (j = 0; j < eR.length;)
                {
                    e e1 = eR[j];
                    int i1 = i;
                    if (e1 != null)
                    {
                        i1 = i + lz.b(1, e1);
                    }
                    j++;
                    i = i1;
                }

                j = i;
            }
        }
        i = j;
        if (eS != null)
        {
            i = j;
            if (eS.length > 0)
            {
                i = j;
                for (int k = 0; k < eS.length;)
                {
                    e e2 = eS[k];
                    int j1 = i;
                    if (e2 != null)
                    {
                        j1 = i + lz.b(2, e2);
                    }
                    k++;
                    i = j1;
                }

            }
        }
        int k1 = i;
        if (eT != null)
        {
            k1 = i;
            if (eT.length > 0)
            {
                int l = ((flag) ? 1 : 0);
                do
                {
                    k1 = i;
                    if (l >= eT.length)
                    {
                        break;
                    }
                    e e3 = eT[l];
                    k1 = i;
                    if (e3 != null)
                    {
                        k1 = i + lz.b(3, e3);
                    }
                    l++;
                    i = k1;
                } while (true);
            }
        }
        return k1;
    }

    public  e(ly ly1)
        throws IOException
    {
        do
        {
            int i = ly1.nB();
            switch (i)
            {
            default:
                if (a(ly1, i))
                {
                    continue;
                }
                // fall through

            case 0: // '\0'
                return this;

            case 10: // '\n'
                int i1 = mh.b(ly1, 10);
                 a1[];
                int j;
                if (eR == null)
                {
                    j = 0;
                } else
                {
                    j = eR.length;
                }
                a1 = new eR[i1 + j];
                i1 = j;
                if (j != 0)
                {
                    System.arraycopy(eR, 0, a1, 0, j);
                    i1 = j;
                }
                for (; i1 < a1.length - 1; i1++)
                {
                    a1[i1] = new <init>();
                    ly1.a(a1[i1]);
                    ly1.nB();
                }

                a1[i1] = new <init>();
                ly1.a(a1[i1]);
                eR = a1;
                break;

            case 18: // '\022'
                int j1 = mh.b(ly1, 18);
                 a2[];
                int k;
                if (eS == null)
                {
                    k = 0;
                } else
                {
                    k = eS.length;
                }
                a2 = new eS[j1 + k];
                j1 = k;
                if (k != 0)
                {
                    System.arraycopy(eS, 0, a2, 0, k);
                    j1 = k;
                }
                for (; j1 < a2.length - 1; j1++)
                {
                    a2[j1] = new <init>();
                    ly1.a(a2[j1]);
                    ly1.nB();
                }

                a2[j1] = new <init>();
                ly1.a(a2[j1]);
                eS = a2;
                break;

            case 26: // '\032'
                int k1 = mh.b(ly1, 26);
                 a3[];
                int l;
                if (eT == null)
                {
                    l = 0;
                } else
                {
                    l = eT.length;
                }
                a3 = new eT[k1 + l];
                k1 = l;
                if (l != 0)
                {
                    System.arraycopy(eT, 0, a3, 0, l);
                    k1 = l;
                }
                for (; k1 < a3.length - 1; k1++)
                {
                    a3[k1] = new <init>();
                    ly1.a(a3[k1]);
                    ly1.nB();
                }

                a3[k1] = new <init>();
                ly1.a(a3[k1]);
                eT = a3;
                break;
            }
        } while (true);
    }

    public boolean equals(Object obj)
    {
        boolean flag1 = false;
        if (obj != this) goto _L2; else goto _L1
_L1:
        boolean flag = true;
_L4:
        return flag;
_L2:
        flag = flag1;
        if (!(obj instanceof eT)) goto _L4; else goto _L3
_L3:
        obj = (eT)obj;
        flag = flag1;
        if (!mc.equals(eR, ((eR) (obj)).eR)) goto _L4; else goto _L5
_L5:
        flag = flag1;
        if (!mc.equals(eS, ((eS) (obj)).eS)) goto _L4; else goto _L6
_L6:
        flag = flag1;
        if (!mc.equals(eT, ((eT) (obj)).eT)) goto _L4; else goto _L7
_L7:
        if (amX != null && !amX.isEmpty())
        {
            break MISSING_BLOCK_LABEL_115;
        }
        if (((amX) (obj)).amX == null)
        {
            break; /* Loop/switch isn't completed */
        }
        flag = flag1;
        if (!((amX) (obj)).amX.isEmpty()) goto _L4; else goto _L8
_L8:
        return true;
        return amX.equals(((amX) (obj)).amX);
    }

    public amX h()
    {
        eR = r();
        eS = r();
        eT = f();
        amX = null;
        anb = -1;
        return this;
    }

    public int hashCode()
    {
        int j = mc.hashCode(eR);
        int k = mc.hashCode(eS);
        int l = mc.hashCode(eT);
        int i;
        if (amX == null || amX.isEmpty())
        {
            i = 0;
        } else
        {
            i = amX.hashCode();
        }
        return i + (((j + 527) * 31 + k) * 31 + l) * 31;
    }

    public ()
    {
        h();
    }
}
