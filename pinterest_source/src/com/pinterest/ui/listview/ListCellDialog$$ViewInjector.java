// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.ui.listview;

import android.widget.TextView;
import com.pinterest.ui.text.IconView;

// Referenced classes of package com.pinterest.ui.listview:
//            ListCellDialog

public class 
{

    public static void inject(butterknife..ViewInjector viewinjector, ListCellDialog listcelldialog, Object obj)
    {
        listcelldialog._titleTv = (TextView)viewinjector._titleTv(obj, 0x7f0f0077, "field '_titleTv'");
        listcelldialog._iconView = (IconView)viewinjector._iconView(obj, 0x7f0f032b, "field '_iconView'");
        listcelldialog._dividerVw = viewinjector._dividerVw(obj, 0x7f0f0322, "field '_dividerVw'");
    }

    public static void reset(ListCellDialog listcelldialog)
    {
        listcelldialog._titleTv = null;
        listcelldialog._iconView = null;
        listcelldialog._dividerVw = null;
    }

    public ()
    {
    }
}
