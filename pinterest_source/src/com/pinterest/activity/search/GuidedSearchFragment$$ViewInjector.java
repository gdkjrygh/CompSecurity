// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.search;

import android.view.View;
import android.widget.ImageView;
import com.pinterest.activity.commerce.view.PricePickerIcon;
import com.pinterest.activity.search.ui.GuidedSearchBar;
import com.pinterest.ui.text.IconView;

// Referenced classes of package com.pinterest.activity.search:
//            GuidedSearchFragment

public class _cls1
{

    public static void inject(butterknife.ent ent, final GuidedSearchFragment target, Object obj)
    {
        target._searchView = (GuidedSearchBar)ent.r(obj, 0x7f0f006d, "field '_searchView'");
        target._backBt = (IconView)ent._backBt(obj, 0x7f0f006a, "field '_backBt'");
        View view = ent._backBt(obj, 0x7f0f006b, "field '_searchFilterIcon' and method 'onFilterClicked'");
        target._searchFilterIcon = (ImageView)view;
        class _cls1 extends DebouncingOnClickListener
        {

            final GuidedSearchFragment val$target;

            public final void doClick(View view1)
            {
                target.onFilterClicked();
            }

            _cls1()
            {
                target = guidedsearchfragment;
                super();
            }
        }

        view.setOnClickListener(new _cls1());
        target._actionBarSearch = ent._actionBarSearch(obj, 0x7f0f0069, "field '_actionBarSearch'");
        target._actionbarShadow = ent._actionbarShadow(obj, 0x7f0f0260, "field '_actionbarShadow'");
        target._pricePicker = (PricePickerIcon)ent.rIcon(obj, 0x7f0f006c, "field '_pricePicker'");
    }

    public static void reset(GuidedSearchFragment guidedsearchfragment)
    {
        guidedsearchfragment._searchView = null;
        guidedsearchfragment._backBt = null;
        guidedsearchfragment._searchFilterIcon = null;
        guidedsearchfragment._actionBarSearch = null;
        guidedsearchfragment._actionbarShadow = null;
        guidedsearchfragment._pricePicker = null;
    }

    public _cls1()
    {
    }
}
