// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.io.IOException;
import java.util.List;

// Referenced classes of package com.google.android.gms.internal:
//            ma, lz, mc, ly, 
//            mh, me

public interface iv
{
    public static final class a extends ma
    {

        public a Uy[];

        public void a(lz lz1)
            throws IOException
        {
            if (Uy != null && Uy.length > 0)
            {
                for (int i = 0; i < Uy.length; i++)
                {
                    a a1 = Uy[i];
                    if (a1 != null)
                    {
                        lz1.a(1, a1);
                    }
                }

            }
            super.a(lz1);
        }

        public me b(ly ly1)
            throws IOException
        {
            return n(ly1);
        }

        protected int c()
        {
            int i = super.c();
            int k = i;
            if (Uy != null)
            {
                k = i;
                if (Uy.length > 0)
                {
                    int j = 0;
                    do
                    {
                        k = i;
                        if (j >= Uy.length)
                        {
                            break;
                        }
                        a a1 = Uy[j];
                        k = i;
                        if (a1 != null)
                        {
                            k = i + lz.b(1, a1);
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
            if (!mc.equals(Uy, ((a) (obj)).Uy)) goto _L4; else goto _L5
_L5:
            if (amX != null && !amX.isEmpty())
            {
                break MISSING_BLOCK_LABEL_83;
            }
            if (((a) (obj)).amX == null)
            {
                break; /* Loop/switch isn't completed */
            }
            flag = flag1;
            if (!((a) (obj)).amX.isEmpty()) goto _L4; else goto _L6
_L6:
            return true;
            return amX.equals(((a) (obj)).amX);
        }

        public int hashCode()
        {
            int j = mc.hashCode(Uy);
            int i;
            if (amX == null || amX.isEmpty())
            {
                i = 0;
            } else
            {
                i = amX.hashCode();
            }
            return i + (j + 527) * 31;
        }

        public a iQ()
        {
            Uy = a.iR();
            amX = null;
            anb = -1;
            return this;
        }

        public a n(ly ly1)
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
                    int k = mh.b(ly1, 10);
                    a aa[];
                    int j;
                    if (Uy == null)
                    {
                        j = 0;
                    } else
                    {
                        j = Uy.length;
                    }
                    aa = new a[k + j];
                    k = j;
                    if (j != 0)
                    {
                        System.arraycopy(Uy, 0, aa, 0, j);
                        k = j;
                    }
                    for (; k < aa.length - 1; k++)
                    {
                        aa[k] = new a();
                        ly1.a(aa[k]);
                        ly1.nB();
                    }

                    aa[k] = new a();
                    ly1.a(aa[k]);
                    Uy = aa;
                    break;
                }
            } while (true);
        }

        public a()
        {
            iQ();
        }
    }

    public static final class a.a extends ma
    {

        private static volatile a.a Uz[];
        public String UA;
        public String UB;
        public int viewId;

        public static a.a[] iR()
        {
            if (Uz == null)
            {
                synchronized (mc.ana)
                {
                    if (Uz == null)
                    {
                        Uz = new a.a[0];
                    }
                }
            }
            return Uz;
            exception;
            obj;
            JVM INSTR monitorexit ;
            throw exception;
        }

        public void a(lz lz1)
            throws IOException
        {
            if (!UA.equals(""))
            {
                lz1.b(1, UA);
            }
            if (!UB.equals(""))
            {
                lz1.b(2, UB);
            }
            if (viewId != 0)
            {
                lz1.p(3, viewId);
            }
            super.a(lz1);
        }

        public me b(ly ly1)
            throws IOException
        {
            return o(ly1);
        }

        protected int c()
        {
            int j = super.c();
            int i = j;
            if (!UA.equals(""))
            {
                i = j + lz.h(1, UA);
            }
            j = i;
            if (!UB.equals(""))
            {
                j = i + lz.h(2, UB);
            }
            i = j;
            if (viewId != 0)
            {
                i = j + lz.r(3, viewId);
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
            if (UA != null) goto _L6; else goto _L5
_L5:
            flag = flag1;
            if (((a.a) (obj)).UA != null) goto _L4; else goto _L7
_L7:
            if (UB != null) goto _L9; else goto _L8
_L8:
            flag = flag1;
            if (((a.a) (obj)).UB != null) goto _L4; else goto _L10
_L10:
            flag = flag1;
            if (viewId != ((a.a) (obj)).viewId) goto _L4; else goto _L11
_L11:
            if (amX != null && !amX.isEmpty())
            {
                break MISSING_BLOCK_LABEL_144;
            }
            if (((a.a) (obj)).amX == null)
            {
                break; /* Loop/switch isn't completed */
            }
            flag = flag1;
            if (!((a.a) (obj)).amX.isEmpty()) goto _L4; else goto _L12
_L12:
            return true;
_L6:
            if (!UA.equals(((a.a) (obj)).UA))
            {
                return false;
            }
              goto _L7
_L9:
            if (!UB.equals(((a.a) (obj)).UB))
            {
                return false;
            }
              goto _L10
            return amX.equals(((a.a) (obj)).amX);
              goto _L7
        }

        public int hashCode()
        {
            boolean flag = false;
            int i;
            int j;
            int k;
            int l;
            if (UA == null)
            {
                i = 0;
            } else
            {
                i = UA.hashCode();
            }
            if (UB == null)
            {
                j = 0;
            } else
            {
                j = UB.hashCode();
            }
            l = viewId;
            k = ((flag) ? 1 : 0);
            if (amX != null)
            {
                if (amX.isEmpty())
                {
                    k = ((flag) ? 1 : 0);
                } else
                {
                    k = amX.hashCode();
                }
            }
            return ((j + (i + 527) * 31) * 31 + l) * 31 + k;
        }

        public a.a iS()
        {
            UA = "";
            UB = "";
            viewId = 0;
            amX = null;
            anb = -1;
            return this;
        }

        public a.a o(ly ly1)
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
                    UA = ly1.readString();
                    break;

                case 18: // '\022'
                    UB = ly1.readString();
                    break;

                case 24: // '\030'
                    viewId = ly1.nE();
                    break;
                }
            } while (true);
        }

        public a.a()
        {
            iS();
        }
    }

}
