// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.fragments;

import android.widget.ScrollView;
import android.widget.TextView;

// Referenced classes of package com.dominos.fragments:
//            ItemUnavailableFragment

class this._cls0
    implements Runnable
{

    final ItemUnavailableFragment this$0;

    public void run()
    {
        mItemUnavailableScrollView.scrollTo(0, mMoreInfoContentView.getTop());
    }

    ()
    {
        this$0 = ItemUnavailableFragment.this;
        super();
    }
}
