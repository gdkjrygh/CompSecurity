// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.chromium.content.browser.accessibility;

import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.util.List;

// Referenced classes of package org.chromium.content.browser.accessibility:
//            JellyBeanBrowserAccessibilityManager, BrowserAccessibilityManager

class val.delegate extends AccessibilityNodeProvider
{

    final JellyBeanBrowserAccessibilityManager this$0;
    final BrowserAccessibilityManager val$delegate;

    public AccessibilityNodeInfo createAccessibilityNodeInfo(int i)
    {
        return val$delegate.createAccessibilityNodeInfo(i);
    }

    public List findAccessibilityNodeInfosByText(String s, int i)
    {
        return val$delegate.findAccessibilityNodeInfosByText(s, i);
    }

    public boolean performAction(int i, int j, Bundle bundle)
    {
        return val$delegate.performAction(i, j, bundle);
    }

    ()
    {
        this$0 = final_jellybeanbrowseraccessibilitymanager;
        val$delegate = BrowserAccessibilityManager.this;
        super();
    }
}
