// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.io.IOException;

// Referenced classes of package com.google.android.gms.internal:
//            qq, c, qv, qw, 
//            qp, qu, qo, qz

public static final class q extends qq
{

    public azh gr[];
    public azh gs;
    public String gt;

    public static q b(byte abyte0[])
        throws qv
    {
        return (q)qw.a(new <init>(), abyte0);
    }

    public void a(qp qp1)
        throws IOException
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

    public qw b(qo qo1)
        throws IOException
    {
        return k(qo1);
    }

    protected int c()
    {
        int i = super.c();
        int l = i;
        if (gr != null)
        {
            l = i;
            if (gr.length > 0)
            {
                int i1 = 0;
                do
                {
                    l = i;
                    if (i1 >= gr.length)
                    {
                        break;
                    }
                    k k1 = gr[i1];
                    l = i;
                    if (k1 != null)
                    {
                        l = i + qp.c(1, k1);
                    }
                    i1++;
                    i = l;
                } while (true);
            }
        }
        i = l;
        if (gs != null)
        {
            i = l + qp.c(2, gs);
        }
        l = i;
        if (!gt.equals(""))
        {
            l = i + qp.j(3, gt);
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

    public int hashCode()
    {
        int l = 0;
        int i1 = qu.hashCode(gr);
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
            l = gt.hashCode();
        }
        return ((i + (i1 + 527) * 31) * 31 + l) * 31 + rQ();
    }

    public rQ k(qo qo1)
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
                int i1 = qz.b(qo1, 10);
                rQ arq[];
                int l;
                if (gr == null)
                {
                    l = 0;
                } else
                {
                    l = gr.length;
                }
                arq = new gr[i1 + l];
                i1 = l;
                if (l != 0)
                {
                    System.arraycopy(gr, 0, arq, 0, l);
                    i1 = l;
                }
                for (; i1 < arq.length - 1; i1++)
                {
                    arq[i1] = new <init>();
                    qo1.a(arq[i1]);
                    qo1.rz();
                }

                arq[i1] = new <init>();
                qo1.a(arq[i1]);
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

    public eadString q()
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
