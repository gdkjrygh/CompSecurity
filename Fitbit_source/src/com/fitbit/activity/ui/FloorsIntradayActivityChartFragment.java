// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.activity.ui;

import com.fitbit.util.format.PostfixDecimalSinglePluralFormat;
import java.text.DecimalFormat;
import java.text.Format;

// Referenced classes of package com.fitbit.activity.ui:
//            IntradayActivityChartFragment

public class FloorsIntradayActivityChartFragment extends IntradayActivityChartFragment
{

    public FloorsIntradayActivityChartFragment()
    {
    }

    public Format a()
    {
        PostfixDecimalSinglePluralFormat postfixdecimalsinglepluralformat = new PostfixDecimalSinglePluralFormat(0x7f0b0001);
        postfixdecimalsinglepluralformat.setMaximumFractionDigits(1);
        return postfixdecimalsinglepluralformat;
    }

    public void b()
    {
    }

    protected void j_()
    {
        super.j_();
    }
}
