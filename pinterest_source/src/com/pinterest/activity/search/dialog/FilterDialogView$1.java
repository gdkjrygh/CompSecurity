// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.search.dialog;

import android.view.View;
import com.pinterest.activity.search.ui.GuidedSearchFilterTransparent;
import com.pinterest.kit.application.Resources;

// Referenced classes of package com.pinterest.activity.search.dialog:
//            FilterDialogView

class this._cls0
    implements Runnable
{

    final FilterDialogView this$0;

    public void run()
    {
        int j = (FilterDialogView.access$000(FilterDialogView.this) + _guide.getMeasuredWidth() / 2) - _anchor.getMeasuredWidth() / 2;
        int i = j;
        if (FilterDialogView.access$100(FilterDialogView.this) == 0)
        {
            i = (int)((float)j + Resources.dimension(0x7f0a015f) / 2.0F);
        }
        _anchor.setX(i);
    }

    parent()
    {
        this$0 = FilterDialogView.this;
        super();
    }
}
