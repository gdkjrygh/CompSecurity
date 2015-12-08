// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mixpanel.android.viewcrawler;

import android.util.Log;
import android.view.View;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;

// Referenced classes of package com.mixpanel.android.viewcrawler:
//            l

public static class a extends a
{

    private final int a;
    private final WeakHashMap b = new WeakHashMap();

    static int a(a a1)
    {
        return a1.a;
    }

    private android.view..AccessibilityDelegate d(View view)
    {
        try
        {
            view = (android.view..AccessibilityDelegate)view.getClass().getMethod("getAccessibilityDelegate", new Class[0]).invoke(view, new Object[0]);
        }
        // Misplaced declaration of an exception variable
        catch (View view)
        {
            return null;
        }
        // Misplaced declaration of an exception variable
        catch (View view)
        {
            return null;
        }
        // Misplaced declaration of an exception variable
        catch (View view)
        {
            Log.w("MixpanelAPI.ViewVisitor", "getAccessibilityDelegate threw an exception when called.", view);
            return null;
        }
        return view;
    }

    public void a()
    {
        Iterator iterator = b.entrySet().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            Object obj = (java.util.Entry)iterator.next();
            View view = (View)((java.util.Entry) (obj)).getKey();
    /* block-local class not found */
    class a {}

            obj = (a)((java.util.Entry) (obj)).getValue();
            android.view..AccessibilityDelegate accessibilitydelegate = d(view);
            if (accessibilitydelegate == obj)
            {
                view.setAccessibilityDelegate(((a) (obj)).a());
            } else
            if (accessibilitydelegate instanceof a)
            {
                ((a)accessibilitydelegate).a(((a) (obj)));
            }
        } while (true);
        b.clear();
    }

    public void a(View view)
    {
        Object obj = d(view);
        if ((obj instanceof a) && ((a)obj).a(e()))
        {
            return;
        } else
        {
            obj = new a(((android.view..AccessibilityDelegate) (obj)));
            view.setAccessibilityDelegate(((android.view..AccessibilityDelegate) (obj)));
            b.put(view, obj);
            return;
        }
    }

    public volatile void b(View view)
    {
        super.b(view);
    }

    protected String d()
    {
        return (new StringBuilder()).append(e()).append(" event when (").append(a).append(")").toString();
    }

    public eption(List list, int i, String s, eption eption)
    {
        super(list, s, eption, false);
        a = i;
    }
}
