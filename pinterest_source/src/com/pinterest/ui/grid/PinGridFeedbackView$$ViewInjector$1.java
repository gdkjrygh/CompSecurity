// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.ui.grid;

import android.view.View;
import butterknife.internal.DebouncingOnClickListener;

// Referenced classes of package com.pinterest.ui.grid:
//            PinGridFeedbackView

final class val.target extends DebouncingOnClickListener
{

    final PinGridFeedbackView val$target;

    public final void doClick(View view)
    {
        val$target.subtitleClicked();
    }

    ()
    {
        val$target = pingridfeedbackview;
        super();
    }
}
