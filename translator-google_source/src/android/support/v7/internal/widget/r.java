// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.widget;

import android.support.v7.widget.ListPopupWindow;
import android.support.v7.widget.y;
import android.view.View;

// Referenced classes of package android.support.v7.internal.widget:
//            ActivityChooserView

final class r extends y
{

    final ActivityChooserView a;

    r(ActivityChooserView activitychooserview, View view)
    {
        a = activitychooserview;
        super(view);
    }

    public final ListPopupWindow a()
    {
        return ActivityChooserView.b(a);
    }

    protected final boolean b()
    {
        a.a();
        return true;
    }

    protected final boolean c()
    {
        a.b();
        return true;
    }
}
