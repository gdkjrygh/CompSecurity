// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;
import java.lang.reflect.Field;
import java.util.WeakHashMap;

static class > extends >
{

    private static Field b;
    private static boolean c = false;

    public final void a(View view, aG ag)
    {
        if (ag == null)
        {
            ag = null;
        } else
        {
            ag = ((aG) (ag.a));
        }
        view.setAccessibilityDelegate((android.view.AccessibilityDelegate)ag);
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

    public final bf p(View view)
    {
        if (a == null)
        {
            a = new WeakHashMap();
        }
        bf bf2 = (bf)a.get(view);
        bf bf1 = bf2;
        if (bf2 == null)
        {
            bf1 = new bf(view);
            a.put(view, bf1);
        }
        return bf1;
    }


    >()
    {
    }
}
