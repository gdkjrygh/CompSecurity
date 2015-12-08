// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.io.IOException;
import java.util.List;

// Referenced classes of package com.google.android.gms.internal:
//            mb, ma, md, lz, 
//            mi, mf

public interface iw
{
    public static final class a extends mb
    {

        public a Uv[];

        public void a(ma ma1)
            throws IOException
        {
            if (Uv != null && Uv.length > 0)
            {
                for (int i = 0; i < Uv.length; i++)
                {
                    a a1 = Uv[i];
                    if (a1 != null)
                    {
                        ma1.a(1, a1);
                    }
                }

            }
            super.a(ma1);
        }

        public mf b(lz lz1)
            throws IOException
        {
            return n(lz1);
        }

        protected int c()
        {
            int i = super.c();
            int k = i;
            if (Uv != null)
            {
                k = i;
                if (Uv.length > 0)
                {
                    int j = 0;
                    do
                    {
                        k = i;
                        if (j >= Uv.length)
                        {
                            break;
                        }
                        a a1 = Uv[j];
                        k = i;
                        if (a1 != null)
                        {
                            k = i + ma.b(1, a1);
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
            flag = flag1;
            if (!md.equals(Uv, ((a) (obj)).Uv)) goto _L4; else goto _L5
_L5:
            if (amU != null && !amU.isEmpty())
            {
                break MISSING_BLOCK_LABEL_83;
            }
            if (((a) (obj)).amU == null)
            {
                break; /* Loop/switch isn't completed */
            }
            flag = flag1;
            if (!((a) (obj)).amU.isEmpty()) goto _L4; else goto _L6
_L6:
            return true;
            return amU.equals(((a) (obj)).amU);
        }

        public int hashCode()
        {
            int j = md.hashCode(Uv);
            int i;
            if (amU == null || amU.isEmpty())
            {
                i = 0;
            } else
            {
                i = amU.hashCode();
            }
            return i + (j + 527) * 31;
        }

        public a iL()
        {
            Uv = a.iM();
            amU = null;
            amY = -1;
            return this;
        }

        public a n(lz lz1)
            throws IOException
        {
            do
            {
                int i = lz1.nw();
                switch (i)
                {
                default:
                    if (a(lz1, i))
                    {
                        continue;
                    }
                    // fall through

                case 0: // '\0'
                    return this;

                case 10: // '\n'
                    int k = mi.b(lz1, 10);
                    a aa[];
                    int j;
                    if (Uv == null)
                    {
                        j = 0;
                    } else
                    {
                        j = Uv.length;
                    }
                    aa = new a[k + j];
                    k = j;
                    if (j != 0)
                    {
                        System.arraycopy(Uv, 0, aa, 0, j);
                        k = j;
                    }
                    for (; k < aa.length - 1; k++)
                    {
                        aa[k] = new a();
                        lz1.a(aa[k]);
                        lz1.nw();
                    }

                    aa[k] = new a();
                    lz1.a(aa[k]);
                    Uv = aa;
                    break;
                }
            } while (true);
        }

        public a()
        {
            iL();
        }
    }

    public static final class a.a extends mb
    {

        private static volatile a.a Uw[];
        public String Ux;
        public String Uy;
        public int viewId;

        public static a.a[] iM()
        {
            if (Uw == null)
            {
                synchronized (md.amX)
                {
                    if (Uw == null)
                    {
                        Uw = new a.a[0];
                    }
                }
            }
            return Uw;
            exception;
            obj;
            JVM INSTR monitorexit ;
            throw exception;
        }

        public void a(ma ma1)
            throws IOException
        {
            if (!Ux.equals(""))
            {
                ma1.b(1, Ux);
            }
            if (!Uy.equals(""))
            {
                ma1.b(2, Uy);
            }
            if (viewId != 0)
            {
                ma1.p(3, viewId);
            }
            super.a(ma1);
        }

        public mf b(lz lz1)
            throws IOException
        {
            return o(lz1);
        }

        protected int c()
        {
            int j = super.c();
            int i = j;
            if (!Ux.equals(""))
            {
                i = j + ma.h(1, Ux);
            }
            j = i;
            if (!Uy.equals(""))
            {
                j = i + ma.h(2, Uy);
            }
            i = j;
            if (viewId != 0)
            {
                i = j + ma.r(3, viewId);
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
            if (!(obj instanceof a.a)) goto _L4; else goto _L3
_L3:
            obj = (a.a)obj;
            if (Ux != null) goto _L6; else goto _L5
_L5:
            flag = flag1;
            if (((a.a) (obj)).Ux != null) goto _L4; else goto _L7
_L7:
            if (Uy != null) goto _L9; else goto _L8
_L8:
            flag = flag1;
            if (((a.a) (obj)).Uy != null) goto _L4; else goto _L10
_L10:
            flag = flag1;
            if (viewId != ((a.a) (obj)).viewId) goto _L4; else goto _L11
_L11:
            if (amU != null && !amU.isEmpty())
            {
                break MISSING_BLOCK_LABEL_144;
            }
            if (((a.a) (obj)).amU == null)
            {
                break; /* Loop/switch isn't completed */
            }
            flag = flag1;
            if (!((a.a) (obj)).amU.isEmpty()) goto _L4; else goto _L12
_L12:
            return true;
_L6:
            if (!Ux.equals(((a.a) (obj)).Ux))
            {
                return false;
            }
              goto _L7
_L9:
            if (!Uy.equals(((a.a) (obj)).Uy))
            {
                return false;
            }
              goto _L10
            return amU.equals(((a.a) (obj)).amU);
              goto _L7
        }

        public int hashCode()
        {
            boolean flag = false;
            int i;
            int j;
            int k;
            int l;
            if (Ux == null)
            {
                i = 0;
            } else
            {
                i = Ux.hashCode();
            }
            if (Uy == null)
            {
                j = 0;
            } else
            {
                j = Uy.hashCode();
            }
            l = viewId;
            k = ((flag) ? 1 : 0);
            if (amU != null)
            {
                if (amU.isEmpty())
                {
                    k = ((flag) ? 1 : 0);
                } else
                {
                    k = amU.hashCode();
                }
            }
            return ((j + (i + 527) * 31) * 31 + l) * 31 + k;
        }

        public a.a iN()
        {
            Ux = "";
            Uy = "";
            viewId = 0;
            amU = null;
            amY = -1;
            return this;
        }

        public a.a o(lz lz1)
            throws IOException
        {
            do
            {
                int i = lz1.nw();
                switch (i)
                {
                default:
                    if (a(lz1, i))
                    {
                        continue;
                    }
                    // fall through

                case 0: // '\0'
                    return this;

                case 10: // '\n'
                    Ux = lz1.readString();
                    break;

                case 18: // '\022'
                    Uy = lz1.readString();
                    break;

                case 24: // '\030'
                    viewId = lz1.nz();
                    break;
                }
            } while (true);
        }

        public a.a()
        {
            iN();
        }
    }

}
