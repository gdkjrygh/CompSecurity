// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.category.fragment;

import android.view.View;
import com.pinterest.ui.actionbar.ActionBar;

// Referenced classes of package com.pinterest.activity.category.fragment:
//            CategoryFragment

class istener extends com.pinterest.ui.scrollview.w.ScrollViewListener
{

    final CategoryFragment this$0;

    public void onScroll(View view, int i, int j, int k, int l)
    {
        if (CategoryFragment.access$000(CategoryFragment.this) != null)
        {
            view = CategoryFragment.access$100(CategoryFragment.this);
            if (j > 0)
            {
                i = 0;
            } else
            {
                i = 8;
            }
            view.setShadowVisibility(i);
        }
    }

    istener()
    {
        this$0 = CategoryFragment.this;
        super();
    }
}
