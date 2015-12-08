// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.search.fragment;

import android.view.View;
import android.widget.LinearLayout;

// Referenced classes of package com.pinterest.activity.search.fragment:
//            GuidedBoardSearchFragment

class  extends com.pinterest.ui.scrollview.iewListener
{

    final GuidedBoardSearchFragment this$0;

    public void onScroll(View view, int i, int j, int k, int l)
    {
        if (_focusView != null)
        {
            _focusView.requestFocus();
        }
        if (_categoryListView == null)
        {
            return;
        }
        i = _headerWrapper.getMeasuredHeight();
        k = (int)_headerWrapper.getY();
        if (j >= GuidedBoardSearchFragment.access$100(GuidedBoardSearchFragment.this)) goto _L2; else goto _L1
_L1:
        if (k < 0)
        {
            i = Math.min(0, k + (GuidedBoardSearchFragment.access$100(GuidedBoardSearchFragment.this) - j));
            _headerWrapper.setTranslationY(i);
        }
_L4:
        GuidedBoardSearchFragment.access$102(GuidedBoardSearchFragment.this, j);
        return;
_L2:
        if (j > GuidedBoardSearchFragment.access$100(GuidedBoardSearchFragment.this) && k > -i)
        {
            i = Math.max(-i, k - (j - GuidedBoardSearchFragment.access$100(GuidedBoardSearchFragment.this)));
            _headerWrapper.setTranslationY(i);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    ()
    {
        this$0 = GuidedBoardSearchFragment.this;
        super();
    }
}
