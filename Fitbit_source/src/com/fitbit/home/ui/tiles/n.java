// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.home.ui.tiles;

import com.fitbit.data.domain.ValueGoal;
import com.fitbit.livedata.LiveDataPacket;
import com.fitbit.livedata.LiveDataState;
import com.fitbit.multipledevice.a;
import com.fitbit.savedstate.l;

// Referenced classes of package com.fitbit.home.ui.tiles:
//            j, e

public abstract class n extends j
{

    protected a b;
    protected LiveDataPacket c;

    public n()
    {
        c = com.fitbit.savedstate.l.h();
        b = com.fitbit.multipledevice.a.a();
    }

    private void l()
    {
        if (u != null)
        {
            c = u.l;
        }
    }

    private boolean s()
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (c != null)
        {
            flag = flag1;
            if (a != null)
            {
                flag = flag1;
                if (r())
                {
                    flag = flag1;
                    if (!b.j().b())
                    {
                        flag = true;
                    }
                }
            }
        }
        return flag;
    }

    protected void R_()
    {
        m();
        super.R_();
    }

    protected abstract ValueGoal a(e e1);

    public void a(LiveDataPacket livedatapacket)
    {
        c = livedatapacket;
    }

    protected abstract double h();

    protected void m()
    {
        l();
        if (s() && a != null)
        {
            double d = ValueGoal.b(a);
            double d1 = h();
            if (d1 > d)
            {
                a.a(Double.valueOf(d1));
            }
        }
    }
}
