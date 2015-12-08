// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.calling;

import android.view.View;
import com.skype.android.app.vim.FilterRosterView;

// Referenced classes of package com.skype.android.app.calling:
//            InCallFragment

final class this._cls0
    implements android.view.ner
{

    final InCallFragment this$0;

    public final void onClick(View view)
    {
        if (filterRoster.isShown())
        {
            filterRoster.hide();
            return;
        } else
        {
            filterRoster.show(InCallFragment.access$100(InCallFragment.this), true);
            filterRoster.bringToFront();
            return;
        }
    }

    ()
    {
        this$0 = InCallFragment.this;
        super();
    }
}
