// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view;

import android.view.View;
import java.lang.reflect.Field;
import java.util.WeakHashMap;

// Referenced classes of package android.support.v4.view:
//            ViewCompat, ViewPropertyAnimatorCompat, AccessibilityDelegateCompat

static class  extends 
{

    static boolean accessibilityDelegateCheckFailed = false;
    static Field mAccessibilityDelegateField;

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
        return view.canScrollHorizontally(i);
    }

    public final boolean canScrollVertically(View view, int i)
    {
        return view.canScrollVertically(i);
    }

    public final boolean hasAccessibilityDelegate(View view)
    {
        if (!accessibilityDelegateCheckFailed)
        {
            if (mAccessibilityDelegateField == null)
            {
                try
                {
                    Field field = android/view/View.getDeclaredField("mAccessibilityDelegate");
                    mAccessibilityDelegateField = field;
                    field.setAccessible(true);
                }
                // Misplaced declaration of an exception variable
                catch (View view)
                {
                    accessibilityDelegateCheckFailed = true;
                    return false;
                }
            }
            try
            {
                view = ((View) (mAccessibilityDelegateField.get(view)));
            }
            // Misplaced declaration of an exception variable
            catch (View view)
            {
                accessibilityDelegateCheckFailed = true;
                return false;
            }
            if (view != null)
            {
                return true;
            }
        }
        return false;
    }

    public final void setAccessibilityDelegate(View view, AccessibilityDelegateCompat accessibilitydelegatecompat)
    {
        if (accessibilitydelegatecompat == null)
        {
            accessibilitydelegatecompat = null;
        } else
        {
            accessibilitydelegatecompat = ((AccessibilityDelegateCompat) (accessibilitydelegatecompat.mBridge));
        }
        view.setAccessibilityDelegate((android.view.)accessibilitydelegatecompat);
    }


    ()
    {
    }
}
