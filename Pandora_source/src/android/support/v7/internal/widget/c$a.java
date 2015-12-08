// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.widget;

import android.database.DataSetObserver;
import android.os.Parcelable;
import android.widget.Adapter;

// Referenced classes of package android.support.v7.internal.widget:
//            c

class b extends DataSetObserver
{

    final c a;
    private Parcelable b;

    public void onChanged()
    {
        a.u = true;
        a.A = a.z;
        a.z = a.e().getCount();
        if (a.e().hasStableIds() && b != null && a.A == 0 && a.z > 0)
        {
            c.a(a, b);
            b = null;
        } else
        {
            a.n();
        }
        a.i();
        a.requestLayout();
    }

    public void onInvalidated()
    {
        a.u = true;
        if (a.e().hasStableIds())
        {
            b = c.a(a);
        }
        a.A = a.z;
        a.z = 0;
        a.x = -1;
        a.y = 0x8000000000000000L;
        a.v = -1;
        a.w = 0x8000000000000000L;
        a.p = false;
        a.i();
        a.requestLayout();
    }

    (c c1)
    {
        a = c1;
        super();
        b = null;
    }
}
