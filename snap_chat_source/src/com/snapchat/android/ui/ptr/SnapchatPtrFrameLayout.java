// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.ui.ptr;

import android.content.Context;
import android.graphics.drawable.AnimationDrawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import in.srain.cube.views.ptr.PtrFrameLayout;

// Referenced classes of package com.snapchat.android.ui.ptr:
//            DancingGhostPtrHeader

public class SnapchatPtrFrameLayout extends PtrFrameLayout
{

    public boolean a;
    private final DancingGhostPtrHeader e;

    public SnapchatPtrFrameLayout(Context context)
    {
        this(context, null, 0);
    }

    public SnapchatPtrFrameLayout(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public SnapchatPtrFrameLayout(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        a = false;
        setResistance(1.7F);
        setRatioOfHeaderHeightToRefresh(1.2F);
        setDurationToClose(300);
        setDurationToCloseHeader(600);
        setKeepHeaderWhenRefresh(true);
        super.d = true;
        e = new DancingGhostPtrHeader(context);
        setHeaderView(e);
        a(e);
    }

    public final boolean a()
    {
        DancingGhostPtrHeader dancingghostptrheader = e;
        return dancingghostptrheader.a != null && dancingghostptrheader.a.isRunning();
    }

    public final boolean b()
    {
        return e.getHeight() + e.getTop() > 0;
    }

    public boolean dispatchTouchEvent(MotionEvent motionevent)
    {
        int i = motionevent.getActionMasked();
        boolean flag;
        if (i == 0 || i == 2)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a = flag;
        return super.dispatchTouchEvent(motionevent);
    }
}
