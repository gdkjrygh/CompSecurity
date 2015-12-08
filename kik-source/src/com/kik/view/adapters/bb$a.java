// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kik.view.adapters;

import android.database.DataSetObserver;

// Referenced classes of package com.kik.view.adapters:
//            bb

final class erver extends DataSetObserver
{

    final bb a;

    public final void onChanged()
    {
        super.onChanged();
        a.notifyDataSetChanged();
    }

    erver(bb bb1)
    {
        a = bb1;
        super();
    }
}
