// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.widget;

import android.support.v4.view.bp;
import android.view.View;

// Referenced classes of package android.support.v4.widget:
//            al, SlidingPaneLayout

class am
    implements al
{

    am()
    {
    }

    public void a(SlidingPaneLayout slidingpanelayout, View view)
    {
        bp.a(slidingpanelayout, view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
    }
}
