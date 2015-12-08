// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.aviary.android.feather.sdk.widget;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import com.a.a.a.a.a;
import com.nineoldandroids.a.k;

// Referenced classes of package com.aviary.android.feather.sdk.widget:
//            IAPDialogList

class a extends a
{

    final IAPDialogList a;

    protected com.nineoldandroids.a.a a(ViewGroup viewgroup, View view)
    {
        return k.a(view, "translationY", new float[] {
            (float)(view.getHeight() / 2), 0.0F
        });
    }

    public (IAPDialogList iapdialoglist, BaseAdapter baseadapter)
    {
        a = iapdialoglist;
        super(baseadapter);
    }
}
