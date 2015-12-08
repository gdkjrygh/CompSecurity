// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.view.pagingindicator;

import android.database.DataSetObserver;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;

// Referenced classes of package com.google.android.libraries.view.pagingindicator:
//            PagingIndicator

final class this._cls0 extends DataSetObserver
{

    final PagingIndicator this$0;

    public final void onChanged()
    {
        PagingIndicator.access$200(PagingIndicator.this, PagingIndicator.access$100(PagingIndicator.this).getAdapter().getCount());
    }

    I()
    {
        this$0 = PagingIndicator.this;
        super();
    }
}
