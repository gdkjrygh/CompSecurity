// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.home.ui.tiles;

import android.content.Context;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.fitbit.data.domain.CaloriesEatenGoal;
import com.fitbit.data.domain.Profile;
import com.fitbit.goals.ui.CreateWeightGoalActivity;
import com.fitbit.goals.ui.PlanSummaryActivity;
import com.fitbit.serverinteraction.ServerGateway;
import com.fitbit.ui.FlipImageView;
import com.fitbit.util.al;
import com.fitbit.util.bl;
import com.fitbit.util.format.e;
import java.util.Locale;

// Referenced classes of package com.fitbit.home.ui.tiles:
//            p, e

public class i extends p
{

    private static final int a = 100;
    private static boolean e = false;
    private TextView b;
    private View c;
    private Button d;

    public i()
    {
    }

    static void a(i i1)
    {
        i1.m();
    }

    private void a(boolean flag)
    {
        boolean flag1 = false;
        Object obj = b;
        int i1;
        if (flag)
        {
            i1 = 0;
        } else
        {
            i1 = 8;
        }
        ((TextView) (obj)).setVisibility(i1);
        obj = c;
        if (flag)
        {
            i1 = 8;
        } else
        {
            i1 = 0;
        }
        ((View) (obj)).setVisibility(i1);
        if (p() && !flag && r())
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        obj = d;
        if (i1 != 0)
        {
            i1 = ((flag1) ? 1 : 0);
        } else
        {
            i1 = 8;
        }
        ((Button) (obj)).setVisibility(i1);
        if (flag)
        {
            double d2 = j();
            double d1 = k();
            Context context = i();
            bl bl1 = new bl();
            if (Locale.CHINA.equals(al.a()))
            {
                String s;
                String s2;
                if (d2 > d1)
                {
                    i1 = 0x7f0805df;
                } else
                {
                    i1 = 0x7f0805dd;
                }
                s = context.getString(i1);
                if (d2 > d1)
                {
                    i1 = 0x7f0805de;
                } else
                {
                    i1 = 0x7f0805dc;
                }
                s2 = context.getString(i1);
                bl1.c(context, (new StringBuilder()).append(s).append(" ").toString());
                bl1.a(context, com.fitbit.util.format.e.e(Math.abs(d1 - d2)));
                bl1.c(context, (new StringBuilder()).append(" ").append(s2).toString());
            } else
            {
                bl1.a(context, com.fitbit.util.format.e.e(Math.abs(d1 - d2)));
                String s1;
                if (d2 > d1)
                {
                    i1 = 0x7f0800b6;
                } else
                {
                    i1 = 0x7f0800b3;
                }
                s1 = context.getString(i1);
                bl1.c(context, (new StringBuilder()).append(" ").append(s1).toString());
            }
            b.setText(bl1);
            if (Double.compare(d2, d1 / 2D) < 0)
            {
                i1 = 0x7f020324;
            } else
            {
                d2 -= d1;
                if (d1 > 100D)
                {
                    d1 = 50D;
                } else
                {
                    d1 = 0.0D;
                }
                if (d2 > d1)
                {
                    i1 = 0x7f020325;
                } else
                if (d2 < -d1)
                {
                    i1 = 0x7f020326;
                } else
                {
                    i1 = 0x7f020323;
                }
            }
            x.setImageResource(i1);
            return;
        } else
        {
            x.setImageResource(0x7f020324);
            return;
        }
    }

    private static boolean a(com.fitbit.home.ui.tiles.e e1)
    {
        return e1 != null && e1.c != null && e1.c.a() != null;
    }

    private void m()
    {
        boolean flag = false;
        if (l())
        {
            PlanSummaryActivity.a(i(), false);
            return;
        }
        Context context = i();
        if (!l())
        {
            flag = true;
        }
        CreateWeightGoalActivity.a(context, flag);
    }

    protected boolean N_()
    {
        return !ServerGateway.a().d();
    }

    protected int P_()
    {
        return 0x7f040165;
    }

    protected void Q_()
    {
        a(l());
    }

    protected void R_()
    {
        a(l());
    }

    protected void a(View view)
    {
        super.a(view);
        b = (TextView)view.findViewById(0x7f110109);
        c = view.findViewById(0x7f11040a);
        d = (Button)view.findViewById(0x7f11040b);
        d.setOnClickListener(new android.view.View.OnClickListener() {

            final i a;

            public void onClick(View view1)
            {
                i.a(a);
            }

            
            {
                a = i.this;
                super();
            }
        });
    }

    protected String b()
    {
        return i().getString(0x7f080141);
    }

    public void b(com.fitbit.home.ui.tiles.e e1)
    {
        if (e1 != null)
        {
            e = a(e1);
        }
        super.b(e1);
    }

    protected int c()
    {
        return 0x7f020327;
    }

    public CharSequence f()
    {
        return i().getText(0x7f0802f7);
    }

    protected double j()
    {
        if (u != null && u.m != null)
        {
            return u.m.e().doubleValue();
        } else
        {
            return 0.0D;
        }
    }

    protected double k()
    {
        if (u != null && u.m != null)
        {
            return u.m.f().doubleValue();
        } else
        {
            return 0.0D;
        }
    }

    protected boolean l()
    {
        if (u != null)
        {
            return a(u);
        } else
        {
            return e;
        }
    }

}
