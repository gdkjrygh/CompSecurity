// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.widget;

import android.database.DataSetObserver;

// Referenced classes of package android.support.v4.widget:
//            m

final class o extends DataSetObserver
{

    final m a;

    o(m m1)
    {
        a = m1;
        super();
    }

    public final void onChanged()
    {
        a.a = true;
        a.notifyDataSetChanged();
    }

    public final void onInvalidated()
    {
        a.a = false;
        a.notifyDataSetInvalidated();
    }
}
