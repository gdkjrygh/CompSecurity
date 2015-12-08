// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.dynamicgrid;

import android.view.View;
import android.widget.FrameLayout;
import com.pinterest.ui.text.PTextView;

// Referenced classes of package com.pinterest.activity.dynamicgrid:
//            EndStoryCell

public class _cls1
{

    public static void inject(butterknife.toryCell torycell, final EndStoryCell target, Object obj)
    {
        View view = torycell.toryCell(obj, 0x7f0f0483, "field '_wrapper' and method 'onClick'");
        target._wrapper = (FrameLayout)view;
        class _cls1 extends DebouncingOnClickListener
        {

            final EndStoryCell val$target;

            public final void doClick(View view1)
            {
                target.onClick(view1);
            }

            _cls1()
            {
                target = endstorycell;
                super();
            }
        }

        view.setOnClickListener(new _cls1());
        target._title = (PTextView)torycell._title(obj, 0x7f0f004f, "field '_title'");
    }

    public static void reset(EndStoryCell endstorycell)
    {
        endstorycell._wrapper = null;
        endstorycell._title = null;
    }

    public _cls1()
    {
    }
}
