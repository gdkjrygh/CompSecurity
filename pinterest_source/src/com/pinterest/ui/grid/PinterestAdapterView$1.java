// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.ui.grid;

import android.database.DataSetObserver;
import com.pinterest.adapter.PinterestBaseAdapter;

// Referenced classes of package com.pinterest.ui.grid:
//            PinterestAdapterView, RecycleBin

class this._cls0 extends DataSetObserver
{

    final PinterestAdapterView this$0;

    public void onChanged()
    {
        synchronized (PinterestAdapterView.this)
        {
            PinterestAdapterView.access$002(PinterestAdapterView.this, true);
        }
        if (_adapter != null)
        {
            PinterestAdapterView.access$100(PinterestAdapterView.this).setViewTypeCount(_adapter.getViewTypeCount());
        }
        requestLayout();
        return;
        exception;
        pinterestadapterview;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void onInvalidated()
    {
        reset();
        if (_adapter != null)
        {
            PinterestAdapterView.access$100(PinterestAdapterView.this).setViewTypeCount(_adapter.getViewTypeCount());
        }
        requestLayout();
    }

    ()
    {
        this$0 = PinterestAdapterView.this;
        super();
    }
}
