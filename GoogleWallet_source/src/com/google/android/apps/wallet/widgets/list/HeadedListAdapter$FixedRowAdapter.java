// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.widgets.list;

import android.widget.ListAdapter;

// Referenced classes of package com.google.android.apps.wallet.widgets.list:
//            SingleRowAdapter, HeadedListAdapter

final class <init> extends SingleRowAdapter
{

    private ity mVisibility;
    final HeadedListAdapter this$0;

    public final boolean isVisible()
    {
        if (getView() != null) goto _L2; else goto _L1
_L1:
        return false;
_L2:
        switch (.google.android.apps.wallet.widgets.list.HeadedListAdapter.FixedViewVisibility[mVisibility.ordinal()])
        {
        default:
            throw new AssertionError("unexpected");

        case 2: // '\002'
            break;

        case 3: // '\003'
            break; /* Loop/switch isn't completed */

        case 1: // '\001'
            return true;
        }
        if (true) goto _L1; else goto _L3
_L3:
        if (mAdapter.isEmpty()) goto _L1; else goto _L4
_L4:
        return true;
    }

    public final void setVisibility(ity ity)
    {
        if (mVisibility != ity)
        {
            mVisibility = ity;
            notifyDataSetChanged();
        }
    }

    private ity()
    {
        this$0 = HeadedListAdapter.this;
        super();
        mVisibility = ity.VISIBLE;
    }

    ity.VISIBLE(ity.VISIBLE visible)
    {
        this();
    }
}
