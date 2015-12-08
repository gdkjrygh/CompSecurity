// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.kit.view;

import android.view.animation.Animation;
import android.widget.LinearLayout;

// Referenced classes of package com.pinterest.kit.view:
//            ExpandableView

class a
    implements android.view.animation.onListener
{

    final ExpandableView a;

    public void onAnimationEnd(Animation animation)
    {
        a.clearAnimation();
        if (!ExpandableView.c(a))
        {
            ExpandableView.a(a).setVisibility(8);
        }
    }

    public void onAnimationRepeat(Animation animation)
    {
    }

    public void onAnimationStart(Animation animation)
    {
        if (ExpandableView.c(a))
        {
            ExpandableView.a(a).setVisibility(0);
        }
    }

    onListener(ExpandableView expandableview)
    {
        a = expandableview;
        super();
    }
}
