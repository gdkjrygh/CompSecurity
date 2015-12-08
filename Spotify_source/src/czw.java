// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.util.Log;
import android.view.View;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;

public final class czw extends dab
{

    final int c;
    private final WeakHashMap e = new WeakHashMap();

    public czw(List list, int i, String s, daf daf)
    {
        super(list, s, daf, false);
        c = i;
    }

    private static android.view.View.AccessibilityDelegate d(View view)
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

    public final void a()
    {
        Iterator iterator = e.entrySet().iterator();
label0:
        do
        {
            if (iterator.hasNext())
            {
                Object obj1 = (java.util.Map.Entry)iterator.next();
                Object obj = (View)((java.util.Map.Entry) (obj1)).getKey();
                obj1 = (czx)((java.util.Map.Entry) (obj1)).getValue();
                android.view.View.AccessibilityDelegate accessibilitydelegate = d(((View) (obj)));
                if (accessibilitydelegate == obj1)
                {
                    ((View) (obj)).setAccessibilityDelegate(((czx) (obj1)).a);
                    continue;
                }
                if (!(accessibilitydelegate instanceof czx))
                {
                    continue;
                }
                obj = (czx)accessibilitydelegate;
                do
                {
                    if (((czx) (obj)).a == obj1)
                    {
                        obj.a = ((czx) (obj1)).a;
                        continue label0;
                    }
                    if (!(((czx) (obj)).a instanceof czx))
                    {
                        continue label0;
                    }
                    obj = (czx)((czx) (obj)).a;
                } while (true);
            }
            e.clear();
            return;
        } while (true);
    }

    public final void a(View view)
    {
        android.view.View.AccessibilityDelegate accessibilitydelegate = d(view);
        if (!(accessibilitydelegate instanceof czx)) goto _L2; else goto _L1
_L1:
        czx czx1;
        String s;
        czx1 = (czx)accessibilitydelegate;
        s = super.d;
_L7:
        if (((dab) (czx1.b)).d != s) goto _L4; else goto _L3
_L3:
        boolean flag = true;
_L5:
        if (flag)
        {
            return;
        }
        break; /* Loop/switch isn't completed */
_L4:
        if (czx1.a instanceof czx)
        {
            czx1 = (czx)czx1.a;
            continue; /* Loop/switch isn't completed */
        }
        flag = false;
        if (true) goto _L5; else goto _L2
_L2:
        czx czx2 = new czx(this, accessibilitydelegate);
        view.setAccessibilityDelegate(czx2);
        e.put(view, czx2);
        return;
        if (true) goto _L7; else goto _L6
_L6:
    }

    public final volatile void b(View view)
    {
        super.b(view);
    }
}
