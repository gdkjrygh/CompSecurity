// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.search.ui;

import android.widget.GridView;
import com.pinterest.ui.listview.SolidTitleDivider;

// Referenced classes of package com.pinterest.activity.search.ui:
//            GuidedSearchFilterHeader

public class 
{

    public static void inject(butterknife.Header header, GuidedSearchFilterHeader guidedsearchfilterheader, Object obj)
    {
        guidedsearchfilterheader._topCategoryTitle = (SolidTitleDivider)header._topCategoryTitle(obj, 0x7f0f0187, "field '_topCategoryTitle'");
        guidedsearchfilterheader._optionsGv = (GridView)header._optionsGv(obj, 0x7f0f0188, "field '_optionsGv'");
    }

    public static void reset(GuidedSearchFilterHeader guidedsearchfilterheader)
    {
        guidedsearchfilterheader._topCategoryTitle = null;
        guidedsearchfilterheader._optionsGv = null;
    }

    public ()
    {
    }
}
