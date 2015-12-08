// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import java.lang.reflect.Field;
import java.util.WeakHashMap;

class mp extends mo
{

    private static Field b;
    private static boolean c = false;

    mp()
    {
    }

    public final void a(View view, AccessibilityEvent accessibilityevent)
    {
        view.onInitializeAccessibilityEvent(accessibilityevent);
    }

    public final void a(View view, kc kc1)
    {
        if (kc1 == null)
        {
            kc1 = null;
        } else
        {
            kc1 = ((kc) (kc1.a));
        }
        view.setAccessibilityDelegate((android.view.View.AccessibilityDelegate)kc1);
    }

    public final void a(View view, pa pa1)
    {
        view.onInitializeAccessibilityNodeInfo((AccessibilityNodeInfo)pa1.b);
    }

    public final boolean a(View view, int i)
    {
        return view.canScrollHorizontally(i);
    }

    public final boolean b(View view)
    {
        if (!c)
        {
            if (b == null)
            {
                try
                {
                    Field field = android/view/View.getDeclaredField("mAccessibilityDelegate");
                    b = field;
                    field.setAccessible(true);
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
            if (view != null)
            {
                return true;
            }
        }
        return false;
    }

    public final boolean b(View view, int i)
    {
        return view.canScrollVertically(i);
    }

    public final ob s(View view)
    {
        if (a == null)
        {
            a = new WeakHashMap();
        }
        ob ob2 = (ob)a.get(view);
        ob ob1 = ob2;
        if (ob2 == null)
        {
            ob1 = new ob(view);
            a.put(view, ob1);
        }
        return ob1;
    }

}
