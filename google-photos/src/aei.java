// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.support.v7.widget.RecyclerView;

public final class aei
    implements Runnable
{

    private RecyclerView a;

    public aei(RecyclerView recyclerview)
    {
        a = recyclerview;
        super();
    }

    public final void run()
    {
        if (RecyclerView.a(a)) goto _L2; else goto _L1
_L1:
        return;
_L2:
        if (RecyclerView.b(a))
        {
            b.a("RV FullInvalidate");
            a.i();
            b.a();
            return;
        }
        if (!a.b.d()) goto _L1; else goto _L3
_L3:
        RecyclerView recyclerview;
        int i;
        int j;
        b.a("RV PartialInvalidate");
        a.a();
        a.b.b();
        if (RecyclerView.c(a))
        {
            break MISSING_BLOCK_LABEL_221;
        }
        recyclerview = a;
        j = recyclerview.c.a();
        i = 0;
_L5:
        afn afn1;
        if (i >= j)
        {
            break MISSING_BLOCK_LABEL_221;
        }
        afn1 = RecyclerView.b(recyclerview.c.c(i));
        if (afn1 != null && !afn1.b())
        {
            if (!afn1.o() && !afn1.k())
            {
                break; /* Loop/switch isn't completed */
            }
            recyclerview.requestLayout();
        }
_L7:
        i++;
        if (true) goto _L5; else goto _L4
_L4:
        if (!afn1.l()) goto _L7; else goto _L6
_L6:
label0:
        {
            int k = recyclerview.d.a(afn1.b);
            if (afn1.e != k)
            {
                break label0;
            }
            if (!afn1.m() || !recyclerview.h())
            {
                recyclerview.d.b(afn1, afn1.b);
            } else
            {
                recyclerview.requestLayout();
            }
        }
          goto _L7
        recyclerview.requestLayout();
        a.a(true);
        b.a();
        return;
    }
}
