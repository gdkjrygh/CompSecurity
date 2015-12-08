// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.funding;


// Referenced classes of package com.google.android.apps.wallet.funding:
//            SelectFundingSourceActivity, FundingSourceListItem

final class this._cls0
    implements ndingSourceListItemListener
{

    final SelectFundingSourceActivity this$0;

    public final void onFundingSourceClicked(FundingSourceListItem fundingsourcelistitem)
    {
        SelectFundingSourceActivity.access$300(SelectFundingSourceActivity.this, fundingsourcelistitem.fundingSource);
    }

    ndingSourceListItemListener()
    {
        this$0 = SelectFundingSourceActivity.this;
        super();
    }
}
