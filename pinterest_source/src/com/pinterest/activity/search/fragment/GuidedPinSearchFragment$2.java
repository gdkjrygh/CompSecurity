// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.search.fragment;

import android.view.View;
import android.widget.LinearLayout;

// Referenced classes of package com.pinterest.activity.search.fragment:
//            GuidedPinSearchFragment

class er extends com.pinterest.ui.scrollview.lViewListener
{

    final GuidedPinSearchFragment this$0;

    public void onScroll(View view, int i, int j, int k, int l)
    {
        if (_focusView != null)
        {
            _focusView.requestFocus();
        }
        if (_categoryListView != null) goto _L2; else goto _L1
_L1:
        return;
_L2:
        int i1;
        i = _headerWrapper.getMeasuredHeight();
        k = (int)_headerWrapper.getY();
        i1 = (l - j) + k;
        if (j >= l)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (k >= 0) goto _L1; else goto _L3
_L3:
        _headerWrapper.setTranslationY(Math.min(0, i1));
        return;
        if (j <= l || k <= -i) goto _L1; else goto _L4
_L4:
        _headerWrapper.setTranslationY(Math.max(-i, i1));
        return;
    }

    er()
    {
        this$0 = GuidedPinSearchFragment.this;
        super();
    }
}
