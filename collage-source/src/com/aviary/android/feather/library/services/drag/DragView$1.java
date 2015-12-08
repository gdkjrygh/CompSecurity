// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.aviary.android.feather.library.services.drag;

import android.graphics.Paint;
import android.view.View;
import android.view.WindowManager;

// Referenced classes of package com.aviary.android.feather.library.services.drag:
//            DragView

class a
    implements it.sephiroth.android.library.easing.er.b
{

    final View a;
    final DragView b;

    public void a(double d)
    {
    }

    public void a(double d, double d1)
    {
        b.h = (float)((1.0D + (double)(b.g - 1.0F) * d) / (double)b.g);
        b.b.setAlpha((int)(255D * d));
        b.invalidate();
    }

    public void b(double d)
    {
        b.j.removeView(a);
    }

    A(DragView dragview, View view)
    {
        b = dragview;
        a = view;
        super();
    }
}
