// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;


// Referenced classes of package com.google.android.gms.internal:
//            qq, qw, qp, qu, 
//            qo, qz

public final class q extends qq
{

    public azh gr[];
    public azh gs;
    public String gt;

    public static q b(byte abyte0[])
    {
        return (q)qw.a(new <init>(), abyte0);
    }

    public final void a(qp qp1)
    {
        if (gr != null && gr.length > 0)
        {
            for (int i = 0; i < gr.length; i++)
            {
                <init> <init>1 = gr[i];
                if (<init>1 != null)
                {
                    qp1.a(1, <init>1);
                }
            }

        }
        if (gs != null)
        {
            qp1.a(2, gs);
        }
        if (!gt.equals(""))
        {
            qp1.b(3, gt);
        }
        super.a(qp1);
    }

    public final qw b(qo qo1)
    {
        return k(qo1);
    }

    protected final int c()
    {
        int i = super.c();
        int j = i;
        if (gr != null)
        {
            j = i;
            if (gr.length > 0)
            {
                int l = 0;
                do
                {
                    j = i;
                    if (l >= gr.length)
                    {
                        break;
                    }
                    k k1 = gr[l];
                    j = i;
                    if (k1 != null)
                    {
                        j = i + qp.c(1, k1);
                    }
                    l++;
                    i = j;
                } while (true);
            }
        }
        i = j;
        if (gs != null)
        {
            i = j + qp.c(2, gs);
        }
        j = i;
        if (!gt.equals(""))
        {
            j = i + qp.j(3, gt);
        }
        return j;
    }

    public final boolean equals(Object obj)
    {
        boolean flag1 = false;
        if (obj != this) goto _L2; else goto _L1
_L1:
        boolean flag = true;
_L4:
        return flag;
_L2:
        flag = flag1;
        if (!(obj instanceof gt)) goto _L4; else goto _L3
_L3:
        obj = (gt)obj;
        flag = flag1;
        if (!qu.equals(gr, ((gr) (obj)).gr)) goto _L4; else goto _L5
_L5:
        if (gs != null) goto _L7; else goto _L6
_L6:
        flag = flag1;
        if (((gs) (obj)).gs != null) goto _L4; else goto _L8
_L8:
        if (gt != null)
        {
            break MISSING_BLOCK_LABEL_95;
        }
        flag = flag1;
        if (((gt) (obj)).gt != null) goto _L4; else goto _L9
_L9:
        return a(((qq) (obj)));
_L7:
        if (!gs.equals(((equals) (obj)).gs))
        {
            return false;
        }
          goto _L8
        if (!gt.equals(((gt) (obj)).gt))
        {
            return false;
        }
          goto _L9
    }

    public final int hashCode()
    {
        int j = 0;
        int l = qu.hashCode(gr);
        int i;
        if (gs == null)
        {
            i = 0;
        } else
        {
            i = gs.hashCode();
        }
        if (gt != null)
        {
            j = gt.hashCode();
        }
        return ((i + (l + 527) * 31) * 31 + j) * 31 + rQ();
    }

    public final rQ k(qo qo1)
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
                int l = qz.b(qo1, 10);
                rQ arq[];
                int j;
                if (gr == null)
                {
                    j = 0;
                } else
                {
                    j = gr.length;
                }
                arq = new gr[l + j];
                l = j;
                if (j != 0)
                {
                    System.arraycopy(gr, 0, arq, 0, j);
                    l = j;
                }
                for (; l < arq.length - 1; l++)
                {
                    arq[l] = new <init>();
                    qo1.a(arq[l]);
                    qo1.rz();
                }

                arq[l] = new <init>();
                qo1.a(arq[l]);
                gr = arq;
                break;

            case 18: // '\022'
                if (gs == null)
                {
                    gs = new <init>();
                }
                qo1.a(gs);
                break;

            case 26: // '\032'
                gt = qo1.readString();
                break;
            }
        } while (true);
    }

    public final eadString q()
    {
        gr = o();
        gs = null;
        gt = "";
        ayW = null;
        azh = -1;
        return this;
    }

    public ()
    {
        q();
    }
}
