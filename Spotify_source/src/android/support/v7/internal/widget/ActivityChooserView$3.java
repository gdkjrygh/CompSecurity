// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.widget;

import aak;
import android.support.v7.widget.ListPopupWindow;
import android.view.View;

// Referenced classes of package android.support.v7.internal.widget:
//            ActivityChooserView

final class a extends aak
{

    private ActivityChooserView a;

    public final ListPopupWindow a()
    {
        return ActivityChooserView.b(a);
    }

    protected final boolean b()
    {
        ActivityChooserView activitychooserview = a;
        if (!activitychooserview.c() && activitychooserview.b)
        {
            activitychooserview.a = false;
            ActivityChooserView.a();
        }
        return true;
    }

    protected final boolean c()
    {
        a.b();
        return true;
    }

    (ActivityChooserView activitychooserview, View view)
    {
        a = activitychooserview;
        super(view);
    }
}
