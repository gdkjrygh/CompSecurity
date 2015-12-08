// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.fragments;

import android.view.View;
import butterknife.internal.DebouncingOnClickListener;

// Referenced classes of package com.jcp.fragments:
//            LPOAddressFragment

class bq extends DebouncingOnClickListener
{

    final LPOAddressFragment a;
    final LPOAddressFragment..ViewInjector b;

    bq(LPOAddressFragment..ViewInjector viewinjector, LPOAddressFragment lpoaddressfragment)
    {
        b = viewinjector;
        a = lpoaddressfragment;
        super();
    }

    public void doClick(View view)
    {
        a.lineOneHintClick();
    }
}
