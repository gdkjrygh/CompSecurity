// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.widget;

import android.support.v7.widget.ListPopupWindow;

// Referenced classes of package android.support.v7.internal.widget:
//            ActivityChooserView

final class a
    implements android.view.balLayoutListener
{

    private ActivityChooserView a;

    public final void onGlobalLayout()
    {
label0:
        {
            if (a.c())
            {
                if (a.isShown())
                {
                    break label0;
                }
                ActivityChooserView.b(a).dismiss();
            }
            return;
        }
        ActivityChooserView.b(a).b();
    }

    (ActivityChooserView activitychooserview)
    {
        a = activitychooserview;
        super();
    }
}
