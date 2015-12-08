// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.bind.data;


// Referenced classes of package com.google.android.libraries.bind.data:
//            DataObserver, FilteredDataList, DataChange

final class  extends DataObserver
{

    final FilteredDataList this$0;
    final boolean val$clearOnInvalidation = false;

    public final void onDataChanged(DataChange datachange)
    {
        if (datachange.isInvalidation && val$clearOnInvalidation)
        {
            update$600ed7f(DataChange.INVALIDATION);
        }
        invalidateData();
    }

    ()
    {
        this$0 = final_filtereddatalist;
        super();
    }
}
