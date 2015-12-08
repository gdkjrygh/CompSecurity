// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.flashlight;

import android.view.View;
import android.widget.ImageView;
import com.pinterest.ui.progress.LoadingView;
import org.lucasr.twowayview.TwoWayView;

// Referenced classes of package com.pinterest.activity.flashlight:
//            FlashlightResultsFragment

public class _cls1
{

    public static void inject(butterknife.ragment ragment, final FlashlightResultsFragment target, Object obj)
    {
        com.pinterest.fragment.ct(ragment, target, obj);
        View view = ragment.inject(obj, 0x7f0f0258, "field '_closeFlashlightButton' and method 'onCloseFlashlightClicked'");
        target._closeFlashlightButton = (ImageView)view;
        class _cls1 extends DebouncingOnClickListener
        {

            final FlashlightResultsFragment val$target;

            public final void doClick(View view1)
            {
                target.onCloseFlashlightClicked(view1);
            }

            _cls1()
            {
                target = flashlightresultsfragment;
                super();
            }
        }

        view.setOnClickListener(new _cls1());
        target._loadingView = (LoadingView)ragment._loadingView(obj, 0x7f0f025a, "field '_loadingView'");
        target._annotationsView = (TwoWayView)ragment._annotationsView(obj, 0x7f0f0259, "field '_annotationsView'");
    }

    public static void reset(FlashlightResultsFragment flashlightresultsfragment)
    {
        com.pinterest.fragment.t(flashlightresultsfragment);
        flashlightresultsfragment._closeFlashlightButton = null;
        flashlightresultsfragment._loadingView = null;
        flashlightresultsfragment._annotationsView = null;
    }

    public _cls1()
    {
    }
}
