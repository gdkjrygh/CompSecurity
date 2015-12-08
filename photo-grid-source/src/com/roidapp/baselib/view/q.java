// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.baselib.view;

import android.content.Context;
import android.view.View;

// Referenced classes of package com.roidapp.baselib.view:
//            p

final class q extends View
{

    final p a;
    private View b;

    public q(p p, Context context)
    {
        a = p;
        super(context);
    }

    public final void a(View view)
    {
        b = view;
    }

    protected final void onMeasure(int i, int j)
    {
        super.onMeasure(i, android.view.View.MeasureSpec.makeMeasureSpec(b.getMeasuredHeight(), 0x40000000));
    }
}
