// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.widget;

import android.support.v4.view.a;
import android.support.v4.view.accessibility.c;
import android.view.View;

// Referenced classes of package android.support.v4.widget:
//            DrawerLayout

final class a extends a
{

    final DrawerLayout a;

    public final void a(View view, c c1)
    {
        super.a(view, c1);
        if (!DrawerLayout.f(view))
        {
            c1.c(null);
        }
    }

    (DrawerLayout drawerlayout)
    {
        a = drawerlayout;
        super();
    }
}
