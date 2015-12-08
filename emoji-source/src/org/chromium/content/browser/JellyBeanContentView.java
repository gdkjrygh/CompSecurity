// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.chromium.content.browser;

import android.content.Context;
import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeProvider;

// Referenced classes of package org.chromium.content.browser:
//            ContentView, ContentViewCore

class JellyBeanContentView extends ContentView
{

    JellyBeanContentView(Context context, ContentViewCore contentviewcore)
    {
        super(context, contentviewcore);
    }

    public AccessibilityNodeProvider getAccessibilityNodeProvider()
    {
        AccessibilityNodeProvider accessibilitynodeprovider = mContentViewCore.getAccessibilityNodeProvider();
        if (accessibilitynodeprovider != null)
        {
            return accessibilitynodeprovider;
        } else
        {
            return super.getAccessibilityNodeProvider();
        }
    }

    public boolean performAccessibilityAction(int i, Bundle bundle)
    {
        if (mContentViewCore.supportsAccessibilityAction(i))
        {
            return mContentViewCore.performAccessibilityAction(i, bundle);
        } else
        {
            return super.performAccessibilityAction(i, bundle);
        }
    }
}
