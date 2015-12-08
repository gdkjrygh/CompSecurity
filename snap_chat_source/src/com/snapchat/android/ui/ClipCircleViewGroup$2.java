// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.ui;

import Jr;
import android.animation.Animator;
import java.util.List;

// Referenced classes of package com.snapchat.android.ui:
//            ClipCircleViewGroup

final class a extends Jr
{

    private boolean a;
    private ClipCircleViewGroup b;

    public final void onAnimationEnd(Animator animator)
    {
        if (a)
        {
            b.g();
        } else
        {
            b.l = false;
            b.setEnabled(true);
            animator = b;
            int i = ((ClipCircleViewGroup) (animator)).k.size() - 1;
            while (i >= 0) 
            {
                ((ClipCircleViewGroup) (animator)).k.get(i);
                i--;
            }
        }
    }

    (ClipCircleViewGroup clipcircleviewgroup, boolean flag)
    {
        b = clipcircleviewgroup;
        a = flag;
        super();
    }
}
