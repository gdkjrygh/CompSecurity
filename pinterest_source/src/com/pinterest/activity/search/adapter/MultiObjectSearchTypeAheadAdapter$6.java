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
            MultiObjectSearchTypeAheadAdapter.access$100(MultiObjectSearchTypeAheadAdapter.this).clear();
            MultiObjectSearchTypeAheadAdapter.access$400(MultiObjectSearchTypeAheadAdapter.this, val$newData, com.pinterest.activity.search.event._cls6.val.newData);
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
