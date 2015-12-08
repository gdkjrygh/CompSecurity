// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.driver.achievements.dials;

import android.content.Context;
import android.content.res.Resources;

// Referenced classes of package me.lyft.android.ui.driver.achievements.dials:
//            DialView

public class PercentageDialView extends DialView
{

    public PercentageDialView(Context context)
    {
        super(context);
    }

    String getProgressTextValue(int i)
    {
        return getResources().getString(0x7f070159, new Object[] {
            Integer.valueOf(i)
        });
    }
}
