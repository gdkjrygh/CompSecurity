// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.home.ui.tiles;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.fitbit.data.bl.t;
import com.fitbit.data.domain.CaloriesBurnedGoal;
import com.fitbit.data.domain.CaloriesEatenGoal;
import com.fitbit.data.domain.Profile;
import com.fitbit.serverinteraction.ServerGateway;
import com.fitbit.ui.FlipImageView;
import com.fitbit.util.bl;
import com.fitbit.util.format.e;
import com.fitbit.util.o;

// Referenced classes of package com.fitbit.home.ui.tiles:
//            p, e

public class c extends p
{

    private TextView a;
    private TextView b;

    public c()
    {
    }

    private com.fitbit.customui.RoughGauge.State j()
    {
        if (u != null && u.f != null && u.m != null && u.c != null && u.c.a() != null)
        {
            return t.a().a(u.m, u.f, u.c.a(), u.b);
        } else
        {
            return com.fitbit.customui.RoughGauge.State.b;
        }
    }

    private double k()
    {
        if (u != null && u.m != null)
        {
            return u.m.e().doubleValue();
        } else
        {
            return 0.0D;
        }
    }

    private double l()
    {
        if (u != null && u.f != null)
        {
            return u.f.c().doubleValue();
        } else
        {
            return 0.0D;
        }
    }

    protected boolean N_()
    {
        boolean flag;
        boolean flag1;
        if (u == null || u.f == null || u.m == null)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        flag = flag1;
        if (!ServerGateway.a().d())
        {
            if (flag1 || k() == 0.0D || l() == 0.0D)
            {
                flag = true;
            } else
            {
                flag = false;
            }
        }
        if (!ServerGateway.a().d() && !o.i(v))
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        return flag && flag1;
    }

    public void O_()
    {
        if (N_())
        {
            Q_();
            o();
            return;
        } else
        {
            R_();
            q();
            return;
        }
    }

    protected int P_()
    {
        return 0x7f0401af;
    }

    protected void R_()
    {
        double d = k();
        double d1 = l();
        Context context = i();
        bl bl1 = new bl();
        bl1.a(context, com.fitbit.util.format.e.e(d));
        bl1.c(context, (new StringBuilder()).append(" ").append(i().getString(0x7f080281)).toString());
        bl1.append(" / ");
        bl1.a(context, com.fitbit.util.format.e.e(d1));
        bl1.c(context, (new StringBuilder()).append(" ").append(i().getString(0x7f080436)).toString());
        a.setText(bl1);
        static class _cls1
        {

            static final int a[];

            static 
            {
                a = new int[com.fitbit.customui.RoughGauge.State.values().length];
                try
                {
                    a[com.fitbit.customui.RoughGauge.State.c.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[com.fitbit.customui.RoughGauge.State.a.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        switch (_cls1.a[j().ordinal()])
        {
        default:
            x.setImageResource(0x7f020109);
            b.setText(0x7f0805af);
            return;

        case 1: // '\001'
            x.setImageResource(0x7f02010a);
            b.setText(0x7f0805b0);
            return;

        case 2: // '\002'
            x.setImageResource(0x7f02010b);
            break;
        }
        b.setText(0x7f0805b1);
    }

    protected void a(View view)
    {
        super.a(view);
        a = (TextView)view.findViewById(0x7f110394);
        b = (TextView)view.findViewById(0x7f110421);
    }

    protected String b()
    {
        return i().getString(0x7f0802c0);
    }

    protected int c()
    {
        return 0x7f02010e;
    }

    public String e()
    {
        return i().getString(0x7f0800b1);
    }

    public CharSequence f()
    {
        return e();
    }
}
