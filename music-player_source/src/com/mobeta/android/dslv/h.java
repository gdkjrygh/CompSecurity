// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mobeta.android.dslv;

import android.database.DataSetObserver;

// Referenced classes of package com.mobeta.android.dslv:
//            g

final class h extends DataSetObserver
{

    final g a;

    h(g g1)
    {
        a = g1;
        super();
    }

    public final void onChanged()
    {
        a.notifyDataSetChanged();
    }

    public final void onInvalidated()
    {
        a.notifyDataSetInvalidated();
    }
}
