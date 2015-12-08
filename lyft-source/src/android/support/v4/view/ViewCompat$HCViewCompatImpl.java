// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view;

import android.graphics.Paint;
import android.view.View;

// Referenced classes of package android.support.v4.view:
//            ViewCompatHC

class _cls9 extends _cls9
{

    long a()
    {
        return ViewCompatHC.a();
    }

    public void a(View view, float f1)
    {
        ViewCompatHC.a(view, f1);
    }

    public void a(View view, int i, Paint paint)
    {
        ViewCompatHC.a(view, i, paint);
    }

    public void a(View view, Paint paint)
    {
        a(view, g(view), paint);
        view.invalidate();
    }

    public void a(View view, boolean flag)
    {
        ViewCompatHC.a(view, flag);
    }

    public void b(View view, float f1)
    {
        ViewCompatHC.b(view, f1);
    }

    public void c(View view, float f1)
    {
        ViewCompatHC.c(view, f1);
    }

    public void d(View view, float f1)
    {
        ViewCompatHC.d(view, f1);
    }

    public void e(View view, float f1)
    {
        ViewCompatHC.e(view, f1);
    }

    public float f(View view)
    {
        return ViewCompatHC.a(view);
    }

    public int g(View view)
    {
        return ViewCompatHC.b(view);
    }

    public float l(View view)
    {
        return ViewCompatHC.c(view);
    }

    public float m(View view)
    {
        return ViewCompatHC.d(view);
    }

    public float n(View view)
    {
        return ViewCompatHC.e(view);
    }

    _cls9()
    {
    }
}
