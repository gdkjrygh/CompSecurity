// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.widgets.swatchpicker;

import android.content.Context;
import android.widget.ImageView;

// Referenced classes of package com.google.android.apps.wallet.widgets.swatchpicker:
//            SwatchPicker

final class this._cls0 extends ImageView
{

    final SwatchPicker this$0;

    protected final void onMeasure(int i, int j)
    {
        i = android.view.c.getSize(i);
        setMeasuredDimension(i, i);
    }

    (Context context)
    {
        this$0 = SwatchPicker.this;
        super(context);
    }
}
