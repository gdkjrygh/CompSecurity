// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.ui;

import android.widget.RadioGroup;
import java.util.Date;

// Referenced classes of package com.fitbit.ui:
//            AbsChartActivity

class a
    implements android.widget.dChangeListener
{

    final AbsChartActivity a;

    public void onCheckedChanged(RadioGroup radiogroup, int i)
    {
        AbsChartActivity.a(a, i);
        radiogroup = a.f(i);
        a.a(a.b(i), new Date(), radiogroup);
        AbsChartActivity.a(a, AbsChartActivity.b(a, i));
    }
�    edChangeListener(AbsChartActivity abschartactivity)
    {
        a = abschartactivity;
        super();
    }
}
