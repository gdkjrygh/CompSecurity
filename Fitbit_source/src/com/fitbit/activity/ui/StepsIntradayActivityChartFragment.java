// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.activity.ui;

import com.fitbit.util.format.PostfixDecimalFormat;
import java.text.DecimalFormat;
import java.text.Format;

// Referenced classes of package com.fitbit.activity.ui:
//            IntradayActivityChartFragment

public class StepsIntradayActivityChartFragment extends IntradayActivityChartFragment
{

    public StepsIntradayActivityChartFragment()
    {
    }

    public Format a()
    {
        PostfixDecimalFormat postfixdecimalformat = new PostfixDecimalFormat(getString(0x7f08056c));
        postfixdecimalformat.setMaximumFractionDigits(1);
        return postfixdecimalformat;
    }

    public void b()
    {
    }

    protected void j_()
    {
        super.j_();
    }
}
