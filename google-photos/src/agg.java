// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.support.v7.widget.RecyclerView;
import java.util.List;

final class agg extends agn
{

    private int o;
    private afn p;
    private agd q;

    agg(agd agd1, afn afn1, int i, int j, float f, float f1, float f2, 
            float f3, int k, afn afn2)
    {
        q = agd1;
        o = k;
        p = afn2;
        super(agd1, afn1, i, j, f, f1, f2, f3);
    }

    public final void a(w w)
    {
        super.a(w);
        if (!l) goto _L2; else goto _L1
_L1:
        return;
_L2:
        if (o > 0)
        {
            break; /* Loop/switch isn't completed */
        }
        q.j.b(q.n, p);
_L4:
        if (q.q == p.a)
        {
            q.b(p.a);
            return;
        }
        if (true) goto _L1; else goto _L3
_L3:
        q.a.add(p.a);
        this.i = true;
        if (o > 0)
        {
            w = q;
            int i = o;
            ((agd) (w)).n.post(new agh(w, this, i));
        }
          goto _L4
        if (true) goto _L1; else goto _L5
_L5:
    }
}
