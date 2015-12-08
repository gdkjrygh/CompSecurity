// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.weight.ui;

import android.widget.TextView;
import com.fitbit.util.format.e;

// Referenced classes of package com.fitbit.weight.ui:
//            AbsChartFragment

public abstract class AbsBodyChartFragment extends AbsChartFragment
{

    public AbsBodyChartFragment()
    {
    }

    protected abstract String a(String s);

    public void a(double d)
    {
        k = d;
        if (f != null && isResumed())
        {
            String s;
            if (d == 1.7976931348623157E+308D)
            {
                s = "--";
            } else
            {
                String s1 = t();
                StringBuilder stringbuilder = (new StringBuilder()).append(e.a(d));
                s = s1;
                if (s1 == null)
                {
                    s = "";
                }
                s = stringbuilder.append(s).toString();
            }
            f.setText(a(s));
            f.setCompoundDrawablesWithIntrinsicBounds(0, 0, b(d), 0);
        }
    }
}
