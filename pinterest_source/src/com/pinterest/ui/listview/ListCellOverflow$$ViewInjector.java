// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.ui.listview;

import android.widget.TextView;

// Referenced classes of package com.pinterest.ui.listview:
//            ListCellOverflow

public class 
{

    public static void inject(butterknife..ViewInjector viewinjector, ListCellOverflow listcelloverflow, Object obj)
    {
        listcelloverflow._textVw = (TextView)viewinjector._textVw(obj, 0x7f0f0077, "field '_textVw'");
    }

    public static void reset(ListCellOverflow listcelloverflow)
    {
        listcelloverflow._textVw = null;
    }

    public ()
    {
    }
}
