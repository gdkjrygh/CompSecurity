// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.activities;

import com.jcp.adapters.PickUpFromStoreAdapter;
import com.jcp.util.x;
import java.util.List;

// Referenced classes of package com.jcp.activities:
//            SelectPickUpStoreActivity

class bn
    implements x
{

    final SelectPickUpStoreActivity a;

    bn(SelectPickUpStoreActivity selectpickupstoreactivity)
    {
        a = selectpickupstoreactivity;
        super();
    }

    public void a(List list)
    {
        if (!SelectPickUpStoreActivity.a(a).isEmpty())
        {
            SelectPickUpStoreActivity.a(a).clear();
        }
        SelectPickUpStoreActivity.a(a).addAll(list);
        SelectPickUpStoreActivity.b(a).a(SelectPickUpStoreActivity.a(a));
    }
}
