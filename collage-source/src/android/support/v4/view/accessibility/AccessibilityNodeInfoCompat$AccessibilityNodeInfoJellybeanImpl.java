// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view.accessibility;

import android.os.Bundle;
import android.view.View;

// Referenced classes of package android.support.v4.view.accessibility:
//            AccessibilityNodeInfoCompat, AccessibilityNodeInfoCompatJellyBean

static class  extends 
{

    public void addChild(Object obj, View view, int i)
    {
        AccessibilityNodeInfoCompatJellyBean.addChild(obj, view, i);
    }

    public Object findFocus(Object obj, int i)
    {
        return AccessibilityNodeInfoCompatJellyBean.findFocus(obj, i);
    }

    public Object focusSearch(Object obj, int i)
    {
        return AccessibilityNodeInfoCompatJellyBean.focusSearch(obj, i);
    }

    public int getMovementGranularities(Object obj)
    {
        return AccessibilityNodeInfoCompatJellyBean.getMovementGranularities(obj);
    }

    public boolean isAccessibilityFocused(Object obj)
    {
        return AccessibilityNodeInfoCompatJellyBean.isAccessibilityFocused(obj);
    }

    public boolean isVisibleToUser(Object obj)
    {
        return AccessibilityNodeInfoCompatJellyBean.isVisibleToUser(obj);
    }

    public Object obtain(View view, int i)
    {
        return AccessibilityNodeInfoCompatJellyBean.obtain(view, i);
    }

    public boolean performAction(Object obj, int i, Bundle bundle)
    {
        return AccessibilityNodeInfoCompatJellyBean.performAction(obj, i, bundle);
    }

    public void setAccessibilityFocused(Object obj, boolean flag)
    {
        AccessibilityNodeInfoCompatJellyBean.setAccesibilityFocused(obj, flag);
    }

    public void setMovementGranularities(Object obj, int i)
    {
        AccessibilityNodeInfoCompatJellyBean.setMovementGranularities(obj, i);
    }

    public void setParent(Object obj, View view, int i)
    {
        AccessibilityNodeInfoCompatJellyBean.setParent(obj, view, i);
    }

    public void setSource(Object obj, View view, int i)
    {
        AccessibilityNodeInfoCompatJellyBean.setSource(obj, view, i);
    }

    public void setVisibleToUser(Object obj, boolean flag)
    {
        AccessibilityNodeInfoCompatJellyBean.setVisibleToUser(obj, flag);
    }

    ()
    {
    }
}
