// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.ui.view;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;

// Referenced classes of package com.spotify.mobile.android.ui.view:
//            FilterHeaderView

final class b
    implements android.view.r
{

    private TextView a;
    private FilterHeaderView b;

    public final boolean onTouch(View view, MotionEvent motionevent)
    {
        if (motionevent.getAction() == 0 && a.isFocused())
        {
            view = new Rect();
            a.getGlobalVisibleRect(view);
            if (!view.contains((int)motionevent.getRawX(), (int)motionevent.getRawY()))
            {
                b.a();
            }
        }
        return false;
    }

    (TextView textview, FilterHeaderView filterheaderview)
    {
        a = textview;
        b = filterheaderview;
        super();
    }
}
