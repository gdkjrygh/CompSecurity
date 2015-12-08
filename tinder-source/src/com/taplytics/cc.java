// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.taplytics;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import java.lang.reflect.Method;

// Referenced classes of package com.taplytics:
//            ci, gj, gs, ca

final class cc
    implements android.view.View.OnLayoutChangeListener
{

    final ca a;

    cc(ca ca)
    {
        a = ca;
        super();
    }

    public final void onLayoutChange(View view, int i, int j, int k, int l, int i1, int j1, 
            int k1, int l1)
    {
        Object obj;
        String s;
        View view1;
        Object obj1;
        int i2;
        try
        {
            obj = ci.b().v.getClass().getMethod("getSupportFragmentManager", new Class[0]).invoke(ci.b().v, new Object[0]);
            obj1 = obj.getClass().getMethod("findFragmentById", new Class[] {
                Integer.TYPE
            }).invoke(obj, new Object[] {
                Integer.valueOf(view.getId())
            });
            i2 = ((Integer)obj1.getClass().getMethod("getId", new Class[0]).invoke(obj1, new Object[0])).intValue();
            obj = obj1.getClass().getMethod("getTag", new Class[0]).invoke(obj1, new Object[0]);
        }
        // Misplaced declaration of an exception variable
        catch (View view)
        {
            gs.b("F Ex sup: ", view);
            return;
        }
        if (obj != null) goto _L2; else goto _L1
_L1:
        s = obj1.getClass().getSimpleName();
_L7:
        view1 = (View)obj1.getClass().getMethod("getView", new Class[0]).invoke(obj1, new Object[0]);
          goto _L3
_L5:
        if (!(view instanceof ViewGroup))
        {
            break; /* Loop/switch isn't completed */
        }
        flag2 = view1 instanceof ViewGroup;
        if (!flag2)
        {
            break; /* Loop/switch isn't completed */
        }
        obj = view1;
        try
        {
            if (view1 instanceof RecyclerView)
            {
                obj = (ViewGroup)view1.getParent();
            }
        }
        catch (Throwable throwable)
        {
            throwable = view1;
        }
        gj.a((ViewGroup)view, (ViewGroup)obj, i2, (String)s, obj1.getClass().getSimpleName(), flag1, flag);
        return;
_L2:
        s = obj.toString();
        continue; /* Loop/switch isn't completed */
_L3:
        boolean flag;
        boolean flag1;
        boolean flag2;
        if (i1 == 0 && j1 == 0 && k1 == 0 && l1 == 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        while (i + k != 0 && l + j != 0) 
        {
            flag1 = false;
            continue; /* Loop/switch isn't completed */
        }
        flag1 = true;
        if (true) goto _L5; else goto _L4
_L4:
        return;
        if (true) goto _L7; else goto _L6
_L6:
    }
}
