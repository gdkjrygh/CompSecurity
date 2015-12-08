// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.io.IOException;

// Referenced classes of package com.google.android.gms.internal:
//            qq, qv, qw, qp, 
//            qo

public interface pu
{
    public static final class a extends qq
    {

        public long auB;
        public c.j auC;
        public c.f gs;

        public static a l(byte abyte0[])
            throws qv
        {
            return (a)qw.a(new a(), abyte0);
        }

        public void a(qp qp1)
            throws IOException
        {
            qp1.b(1, auB);
            if (gs != null)
            {
                qp1.a(2, gs);
            }
            if (auC != null)
            {
                qp1.a(3, auC);
            }
            super.a(qp1);
        }

        public qw b(qo qo1)
            throws IOException
        {
            return s(qo1);
        }

        protected int c()
        {
            int j = super.c() + qp.d(1, auB);
            int i = j;
            if (gs != null)
            {
                i = j + qp.c(2, gs);
            }
            j = i;
            if (auC != null)
            {
                j = i + qp.c(3, auC);
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
            if (!(obj instanceof a)) goto _L4; else goto _L3
_L3:
            obj = (a)obj;
            flag = flag1;
            if (auB != ((a) (obj)).auB) goto _L4; else goto _L5
_L5:
            if (gs != null) goto _L7; else goto _L6
_L6:
            flag = flag1;
            if (((a) (obj)).gs != null) goto _L4; else goto _L8
_L8:
            if (auC != null)
            {
                break MISSING_BLOCK_LABEL_93;
            }
            flag = flag1;
            if (((a) (obj)).auC != null) goto _L4; else goto _L9
_L9:
            return a(((qq) (obj)));
_L7:
            if (!gs.equals(((a) (obj)).gs))
            {
                return false;
            }
              goto _L8
            if (!auC.equals(((a) (obj)).auC))
            {
                return false;
            }
              goto _L9
        }

        public int hashCode()
        {
            int j = 0;
            int k = (int)(auB ^ auB >>> 32);
            int i;
            if (gs == null)
            {
                i = 0;
            } else
            {
                i = gs.hashCode();
            }
            if (auC != null)
            {
                j = auC.hashCode();
            }
            return ((i + (k + 527) * 31) * 31 + j) * 31 + rQ();
        }

        public a rc()
        {
            auB = 0L;
            gs = null;
            auC = null;
            ayW = null;
            azh = -1;
            return this;
        }

        public a s(qo qo1)
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
                    auB = qo1.rB();
                    break;

                case 18: // '\022'
                    if (gs == null)
                    {
                        gs = new c.f();
                    }
                    qo1.a(gs);
                    break;

                case 26: // '\032'
                    if (auC == null)
                    {
                        auC = new c.j();
                    }
                    qo1.a(auC);
                    break;
                }
            } while (true);
        }

        public a()
        {
            rc();
        }
    }

}
