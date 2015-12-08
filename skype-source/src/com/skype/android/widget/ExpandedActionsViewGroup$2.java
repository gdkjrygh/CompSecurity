// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import java.util.List;

// Referenced classes of package com.skype.android.widget:
//            ExpandedActionsViewGroup

final class c extends AnimatorListenerAdapter
{

    final View a;
    final boolean b;
    final int c;
    final ExpandedActionsViewGroup d;

    public final void onAnimationEnd(Animator animator)
    {
        animator = a;
        int i;
        int j;
        if (b)
        {
            i = 0;
        } else
        {
            i = 8;
        }
        animator.setVisibility(i);
        j = c;
        if (ExpandedActionsViewGroup.a(d))
        {
            i = ExpandedActionsViewGroup.b(d).size() - 1;
        } else
        {
            i = 0;
        }
        if (j == i)
        {
            ((ViewGroup)d.getParent()).setClipChildren(false);
        }
    }

    _cls9(ExpandedActionsViewGroup expandedactionsviewgroup, View view, boolean flag, int i)
    {
        d = expandedactionsviewgroup;
        a = view;
        b = flag;
        c = i;
        super();
    }
}
