// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.home.ui;

import android.view.DragEvent;
import android.view.View;
import android.widget.ImageView;

// Referenced classes of package com.fitbit.home.ui:
//            DashboardPagerFragment, DashboardFragment

class a
    implements android.view.ent._cls4
{

    final DashboardPagerFragment a;

    public boolean onDrag(View view, DragEvent dragevent)
    {
        switch (dragevent.getAction())
        {
        case 4: // '\004'
        default:
            return true;

        case 5: // '\005'
            DashboardPagerFragment.b(a).setImageLevel(1);
            return true;

        case 3: // '\003'
            view = (DashboardFragment)DashboardPagerFragment.a(a, DashboardPagerFragment.c(a));
            if (view != null)
            {
                view.m();
            }
            // fall through

        case 6: // '\006'
            DashboardPagerFragment.b(a).setImageLevel(0);
            return true;
        }
    }

    (DashboardPagerFragment dashboardpagerfragment)
    {
        a = dashboardpagerfragment;
        super();
    }
}
