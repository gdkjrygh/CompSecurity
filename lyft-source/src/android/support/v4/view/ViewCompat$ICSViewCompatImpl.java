// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view;

import android.view.View;
import java.lang.reflect.Field;
import java.util.WeakHashMap;

// Referenced classes of package android.support.v4.view:
//            ViewCompatICS, AccessibilityDelegateCompat, ViewPropertyAnimatorCompat

class  extends 
{

    static Field b;
    static boolean c = false;

    public void a(View view, AccessibilityDelegateCompat accessibilitydelegatecompat)
    {
        if (accessibilitydelegatecompat == null)
        {
            accessibilitydelegatecompat = null;
        } else
        {
            accessibilitydelegatecompat = ((AccessibilityDelegateCompat) (accessibilitydelegatecompat.a()));
        }
        ViewCompatICS.a(view, accessibilitydelegatecompat);
    }

    public boolean a(View view, int i)
    {
        return ViewCompatICS.a(view, i);
    }

    public boolean b(View view)
    {
        boolean flag = true;
        if (c)
        {
            return false;
        }
        if (b == null)
        {
            try
            {
                b = android/view/View.getDeclaredField("mAccessibilityDelegate");
                b.setAccessible(true);
            }
            // Misplaced declaration of an exception variable
            catch (View view)
            {
                c = true;
                return false;
            }
        }
        try
        {
            view = ((View) (b.get(view)));
        }
        // Misplaced declaration of an exception variable
        catch (View view)
        {
            c = true;
            return false;
        }
        if (view == null)
        {
            flag = false;
        }
        return flag;
    }

    public boolean b(View view, int i)
    {
        return ViewCompatICS.b(view, i);
    }

    public ViewPropertyAnimatorCompat q(View view)
    {
        if (a == null)
        {
            a = new WeakHashMap();
        }
        ViewPropertyAnimatorCompat viewpropertyanimatorcompat1 = (ViewPropertyAnimatorCompat)a.get(view);
        ViewPropertyAnimatorCompat viewpropertyanimatorcompat = viewpropertyanimatorcompat1;
        if (viewpropertyanimatorcompat1 == null)
        {
            viewpropertyanimatorcompat = new ViewPropertyAnimatorCompat(view);
            a.put(view, viewpropertyanimatorcompat);
        }
        return viewpropertyanimatorcompat;
    }


    ()
    {
    }
}
