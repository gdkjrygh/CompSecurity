// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.baselib.hlistview;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.TransitionDrawable;
import android.view.View;
import android.view.ViewConfiguration;

// Referenced classes of package com.roidapp.baselib.hlistview:
//            AbsHListView, e

final class f
    implements Runnable
{

    final AbsHListView a;

    f(AbsHListView abshlistview)
    {
        a = abshlistview;
        super();
    }

    public final void run()
    {
label0:
        {
label1:
            {
                if (a.F == 0)
                {
                    a.F = 1;
                    View view = a.getChildAt(a.A - a.V);
                    if (view != null && !view.hasFocusable())
                    {
                        a.h = 0;
                        if (a.aj)
                        {
                            break label0;
                        }
                        view.setPressed(true);
                        a.setPressed(true);
                        a.d();
                        a.a(a.A, view);
                        a.refreshDrawableState();
                        int i = ViewConfiguration.getLongPressTimeout();
                        boolean flag = a.isLongClickable();
                        if (a.m != null)
                        {
                            Drawable drawable = a.m.getCurrent();
                            if (drawable != null && (drawable instanceof TransitionDrawable))
                            {
                                if (flag)
                                {
                                    ((TransitionDrawable)drawable).startTransition(i);
                                } else
                                {
                                    ((TransitionDrawable)drawable).resetTransition();
                                }
                            }
                        }
                        if (!flag)
                        {
                            break label1;
                        }
                        if (AbsHListView.c(a) == null)
                        {
                            AbsHListView.a(a, new e(a, (byte)0));
                        }
                        AbsHListView.c(a).a();
                        a.postDelayed(AbsHListView.c(a), i);
                    }
                }
                return;
            }
            a.F = 2;
            return;
        }
        a.F = 2;
    }
}
