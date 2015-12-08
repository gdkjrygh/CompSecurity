// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.io.IOException;

// Referenced classes of package com.google.android.gms.internal:
//            ph, ll, pg, pl, 
//            pf, pq, pn

public static final class lP extends ph
{
    public static final class a extends ph
    {

        private static volatile a adF[];
        public String adG;
        public String adH;
        public int viewId;

        public static a[] lQ()
        {
            if (adF == null)
            {
                synchronized (pl.awT)
                {
                    if (adF == null)
                    {
                        adF = new a[0];
                    }
                }
            }
            return adF;
            exception;
            obj;
            JVM INSTR monitorexit ;
            throw exception;
        }

        public void a(pg pg1)
            throws IOException
        {
            if (!adG.equals(""))
            {
                pg1.b(1, adG);
            }
            if (!adH.equals(""))
            {
                pg1.b(2, adH);
            }
            if (viewId != 0)
            {
                pg1.s(3, viewId);
            }
            super.a(pg1);
        }

        public pn b(pf pf1)
            throws IOException
        {
            return o(pf1);
        }

        protected int c()
        {
            int j = super.c();
            int i = j;
            if (!adG.equals(""))
            {
                i = j + pg.j(1, adG);
            }
            j = i;
            if (!adH.equals(""))
            {
                j = i + pg.j(2, adH);
            }
            i = j;
            if (viewId != 0)
            {
                i = j + pg.u(3, viewId);
            }
            return i;
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
            if (!(obj instanceof a)) goto _L4; else goto _L3
_L3:
            obj = (a)obj;
            if (adG != null) goto _L6; else goto _L5
_L5:
            flag = flag1;
            if (((a) (obj)).adG != null) goto _L4; else goto _L7
_L7:
            if (adH != null)
            {
                break MISSING_BLOCK_LABEL_92;
            }
            flag = flag1;
            if (((a) (obj)).adH != null) goto _L4; else goto _L8
_L8:
            flag = flag1;
            if (viewId == ((a) (obj)).viewId)
            {
                return a(((ph) (obj)));
            }
              goto _L4
_L6:
            if (!adG.equals(((a) (obj)).adG))
            {
                return false;
            }
              goto _L7
            if (!adH.equals(((a) (obj)).adH))
            {
                return false;
            }
              goto _L8
        }

        public int hashCode()
        {
            int j = 0;
            int i;
            if (adG == null)
            {
                i = 0;
            } else
            {
                i = adG.hashCode();
            }
            if (adH != null)
            {
                j = adH.hashCode();
            }
            return (((i + 527) * 31 + j) * 31 + viewId) * 31 + qz();
        }

        public a lR()
        {
            adG = "";
            adH = "";
            viewId = 0;
            awJ = null;
            awU = -1;
            return this;
        }

        public a o(pf pf1)
            throws IOException
        {
            do
            {
                int i = pf1.qi();
                switch (i)
                {
                default:
                    if (a(pf1, i))
                    {
                        continue;
                    }
                    // fall through

                case 0: // '\0'
                    return this;

                case 10: // '\n'
                    adG = pf1.readString();
                    break;

                case 18: // '\022'
                    adH = pf1.readString();
                    break;

                case 24: // '\030'
                    viewId = pf1.ql();
                    break;
                }
            } while (true);
        }

        public a()
        {
            lR();
        }
    }


    public a adE[];

    public void a(pg pg1)
        throws IOException
    {
        if (adE != null && adE.length > 0)
        {
            for (int i = 0; i < adE.length; i++)
            {
                a a1 = adE[i];
                if (a1 != null)
                {
                    pg1.a(1, a1);
                }
            }

        }
        super.a(pg1);
    }

    public pn b(pf pf1)
        throws IOException
    {
        return n(pf1);
    }

    protected int c()
    {
        int i = super.c();
        int k = i;
        if (adE != null)
        {
            k = i;
            if (adE.length > 0)
            {
                int j = 0;
                do
                {
                    k = i;
                    if (j >= adE.length)
                    {
                        break;
                    }
                    a a1 = adE[j];
                    k = i;
                    if (a1 != null)
                    {
                        k = i + pg.c(1, a1);
                    }
                    j++;
                    i = k;
                } while (true);
            }
        }
        return k;
    }

    public boolean equals(Object obj)
    {
        boolean flag1 = false;
        boolean flag;
        if (obj == this)
        {
            flag = true;
        } else
        {
            flag = flag1;
            if (obj instanceof adE)
            {
                obj = (adE)obj;
                flag = flag1;
                if (pl.equals(adE, ((adE) (obj)).adE))
                {
                    return a(((ph) (obj)));
                }
            }
        }
        return flag;
    }

    public int hashCode()
    {
        return (pl.hashCode(adE) + 527) * 31 + qz();
    }

    public qz lP()
    {
        adE = a.lQ();
        awJ = null;
        awU = -1;
        return this;
    }

    public awU n(pf pf1)
        throws IOException
    {
        do
        {
            int i = pf1.qi();
            switch (i)
            {
            default:
                if (a(pf1, i))
                {
                    continue;
                }
                // fall through

            case 0: // '\0'
                return this;

            case 10: // '\n'
                int k = pq.b(pf1, 10);
                a aa[];
                int j;
                if (adE == null)
                {
                    j = 0;
                } else
                {
                    j = adE.length;
                }
                aa = new a[k + j];
                k = j;
                if (j != 0)
                {
                    System.arraycopy(adE, 0, aa, 0, j);
                    k = j;
                }
                for (; k < aa.length - 1; k++)
                {
                    aa[k] = new a();
                    pf1.a(aa[k]);
                    pf1.qi();
                }

                aa[k] = new a();
                pf1.a(aa[k]);
                adE = aa;
                break;
            }
        } while (true);
    }

    public a.lR()
    {
        lP();
    }
}
