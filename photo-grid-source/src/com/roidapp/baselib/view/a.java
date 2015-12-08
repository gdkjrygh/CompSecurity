// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.baselib.view;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.os.Vibrator;

// Referenced classes of package com.roidapp.baselib.view:
//            DraggableGridView

final class a
    implements Runnable
{

    final DraggableGridView a;

    a(DraggableGridView draggablegridview)
    {
        a = draggablegridview;
        super();
    }

    public final void run()
    {
        if (!DraggableGridView.a(a) && a.getContext() != null && !((Activity)a.getContext()).isFinishing())
        {
            DraggableGridView.b(a);
            DraggableGridView.c(a).vibrate(50L);
            a.getSelector().setState(new int[] {
                0
            });
            a.invalidate();
            DraggableGridView.d(a);
        }
    }
}
