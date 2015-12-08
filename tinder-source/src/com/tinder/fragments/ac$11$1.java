// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.fragments;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.widget.ImageButton;
import com.tinder.views.ScalableLine;
import java.util.Hashtable;

// Referenced classes of package com.tinder.fragments:
//            ac

final class a
    implements android.view.lickListener
{

    final a a;

    public final void onClick(View view)
    {
        a.a.a();
    }

    tenerAdapter(tenerAdapter teneradapter)
    {
        a = teneradapter;
        super();
    }

    // Unreferenced inner class com/tinder/fragments/ac$11

/* anonymous class */
    final class ac._cls11 extends AnimatorListenerAdapter
    {

        final ac a;

        public final void onAnimationEnd(Animator animator)
        {
            ac.h(a).clear();
            a.o.setVisibility(8);
            a.a.setVisibility(0);
            a.m.setOnClickListener(new ac._cls11._cls1(this));
        }

            
            {
                a = ac1;
                super();
            }
    }

}
