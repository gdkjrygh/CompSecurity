// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view.accessibility;

import android.view.View;
import android.view.accessibility.AccessibilityRecord;

// Referenced classes of package android.support.v4.view.accessibility:
//            AccessibilityRecordCompat

static class  extends 
{

    public final int getItemCount(Object obj)
    {
        return ((AccessibilityRecord)obj).getItemCount();
    }

    public final Object obtain()
    {
        return AccessibilityRecord.obtain();
    }

    public final void setFromIndex(Object obj, int i)
    {
        ((AccessibilityRecord)obj).setFromIndex(i);
    }

    public final void setItemCount(Object obj, int i)
    {
        ((AccessibilityRecord)obj).setItemCount(i);
    }

    public final void setScrollX(Object obj, int i)
    {
        ((AccessibilityRecord)obj).setScrollX(i);
    }

    public final void setScrollY(Object obj, int i)
    {
        ((AccessibilityRecord)obj).setScrollY(i);
    }

    public final void setScrollable(Object obj, boolean flag)
    {
        ((AccessibilityRecord)obj).setScrollable(flag);
    }

    public final void setSource(Object obj, View view)
    {
        ((AccessibilityRecord)obj).setSource(view);
    }

    public final void setToIndex(Object obj, int i)
    {
        ((AccessibilityRecord)obj).setToIndex(i);
    }

    ()
    {
    }
}
