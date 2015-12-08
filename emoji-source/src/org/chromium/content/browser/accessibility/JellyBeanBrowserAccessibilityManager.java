// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.chromium.content.browser.accessibility;

import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.util.List;
import org.chromium.content.browser.ContentViewCore;

// Referenced classes of package org.chromium.content.browser.accessibility:
//            BrowserAccessibilityManager

public class JellyBeanBrowserAccessibilityManager extends BrowserAccessibilityManager
{

    private AccessibilityNodeProvider mAccessibilityNodeProvider;

    JellyBeanBrowserAccessibilityManager(long l, ContentViewCore contentviewcore)
    {
        super(l, contentviewcore);
        mAccessibilityNodeProvider = new AccessibilityNodeProvider() {

            final JellyBeanBrowserAccessibilityManager this$0;
            final BrowserAccessibilityManager val$delegate;

            public AccessibilityNodeInfo createAccessibilityNodeInfo(int i)
            {
                return delegate.createAccessibilityNodeInfo(i);
            }

            public List findAccessibilityNodeInfosByText(String s, int i)
            {
                return delegate.findAccessibilityNodeInfosByText(s, i);
            }

            public boolean performAction(int i, int j, Bundle bundle)
            {
                return delegate.performAction(i, j, bundle);
            }

            
            {
                this$0 = JellyBeanBrowserAccessibilityManager.this;
                delegate = browseraccessibilitymanager;
                super();
            }
        };
    }

    public AccessibilityNodeProvider getAccessibilityNodeProvider()
    {
        return mAccessibilityNodeProvider;
    }
}
