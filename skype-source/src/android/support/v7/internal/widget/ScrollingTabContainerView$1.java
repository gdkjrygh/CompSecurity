// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.widget;

import android.view.View;

// Referenced classes of package android.support.v7.internal.widget:
//            ScrollingTabContainerView

final class a
    implements Runnable
{

    final View a;
    final ScrollingTabContainerView b;

    public final void run()
    {
        int i = a.getLeft();
        int j = (b.getWidth() - a.getWidth()) / 2;
        b.smoothScrollTo(i - j, 0);
        b.a = null;
    }

    (ScrollingTabContainerView scrollingtabcontainerview, View view)
    {
        b = scrollingtabcontainerview;
        a = view;
        super();
    }
}
