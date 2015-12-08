// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view;

import android.graphics.Paint;
import android.view.View;

// Referenced classes of package android.support.v4.view:
//            x

static class  extends 
{

    public final boolean C(View view)
    {
        return view.isPaddingRelative();
    }

    public final void a(View view, Paint paint)
    {
        view.setLayerPaint(paint);
    }

    public final void b(View view, int i, int j, int k, int l)
    {
        view.setPaddingRelative(i, j, k, l);
    }

    public final int h(View view)
    {
        return view.getLayoutDirection();
    }

    public final int m(View view)
    {
        return view.getPaddingStart();
    }

    public final int n(View view)
    {
        return view.getPaddingEnd();
    }

    public final int v(View view)
    {
        return view.getWindowSystemUiVisibility();
    }

    ()
    {
    }
}
