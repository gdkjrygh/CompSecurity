// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.baselib.hlistview;

import android.database.DataSetObserver;
import android.os.Parcelable;
import android.widget.Adapter;

// Referenced classes of package com.roidapp.baselib.hlistview:
//            AdapterView

class r extends DataSetObserver
{

    private Parcelable a;
    final AdapterView b;

    r(AdapterView adapterview)
    {
        b = adapterview;
        super();
        a = null;
    }

    public void onChanged()
    {
        b.aj = true;
        b.ap = b.ao;
        b.ao = b.p().getCount();
        if (b.p().hasStableIds() && a != null && b.ap == 0 && b.ao > 0)
        {
            AdapterView.a(b, a);
            a = null;
        } else
        {
            b.y();
        }
        b.v();
        b.requestLayout();
    }

    public void onInvalidated()
    {
        b.aj = true;
        if (b.p().hasStableIds())
        {
            a = AdapterView.a(b);
        }
        b.ap = b.ao;
        b.ao = 0;
        b.am = -1;
        b.an = 0x8000000000000000L;
        b.ak = -1;
        b.al = 0x8000000000000000L;
        b.ad = false;
        b.v();
        b.requestLayout();
    }
}
