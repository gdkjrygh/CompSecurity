// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.fragments;

import android.view.View;
import butterknife.internal.DebouncingOnClickListener;

// Referenced classes of package com.jcp.fragments:
//            FindStoreDetailsFragment

class an extends DebouncingOnClickListener
{

    final FindStoreDetailsFragment a;
    final FindStoreDetailsFragment..ViewInjector b;

    an(FindStoreDetailsFragment..ViewInjector viewinjector, FindStoreDetailsFragment findstoredetailsfragment)
    {
        b = viewinjector;
        a = findstoredetailsfragment;
        super();
    }

    public void doClick(View view)
    {
        a.toggleButtonClick();
    }
}
