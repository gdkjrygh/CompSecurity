// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.home.view;

import android.view.View;
import android.widget.ImageView;

// Referenced classes of package com.pinterest.activity.home.view:
//            HomefeedBuilderIcon

public class _cls1
{

    public static void inject(butterknife.erIcon ericon, final HomefeedBuilderIcon target, Object obj)
    {
        target._icon = (ImageView)ericon._icon(obj, 0x7f0f004b, "field '_icon'");
        class _cls1 extends DebouncingOnClickListener
        {

            final HomefeedBuilderIcon val$target;

            public final void doClick(View view)
            {
                target.onClick();
            }

            _cls1()
            {
                target = homefeedbuildericon;
                super();
            }
        }

        target.setOnClickListener(new _cls1());
    }

    public static void reset(HomefeedBuilderIcon homefeedbuildericon)
    {
        homefeedbuildericon._icon = null;
    }

    public _cls1()
    {
    }
}
