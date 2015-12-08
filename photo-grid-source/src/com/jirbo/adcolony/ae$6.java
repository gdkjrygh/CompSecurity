// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jirbo.adcolony;

import android.view.View;
import android.widget.FrameLayout;

// Referenced classes of package com.jirbo.adcolony:
//            ae, ADCVideo

class a
    implements Runnable
{

    final View a;
    final ae b;

    public void run()
    {
        b.d.N.removeView(a);
        b.a(true);
        b.d.r = System.currentTimeMillis();
    }

    ut(ae ae1, View view)
    {
        b = ae1;
        a = view;
        super();
    }
}
