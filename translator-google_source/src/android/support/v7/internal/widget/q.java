// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.widget;

import android.support.v4.view.n;
import android.support.v7.widget.ListPopupWindow;

// Referenced classes of package android.support.v7.internal.widget:
//            ActivityChooserView

final class q
    implements android.view.ViewTreeObserver.OnGlobalLayoutListener
{

    final ActivityChooserView a;

    q(ActivityChooserView activitychooserview)
    {
        a = activitychooserview;
        super();
    }

    public final void onGlobalLayout()
    {
        if (a.c())
        {
            if (!a.isShown())
            {
                ActivityChooserView.b(a).d();
            } else
            {
                ActivityChooserView.b(a).b();
                if (a.a != null)
                {
                    a.a.a(true);
                    return;
                }
            }
        }
    }
}
