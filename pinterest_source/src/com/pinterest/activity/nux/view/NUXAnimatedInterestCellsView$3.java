// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.nux.view;

import com.pinterest.api.model.Interest;
import java.util.ArrayList;

// Referenced classes of package com.pinterest.activity.nux.view:
//            NUXAnimatedInterestCellsView

class this._cls0
    implements Runnable
{

    final NUXAnimatedInterestCellsView this$0;

    public void run()
    {
        Interest interest = (Interest)NUXAnimatedInterestCellsView.access$000(NUXAnimatedInterestCellsView.this).get(NUXAnimatedInterestCellsView.access$300(NUXAnimatedInterestCellsView.this) % NUXAnimatedInterestCellsView.access$000(NUXAnimatedInterestCellsView.this).size());
        addView(NUXAnimatedInterestCellsView.access$100(NUXAnimatedInterestCellsView.this, interest));
        NUXAnimatedInterestCellsView.access$200(NUXAnimatedInterestCellsView.this);
    }

    ()
    {
        this$0 = NUXAnimatedInterestCellsView.this;
        super();
    }
}
