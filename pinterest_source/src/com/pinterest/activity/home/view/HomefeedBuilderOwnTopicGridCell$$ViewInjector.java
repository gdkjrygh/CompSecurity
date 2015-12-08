// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.home.view;

import android.view.View;

// Referenced classes of package com.pinterest.activity.home.view:
//            HomefeedBuilderOwnTopicGridCell

public class _cls1
{

    public static void inject(butterknife.idCell idcell, final HomefeedBuilderOwnTopicGridCell target, Object obj)
    {
        com.pinterest.activity.home.view._cls1.val.target(idcell, target, obj);
        class _cls1 extends DebouncingOnClickListener
        {

            final HomefeedBuilderOwnTopicGridCell val$target;

            public final void doClick(View view)
            {
                target.onTopicClick(view);
            }

            _cls1()
            {
                target = homefeedbuilderowntopicgridcell;
                super();
            }
        }

        idcell.idCell(obj, 0x7f0f004b, "method 'onTopicClick'").setOnClickListener(new _cls1());
    }

    public static void reset(HomefeedBuilderOwnTopicGridCell homefeedbuilderowntopicgridcell)
    {
        _mth1(homefeedbuilderowntopicgridcell);
    }

    public _cls1()
    {
    }
}
