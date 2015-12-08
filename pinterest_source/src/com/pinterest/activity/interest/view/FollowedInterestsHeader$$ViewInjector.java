// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.interest.view;

import android.view.View;
import android.widget.TextView;

// Referenced classes of package com.pinterest.activity.interest.view:
//            FollowedInterestsHeader

public class _cls1
{

    public static void inject(butterknife.estsHeader estsheader, final FollowedInterestsHeader target, Object obj)
    {
        estsheader = estsheader.estsHeader(obj, 0x7f0f0356, "field '_seeAll' and method 'onSeeAllClicked'");
        target._seeAll = (TextView)estsheader;
        class _cls1 extends DebouncingOnClickListener
        {

            final FollowedInterestsHeader val$target;

            public final void doClick(View view)
            {
                target.onSeeAllClicked();
            }

            _cls1()
            {
                target = followedinterestsheader;
                super();
            }
        }

        estsheader.setOnClickListener(new _cls1());
    }

    public static void reset(FollowedInterestsHeader followedinterestsheader)
    {
        followedinterestsheader._seeAll = null;
    }

    public _cls1()
    {
    }
}
