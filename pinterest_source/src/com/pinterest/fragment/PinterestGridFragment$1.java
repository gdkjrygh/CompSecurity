// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.fragment;

import android.view.View;
import com.pinterest.ui.actionbar.ActionBar;

// Referenced classes of package com.pinterest.fragment:
//            PinterestGridFragment

class w.ScrollViewListener extends com.pinterest.ui.scrollview.ollViewListener
{

    final PinterestGridFragment this$0;

    public void onScroll(View view, int i, int j, int k, int l)
    {
        if (PinterestGridFragment.access$000(PinterestGridFragment.this) != null && !_fixedActionBar) goto _L2; else goto _L1
_L1:
        return;
_L2:
        int i1;
        i = PinterestGridFragment.access$100();
        k = (int)PinterestGridFragment.access$200(PinterestGridFragment.this).getY();
        i1 = (int)((float)k + (float)(l - j) * _movingSpeed);
        if (j >= l)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (k >= 0) goto _L1; else goto _L3
_L3:
        PinterestGridFragment.access$300(PinterestGridFragment.this).setTranslationY(Math.min(0, i1));
        return;
        if (j <= l || k <= -i) goto _L1; else goto _L4
_L4:
        PinterestGridFragment.access$400(PinterestGridFragment.this).setTranslationY(Math.max(-i, i1));
        return;
    }

    w.ScrollViewListener()
    {
        this$0 = PinterestGridFragment.this;
        super();
    }
}
