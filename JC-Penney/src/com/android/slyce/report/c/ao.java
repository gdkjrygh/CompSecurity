// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.slyce.report.c;

import android.util.Log;
import android.view.View;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;

// Referenced classes of package com.android.slyce.report.c:
//            as, ap, at

public class ao extends as
{

    private final int a;
    private final WeakHashMap b = new WeakHashMap();

    public ao(List list, int i, String s, at at)
    {
        super(list, s, at, false);
        a = i;
    }

    static int a(ao ao1)
    {
        return ao1.a;
    }

    private android.view.View.AccessibilityDelegate d(View view)
    {
        try
        {
            view = (android.view.View.AccessibilityDelegate)view.getClass().getMethod("getAccessibilityDelegate", new Class[0]).invoke(view, new Object[0]);
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
            Object obj = (java.util.Map.Entry)iterator.next();
            View view = (View)((java.util.Map.Entry) (obj)).getKey();
            obj = (ap)((java.util.Map.Entry) (obj)).getValue();
            android.view.View.AccessibilityDelegate accessibilitydelegate = d(view);
            if (accessibilitydelegate == obj)
            {
                view.setAccessibilityDelegate(((ap) (obj)).a());
            } else
            if (accessibilitydelegate instanceof ap)
            {
                ((ap)accessibilitydelegate).a(((ap) (obj)));
            }
        } while (true);
        b.clear();
    }

    public void a(View view)
    {
        Object obj = d(view);
        if ((obj instanceof ap) && ((ap)obj).a(b()))
        {
            return;
        } else
        {
            obj = new ap(this, ((android.view.View.AccessibilityDelegate) (obj)));
            view.setAccessibilityDelegate(((android.view.View.AccessibilityDelegate) (obj)));
            b.put(view, obj);
            return;
        }
    }

    public volatile void b(View view)
    {
        super.b(view);
    }
}
