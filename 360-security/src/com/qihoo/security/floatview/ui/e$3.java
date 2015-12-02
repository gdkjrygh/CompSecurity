// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.floatview.ui;

import android.content.res.Resources;
import android.widget.ImageView;
import com.qihoo.security.ui.opti.sysclear.rocket.c;

// Referenced classes of package com.qihoo.security.floatview.ui:
//            e

class a
    implements Runnable
{

    final e a;

    public void run()
    {
        if (a.b == null)
        {
            a.b = new c(a.getContext());
            com.qihoo.security.floatview.ui.e.c(a).setImageDrawable(a.b);
        }
        float f = a.getResources().getDimensionPixelSize(0x7f09006f);
        a.b.a(a.getWidth() / 2, (float)a.getHeight() - f);
    }

    rocket.c(e e1)
    {
        a = e1;
        super();
    }
}
