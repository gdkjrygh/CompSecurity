// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.ui;

import android.view.View;
import android.widget.AdapterView;

// Referenced classes of package com.fitbit.ui:
//            AbsChartActivity

class a
    implements android.widget.electedListener
{

    final AbsChartActivity a;

    public void onItemSelected(AdapterView adapterview, View view, int i, long l)
    {
        a.j(i);
        a.n();
    }

    public void onNothingSelected(AdapterView adapterview)
    {
    }

    SelectedListener(AbsChartActivity abschartactivity)
    {
        a = abschartactivity;
        super();
    }
}
