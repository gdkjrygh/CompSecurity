// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.profile.ui;

import com.fitbit.FitBitApplication;
import com.fitbit.data.bl.gd;
import com.fitbit.data.domain.Gender;
import com.fitbit.data.domain.Length;
import com.fitbit.data.domain.Profile;
import com.fitbit.data.domain.r;
import com.fitbit.util.bh;
import com.fitbit.util.bn;
import com.fitbit.util.o;
import com.fitbit.weight.Weight;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

// Referenced classes of package com.fitbit.profile.ui:
//            ProfileSaveModel

public final class b
{

    private String a;
    private Date b;
    private Length c;
    private Weight d;
    private Gender e;

    public b()
    {
    }

    private void d(Profile profile)
    {
        if (profile != null && profile.h())
        {
            b = (Date)profile.j().clone();
            return;
        } else
        {
            profile = new GregorianCalendar(bn.c());
            profile.add(1, -25);
            profile.set(2, 0);
            profile.set(5, 1);
            b = profile.getTime();
            return;
        }
    }

    private void e(Profile profile)
    {
        if (a == null && profile != null)
        {
            if (profile.E() == null)
            {
                profile = null;
            } else
            {
                profile = profile.E().trim();
            }
            a = profile;
        }
    }

    private void f(Profile profile)
    {
        Object obj;
        if (profile != null)
        {
            profile = profile.J();
        } else
        {
            profile = null;
        }
        obj = profile;
        if (profile == null)
        {
            obj = Gender.NA;
        }
        e = ((Gender) (obj));
    }

    public String a()
    {
        return a;
    }

    public void a(Gender gender)
    {
        e = gender;
    }

    public void a(Length length)
    {
        c = length;
    }

    public void a(Profile profile)
    {
        e(profile);
        d(profile);
        c(profile);
        b(profile);
        f(profile);
    }

    public void a(ProfileSaveModel profilesavemodel)
    {
        if (profilesavemodel != null)
        {
            a = profilesavemodel.fullName;
            b = profilesavemodel.date;
            c = profilesavemodel.height.a(r.d());
            d = profilesavemodel.weight.a(r.a());
            e = profilesavemodel.gender;
        }
    }

    public void a(Weight weight)
    {
        d = weight;
    }

    public void a(String s)
    {
        a = s;
    }

    public void a(Date date)
    {
        b = date;
    }

    public Date b()
    {
        return b;
    }

    public void b(Profile profile)
    {
label0:
        {
            Weight weight;
            Weight weight1;
            if (d != null)
            {
                weight1 = d;
            } else
            {
                weight1 = gd.a().b();
            }
            if (weight1 != null)
            {
                weight = weight1;
                if (Math.abs(weight1.b()) >= 0.0001D)
                {
                    break label0;
                }
            }
            weight = gd.a().d();
            if (profile != null && profile.w() != null)
            {
                weight = weight.a(profile.w());
            } else
            {
                weight = weight.a(r.a());
            }
        }
        weight1 = weight;
        if (profile != null)
        {
            weight1 = weight.a(profile.w());
        }
        d = weight1;
    }

    public Length c()
    {
        return c;
    }

    public void c(Profile profile)
    {
label0:
        {
            Length length;
            Length length1;
            if (c != null || profile == null)
            {
                length1 = c;
            } else
            {
                length1 = profile.Q();
            }
            if (length1 != null)
            {
                length = length1;
                if (Math.abs(length1.b()) >= 0.0001D)
                {
                    break label0;
                }
            }
            length = (new Length(5.75D, com.fitbit.data.domain.Length.LengthUnits.FEET)).a(r.d());
        }
        length1 = length;
        if (profile != null)
        {
            length1 = length.a(profile.v());
        }
        c = length1;
    }

    public Weight d()
    {
        return d;
    }

    public Gender e()
    {
        return e;
    }

    public int f()
    {
        a = bh.f(a);
        return a != null && a.length() != 0 ? 0 : 0x7f0803e2;
    }

    public int g()
    {
        if (c == null || c.b() == 0.0D)
        {
            return 0x7f0803e1;
        }
        return c.a(com.fitbit.data.domain.Length.LengthUnits.CM).b() <= 300D ? 0 : 0x7f080297;
    }

    public int h()
    {
        return d != null && d.b() != 0.0D ? 0 : 0x7f0803e6;
    }

    public int i()
    {
        return e != null && !Gender.NA.equals(e) ? 0 : 0x7f0803e0;
    }

    public int j()
    {
        int k = 0;
        GregorianCalendar gregoriancalendar = new GregorianCalendar(bn.c());
        gregoriancalendar.set(10, 0);
        gregoriancalendar.set(12, 0);
        gregoriancalendar.set(13, 0);
        gregoriancalendar.add(1, -13);
        gregoriancalendar.add(13, 1);
        if (b.after(gregoriancalendar.getTime()))
        {
            k = 0x7f080295;
        } else
        if (b.before(o.b(FitBitApplication.a())))
        {
            return 0x7f080294;
        }
        return k;
    }
}
