// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.settings;

import android.view.View;
import butterknife.internal.DebouncingOnClickListener;

// Referenced classes of package me.lyft.android.ui.settings:
//            CarView

class > extends DebouncingOnClickListener
{

    final nceClicked this$0;
    final CarView val$target;

    public void doClick(View view)
    {
        val$target.onPersonalInsuranceClicked();
    }

    _cls9()
    {
        this$0 = final__pcls9;
        val$target = CarView.this;
        super();
    }
}
