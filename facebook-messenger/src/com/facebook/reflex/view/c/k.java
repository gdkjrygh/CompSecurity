// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.reflex.view.c;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewParent;
import com.facebook.reflex.view.ContainerView;

// Referenced classes of package com.facebook.reflex.view.c:
//            t, j

class k extends ContainerView
    implements t
{

    final j a;
    private boolean c;

    public k(j j, Context context)
    {
        a = j;
        super(context);
        c = true;
    }

    public View a()
    {
        return getChildAt(0);
    }

    public void a(View view)
    {
        if (view != getChildAt(0))
        {
            removeAllViewsInLayout();
            addViewInLayout(view, 0, view.getLayoutParams());
            setLayoutParams(view.getLayoutParams());
        }
    }

    public void e()
    {
        if (c)
        {
            c = false;
            super.e();
        }
    }

    public void invalidate()
    {
        c = true;
        super.invalidate();
    }

    public void invalidate(int i, int j, int l, int i1)
    {
        c = true;
        super.invalidate(i, j, l, i1);
    }

    public void invalidate(Rect rect)
    {
        c = true;
        super.invalidate(rect);
    }

    public ViewParent invalidateChildInParent(int ai[], Rect rect)
    {
        c = true;
        return super.invalidateChildInParent(ai, rect);
    }

    protected void onLayout(boolean flag, int i, int j, int l, int i1)
    {
        c = true;
        super.onLayout(flag, i, j, l, i1);
    }
}
