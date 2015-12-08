// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.vim;

import android.support.v7.widget.RecyclerView;

// Referenced classes of package com.skype.android.app.vim:
//            FilterRosterView

final class t> extends android.support.v7.widget.t>
{

    final FilterRosterView this$0;

    public final void onScrolled(RecyclerView recyclerview, int i, int j)
    {
        super.rolled(recyclerview, i, j);
        if (i != 0)
        {
            FilterRosterView.access$000(FilterRosterView.this, 5000L);
        }
    }

    ()
    {
        this$0 = FilterRosterView.this;
        super();
    }
}
