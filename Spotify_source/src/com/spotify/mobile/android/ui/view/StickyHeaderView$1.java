// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.ui.view;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ListView;

// Referenced classes of package com.spotify.mobile.android.ui.view:
//            StickyHeaderView

final class a extends FrameLayout
{

    private StickyHeaderView a;

    protected final void dispatchDraw(Canvas canvas)
    {
        super.dispatchDraw(canvas);
        if (StickyHeaderView.a(a) && StickyHeaderView.b(a) == -1)
        {
            canvas = StickyHeaderView.c(a);
            do
            {
                if (canvas == null)
                {
                    break;
                }
                View view = (View)canvas.getParent();
                if (view == StickyHeaderView.d(a))
                {
                    break;
                }
                canvas = view;
            } while (true);
            if (canvas != null)
            {
                StickyHeaderView.a(a, StickyHeaderView.d(a).getPositionForView(canvas));
            }
        }
    }

    (StickyHeaderView stickyheaderview, Context context)
    {
        a = stickyheaderview;
        super(context);
    }
}
