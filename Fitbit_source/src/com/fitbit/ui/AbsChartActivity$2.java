// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.ui;

import android.view.View;

// Referenced classes of package com.fitbit.ui:
//            AbsChartActivity

class a
    implements android.view.r
{

    final AbsChartActivity a;

    public void onClick(View view)
    {
        a.onBackPressed();
    }

    (AbsChartActivity abschartactivity)
    {
        a = abschartactivity;
        super();
    }
}
