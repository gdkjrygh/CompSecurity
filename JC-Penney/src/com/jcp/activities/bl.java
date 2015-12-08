// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.activities;

import android.view.View;
import butterknife.internal.DebouncingOnClickListener;

// Referenced classes of package com.jcp.activities:
//            SelectPickUpStoreActivity

class bl extends DebouncingOnClickListener
{

    final SelectPickUpStoreActivity a;
    final SelectPickUpStoreActivity..ViewInjector b;

    bl(SelectPickUpStoreActivity..ViewInjector viewinjector, SelectPickUpStoreActivity selectpickupstoreactivity)
    {
        b = viewinjector;
        a = selectpickupstoreactivity;
        super();
    }

    public void doClick(View view)
    {
        a.loadZipCode();
    }
}
