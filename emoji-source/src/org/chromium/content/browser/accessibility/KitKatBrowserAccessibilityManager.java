// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.chromium.content.browser.accessibility;

import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import org.chromium.content.browser.ContentViewCore;

// Referenced classes of package org.chromium.content.browser.accessibility:
//            JellyBeanBrowserAccessibilityManager

public class KitKatBrowserAccessibilityManager extends JellyBeanBrowserAccessibilityManager
{

    KitKatBrowserAccessibilityManager(long l, ContentViewCore contentviewcore)
    {
        super(l, contentviewcore);
    }

    protected void setAccessibilityEventCollectionInfo(AccessibilityEvent accessibilityevent, int i, int j, boolean flag)
    {
    }

    protected void setAccessibilityEventCollectionItemInfo(AccessibilityEvent accessibilityevent, int i, int j, int k, int l)
    {
    }

    protected void setAccessibilityEventHeadingFlag(AccessibilityEvent accessibilityevent, boolean flag)
    {
    }

    protected void setAccessibilityEventKitKatAttributes(AccessibilityEvent accessibilityevent, boolean flag, boolean flag1, boolean flag2, boolean flag3, int i, int j)
    {
    }

    protected void setAccessibilityEventRangeInfo(AccessibilityEvent accessibilityevent, int i, float f, float f1, float f2)
    {
    }

    protected void setAccessibilityNodeInfoCollectionInfo(AccessibilityNodeInfo accessibilitynodeinfo, int i, int j, boolean flag)
    {
        accessibilitynodeinfo.setCollectionInfo(android.view.accessibility.AccessibilityNodeInfo.CollectionInfo.obtain(i, j, flag));
    }

    protected void setAccessibilityNodeInfoCollectionItemInfo(AccessibilityNodeInfo accessibilitynodeinfo, int i, int j, int k, int l, boolean flag)
    {
        accessibilitynodeinfo.setCollectionItemInfo(android.view.accessibility.AccessibilityNodeInfo.CollectionItemInfo.obtain(i, j, k, l, flag));
    }

    protected void setAccessibilityNodeInfoKitKatAttributes(AccessibilityNodeInfo accessibilitynodeinfo, boolean flag, boolean flag1, boolean flag2, boolean flag3, int i, int j)
    {
        accessibilitynodeinfo.setCanOpenPopup(flag);
        accessibilitynodeinfo.setContentInvalid(flag1);
        accessibilitynodeinfo.setDismissable(flag1);
        accessibilitynodeinfo.setMultiLine(flag3);
        accessibilitynodeinfo.setInputType(i);
        accessibilitynodeinfo.setLiveRegion(j);
    }

    protected void setAccessibilityNodeInfoRangeInfo(AccessibilityNodeInfo accessibilitynodeinfo, int i, float f, float f1, float f2)
    {
        accessibilitynodeinfo.setRangeInfo(android.view.accessibility.AccessibilityNodeInfo.RangeInfo.obtain(i, f, f1, f2));
    }
}
