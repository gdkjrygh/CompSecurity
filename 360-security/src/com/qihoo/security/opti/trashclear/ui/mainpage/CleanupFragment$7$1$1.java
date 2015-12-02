// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.opti.trashclear.ui.mainpage;

import android.view.View;
import android.view.animation.Animation;
import com.nineoldandroids.a.a;
import com.nineoldandroids.a.b;
import com.nineoldandroids.a.k;
import com.qihoo.security.locale.d;
import com.qihoo.security.locale.widget.LocaleTextView;
import com.qihoo.security.widget.RevealPanel;

// Referenced classes of package com.qihoo.security.opti.trashclear.ui.mainpage:
//            CleanupFragment

class a extends b
{

    final a a;

    public void b(a a1)
    {
        com.qihoo.security.opti.trashclear.ui.mainpage.CleanupFragment.a(a.a.a, new t>(CleanupFragment.V(a.a.a), CleanupFragment.W(a.a.a)));
        CleanupFragment.H(a.a.a).a();
    }

    ( )
    {
        a = ;
        super();
    }

    // Unreferenced inner class com/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$7

/* anonymous class */
    class CleanupFragment._cls7
        implements android.view.animation.Animation.AnimationListener
    {

        final CleanupFragment a;

        public void onAnimationEnd(Animation animation)
        {
            CleanupFragment.R(a).setVisibility(4);
            com.qihoo.security.ui.b.b.c(4);
            a.a(new CleanupFragment._cls7._cls1(this), true);
            a.a(com.qihoo.security.ui.exam.ExamMainAnim.ExamStatus.EXCELLENT, false);
        }

        public void onAnimationRepeat(Animation animation)
        {
        }

        public void onAnimationStart(Animation animation)
        {
            com.qihoo.security.ui.b.b.a(4, CleanupFragment.R(a));
        }

            
            {
                a = cleanupfragment;
                super();
            }
    }


    // Unreferenced inner class com/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$7$1

/* anonymous class */
    class CleanupFragment._cls7._cls1 extends b
    {

        final CleanupFragment._cls7 a;

        public void b(a a1)
        {
            a.a.a_(CleanupFragment.S(a.a).a(0x7f0c00a9));
            CleanupFragment.T(a.a).setVisibility(0);
            CleanupFragment.C(a.a).e();
            CleanupFragment.F(a.a).e();
            CleanupFragment.E(a.a).e();
            CleanupFragment.U(a.a);
            CleanupFragment.f(a.a).setVisibility(0);
            a1 = new CleanupFragment._cls7._cls1._cls1(this);
            k k1 = k.a(CleanupFragment.f(a.a), "alpha", new float[] {
                0.0F, 1.0F
            });
            k1.c(350L).a(a1);
            k1.a();
            CleanupFragment.f(a.a).setText(CleanupFragment.X(a.a));
        }

            
            {
                a = _pcls7;
                super();
            }
    }

}
