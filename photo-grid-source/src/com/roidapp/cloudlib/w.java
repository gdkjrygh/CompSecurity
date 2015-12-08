// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.cloudlib;

import android.widget.GridView;

// Referenced classes of package com.roidapp.cloudlib:
//            t, ad

final class w
    implements android.view.ViewTreeObserver.OnGlobalLayoutListener
{

    final t a;

    w(t t1)
    {
        a = t1;
        super();
    }

    public final void onGlobalLayout()
    {
        if (a.d.a() == 0)
        {
            ad ad1 = a.d;
            int i = a.c.getWidth() / 4;
            int j = a.b;
            a.d.c(i - j);
        }
    }
}
