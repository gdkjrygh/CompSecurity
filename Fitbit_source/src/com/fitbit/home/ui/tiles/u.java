// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.home.ui.tiles;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.fitbit.FitBitApplication;
import com.fitbit.data.domain.WeightGoal;
import com.fitbit.data.domain.r;
import com.fitbit.ui.FlipImageView;
import com.fitbit.util.bl;
import com.fitbit.util.format.e;
import com.fitbit.util.format.f;
import com.fitbit.weight.Fat;
import com.fitbit.weight.Weight;

// Referenced classes of package com.fitbit.home.ui.tiles:
//            p, e

public class u extends p
{

    private TextView a;
    private TextView b;
    private TextView c;
    private com.fitbit.data.domain.WeightLogEntry.WeightUnits d;

    public u()
    {
    }

    private double a(WeightGoal weightgoal, Weight weight, com.fitbit.data.domain.WeightLogEntry.WeightUnits weightunits)
    {
        weight = a(weight, weightunits);
        Weight weight1 = a((Weight)weightgoal.j(), weightunits);
        weightgoal = a((Weight)weightgoal.o(), weightunits);
        double d1;
        double d2;
        boolean flag;
        if (weight1.b() >= weightgoal.b())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        d2 = Math.abs(weightgoal.b() - weight1.b());
        if (flag)
        {
            d1 = weight.b() - weightgoal.b();
        } else
        {
            d1 = weightgoal.b() - weight.b();
        }
        return d2 - d1;
    }

    private static Weight a(Weight weight, com.fitbit.data.domain.WeightLogEntry.WeightUnits weightunits)
    {
        if (weight != null)
        {
            Weight weight1 = weight;
            if (weightunits != null)
            {
                weight1 = weight.a(weightunits);
            }
            return weight1;
        }
        if (weightunits == null)
        {
            weightunits = com.fitbit.data.domain.WeightLogEntry.WeightUnits.KG;
        }
        return new Weight(0.0D, weightunits);
    }

    private void a(double d1)
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append(i().getString(0x7f0802bb, new Object[] {
            e.a(d1)
        }));
        b.setText(stringbuilder);
        b.setVisibility(0);
    }

    private void a(Weight weight)
    {
        Object obj = com.fitbit.util.format.f.b(i(), weight);
        String s = i().getString(0x7f08037a);
        int i = s.indexOf("%1$s");
        int k = "%1$s".length() + i;
        weight = ((Weight) (obj));
        if (i > 0)
        {
            weight = new bl();
            weight.c(i(), s.substring(0, i));
            weight = TextUtils.concat(new CharSequence[] {
                weight, obj
            });
        }
        obj = weight;
        if (k < s.length())
        {
            obj = new bl();
            ((bl) (obj)).c(i(), s.substring(k, s.length()));
            obj = TextUtils.concat(new CharSequence[] {
                weight, obj
            });
        }
        a.setText(((CharSequence) (obj)));
        a.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
        a.setVisibility(0);
    }

    private void a(Weight weight, int i)
    {
        weight = com.fitbit.util.format.f.b(i(), weight);
        a.setText(weight);
        a.setCompoundDrawablesWithIntrinsicBounds(0, 0, i, 0);
        a.setVisibility(0);
    }

    private void a(Weight weight, Fat fat)
    {
        String s = com.fitbit.util.format.f.a(FitBitApplication.a(), weight);
        weight = s;
        if (fat != null)
        {
            weight = s;
            if (fat.b() > 0.0D)
            {
                weight = TextUtils.concat(new CharSequence[] {
                    s, " / ", i().getString(0x7f0802bb, new Object[] {
                        e.a(fat.b())
                    })
                });
            }
        }
        b.setText(weight);
        b.setVisibility(0);
    }

    private boolean a(WeightGoal weightgoal, Weight weight, com.fitbit.data.domain.WeightLogEntry.WeightUnits weightunits, Fat fat)
    {
        if (weightgoal != null && weight != null)
        {
            Weight weight1 = a(weight, weightunits);
            double d1 = a(weightgoal, weight, weightunits);
            if (d1 > 0.050000000000000003D)
            {
                a(new Weight(d1, weightunits));
                a(weight1, fat);
                return true;
            }
        }
        return false;
    }

    private static final int b(double d1)
    {
        if (d1 > 0.01D)
        {
            return 0x7f0202b2;
        }
        return d1 >= -0.01D ? 0 : 0x7f0202b1;
    }

    private boolean b(WeightGoal weightgoal, Weight weight, com.fitbit.data.domain.WeightLogEntry.WeightUnits weightunits, Fat fat)
    {
        if (weightgoal != null && weight != null && a(weightgoal, weight, weightunits) <= 0.050000000000000003D)
        {
            c(u.n.a, weight, weightunits, fat);
            return true;
        } else
        {
            return false;
        }
    }

    private void c(WeightGoal weightgoal, Weight weight, com.fitbit.data.domain.WeightLogEntry.WeightUnits weightunits, Fat fat)
    {
        weightgoal = i();
        bl bl1 = new bl();
        bl1.b(weightgoal, weightgoal.getString(0x7f08037b));
        bl1.append(" ");
        bl1.c(weightgoal, weightgoal.getString(0x7f0802fe));
        a.setText(bl1);
        a.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
        a.setVisibility(0);
        a(a(weight, weightunits), fat);
    }

    private void j()
    {
        b.setVisibility(8);
        a.setVisibility(8);
        c.setVisibility(0);
        c.setText(0x7f080425);
    }

    protected boolean N_()
    {
        return false;
    }

    protected int P_()
    {
        return 0x7f0401af;
    }

    protected void R_()
    {
        x.setImageResource(0x7f0203c9);
        if (u != null && u.n != null && u.n.b != null)
        {
            Object obj1 = u.n;
            Object obj;
            if (d != null)
            {
                obj = d;
            } else
            {
                obj = (com.fitbit.data.domain.WeightLogEntry.WeightUnits)((e.a) (obj1)).b.a();
            }
            if (!a(((e.a) (obj1)).a, ((e.a) (obj1)).b, ((com.fitbit.data.domain.WeightLogEntry.WeightUnits) (obj)), u.n.d) && !b(((e.a) (obj1)).a, ((e.a) (obj1)).b, ((com.fitbit.data.domain.WeightLogEntry.WeightUnits) (obj)), u.n.d))
            {
                obj1 = a(u.n.b, ((com.fitbit.data.domain.WeightLogEntry.WeightUnits) (obj)));
                double d1;
                int i;
                if (u.n.c != null)
                {
                    obj = a(u.n.c, ((com.fitbit.data.domain.WeightLogEntry.WeightUnits) (obj)));
                    i = b(((Weight) (obj1)).b() - ((Weight) (obj)).b());
                } else
                {
                    i = 0;
                }
                a(((Weight) (obj1)), i);
                if (u.n.d != null)
                {
                    d1 = u.n.d.b();
                } else
                {
                    d1 = 0.0D;
                }
                if (d1 > 0.0D)
                {
                    a(d1);
                } else
                {
                    b.setVisibility(8);
                }
            }
            c.setVisibility(8);
            return;
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
        return i().getString(0x7f080379);
    }

    public void b(com.fitbit.home.ui.tiles.e e1)
    {
        com.fitbit.data.domain.WeightLogEntry.WeightUnits weightunits;
        if (e1 != null)
        {
            weightunits = r.a();
        } else
        {
            weightunits = com.fitbit.data.domain.WeightLogEntry.WeightUnits.KG;
        }
        d = weightunits;
        super.b(e1);
    }

    protected int c()
    {
        return 0x7f0203ce;
    }

    public CharSequence f()
    {
        return i().getString(0x7f08058e);
    }
}
