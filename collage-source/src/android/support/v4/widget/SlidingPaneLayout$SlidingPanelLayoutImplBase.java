// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.widget;

import android.support.v4.view.ViewCompat;
import android.view.View;

// Referenced classes of package android.support.v4.widget:
//            SlidingPaneLayout

static class 
    implements 
{

    public void invalidateChildRegion(SlidingPaneLayout slidingpanelayout, View view)
    {
        ViewCompat.postInvalidateOnAnimation(slidingpanelayout, view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
    }

    ()
    {
    }
}
