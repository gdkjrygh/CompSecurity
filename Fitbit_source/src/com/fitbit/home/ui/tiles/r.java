// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.home.ui.tiles;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.widget.TextView;
import com.fitbit.data.domain.SleepGoal;
import com.fitbit.data.domain.SleepLogEntry;
import com.fitbit.savedstate.UISavedState;
import com.fitbit.serverinteraction.ServerGateway;
import com.fitbit.ui.FlipImageView;
import com.fitbit.util.bl;
import com.fitbit.util.format.e;
import com.fitbit.util.o;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.fitbit.home.ui.tiles:
//            p, e

public class r extends p
{

    private static final int d = 100;
    private TextView a;
    private TextView b;
    private TextView c;
    private int e;
    private int f;
    private int g;

    public r()
    {
        e = 0x80000000;
        f = 0x80000000;
        g = 0x80000000;
    }

    private void a(int i, int i1, int j1, int k1)
    {
        g = 0x80000000;
        f = 0x80000000;
        e = 0x80000000;
        c.setVisibility(8);
        a.setVisibility(0);
        b.setVisibility(0);
        if (e != i)
        {
            e = i;
            bl bl1 = new bl();
            int l1 = i / 60;
            if (l1 > 0)
            {
                bl1.a(i(), com.fitbit.util.format.e.e(l1));
                bl1.c(i(), i().getString(0x7f08025e));
            }
            int i2 = i % 60;
            if (i2 > 0 || i2 == 0 && l1 == 0)
            {
                if (l1 > 0)
                {
                    bl1.append(" ");
                }
                bl1.a(i(), com.fitbit.util.format.e.e(i2));
                bl1.c(i(), i().getString(0x7f0803d7));
            }
            bl1.c(i(), (new StringBuilder()).append(" ").append(i().getString(0x7f08005c)).toString());
            a.setText(bl1);
        }
        if (i >= k1 && k1 != 0)
        {
            x.a(i().getResources().getDrawable(0x7f02022f));
            b.setText(0x7f0802fe);
            if (!k() && !x.b())
            {
                x.c();
                l();
            }
        } else
        {
            x.setImageResource(0x7f020350);
            if (f != i1 || g != j1)
            {
                f = i1;
                g = j1;
                b.setText(String.format("%s / %s", new Object[] {
                    i().getString(0x7f08034c, new Object[] {
                        Integer.valueOf(i1)
                    }), i().getString(0x7f08034f, new Object[] {
                        Integer.valueOf(j1)
                    })
                }));
                return;
            }
        }
    }

    private void a(boolean flag)
    {
        b.setVisibility(8);
        a.setVisibility(8);
        c.setVisibility(0);
        TextView textview = c;
        int i;
        if (flag)
        {
            i = 0x7f080306;
        } else
        {
            i = 0x7f080331;
        }
        textview.setText(i);
        x.setImageResource(0x7f020350);
    }

    private void j()
    {
        a(false);
    }

    private boolean k()
    {
        return UISavedState.b(com.fitbit.savedstate.UISavedState.AnimatedGoalType.g);
    }

    private void l()
    {
        UISavedState.a(com.fitbit.savedstate.UISavedState.AnimatedGoalType.g);
    }

    protected boolean N_()
    {
        return (u == null || u.p.isEmpty()) && !ServerGateway.a().d() && !o.i(v);
    }

    public void O_()
    {
        if (N_())
        {
            o();
            return;
        } else
        {
            j();
            return;
        }
    }

    protected int P_()
    {
        return 0x7f0401af;
    }

    protected void R_()
    {
        if (!u.p.isEmpty())
        {
            Iterator iterator = u.p.iterator();
            int i = 0;
            int i1 = 0;
            int j1 = 0;
            while (iterator.hasNext()) 
            {
                SleepLogEntry sleeplogentry = (SleepLogEntry)iterator.next();
                j1 += sleeplogentry.g();
                i1 += sleeplogentry.k();
                i = sleeplogentry.l() + i;
            }
            int k1 = u.k.p().intValue();
            if (j1 != 0)
            {
                a(j1, i1, i, k1);
                return;
            } else
            {
                a(true);
                return;
            }
        } else
        {
            j();
            return;
        }
    }

    protected void a(View view)
    {
        super.a(view);
        a = (TextView)view.findViewById(0x7f110394);
        b = (TextView)view.findViewById(0x7f110421);
        c = (TextView)view.findViewById(0x7f110463);
    }

    protected String b()
    {
        return i().getString(0x7f08034d);
    }

    protected int c()
    {
        return 0x7f020352;
    }

    public CharSequence f()
    {
        return i().getText(0x7f08034b);
    }
}
