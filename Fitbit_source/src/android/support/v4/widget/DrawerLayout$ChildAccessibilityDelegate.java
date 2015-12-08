// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.widget;

import android.support.v4.view.AccessibilityDelegateCompat;
import android.support.v4.view.accessibility.AccessibilityNodeInfoCompat;
import android.view.View;

// Referenced classes of package android.support.v4.widget:
//            DrawerLayout

final class this._cls0 extends AccessibilityDelegateCompat
{

    final DrawerLayout this$0;

    public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfoCompat accessibilitynodeinfocompat)
    {
        super.onInitializeAccessibilityNodeInfo(view, accessibilitynodeinfocompat);
        if (!DrawerLayout.access$400(view))
        {
            accessibilitynodeinfocompat.setParent(null);
        }
    }

    ()
    {
        this$0 = DrawerLayout.this;
        super();
    }
}
