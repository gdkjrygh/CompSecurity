// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.fragments;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import com.tinder.managers.i;
import com.tinder.utils.ad;

// Referenced classes of package com.tinder.fragments:
//            ac

final class a
    implements android.view.lickListener
{

    final a a;

    public final void onClick(View view)
    {
        a.a.a(true);
    }

    tenerAdapter(tenerAdapter teneradapter)
    {
        a = teneradapter;
        super();
    }

    // Unreferenced inner class com/tinder/fragments/ac$10

/* anonymous class */
    final class ac._cls10 extends AnimatorListenerAdapter
    {

        final ac a;

        public final void onAnimationEnd(Animator animator)
        {
            animator = String.format(a.getString(0x7f0601c5), new Object[] {
                Integer.valueOf(a.q.j())
            });
            a.n.setHint(animator);
            a.n.setVisibility(0);
            a.p.setVisibility(0);
            a.m.setOnClickListener(new ac._cls10._cls1(this));
            ad.a(a.getActivity(), a.n);
        }

            
            {
                a = ac1;
                super();
            }
    }

}
