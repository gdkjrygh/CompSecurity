// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.widget;

import android.database.DataSetObserver;
import android.os.Parcelable;
import android.widget.Adapter;

// Referenced classes of package android.support.v7.internal.widget:
//            u

final class v extends DataSetObserver
{

    final u a;
    private Parcelable b;

    v(u u1)
    {
        a = u1;
        super();
        b = null;
    }

    public final void onChanged()
    {
        a.t = true;
        a.z = a.y;
        a.y = a.c().getCount();
        if (a.c().hasStableIds() && b != null && a.z == 0 && a.y > 0)
        {
            u.a(a, b);
            b = null;
        } else
        {
            a.g();
        }
        a.d();
        a.requestLayout();
    }

    public final void onInvalidated()
    {
        a.t = true;
        if (a.c().hasStableIds())
        {
            b = u.a(a);
        }
        a.z = a.y;
        a.y = 0;
        a.w = -1;
        a.x = 0x8000000000000000L;
        a.u = -1;
        a.v = 0x8000000000000000L;
        a.o = false;
        a.d();
        a.requestLayout();
    }
}
