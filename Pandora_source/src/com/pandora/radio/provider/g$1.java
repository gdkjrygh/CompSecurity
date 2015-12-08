// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.radio.provider;

import android.database.DataSetObserver;

// Referenced classes of package com.pandora.radio.provider:
//            g

class r extends DataSetObserver
{

    final g a;

    public void onChanged()
    {
        g.a(a, -1);
    }

    public void onInvalidated()
    {
        g.b(a, -1);
    }

    r(g g1)
    {
        a = g1;
        super();
    }
}
