// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.support.v7.widget.RecyclerView;
import java.util.List;

final class agh
    implements Runnable
{

    private agn a;
    private int b;
    private agd c;

    agh(agd agd1, agn agn1, int i)
    {
        c = agd1;
        a = agn1;
        b = i;
        super();
    }

    public final void run()
    {
        if (c.n == null || !c.n.isAttachedToWindow() || a.l || a.e.e() == -1) goto _L2; else goto _L1
_L1:
        Object obj = c.n.q;
        if (obj != null && ((aer) (obj)).a(null)) goto _L4; else goto _L3
_L3:
        int i;
        int j;
        obj = c;
        j = ((agd) (obj)).l.size();
        i = 0;
_L11:
        if (i >= j) goto _L6; else goto _L5
_L5:
        if (((agn)((agd) (obj)).l.get(i)).m) goto _L8; else goto _L7
_L7:
        i = 1;
_L9:
        if (i != 0)
        {
            break; /* Loop/switch isn't completed */
        }
        c.j.i();
_L2:
        return;
_L8:
        i++;
        continue; /* Loop/switch isn't completed */
_L6:
        i = 0;
        if (true) goto _L9; else goto _L4
_L4:
        c.n.post(this);
        return;
        if (true) goto _L11; else goto _L10
_L10:
    }
}
