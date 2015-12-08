// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.aviary.android.feather.sdk.widget;

import android.database.DataSetObserver;
import android.os.Parcelable;
import android.widget.Adapter;

// Referenced classes of package com.aviary.android.feather.sdk.widget:
//            AviaryAdapterView

class b extends DataSetObserver
{

    final AviaryAdapterView a;
    private Parcelable b;

    public void onChanged()
    {
        a.A = true;
        a.G = a.F;
        a.F = a.getAdapter().getCount();
        if (a.getAdapter().hasStableIds() && b != null && a.G == 0 && a.F > 0)
        {
            AviaryAdapterView.a(a, b);
            b = null;
        } else
        {
            a.j();
        }
        a.e();
        a.requestLayout();
    }

    public void onInvalidated()
    {
        a.A = true;
        if (a.getAdapter().hasStableIds())
        {
            b = AviaryAdapterView.a(a);
        }
        a.G = a.F;
        a.F = 0;
        a.D = -1;
        a.E = 0x8000000000000000L;
        a.B = -1;
        a.C = 0x8000000000000000L;
        a.u = false;
        a.e();
        a.requestLayout();
    }

    (AviaryAdapterView aviaryadapterview)
    {
        a = aviaryadapterview;
        super();
        b = null;
    }
}
