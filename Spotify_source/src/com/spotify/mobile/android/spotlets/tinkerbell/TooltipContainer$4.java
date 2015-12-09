// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.tinkerbell;

import android.widget.AbsListView;
import fjo;
import gjg;

// Referenced classes of package com.spotify.mobile.android.spotlets.tinkerbell:
//            TooltipContainer

final class b extends gjg
{

    private TooltipContainer b;

    public final void a(int i)
    {
        TooltipContainer tooltipcontainer = b;
        if (tooltipcontainer.c == null || tooltipcontainer.b)
        {
            return;
        }
        if (!tooltipcontainer.a(tooltipcontainer.c))
        {
            tooltipcontainer.a();
            return;
        } else
        {
            tooltipcontainer.a.offsetTopAndBottom(i);
            return;
        }
    }

    public final void onScrollStateChanged(AbsListView abslistview, int i)
    {
        if (i == 0)
        {
            TooltipContainer.e(b);
        }
    }

    (TooltipContainer tooltipcontainer)
    {
        b = tooltipcontainer;
        super();
    }
}
