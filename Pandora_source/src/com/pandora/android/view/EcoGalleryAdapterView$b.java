// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.android.view;

import android.database.DataSetObserver;
import android.os.Parcelable;
import android.widget.Adapter;

// Referenced classes of package com.pandora.android.view:
//            EcoGalleryAdapterView

class b extends DataSetObserver
{

    final EcoGalleryAdapterView a;
    private Parcelable b;

    public void onChanged()
    {
        a.v = true;
        a.B = a.A;
        a.A = a.getAdapter().getCount();
        if (a.getAdapter().hasStableIds() && b != null && a.B == 0 && a.A > 0)
        {
            EcoGalleryAdapterView.a(a, b);
            b = null;
        } else
        {
            a.m();
        }
        a.j();
        a.requestLayout();
    }

    public void onInvalidated()
    {
        a.v = true;
        if (a.getAdapter().hasStableIds())
        {
            b = EcoGalleryAdapterView.a(a);
        }
        a.B = a.A;
        a.A = 0;
        a.y = -1;
        a.z = 0x8000000000000000L;
        a.setSelectedItemPosition(-1);
        a.x = 0x8000000000000000L;
        a.p = false;
        a.j();
        a.requestLayout();
    }

    (EcoGalleryAdapterView ecogalleryadapterview)
    {
        a = ecogalleryadapterview;
        super();
        b = null;
    }
}
