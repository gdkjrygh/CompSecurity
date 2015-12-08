// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.util.i;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.SparseArray;
import android.view.View;
import com.caverock.androidsvg.PreserveAspectRatio;
import com.caverock.androidsvg.SVG;
import com.fitbit.e.a;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;

// Referenced classes of package com.fitbit.util.i:
//            d, e, h

public class g
    implements d
{

    private final SparseArray a = new SparseArray();

    public g()
    {
    }

    public View a(View view, String s, Context context, AttributeSet attributeset)
    {
        View view1;
        Object obj1;
        view1 = null;
        obj1 = null;
        Object obj = context.obtainStyledAttributes(attributeset, com.fitbit.FitbitMobile.R.styleable.Svgable);
        View view2 = view;
        if (((TypedArray) (obj)).getDrawable(0) != null) goto _L2; else goto _L1
_L1:
        view2 = view;
        int i = ((TypedArray) (obj)).getResourceId(0, 0);
_L17:
        view1 = view;
        if (i == 0) goto _L4; else goto _L3
_L3:
        view1 = view;
        if (view != null)
        {
            break MISSING_BLOCK_LABEL_71;
        }
        view2 = view;
        view1 = (View)com.fitbit.util.i.e.a(s, context, attributeset);
        view2 = view1;
        view = (Reference)a.get(i);
        if (view != null) goto _L6; else goto _L5
_L5:
        view = obj1;
_L9:
        if (view != null) goto _L8; else goto _L7
_L7:
        view2 = view1;
        a.remove(i);
        view2 = view1;
        view = SVG.a(context.getResources(), i);
        view2 = view1;
        view.c("100%");
        view2 = view1;
        view.b("100%");
        view2 = view1;
        view.a(context.getResources().getDisplayMetrics().xdpi);
        view2 = view1;
        view.a(PreserveAspectRatio.h);
        view2 = view1;
        view = new h(view);
        view2 = view1;
        a.put(i, new WeakReference(view));
_L10:
        view2 = view1;
        view1.setLayerType(1, null);
        view2 = view1;
        view1.setBackgroundDrawable(view);
_L4:
        context = view1;
        if (obj != null)
        {
            ((TypedArray) (obj)).recycle();
            context = view1;
        }
_L12:
        return context;
_L6:
        view2 = view1;
        view = (Drawable)view.get();
          goto _L9
_L8:
        view2 = view1;
        view = view.getConstantState().newDrawable();
          goto _L10
        s;
        context = view;
        view = view1;
        attributeset = s;
        s = context;
_L15:
        com.fitbit.e.a.f("SVG", "Errror", attributeset, new Object[0]);
        context = s;
        if (view == null) goto _L12; else goto _L11
_L11:
        view.recycle();
        return s;
        view;
        obj = null;
_L14:
        if (obj != null)
        {
            ((TypedArray) (obj)).recycle();
        }
        throw view;
        view;
        continue; /* Loop/switch isn't completed */
        s;
        obj = view;
        view = s;
        if (true) goto _L14; else goto _L13
_L13:
        attributeset;
        view = ((View) (obj));
        s = view2;
          goto _L15
_L2:
        i = 0;
        if (true) goto _L17; else goto _L16
_L16:
    }
}
