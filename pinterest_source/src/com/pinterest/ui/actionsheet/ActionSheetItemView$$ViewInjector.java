// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.ui.actionsheet;

import android.widget.TextView;

// Referenced classes of package com.pinterest.ui.actionsheet:
//            ActionSheetItemView

public class 
{

    public static void inject(butterknife.ew ew, ActionSheetItemView actionsheetitemview, Object obj)
    {
        actionsheetitemview._tv = (TextView)ew._tv(obj, 0x7f0f0067, "field '_tv'");
        actionsheetitemview._divider = ew._divider(obj, 0x7f0f0068, "field '_divider'");
    }

    public static void reset(ActionSheetItemView actionsheetitemview)
    {
        actionsheetitemview._tv = null;
        actionsheetitemview._divider = null;
    }

    public ()
    {
    }
}
