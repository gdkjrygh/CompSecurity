// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.widget;

import android.support.v4.view.bt;
import android.view.View;
import java.util.ArrayList;

// Referenced classes of package android.support.v4.widget:
//            SlidingPaneLayout

final class bl
    implements Runnable
{

    final View a;
    final SlidingPaneLayout b;

    bl(SlidingPaneLayout slidingpanelayout, View view)
    {
        b = slidingpanelayout;
        super();
        a = view;
    }

    public final void run()
    {
        if (a.getParent() == b)
        {
            bt.a(a, 0, null);
            SlidingPaneLayout.a(b, a);
        }
        SlidingPaneLayout.g(b).remove(this);
    }
}
