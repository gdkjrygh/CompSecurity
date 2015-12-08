// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.driver.achievements.dials;

import android.content.Context;
import android.widget.TextView;
import me.lyft.android.domain.payment.Money;

// Referenced classes of package me.lyft.android.ui.driver.achievements.dials:
//            DialView

public class MoneyDialView extends DialView
{

    private static final int PROGRESS_TEXT_SIZE = 14;

    public MoneyDialView(Context context)
    {
        super(context);
        titleTextView.setVisibility(8);
        subtitleTextView.setVisibility(8);
        progressText.setTextSize(14F);
    }

    public void animateProgress(int i, int j, boolean flag)
    {
        super.animateProgress(i, Math.max(i, j), flag);
    }

    String getProgressTextValue(int i)
    {
        return Money.format(i);
    }
}
