// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view.accessibility;


// Referenced classes of package android.support.v4.view.accessibility:
//            AccessibilityNodeInfoCompat, AccessibilityNodeInfoCompatJellyBean

static class  extends 
{

    public boolean isAccessibilityFocused(Object obj)
    {
        return AccessibilityNodeInfoCompatJellyBean.isAccessibilityFocused(obj);
    }

    public boolean isVisibleToUser(Object obj)
    {
        return AccessibilityNodeInfoCompatJellyBean.isVisibleToUser(obj);
    }

    public void setAccessibilityFocused(Object obj, boolean flag)
    {
        AccessibilityNodeInfoCompatJellyBean.setAccesibilityFocused(obj, flag);
    }

    public void setVisibleToUser(Object obj, boolean flag)
    {
        AccessibilityNodeInfoCompatJellyBean.setVisibleToUser(obj, flag);
    }

    ()
    {
    }
}
