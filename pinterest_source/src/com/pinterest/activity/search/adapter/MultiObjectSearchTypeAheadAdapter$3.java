// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.search.adapter;

import android.text.TextUtils;
import java.util.List;
import java.util.Map;

// Referenced classes of package com.pinterest.activity.search.adapter:
//            MultiObjectSearchTypeAheadAdapter

class val.newData
    implements Runnable
{

    final MultiObjectSearchTypeAheadAdapter this$0;
    final List val$newData;
    final String val$searchTerm;

    public void run()
    {
        if (TextUtils.equals(val$searchTerm, MultiObjectSearchTypeAheadAdapter.access$200(MultiObjectSearchTypeAheadAdapter.this)))
        {
            if (MultiObjectSearchTypeAheadAdapter.access$300(MultiObjectSearchTypeAheadAdapter.this) == com.pinterest.api.remote.eadAdapter)
            {
                if (!MultiObjectSearchTypeAheadAdapter.access$100(MultiObjectSearchTypeAheadAdapter.this).isEmpty())
                {
                    MultiObjectSearchTypeAheadAdapter.access$100(MultiObjectSearchTypeAheadAdapter.this).remove(com.pinterest.activity.search.event._cls3.this._fld0);
                    MultiObjectSearchTypeAheadAdapter.access$100(MultiObjectSearchTypeAheadAdapter.this).remove(com.pinterest.activity.search.event._cls3.this._fld0);
                }
                MultiObjectSearchTypeAheadAdapter.access$400(MultiObjectSearchTypeAheadAdapter.this, val$newData, com.pinterest.activity.search.event._cls3.val.newData);
                MultiObjectSearchTypeAheadAdapter.access$502(MultiObjectSearchTypeAheadAdapter.this, MultiObjectSearchTypeAheadAdapter.access$100(MultiObjectSearchTypeAheadAdapter.this));
            } else
            {
                MultiObjectSearchTypeAheadAdapter.access$600(MultiObjectSearchTypeAheadAdapter.this, val$newData);
            }
            notifyDataSetChanged();
        }
    }

    ()
    {
        this$0 = final_multiobjectsearchtypeaheadadapter;
        val$searchTerm = s;
        val$newData = List.this;
        super();
    }
}
