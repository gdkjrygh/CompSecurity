// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view;

import android.view.View;
import java.util.WeakHashMap;

// Referenced classes of package android.support.v4.view:
//            ViewCompat, ViewPropertyAnimatorCompat, ViewCompatICS, AccessibilityDelegateCompat

static class  extends 
{

    static boolean accessibilityDelegateCheckFailed = false;

    public final ViewPropertyAnimatorCompat animate(View view)
    {
        if (mViewPropertyAnimatorCompatMap == null)
        {
            mViewPropertyAnimatorCompatMap = new WeakHashMap();
        }
        ViewPropertyAnimatorCompat viewpropertyanimatorcompat1 = (ViewPropertyAnimatorCompat)mViewPropertyAnimatorCompatMap.get(view);
        ViewPropertyAnimatorCompat viewpropertyanimatorcompat = viewpropertyanimatorcompat1;
        if (viewpropertyanimatorcompat1 == null)
        {
            viewpropertyanimatorcompat = new ViewPropertyAnimatorCompat(view);
            mViewPropertyAnimatorCompatMap.put(view, viewpropertyanimatorcompat);
        }
        return viewpropertyanimatorcompat;
    }

    public final boolean canScrollHorizontally(View view, int i)
    {
        return ViewCompatICS.canScrollHorizontally(view, i);
    }

    public final boolean canScrollVertically(View view, int i)
    {
        return ViewCompatICS.canScrollVertically(view, i);
    }

    public final void setAccessibilityDelegate(View view, AccessibilityDelegateCompat accessibilitydelegatecompat)
    {
        ViewCompatICS.setAccessibilityDelegate(view, accessibilitydelegatecompat.getBridge());
    }


    ()
    {
    }
}
