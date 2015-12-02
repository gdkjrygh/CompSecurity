// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nineoldandroids.b;

import android.view.View;

// Referenced classes of package com.nineoldandroids.b:
//            a

private static final class 
{

    static float a(View view)
    {
        return view.getX();
    }

    static void a(View view, float f)
    {
        view.setAlpha(f);
    }

    static float b(View view)
    {
        return view.getY();
    }

    static void b(View view, float f)
    {
        view.setScaleX(f);
    }

    static void c(View view, float f)
    {
        view.setScaleY(f);
    }

    static void d(View view, float f)
    {
        view.setTranslationX(f);
    }

    static void e(View view, float f)
    {
        view.setTranslationY(f);
    }
}
