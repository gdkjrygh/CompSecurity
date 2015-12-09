// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.fragments;

import android.view.View;

// Referenced classes of package com.jcp.fragments:
//            el

class ep
    implements android.widget.AbsListView.RecyclerListener
{

    final el a;

    ep(el el1)
    {
        a = el1;
        super();
    }

    public void onMovedToScrapHeap(View view)
    {
        el.e(a);
    }
}
