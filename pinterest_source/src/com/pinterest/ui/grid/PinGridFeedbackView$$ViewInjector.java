// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.ui.grid;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

// Referenced classes of package com.pinterest.ui.grid:
//            PinGridFeedbackView

public class _cls1
{

    public static void inject(butterknife.wInjector winjector, final PinGridFeedbackView target, Object obj)
    {
        target._title = (TextView)winjector.le(obj, 0x7f0f004f, "field '_title'");
        View view = winjector.le(obj, 0x7f0f02f5, "field '_subtitle' and method 'subtitleClicked'");
        target._subtitle = (TextView)view;
        class _cls1 extends DebouncingOnClickListener
        {

            final PinGridFeedbackView val$target;

            public final void doClick(View view1)
            {
                target.subtitleClicked();
            }

            _cls1()
            {
                target = pingridfeedbackview;
                super();
            }
        }

        view.setOnClickListener(new _cls1());
        target._imageVw = (ImageView)winjector.geVw(obj, 0x7f0f004b, "field '_imageVw'");
    }

    public static void reset(PinGridFeedbackView pingridfeedbackview)
    {
        pingridfeedbackview._title = null;
        pingridfeedbackview._subtitle = null;
        pingridfeedbackview._imageVw = null;
    }

    public _cls1()
    {
    }
}
