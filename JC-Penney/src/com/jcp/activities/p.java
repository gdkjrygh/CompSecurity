// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.activities;

import android.view.View;
import butterknife.internal.DebouncingOnClickListener;

// Referenced classes of package com.jcp.activities:
//            FutureDatePickerActivity

class p extends DebouncingOnClickListener
{

    final FutureDatePickerActivity a;
    final FutureDatePickerActivity..ViewInjector b;

    p(FutureDatePickerActivity..ViewInjector viewinjector, FutureDatePickerActivity futuredatepickeractivity)
    {
        b = viewinjector;
        a = futuredatepickeractivity;
        super();
    }

    public void doClick(View view)
    {
        a.onSet();
    }
}
