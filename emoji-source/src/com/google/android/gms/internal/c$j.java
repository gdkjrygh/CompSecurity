// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.io.IOException;
import java.util.List;

// Referenced classes of package com.google.android.gms.internal:
//            ma, c, md, me, 
//            lz, mc, ly, mh

public static final class q extends ma
{

    public anb fJ[];
    public anb fK;
    public String fL;

    public static q b(byte abyte0[])
        throws md
    {
        return (q)me.a(new <init>(), abyte0);
    }

    public void a(lz lz1)
        throws IOException
    {
        if (fJ != null && fJ.length > 0)
        {
            for (int i = 0; i < fJ.length; i++)
            {
                <init> <init>1 = fJ[i];
                if (<init>1 != null)
                {
                    lz1.a(1, <init>1);
                }
            }

        }
        if (fK != null)
        {
            lz1.a(2, fK);
        }
        if (!fL.equals(""))
        {
            lz1.b(3, fL);
        }
        super.a(lz1);
    }

    public me b(ly ly1)
        throws IOException
    {
        return k(ly1);
    }

    protected int c()
    {
        int i = super.c();
        int l = i;
        if (fJ != null)
        {
            l = i;
            if (fJ.length > 0)
            {
                int i1 = 0;
                do
                {
                    l = i;
                    if (i1 >= fJ.length)
                    {
                        break;
                    }
                    k k1 = fJ[i1];
                    l = i;
                    if (k1 != null)
                    {
                        l = i + lz.b(1, k1);
                    }
                    i1++;
                    i = l;
                } while (true);
            }
        }
        i = l;
        if (fK != null)
        {
            i = l + lz.b(2, fK);
        }
        l = i;
        if (!fL.equals(""))
        {
            l = i + lz.h(3, fL);
        }
        return l;
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
        if (!(obj instanceof fL)) goto _L4; else goto _L3
_L3:
        obj = (fL)obj;
        flag = flag1;
        if (!mc.equals(fJ, ((fJ) (obj)).fJ)) goto _L4; else goto _L5
_L5:
        if (fK != null) goto _L7; else goto _L6
_L6:
        flag = flag1;
        if (((fK) (obj)).fK != null) goto _L4; else goto _L8
_L8:
        if (fL != null) goto _L10; else goto _L9
_L9:
        flag = flag1;
        if (((fL) (obj)).fL != null) goto _L4; else goto _L11
_L11:
        if (amX != null && !amX.isEmpty())
        {
            break MISSING_BLOCK_LABEL_147;
        }
        if (((amX) (obj)).amX == null)
        {
            break; /* Loop/switch isn't completed */
        }
        flag = flag1;
        if (!((amX) (obj)).amX.isEmpty()) goto _L4; else goto _L12
_L12:
        return true;
_L7:
        if (!fK.equals(((equals) (obj)).fK))
        {
            return false;
        }
          goto _L8
_L10:
        if (!fL.equals(((fL) (obj)).fL))
        {
            return false;
        }
          goto _L11
        return amX.equals(((amX) (obj)).amX);
          goto _L8
    }

    public int hashCode()
    {
        boolean flag = false;
        int j1 = mc.hashCode(fJ);
        int i;
        int l;
        int i1;
        if (fK == null)
        {
            i = 0;
        } else
        {
            i = fK.hashCode();
        }
        if (fL == null)
        {
            l = 0;
        } else
        {
            l = fL.hashCode();
        }
        i1 = ((flag) ? 1 : 0);
        if (amX != null)
        {
            if (amX.isEmpty())
            {
                i1 = ((flag) ? 1 : 0);
            } else
            {
                i1 = amX.hashCode();
            }
        }
        return (l + (i + (j1 + 527) * 31) * 31) * 31 + i1;
    }

    public amX k(ly ly1)
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
                amX aamx[];
                int l;
                if (fJ == null)
                {
                    l = 0;
                } else
                {
                    l = fJ.length;
                }
                aamx = new fJ[i1 + l];
                i1 = l;
                if (l != 0)
                {
                    System.arraycopy(fJ, 0, aamx, 0, l);
                    i1 = l;
                }
                for (; i1 < aamx.length - 1; i1++)
                {
                    aamx[i1] = new <init>();
                    ly1.a(aamx[i1]);
                    ly1.nB();
                }

                aamx[i1] = new <init>();
                ly1.a(aamx[i1]);
                fJ = aamx;
                break;

            case 18: // '\022'
                if (fK == null)
                {
                    fK = new <init>();
                }
                ly1.a(fK);
                break;

            case 26: // '\032'
                fL = ly1.readString();
                break;
            }
        } while (true);
    }

    public eadString q()
    {
        fJ = o();
        fK = null;
        fL = "";
        amX = null;
        anb = -1;
        return this;
    }

    public ()
    {
        q();
    }
}
