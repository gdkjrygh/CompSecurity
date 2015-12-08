// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.ui;

import android.os.Bundle;
import com.fitbit.e.a;
import com.fitbit.ui.fragments.FitbitFragment;
import com.fitbit.util.o;
import java.util.Calendar;

// Referenced classes of package com.fitbit.ui:
//            DayPagerFragment

public abstract class DayFragment extends FitbitFragment
{

    private static final String a = "DayFragment";
    private boolean b;
    private boolean c;
    protected Calendar d;
    private DayPagerFragment e;
    private int f;

    public DayFragment()
    {
        b = false;
        c = false;
    }

    public void a(Calendar calendar)
    {
        d = calendar;
    }

    protected void a(boolean flag)
    {
    }

    protected void d()
    {
    }

    protected void o()
    {
    }

    public void onCreate(Bundle bundle)
    {
        c = true;
        super.onCreate(bundle);
        if (!(getParentFragment() instanceof DayPagerFragment))
        {
            throw new IllegalStateException("May only be attached to DayPagerFragment");
        } else
        {
            e = (DayPagerFragment)getParentFragment();
            f = com.fitbit.util.o.h(d);
            return;
        }
    }

    public void onDestroy()
    {
        c = false;
        super.onDestroy();
        e = null;
    }

    public void onPause()
    {
        super.onPause();
        if (b)
        {
            o();
        }
    }

    public void onResume()
    {
        super.onResume();
        if (b)
        {
            d();
        }
    }

    public boolean p()
    {
        return isResumed() && b;
    }

    public boolean q()
    {
        return c;
    }

    public int r()
    {
        return e.a(f);
    }

    public boolean s()
    {
        return r() == 0;
    }

    public void setUserVisibleHint(boolean flag)
    {
label0:
        {
            try
            {
                super.setUserVisibleHint(flag);
            }
            catch (NullPointerException nullpointerexception)
            {
                com.fitbit.e.a.a("DayFragment", "Can't set user visible hint", nullpointerexception, new Object[0]);
            }
            if (b != flag)
            {
                b = flag;
                if (isResumed())
                {
                    if (!flag)
                    {
                        break label0;
                    }
                    d();
                }
            }
            return;
        }
        o();
    }

    public Calendar t()
    {
        return d;
    }

    public boolean u()
    {
        return e.k();
    }
}
