// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.android.view;

import android.util.SparseArray;
import android.view.View;

// Referenced classes of package com.pandora.android.view:
//            EcoGalleryAbsSpinner

class b
{

    final EcoGalleryAbsSpinner a;
    private SparseArray b;

    public View a()
    {
        View view;
        if (b.size() < 1)
        {
            view = null;
        } else
        {
            View view1 = (View)b.valueAt(0);
            int i = b.keyAt(0);
            view = view1;
            if (view1 != null)
            {
                b.delete(i);
                return view1;
            }
        }
        return view;
    }

    public void a(int i, View view)
    {
        b.put(i, view);
    }

    public void b(int i, View view)
    {
        b.put(b.size(), view);
    }

    (EcoGalleryAbsSpinner ecogalleryabsspinner)
    {
        a = ecogalleryabsspinner;
        super();
        b = new SparseArray();
    }
}
