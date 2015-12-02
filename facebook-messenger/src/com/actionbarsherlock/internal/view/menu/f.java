// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.actionbarsherlock.internal.view.menu;

import android.database.DataSetObserver;

// Referenced classes of package com.actionbarsherlock.internal.view.menu:
//            d, g, e

class f extends DataSetObserver
{

    final d a;

    private f(d d1)
    {
        a = d1;
        super();
    }

    f(d d1, e e)
    {
        this(d1);
    }

    public void onChanged()
    {
        d.d(a).a();
    }
}
