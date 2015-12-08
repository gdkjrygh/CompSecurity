// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.search.ui;

import android.widget.ImageView;

// Referenced classes of package com.pinterest.activity.search.ui:
//            GuidedSearchSpecificFilter

public class 
{

    public static void inject(butterknife.Filter filter, GuidedSearchSpecificFilter guidedsearchspecificfilter, Object obj)
    {
        ct(filter, guidedsearchspecificfilter, obj);
        guidedsearchspecificfilter._tokenCaret = (ImageView)filter._tokenCaret(obj, 0x7f0f035b, "field '_tokenCaret'");
    }

    public static void reset(GuidedSearchSpecificFilter guidedsearchspecificfilter)
    {
        t(guidedsearchspecificfilter);
        guidedsearchspecificfilter._tokenCaret = null;
    }

    public ()
    {
    }
}
