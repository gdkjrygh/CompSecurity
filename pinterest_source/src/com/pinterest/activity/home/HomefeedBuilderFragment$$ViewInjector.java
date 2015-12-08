// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.home;

import android.view.View;
import com.pinterest.activity.search.ui.GuidedSearchBar;

// Referenced classes of package com.pinterest.activity.home:
//            HomefeedBuilderFragment

public class _cls1
{

    public static void inject(butterknife.t t, final HomefeedBuilderFragment target, Object obj)
    {
        com.pinterest.fragment.ject(t, target, obj);
        target._searchBar = (GuidedSearchBar)t._searchBar(obj, 0x7f0f006d, "field '_searchBar'");
        class _cls1 extends DebouncingOnClickListener
        {

            final HomefeedBuilderFragment val$target;

            public final void doClick(View view)
            {
                target.onBackBtnClicked(view);
            }

            _cls1()
            {
                target = homefeedbuilderfragment;
                super();
            }
        }

        t.t(obj, 0x7f0f006a, "method 'onBackBtnClicked'").setOnClickListener(new _cls1());
    }

    public static void reset(HomefeedBuilderFragment homefeedbuilderfragment)
    {
        com.pinterest.fragment.set(homefeedbuilderfragment);
        homefeedbuilderfragment._searchBar = null;
    }

    public _cls1()
    {
    }
}
