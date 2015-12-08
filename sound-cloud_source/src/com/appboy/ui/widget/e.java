// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.appboy.ui.widget;

import android.widget.ImageView;

// Referenced classes of package com.appboy.ui.widget:
//            c

final class e
    implements android.view.ViewTreeObserver.OnGlobalLayoutListener
{

    final ImageView a;
    final float b;
    final c c;

    e(c c1, ImageView imageview, float f)
    {
        c = c1;
        a = imageview;
        b = f;
        super();
    }

    public final void onGlobalLayout()
    {
        int i = a.getWidth();
        a.setLayoutParams(new android.widget.RelativeLayout.LayoutParams(i, (int)((float)i / b)));
        com.appboy.ui.widget.c.a(a.getViewTreeObserver(), this);
    }
}
