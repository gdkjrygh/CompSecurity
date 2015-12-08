// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.accuweather.android.fragments;

import android.view.View;

// Referenced classes of package com.accuweather.android.fragments:
//            TableFragment

private final class itemIndex
    implements android.view.eCellOnClickListener
{

    int itemIndex;
    final TableFragment this$0;

    public void onClick(View view)
    {
        if (TableFragment.access$000(TableFragment.this) != null)
        {
            TableFragment.access$000(TableFragment.this).ItemSelected(itemIndex);
        }
    }

    public (int i)
    {
        this$0 = TableFragment.this;
        super();
        itemIndex = i;
    }
}
