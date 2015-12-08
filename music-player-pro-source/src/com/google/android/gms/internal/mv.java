// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.io.IOException;

// Referenced classes of package com.google.android.gms.internal:
//            qq, qp, qu, qo, 
//            qz, qw

public interface mv
{
    public static final class a extends qq
    {

        public a afu[];

        public void a(qp qp1)
            throws IOException
        {
            if (afu != null && afu.length > 0)
            {
                for (int i = 0; i < afu.length; i++)
                {
                    a a1 = afu[i];
                    if (a1 != null)
                    {
                        qp1.a(1, a1);
                    }
                }

            }
            super.a(qp1);
        }

        public qw b(qo qo1)
            throws IOException
        {
            return n(qo1);
        }

        protected int c()
        {
            int i = super.c();
            int k = i;
            if (afu != null)
            {
                k = i;
                if (afu.length > 0)
                {
                    int j = 0;
                    do
                    {
                        k = i;
                        if (j >= afu.length)
                        {
                            break;
                        }
                        a a1 = afu[j];
                        k = i;
                        if (a1 != null)
                        {
                            k = i + qp.c(1, a1);
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
                if (obj instanceof a)
                {
                    obj = (a)obj;
                    flag = flag1;
                    if (qu.equals(afu, ((a) (obj)).afu))
                    {
                        return a(((qq) (obj)));
                    }
                }
            }
            return flag;
        }

        public int hashCode()
        {
            return (qu.hashCode(afu) + 527) * 31 + rQ();
        }

        public a mW()
        {
            afu = a.mX();
            ayW = null;
            azh = -1;
            return this;
        }

        public a n(qo qo1)
            throws IOException
        {
            do
            {
                int i = qo1.rz();
                switch (i)
                {
                default:
                    if (a(qo1, i))
                    {
                        continue;
                    }
                    // fall through

                case 0: // '\0'
                    return this;

                case 10: // '\n'
                    int k = qz.b(qo1, 10);
                    a aa[];
                    int j;
                    if (afu == null)
                    {
                        j = 0;
                    } else
                    {
                        j = afu.length;
                    }
                    aa = new a[k + j];
                    k = j;
                    if (j != 0)
                    {
                        System.arraycopy(afu, 0, aa, 0, j);
                        k = j;
                    }
                    for (; k < aa.length - 1; k++)
                    {
                        aa[k] = new a();
                        qo1.a(aa[k]);
                        qo1.rz();
                    }

                    aa[k] = new a();
                    qo1.a(aa[k]);
                    afu = aa;
                    break;
                }
            } while (true);
        }

        public a()
        {
            mW();
        }
    }

    public static final class a.a extends qq
    {

        private static volatile a.a afv[];
        public String afw;
        public String afx;
        public int viewId;

        public static a.a[] mX()
        {
            if (afv == null)
            {
                synchronized (qu.azg)
                {
                    if (afv == null)
                    {
                        afv = new a.a[0];
                    }
                }
            }
            return afv;
            exception;
            obj;
            JVM INSTR monitorexit ;
            throw exception;
        }

        public void a(qp qp1)
            throws IOException
        {
            if (!afw.equals(""))
            {
                qp1.b(1, afw);
            }
            if (!afx.equals(""))
            {
                qp1.b(2, afx);
            }
            if (viewId != 0)
            {
                qp1.t(3, viewId);
            }
            super.a(qp1);
        }

        public qw b(qo qo1)
            throws IOException
        {
            return o(qo1);
        }

        protected int c()
        {
            int j = super.c();
            int i = j;
            if (!afw.equals(""))
            {
                i = j + qp.j(1, afw);
            }
            j = i;
            if (!afx.equals(""))
            {
                j = i + qp.j(2, afx);
            }
            i = j;
            if (viewId != 0)
            {
                i = j + qp.v(3, viewId);
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
            if (afw != null) goto _L6; else goto _L5
_L5:
            flag = flag1;
            if (((a.a) (obj)).afw != null) goto _L4; else goto _L7
_L7:
            if (afx != null)
            {
                break MISSING_BLOCK_LABEL_92;
            }
            flag = flag1;
            if (((a.a) (obj)).afx != null) goto _L4; else goto _L8
_L8:
            flag = flag1;
            if (viewId == ((a.a) (obj)).viewId)
            {
                return a(((qq) (obj)));
            }
              goto _L4
_L6:
            if (!afw.equals(((a.a) (obj)).afw))
            {
                return false;
            }
              goto _L7
            if (!afx.equals(((a.a) (obj)).afx))
            {
                return false;
            }
              goto _L8
        }

        public int hashCode()
        {
            int j = 0;
            int i;
            if (afw == null)
            {
                i = 0;
            } else
            {
                i = afw.hashCode();
            }
            if (afx != null)
            {
                j = afx.hashCode();
            }
            return (((i + 527) * 31 + j) * 31 + viewId) * 31 + rQ();
        }

        public a.a mY()
        {
            afw = "";
            afx = "";
            viewId = 0;
            ayW = null;
            azh = -1;
            return this;
        }

        public a.a o(qo qo1)
            throws IOException
        {
            do
            {
                int i = qo1.rz();
                switch (i)
                {
                default:
                    if (a(qo1, i))
                    {
                        continue;
                    }
                    // fall through

                case 0: // '\0'
                    return this;

                case 10: // '\n'
                    afw = qo1.readString();
                    break;

                case 18: // '\022'
                    afx = qo1.readString();
                    break;

                case 24: // '\030'
                    viewId = qo1.rC();
                    break;
                }
            } while (true);
        }

        public a.a()
        {
            mY();
        }
    }

    public static final class b extends qq
    {

        private static volatile b afy[];
        public d afz;
        public String name;

        public static b[] mZ()
        {
            if (afy == null)
            {
                synchronized (qu.azg)
                {
                    if (afy == null)
                    {
                        afy = new b[0];
                    }
                }
            }
            return afy;
            exception;
            obj;
            JVM INSTR monitorexit ;
            throw exception;
        }

        public void a(qp qp1)
            throws IOException
        {
            if (!name.equals(""))
            {
                qp1.b(1, name);
            }
            if (afz != null)
            {
                qp1.a(2, afz);
            }
            super.a(qp1);
        }

        public qw b(qo qo1)
            throws IOException
        {
            return p(qo1);
        }

        protected int c()
        {
            int j = super.c();
            int i = j;
            if (!name.equals(""))
            {
                i = j + qp.j(1, name);
            }
            j = i;
            if (afz != null)
            {
                j = i + qp.c(2, afz);
            }
            return j;
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
            if (!(obj instanceof b)) goto _L4; else goto _L3
_L3:
            obj = (b)obj;
            if (name != null) goto _L6; else goto _L5
_L5:
            flag = flag1;
            if (((b) (obj)).name != null) goto _L4; else goto _L7
_L7:
            if (afz != null)
            {
                break MISSING_BLOCK_LABEL_79;
            }
            flag = flag1;
            if (((b) (obj)).afz != null) goto _L4; else goto _L8
_L8:
            return a(((qq) (obj)));
_L6:
            if (!name.equals(((b) (obj)).name))
            {
                return false;
            }
              goto _L7
            if (!afz.equals(((b) (obj)).afz))
            {
                return false;
            }
              goto _L8
        }

        public int hashCode()
        {
            int j = 0;
            int i;
            if (name == null)
            {
                i = 0;
            } else
            {
                i = name.hashCode();
            }
            if (afz != null)
            {
                j = afz.hashCode();
            }
            return ((i + 527) * 31 + j) * 31 + rQ();
        }

        public b na()
        {
            name = "";
            afz = null;
            ayW = null;
            azh = -1;
            return this;
        }

        public b p(qo qo1)
            throws IOException
        {
            do
            {
                int i = qo1.rz();
                switch (i)
                {
                default:
                    if (a(qo1, i))
                    {
                        continue;
                    }
                    // fall through

                case 0: // '\0'
                    return this;

                case 10: // '\n'
                    name = qo1.readString();
                    break;

                case 18: // '\022'
                    if (afz == null)
                    {
                        afz = new d();
                    }
                    qo1.a(afz);
                    break;
                }
            } while (true);
        }

        public b()
        {
            na();
        }
    }

    public static final class c extends qq
    {

        public b afA[];
        public String type;

        public void a(qp qp1)
            throws IOException
        {
            if (!type.equals(""))
            {
                qp1.b(1, type);
            }
            if (afA != null && afA.length > 0)
            {
                for (int i = 0; i < afA.length; i++)
                {
                    b b1 = afA[i];
                    if (b1 != null)
                    {
                        qp1.a(2, b1);
                    }
                }

            }
            super.a(qp1);
        }

        public qw b(qo qo1)
            throws IOException
        {
            return q(qo1);
        }

        protected int c()
        {
            int j = super.c();
            int i = j;
            if (!type.equals(""))
            {
                i = j + qp.j(1, type);
            }
            j = i;
            if (afA != null)
            {
                j = i;
                if (afA.length > 0)
                {
                    for (j = 0; j < afA.length;)
                    {
                        b b1 = afA[j];
                        int k = i;
                        if (b1 != null)
                        {
                            k = i + qp.c(2, b1);
                        }
                        j++;
                        i = k;
                    }

                    j = i;
                }
            }
            return j;
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
            if (!(obj instanceof c))
            {
                continue; /* Loop/switch isn't completed */
            }
            obj = (c)obj;
            if (type != null)
            {
                break; /* Loop/switch isn't completed */
            }
            flag = flag1;
            if (((c) (obj)).type != null)
            {
                continue; /* Loop/switch isn't completed */
            }
_L5:
            flag = flag1;
            if (qu.equals(afA, ((c) (obj)).afA))
            {
                return a(((qq) (obj)));
            }
            if (true) goto _L4; else goto _L3
_L3:
            if (!type.equals(((c) (obj)).type))
            {
                return false;
            }
              goto _L5
            if (true) goto _L4; else goto _L6
_L6:
        }

        public int hashCode()
        {
            int i;
            if (type == null)
            {
                i = 0;
            } else
            {
                i = type.hashCode();
            }
            return ((i + 527) * 31 + qu.hashCode(afA)) * 31 + rQ();
        }

        public c nb()
        {
            type = "";
            afA = b.mZ();
            ayW = null;
            azh = -1;
            return this;
        }

        public c q(qo qo1)
            throws IOException
        {
            do
            {
                int i = qo1.rz();
                switch (i)
                {
                default:
                    if (a(qo1, i))
                    {
                        continue;
                    }
                    // fall through

                case 0: // '\0'
                    return this;

                case 10: // '\n'
                    type = qo1.readString();
                    break;

                case 18: // '\022'
                    int k = qz.b(qo1, 18);
                    b ab[];
                    int j;
                    if (afA == null)
                    {
                        j = 0;
                    } else
                    {
                        j = afA.length;
                    }
                    ab = new b[k + j];
                    k = j;
                    if (j != 0)
                    {
                        System.arraycopy(afA, 0, ab, 0, j);
                        k = j;
                    }
                    for (; k < ab.length - 1; k++)
                    {
                        ab[k] = new b();
                        qo1.a(ab[k]);
                        qo1.rz();
                    }

                    ab[k] = new b();
                    qo1.a(ab[k]);
                    afA = ab;
                    break;
                }
            } while (true);
        }

        public c()
        {
            nb();
        }
    }

    public static final class d extends qq
    {

        public String NJ;
        public boolean afB;
        public long afC;
        public double afD;
        public c afE;

        public void a(qp qp1)
            throws IOException
        {
            if (afB)
            {
                qp1.b(1, afB);
            }
            if (!NJ.equals(""))
            {
                qp1.b(2, NJ);
            }
            if (afC != 0L)
            {
                qp1.b(3, afC);
            }
            if (Double.doubleToLongBits(afD) != Double.doubleToLongBits(0.0D))
            {
                qp1.a(4, afD);
            }
            if (afE != null)
            {
                qp1.a(5, afE);
            }
            super.a(qp1);
        }

        public qw b(qo qo1)
            throws IOException
        {
            return r(qo1);
        }

        protected int c()
        {
            int j = super.c();
            int i = j;
            if (afB)
            {
                i = j + qp.c(1, afB);
            }
            j = i;
            if (!NJ.equals(""))
            {
                j = i + qp.j(2, NJ);
            }
            i = j;
            if (afC != 0L)
            {
                i = j + qp.d(3, afC);
            }
            j = i;
            if (Double.doubleToLongBits(afD) != Double.doubleToLongBits(0.0D))
            {
                j = i + qp.b(4, afD);
            }
            i = j;
            if (afE != null)
            {
                i = j + qp.c(5, afE);
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
            if (!(obj instanceof d)) goto _L4; else goto _L3
_L3:
            obj = (d)obj;
            flag = flag1;
            if (afB != ((d) (obj)).afB) goto _L4; else goto _L5
_L5:
            if (NJ != null) goto _L7; else goto _L6
_L6:
            flag = flag1;
            if (((d) (obj)).NJ != null) goto _L4; else goto _L8
_L8:
            flag = flag1;
            if (afC != ((d) (obj)).afC) goto _L4; else goto _L9
_L9:
            flag = flag1;
            if (Double.doubleToLongBits(afD) != Double.doubleToLongBits(((d) (obj)).afD)) goto _L4; else goto _L10
_L10:
            if (afE != null)
            {
                break MISSING_BLOCK_LABEL_126;
            }
            flag = flag1;
            if (((d) (obj)).afE != null) goto _L4; else goto _L11
_L11:
            return a(((qq) (obj)));
_L7:
            if (!NJ.equals(((d) (obj)).NJ))
            {
                return false;
            }
              goto _L8
            if (!afE.equals(((d) (obj)).afE))
            {
                return false;
            }
              goto _L11
        }

        public int hashCode()
        {
            int j = 0;
            char c1;
            int i;
            int k;
            int l;
            long l1;
            if (afB)
            {
                c1 = '\u04CF';
            } else
            {
                c1 = '\u04D5';
            }
            if (NJ == null)
            {
                i = 0;
            } else
            {
                i = NJ.hashCode();
            }
            k = (int)(afC ^ afC >>> 32);
            l1 = Double.doubleToLongBits(afD);
            l = (int)(l1 ^ l1 >>> 32);
            if (afE != null)
            {
                j = afE.hashCode();
            }
            return ((((i + (c1 + 527) * 31) * 31 + k) * 31 + l) * 31 + j) * 31 + rQ();
        }

        public d nc()
        {
            afB = false;
            NJ = "";
            afC = 0L;
            afD = 0.0D;
            afE = null;
            ayW = null;
            azh = -1;
            return this;
        }

        public d r(qo qo1)
            throws IOException
        {
            do
            {
                int i = qo1.rz();
                switch (i)
                {
                default:
                    if (a(qo1, i))
                    {
                        continue;
                    }
                    // fall through

                case 0: // '\0'
                    return this;

                case 8: // '\b'
                    afB = qo1.rD();
                    break;

                case 18: // '\022'
                    NJ = qo1.readString();
                    break;

                case 24: // '\030'
                    afC = qo1.rB();
                    break;

                case 33: // '!'
                    afD = qo1.readDouble();
                    break;

                case 42: // '*'
                    if (afE == null)
                    {
                        afE = new c();
                    }
                    qo1.a(afE);
                    break;
                }
            } while (true);
        }

        public d()
        {
            nc();
        }
    }

}
