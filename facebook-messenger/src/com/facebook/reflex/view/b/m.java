// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.reflex.view.b;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.reflex.b;

// Referenced classes of package com.facebook.reflex.view.b:
//            o, r

public class m extends b
{

    private static Paint b = null;
    private static final o c = new o(null);
    private View d;
    private int e;

    public m(View view)
    {
        e = 0;
        d = view;
        c.a(view.getContext());
        a(c);
    }

    private static void a(View view)
    {
        if (android.os.Build.VERSION.SDK_INT >= 11)
        {
            b(view);
        }
        view.setDrawingCacheEnabled(false);
        view.destroyDrawingCache();
        if (view instanceof ViewGroup)
        {
            view = (ViewGroup)view;
            int k = 0;
            while (k < view.getChildCount()) 
            {
                View view1 = view.getChildAt(k);
                if (!(view1 instanceof r) || !((r)view1).d())
                {
                    a(view1);
                }
                k++;
            }
        }
    }

    private static void b(View view)
    {
        view.setLayerType(0, null);
    }

    private static boolean c(View view)
    {
        boolean flag1 = false;
        boolean flag;
        if (view.getVisibility() == 0 && (!view.willNotDraw() || view.getBackground() != null) && view.getWidth() > 0 && view.getHeight() > 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag || d(view))
        {
            flag1 = true;
        }
        return flag1;
    }

    private static boolean d(View view)
    {
        boolean flag;
        boolean flag1;
        flag1 = false;
        flag = flag1;
        if (!(view instanceof ViewGroup)) goto _L2; else goto _L1
_L1:
        int k;
        view = (ViewGroup)view;
        k = 0;
_L9:
        flag = flag1;
        if (k >= view.getChildCount()) goto _L2; else goto _L3
_L3:
        View view1 = view.getChildAt(k);
        if (!(view1 instanceof r)) goto _L5; else goto _L4
_L4:
        if (((r)view1).d() || !c(view1)) goto _L7; else goto _L6
_L6:
        flag = true;
_L2:
        return flag;
_L5:
        if (c(view1))
        {
            return true;
        }
_L7:
        k++;
        if (true) goto _L9; else goto _L8
_L8:
    }

    protected void a(Canvas canvas)
    {
        i();
        d.draw(canvas);
    }

    public void b(Canvas canvas)
    {
    }

    public void i()
    {
        a(d);
    }

    public boolean j()
    {
        return d.getVisibility() == 0 && (d.getBackground() != null || d(d));
    }

}
