// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.ui.layout;

import android.database.DataSetObserver;

// Referenced classes of package com.pinterest.ui.layout:
//            AdapterLinearLayout

class this._cls0 extends DataSetObserver
{

    final AdapterLinearLayout this$0;

    public void onChanged()
    {
        super.onChanged();
        updateView();
    }

    ()
    {
        this$0 = AdapterLinearLayout.this;
        super();
    }
}
