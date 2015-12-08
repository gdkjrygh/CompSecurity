// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.taplytics;

import android.view.View;
import android.view.ViewGroup;

// Referenced classes of package com.taplytics:
//            hk

public final class bh
    implements android.widget.AbsListView.RecyclerListener
{

    android.widget.AbsListView.RecyclerListener a;

    public bh(android.widget.AbsListView.RecyclerListener recyclerlistener)
    {
        a = recyclerlistener;
    }

    public final void onMovedToScrapHeap(View view)
    {
        if (view != null && (view instanceof ViewGroup))
        {
            hk.d((ViewGroup)view);
        }
        if (a != null)
        {
            a.onMovedToScrapHeap(view);
        }
    }
}
