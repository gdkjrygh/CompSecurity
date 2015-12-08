// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.widget;

import android.os.Bundle;
import android.support.v4.view.accessibility.AccessibilityNodeInfoCompat;
import android.support.v4.view.accessibility.AccessibilityNodeProviderCompat;

// Referenced classes of package android.support.v4.widget:
//            ExploreByTouchHelper

private class <init> extends AccessibilityNodeProviderCompat
{

    final ExploreByTouchHelper this$0;

    public AccessibilityNodeInfoCompat createAccessibilityNodeInfo(int i)
    {
        return ExploreByTouchHelper.access$100(ExploreByTouchHelper.this, i);
    }

    public boolean performAction(int i, int j, Bundle bundle)
    {
        return ExploreByTouchHelper.access$200(ExploreByTouchHelper.this, i, j, bundle);
    }

    private ()
    {
        this$0 = ExploreByTouchHelper.this;
        super();
    }

    t>(t> t>)
    {
        this();
    }
}
