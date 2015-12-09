// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view.accessibility;

import android.os.Bundle;
import java.util.List;

// Referenced classes of package android.support.v4.view.accessibility:
//            AccessibilityNodeInfoCompat

public class AccessibilityNodeProviderCompat
{

    private static final AccessibilityNodeProviderImpl IMPL;
    private final Object mProvider;

    public AccessibilityNodeProviderCompat()
    {
    /* block-local class not found */
    class AccessibilityNodeProviderImpl {}

        mProvider = IMPL.newAccessibilityNodeProviderBridge(this);
    }

    public AccessibilityNodeProviderCompat(Object obj)
    {
        mProvider = obj;
    }

    public AccessibilityNodeInfoCompat createAccessibilityNodeInfo(int i)
    {
        return null;
    }

    public List findAccessibilityNodeInfosByText(String s, int i)
    {
        return null;
    }

    public AccessibilityNodeInfoCompat findFocus(int i)
    {
        return null;
    }

    public Object getProvider()
    {
        return mProvider;
    }

    public boolean performAction(int i, int j, Bundle bundle)
    {
        return false;
    }

    static 
    {
    /* block-local class not found */
    class AccessibilityNodeProviderJellyBeanImpl {}

    /* block-local class not found */
    class AccessibilityNodeProviderKitKatImpl {}

    /* block-local class not found */
    class AccessibilityNodeProviderStubImpl {}

        if (android.os.Build.VERSION.SDK_INT >= 19)
        {
            IMPL = new AccessibilityNodeProviderKitKatImpl();
        } else
        if (android.os.Build.VERSION.SDK_INT >= 16)
        {
            IMPL = new AccessibilityNodeProviderJellyBeanImpl();
        } else
        {
            IMPL = new AccessibilityNodeProviderStubImpl();
        }
    }
}
