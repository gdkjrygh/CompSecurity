// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.ui.dialog.calendar;

import android.os.Bundle;

// Referenced classes of package com.google.android.apps.wallet.ui.dialog.calendar:
//            DayOfMonthDialog

public static final class 
{

    public static DayOfMonthDialog create(String s, int i)
    {
        DayOfMonthDialog dayofmonthdialog = new DayOfMonthDialog();
        Bundle bundle = new Bundle();
        bundle.putString("title", s);
        bundle.putInt("dayOfMonth", i);
        dayofmonthdialog.setArguments(bundle);
        return dayofmonthdialog;
    }

    public ()
    {
    }
}
