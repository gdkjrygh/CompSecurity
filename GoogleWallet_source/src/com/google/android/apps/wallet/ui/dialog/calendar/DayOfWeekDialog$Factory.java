// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.ui.dialog.calendar;

import android.os.Bundle;

// Referenced classes of package com.google.android.apps.wallet.ui.dialog.calendar:
//            DayOfWeekDialog

public static final class 
{

    public static DayOfWeekDialog create(String s, int i)
    {
        DayOfWeekDialog dayofweekdialog = new DayOfWeekDialog();
        Bundle bundle = new Bundle();
        bundle.putString("title", s);
        bundle.putInt("dayOfWeek", i);
        dayofweekdialog.setArguments(bundle);
        return dayofweekdialog;
    }

    public ()
    {
    }
}
