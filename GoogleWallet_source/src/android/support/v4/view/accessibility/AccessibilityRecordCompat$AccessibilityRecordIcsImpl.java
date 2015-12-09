// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view.accessibility;

import android.view.View;

// Referenced classes of package android.support.v4.view.accessibility:
//            AccessibilityRecordCompat, AccessibilityRecordCompatIcs

static class  extends 
{

    public final Object obtain()
    {
        return AccessibilityRecordCompatIcs.obtain();
    }

    public final void setFromIndex(Object obj, int i)
    {
        AccessibilityRecordCompatIcs.setFromIndex(obj, i);
    }

    public final void setItemCount(Object obj, int i)
    {
        AccessibilityRecordCompatIcs.setItemCount(obj, i);
    }

    public final void setScrollable(Object obj, boolean flag)
    {
        AccessibilityRecordCompatIcs.setScrollable(obj, flag);
    }

    public final void setSource(Object obj, View view)
    {
        AccessibilityRecordCompatIcs.setSource(obj, view);
    }

    public final void setToIndex(Object obj, int i)
    {
        AccessibilityRecordCompatIcs.setToIndex(obj, i);
    }

    ()
    {
    }
}
