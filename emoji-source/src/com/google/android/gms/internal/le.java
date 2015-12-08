// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.io.IOException;
import java.util.List;

// Referenced classes of package com.google.android.gms.internal:
//            ma, md, me, lz, 
//            ly

public interface le
{
    public static final class a extends ma
    {

        public long aiG;
        public c.j aiH;
        public c.f fK;

        public static a l(byte abyte0[])
            throws md
        {
            return (a)me.a(new a(), abyte0);
        }

        public void a(lz lz1)
            throws IOException
        {
            lz1.b(1, aiG);
            if (fK != null)
            {
                lz1.a(2, fK);
            }
            if (aiH != null)
            {
                lz1.a(3, aiH);
            }
            super.a(lz1);
        }

        public me b(ly ly1)
            throws IOException
        {
            return p(ly1);
        }

        protected int c()
        {
            int j = super.c() + lz.d(1, aiG);
            int i = j;
            if (fK != null)
            {
                i = j + lz.b(2, fK);
            }
            j = i;
            if (aiH != null)
            {
                j = i + lz.b(3, aiH);
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
            if (aiG != ((a) (obj)).aiG) goto _L4; else goto _L5
_L5:
            if (fK != null) goto _L7; else goto _L6
_L6:
            flag = flag1;
            if (((a) (obj)).fK != null) goto _L4; else goto _L8
_L8:
            if (aiH != null) goto _L10; else goto _L9
_L9:
            flag = flag1;
            if (((a) (obj)).aiH != null) goto _L4; else goto _L11
_L11:
            if (amX != null && !amX.isEmpty())
            {
                break MISSING_BLOCK_LABEL_145;
            }
            if (((a) (obj)).amX == null)
            {
                break; /* Loop/switch isn't completed */
            }
            flag = flag1;
            if (!((a) (obj)).amX.isEmpty()) goto _L4; else goto _L12
_L12:
            return true;
_L7:
            if (!fK.equals(((a) (obj)).fK))
            {
                return false;
            }
              goto _L8
_L10:
            if (!aiH.equals(((a) (obj)).aiH))
            {
                return false;
            }
              goto _L11
            return amX.equals(((a) (obj)).amX);
              goto _L8
        }

        public int hashCode()
        {
            boolean flag = false;
            int i1 = (int)(aiG ^ aiG >>> 32);
            int i;
            int j;
            int k;
            if (fK == null)
            {
                i = 0;
            } else
            {
                i = fK.hashCode();
            }
            if (aiH == null)
            {
                j = 0;
            } else
            {
                j = aiH.hashCode();
            }
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
            return (j + (i + (i1 + 527) * 31) * 31) * 31 + k;
        }

        public a nf()
        {
            aiG = 0L;
            fK = null;
            aiH = null;
            amX = null;
            anb = -1;
            return this;
        }

        public a p(ly ly1)
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

                case 8: // '\b'
                    aiG = ly1.nD();
                    break;

                case 18: // '\022'
                    if (fK == null)
                    {
                        fK = new c.f();
                    }
                    ly1.a(fK);
                    break;

                case 26: // '\032'
                    if (aiH == null)
                    {
                        aiH = new c.j();
                    }
                    ly1.a(aiH);
                    break;
                }
            } while (true);
        }

        public a()
        {
            nf();
        }
    }

}
