// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.ui.listview;

import android.widget.TextView;

// Referenced classes of package com.pinterest.ui.listview:
//            ListCellHeader

public class 
{

    public static void inject(butterknife..ViewInjector viewinjector, ListCellHeader listcellheader, Object obj)
    {
        listcellheader._headerTv = (TextView)viewinjector._headerTv(obj, 0x7f0f0077, "field '_headerTv'");
        listcellheader._dividerVw = viewinjector._dividerVw(obj, 0x7f0f0322, "field '_dividerVw'");
    }

    public static void reset(ListCellHeader listcellheader)
    {
        listcellheader._headerTv = null;
        listcellheader._dividerVw = null;
    }

    public ()
    {
    }
}
