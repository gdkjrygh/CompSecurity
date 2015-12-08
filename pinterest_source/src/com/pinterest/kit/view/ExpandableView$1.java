// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.kit.view;

import android.view.ViewTreeObserver;
import android.widget.LinearLayout;

// Referenced classes of package com.pinterest.kit.view:
//            ExpandableView

class a
    implements android.view.OnGlobalLayoutListener
{

    final ExpandableView a;

    public void onGlobalLayout()
    {
        ExpandableView.a(a, ExpandableView.a(a).getHeight());
        ExpandableView.a(a).getViewTreeObserver().removeGlobalOnLayoutListener(this);
        ExpandableView.a(a).setVisibility(8);
    }

    youtListener(ExpandableView expandableview)
    {
        a = expandableview;
        super();
    }
}
