// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.search.adapter;

import java.util.Map;

// Referenced classes of package com.pinterest.activity.search.adapter:
//            MultiObjectSearchTypeAheadAdapter

class this._cls0
    implements Runnable
{

    final MultiObjectSearchTypeAheadAdapter this$0;

    public void run()
    {
        if (MultiObjectSearchTypeAheadAdapter.access$500(MultiObjectSearchTypeAheadAdapter.this) != null && !MultiObjectSearchTypeAheadAdapter.access$500(MultiObjectSearchTypeAheadAdapter.this).isEmpty())
        {
            MultiObjectSearchTypeAheadAdapter.access$102(MultiObjectSearchTypeAheadAdapter.this, MultiObjectSearchTypeAheadAdapter.access$500(MultiObjectSearchTypeAheadAdapter.this));
            notifyDataSetChanged();
        }
    }

    ()
    {
        this$0 = MultiObjectSearchTypeAheadAdapter.this;
        super();
    }
}
