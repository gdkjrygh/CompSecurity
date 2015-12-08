// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package se.emilsjolander.stickylistheaders;

import android.database.DataSetObserver;
import java.util.List;

// Referenced classes of package se.emilsjolander.stickylistheaders:
//            AdapterWrapper

class this._cls0 extends DataSetObserver
{

    final AdapterWrapper this$0;

    public void onChanged()
    {
        AdapterWrapper.access$201(AdapterWrapper.this);
    }

    public void onInvalidated()
    {
        AdapterWrapper.access$000(AdapterWrapper.this).clear();
        AdapterWrapper.access$101(AdapterWrapper.this);
    }

    _cls9()
    {
        this$0 = AdapterWrapper.this;
        super();
    }
}
