// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.bind.card;

import android.database.DataSetObserver;

// Referenced classes of package com.google.android.libraries.bind.card:
//            CardListView

final class this._cls0 extends DataSetObserver
{

    final CardListView this$0;

    public final void onChanged()
    {
        CardListView cardlistview = CardListView.this;
        if (cardlistview.stashedSavedState != null)
        {
            vedState vedstate = cardlistview.stashedSavedState;
            cardlistview.stashedSavedState = null;
            com.google.android.libraries.bind.logging.Logd logd = CardListView.LOGD;
            cardlistview.restoreSavedState(vedstate);
        }
    }

    ()
    {
        this$0 = CardListView.this;
        super();
    }
}
