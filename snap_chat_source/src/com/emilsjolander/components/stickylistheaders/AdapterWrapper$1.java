// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.emilsjolander.components.stickylistheaders;

import android.database.DataSetObserver;
import java.util.List;

// Referenced classes of package com.emilsjolander.components.stickylistheaders:
//            AdapterWrapper

final class this._cls0 extends DataSetObserver
{

    private AdapterWrapper this$0;

    public final void onChanged()
    {
        AdapterWrapper.access$201(AdapterWrapper.this);
    }

    public final void onInvalidated()
    {
        AdapterWrapper.access$000(AdapterWrapper.this).clear();
        AdapterWrapper.access$101(AdapterWrapper.this);
    }

    ()
    {
        this$0 = AdapterWrapper.this;
        super();
    }
}
