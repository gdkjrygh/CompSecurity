// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.widget;

import android.view.View;
import cm;
import es;

// Referenced classes of package android.support.v4.widget:
//            DrawerLayout

final class a extends cm
{

    final DrawerLayout a;

    public void onInitializeAccessibilityNodeInfo(View view, es es1)
    {
        super.onInitializeAccessibilityNodeInfo(view, es1);
        if (!DrawerLayout.l(view))
        {
            es1.c(null);
        }
    }

    (DrawerLayout drawerlayout)
    {
        a = drawerlayout;
        super();
    }
}
