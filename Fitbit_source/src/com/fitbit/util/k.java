// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.util;

import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import com.fitbit.e.a;
import com.fitbit.savedstate.UISavedState;
import java.util.Date;

// Referenced classes of package com.fitbit.util:
//            SimpleConfirmDialogFragment

public class k
{

    private static final String a = "CoppaUtils";
    private static final String b = "com.fitbit.util.COPPA_DIALOG_TAG";

    public k()
    {
    }

    public static void a(FragmentActivity fragmentactivity, boolean flag)
    {
        FragmentManager fragmentmanager = fragmentactivity.getSupportFragmentManager();
        SimpleConfirmDialogFragment simpleconfirmdialogfragment = (SimpleConfirmDialogFragment)fragmentmanager.findFragmentByTag("com.fitbit.util.COPPA_DIALOG_TAG");
        if (simpleconfirmdialogfragment == null)
        {
            fragmentactivity = com.fitbit.util.SimpleConfirmDialogFragment.a(new _cls1(), 0x7f08042e, 0, 0x7f08002e, 0x7f08002d);
        } else
        {
            fragmentactivity = simpleconfirmdialogfragment;
            if (simpleconfirmdialogfragment.isAdded())
            {
                return;
            }
        }
        if (flag)
        {
            UISavedState.a(new Date());
        }
        fragmentactivity.show(fragmentmanager, "com.fitbit.util.COPPA_DIALOG_TAG");
    }

    public static boolean a()
    {
        Date date = UISavedState.r();
        Date date1 = new Date();
        boolean flag;
        if (0x5265c00L < date1.getTime() - date.getTime())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        com.fitbit.e.a.a("CoppaUtils", "coppaDialogShownDate = %s , currentDate = %s, isAllowed = %s", new Object[] {
            date, date1, Boolean.valueOf(flag)
        });
        return flag;
    }

    public static void b()
    {
        com.fitbit.e.a.a("CoppaUtils", "resetCoppaDialogShownDate", new Object[0]);
        UISavedState.s();
    }

    /* member class not found */
    class _cls1 {}

}
