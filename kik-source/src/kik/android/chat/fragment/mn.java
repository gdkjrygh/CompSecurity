// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat.fragment;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.res.Resources;
import android.view.View;

// Referenced classes of package kik.android.chat.fragment:
//            KikMultiselectContactsListFragment

final class mn extends AnimatorListenerAdapter
{

    final boolean a;
    final KikMultiselectContactsListFragment b;

    mn(KikMultiselectContactsListFragment kikmultiselectcontactslistfragment, boolean flag)
    {
        b = kikmultiselectcontactslistfragment;
        a = flag;
        super();
    }

    public final void onAnimationEnd(Animator animator)
    {
        boolean flag = false;
        animator = KikMultiselectContactsListFragment.c(b).getLayoutParams();
        int i;
        if (a)
        {
            i = (int)KikMultiselectContactsListFragment.c(b).getResources().getDimension(0x7f0d0023);
        } else
        {
            i = 0;
        }
        animator.height = i;
        KikMultiselectContactsListFragment.c(b).setLayoutParams(animator);
        if (KikMultiselectContactsListFragment.d(b) != null)
        {
            animator = KikMultiselectContactsListFragment.d(b);
            if (a)
            {
                i = ((flag) ? 1 : 0);
            } else
            {
                i = 4;
            }
            animator.setVisibility(i);
        }
    }
}
