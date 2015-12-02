// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.actionbarsherlock.internal.a;

import android.database.DataSetObserver;

// Referenced classes of package com.actionbarsherlock.internal.a:
//            a, b

class e extends DataSetObserver
{

    final a a;

    private e(a a1)
    {
        a = a1;
        super();
    }

    e(a a1, b b)
    {
        this(a1);
    }

    public void onChanged()
    {
        if (a.d())
        {
            a.a();
        }
    }

    public void onInvalidated()
    {
        a.b();
    }
}
