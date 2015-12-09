// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.ui.view;

import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;

// Referenced classes of package com.spotify.mobile.android.ui.view:
//            FilterHeaderView

final class a
    implements android.view.r
{

    private FilterHeaderView a;

    public final boolean onTouch(View view, MotionEvent motionevent)
    {
        if (motionevent.getAction() == 1)
        {
            view = FilterHeaderView.e(a).getCompoundDrawables()[2];
            if (view != null && motionevent.getX() >= (float)(FilterHeaderView.e(a).getWidth() - FilterHeaderView.e(a).getPaddingRight() - FilterHeaderView.e(a).getCompoundPaddingRight() - view.getBounds().width()))
            {
                FilterHeaderView.e(a).setText("");
                a.a();
                FilterHeaderView.e(a).clearFocus();
            }
        }
        return false;
    }

    (FilterHeaderView filterheaderview)
    {
        a = filterheaderview;
        super();
    }
}
