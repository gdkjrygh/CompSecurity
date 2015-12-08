// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view;

import android.view.View;
import java.lang.reflect.Field;
import java.util.WeakHashMap;

// Referenced classes of package android.support.v4.view:
//            bt, a, cy

class bu extends bt
{

    static Field b;
    static boolean c = false;

    bu()
    {
    }

    public final void a(View view, a a1)
    {
        if (a1 == null)
        {
            a1 = null;
        } else
        {
            a1 = ((a) (a1.a));
        }
        view.setAccessibilityDelegate((android.view.View.AccessibilityDelegate)a1);
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

    public final cy p(View view)
    {
        if (a == null)
        {
            a = new WeakHashMap();
        }
        cy cy2 = (cy)a.get(view);
        cy cy1 = cy2;
        if (cy2 == null)
        {
            cy1 = new cy(view);
            a.put(view, cy1);
        }
        return cy1;
    }

}
