// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.discover.ui;

import Jr;
import android.animation.Animator;
import android.widget.LinearLayout;

// Referenced classes of package com.snapchat.android.discover.ui:
//            DSnapView

final class a extends Jr
{

    private DSnapView a;

    public final void onAnimationEnd(Animator animator)
    {
        animator = a;
        if (((DSnapView) (animator)).d != null)
        {
            ((DSnapView) (animator)).d.setVisibility(8);
        }
        animator.j = false;
        animator.c(animator.k());
    }

    (DSnapView dsnapview)
    {
        a = dsnapview;
        super();
    }
}
