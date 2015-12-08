// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.widget;

import android.support.v4.view.a;
import android.view.View;

// Referenced classes of package android.support.v4.widget:
//            DrawerLayout

final class b extends a
{

    final DrawerLayout b;

    public void a(View view, p.f.a a1)
    {
        super.a(view, a1);
        if (!DrawerLayout.k(view))
        {
            a1.c(null);
        }
    }

    (DrawerLayout drawerlayout)
    {
        b = drawerlayout;
        super();
    }
}
