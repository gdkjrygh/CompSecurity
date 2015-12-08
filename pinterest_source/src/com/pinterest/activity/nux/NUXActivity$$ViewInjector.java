// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.nux;

import android.widget.FrameLayout;
import com.pinterest.activity.nux.view.NUXProgressIndicatorView;

// Referenced classes of package com.pinterest.activity.nux:
//            NUXActivity

public class iew
{

    public static void inject(butterknife. , NUXActivity nuxactivity, Object obj)
    {
        nuxactivity._wrapper = (FrameLayout)._wrapper(obj, 0x7f0f0085, "field '_wrapper'");
        nuxactivity._progressBar = (NUXProgressIndicatorView).gressIndicatorView(obj, 0x7f0f008d, "field '_progressBar'");
    }

    public static void reset(NUXActivity nuxactivity)
    {
        nuxactivity._wrapper = null;
        nuxactivity._progressBar = null;
    }

    public iew()
    {
    }
}
