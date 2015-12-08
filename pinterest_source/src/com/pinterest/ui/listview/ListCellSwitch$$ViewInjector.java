// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.ui.listview;

import android.support.v7.widget.SwitchCompat;
import android.widget.TextView;

// Referenced classes of package com.pinterest.ui.listview:
//            ListCellSwitch

public class 
{

    public static void inject(butterknife..ViewInjector viewinjector, ListCellSwitch listcellswitch, Object obj)
    {
        listcellswitch._titleTv = (TextView)viewinjector._titleTv(obj, 0x7f0f0077, "field '_titleTv'");
        listcellswitch._metadataTv = (TextView)viewinjector._metadataTv(obj, 0x7f0f0385, "field '_metadataTv'");
        listcellswitch._toggleSw = (SwitchCompat)viewinjector._toggleSw(obj, 0x7f0f0386, "field '_toggleSw'");
        listcellswitch._dividerVw = viewinjector._dividerVw(obj, 0x7f0f0322, "field '_dividerVw'");
    }

    public static void reset(ListCellSwitch listcellswitch)
    {
        listcellswitch._titleTv = null;
        listcellswitch._metadataTv = null;
        listcellswitch._toggleSw = null;
        listcellswitch._dividerVw = null;
    }

    public ()
    {
    }
}
