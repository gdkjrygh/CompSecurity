// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.baselib.view;

import android.support.v4.view.AccessibilityDelegateCompat;
import android.support.v4.view.accessibility.AccessibilityNodeInfoCompat;
import android.view.View;

// Referenced classes of package com.roidapp.baselib.view:
//            FixedDrawerLayout

final class i extends AccessibilityDelegateCompat
{

    final FixedDrawerLayout a;

    i(FixedDrawerLayout fixeddrawerlayout)
    {
        a = fixeddrawerlayout;
        super();
    }

    public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfoCompat accessibilitynodeinfocompat)
    {
        super.onInitializeAccessibilityNodeInfo(view, accessibilitynodeinfocompat);
        if (!FixedDrawerLayout.h(view))
        {
            accessibilitynodeinfocompat.setParent(null);
        }
    }
}
