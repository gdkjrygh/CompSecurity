// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.android.tablet;

import android.view.View;
import com.pandora.android.provider.b;
import com.pandora.android.util.q;
import com.pandora.radio.data.ag;
import p.cw.c;

// Referenced classes of package com.pandora.android.tablet:
//            TabletHome

class a
    implements com.pandora.android.eureka.diaRouteButton.a
{

    final TabletHome a;

    public void a(View view, int i)
    {
        boolean flag = b.a.b().k().C();
        if (i == 0 && flag)
        {
            q.b(TabletHome.n(a), TabletHome.o(a));
        }
    }

    public void a(boolean flag)
    {
        com.pandora.android.tablet.TabletHome.b(a, flag);
    }

    diaRouteButton.a(TabletHome tablethome)
    {
        a = tablethome;
        super();
    }
}
