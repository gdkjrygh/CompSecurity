// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.android.ads;

import android.graphics.Point;
import com.pandora.android.util.s;
import com.pandora.radio.data.a;

// Referenced classes of package com.pandora.android.ads:
//            AdView, j

class a
    implements Runnable
{

    final AdView a;

    public void run()
    {
        if (a.d != null && a.d.Q())
        {
            Point point = AdView.b(a).u();
            int i = point.x;
            int k = point.y;
            a.d.a(s.b(i), s.b(k));
        }
        if (a.c != null && a.c.d())
        {
            a.c.a();
        }
        AdView.l(a);
    }

    (AdView adview)
    {
        a = adview;
        super();
    }
}
