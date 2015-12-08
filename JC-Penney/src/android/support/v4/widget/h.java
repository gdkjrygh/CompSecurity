// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.widget;

import android.database.DataSetObserver;

// Referenced classes of package android.support.v4.widget:
//            e, f

class h extends DataSetObserver
{

    final e a;

    private h(e e1)
    {
        a = e1;
        super();
    }

    h(e e1, f f)
    {
        this(e1);
    }

    public void onChanged()
    {
        a.a = true;
        a.notifyDataSetChanged();
    }

    public void onInvalidated()
    {
        a.a = false;
        a.notifyDataSetInvalidated();
    }
}
