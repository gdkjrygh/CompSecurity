// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.nux.fragment;

import android.widget.ImageView;
import android.widget.LinearLayout;

// Referenced classes of package com.pinterest.activity.nux.fragment:
//            NUXCoreConceptsPagerFragment

public class 
{

    public static void inject(butterknife.rFragment rfragment, NUXCoreConceptsPagerFragment nuxcoreconceptspagerfragment, Object obj)
    {
        nuxcoreconceptspagerfragment._progressDot1 = (ImageView)rfragment._progressDot1(obj, 0x7f0f0123, "field '_progressDot1'");
        nuxcoreconceptspagerfragment._progressDot2 = (ImageView)rfragment._progressDot2(obj, 0x7f0f0124, "field '_progressDot2'");
        nuxcoreconceptspagerfragment._progressDot3 = (ImageView)rfragment._progressDot3(obj, 0x7f0f0125, "field '_progressDot3'");
        nuxcoreconceptspagerfragment._progressDot4 = (ImageView)rfragment._progressDot4(obj, 0x7f0f0126, "field '_progressDot4'");
        nuxcoreconceptspagerfragment._progressDots = (LinearLayout)rfragment._progressDots(obj, 0x7f0f0122, "field '_progressDots'");
    }

    public static void reset(NUXCoreConceptsPagerFragment nuxcoreconceptspagerfragment)
    {
        nuxcoreconceptspagerfragment._progressDot1 = null;
        nuxcoreconceptspagerfragment._progressDot2 = null;
        nuxcoreconceptspagerfragment._progressDot3 = null;
        nuxcoreconceptspagerfragment._progressDot4 = null;
        nuxcoreconceptspagerfragment._progressDots = null;
    }

    public ()
    {
    }
}
