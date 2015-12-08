// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.widget;

import android.support.v4.view.AccessibilityDelegateCompat;
import android.support.v4.view.accessibility.AccessibilityNodeInfoCompat;
import android.view.View;

// Referenced classes of package android.support.v4.widget:
//            DrawerLayout

final class b extends AccessibilityDelegateCompat
{

    final DrawerLayout b;

    public void a(View view, AccessibilityNodeInfoCompat accessibilitynodeinfocompat)
    {
        super.a(view, accessibilitynodeinfocompat);
        if (!DrawerLayout.l(view))
        {
            accessibilitynodeinfocompat.c(null);
        }
    }

    (DrawerLayout drawerlayout)
    {
        b = drawerlayout;
        super();
    }
}
