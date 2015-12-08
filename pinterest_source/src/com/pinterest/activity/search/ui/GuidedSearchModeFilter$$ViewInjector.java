// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.search.ui;

import android.widget.ImageView;
import android.widget.LinearLayout;

// Referenced classes of package com.pinterest.activity.search.ui:
//            GuidedSearchModeFilter

public class 
{

    public static void inject(butterknife.Filter filter, GuidedSearchModeFilter guidedsearchmodefilter, Object obj)
    {
        ct(filter, guidedsearchmodefilter, obj);
        guidedsearchmodefilter._divider = (LinearLayout)filter._divider(obj, 0x7f0f035c, "field '_divider'");
        guidedsearchmodefilter._tokenIcon = (ImageView)filter._tokenIcon(obj, 0x7f0f035a, "field '_tokenIcon'");
    }

    public static void reset(GuidedSearchModeFilter guidedsearchmodefilter)
    {
        t(guidedsearchmodefilter);
        guidedsearchmodefilter._divider = null;
        guidedsearchmodefilter._tokenIcon = null;
    }

    public ()
    {
    }
}
