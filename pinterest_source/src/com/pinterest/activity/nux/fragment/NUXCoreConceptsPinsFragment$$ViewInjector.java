// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.nux.fragment;

import com.pinterest.ui.imageview.WebImageView;
import com.pinterest.ui.text.PTextView;
import me.grantland.widget.AutofitLayout;

// Referenced classes of package com.pinterest.activity.nux.fragment:
//            NUXCoreConceptsPinsFragment

public class 
{

    public static void inject(butterknife.sFragment sfragment, NUXCoreConceptsPinsFragment nuxcoreconceptspinsfragment, Object obj)
    {
        nuxcoreconceptspinsfragment._title = (PTextView)sfragment._title(obj, 0x7f0f0283, "field '_title'");
        nuxcoreconceptspinsfragment._pin = (WebImageView)sfragment._pin(obj, 0x7f0f0284, "field '_pin'");
        nuxcoreconceptspinsfragment._pinTip = (WebImageView)sfragment._pinTip(obj, 0x7f0f0285, "field '_pinTip'");
        nuxcoreconceptspinsfragment._pinItBtn = (WebImageView)sfragment._pinItBtn(obj, 0x7f0f0286, "field '_pinItBtn'");
        nuxcoreconceptspinsfragment._titleWrapper = (AutofitLayout)sfragment._titleWrapper(obj, 0x7f0f0282, "field '_titleWrapper'");
    }

    public static void reset(NUXCoreConceptsPinsFragment nuxcoreconceptspinsfragment)
    {
        nuxcoreconceptspinsfragment._title = null;
        nuxcoreconceptspinsfragment._pin = null;
        nuxcoreconceptspinsfragment._pinTip = null;
        nuxcoreconceptspinsfragment._pinItBtn = null;
        nuxcoreconceptspinsfragment._titleWrapper = null;
    }

    public ()
    {
    }
}
