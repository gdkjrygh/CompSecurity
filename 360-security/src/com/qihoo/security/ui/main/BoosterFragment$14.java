// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.ui.main;

import android.view.View;
import android.view.animation.Animation;
import com.qihoo.security.booster.widget.DialView.a;
import com.qihoo.security.ui.b.b;

// Referenced classes of package com.qihoo.security.ui.main:
//            BoosterFragment, a

class init> extends a
{

    final BoosterFragment a;

    public void b()
    {
        BoosterFragment.q(a);
    }

    public void c()
    {
        a.a(com.qihoo.security.ui.exam.atus.EXCELLENT, true);
        long l;
        if (com.qihoo.security.app.a.b(BoosterFragment.f(a)))
        {
            l = 150L;
        } else
        {
            l = 300L;
        }
        com.qihoo.security.ui.main.a.a(l, BoosterFragment.r(a), new com.qihoo.security.opti.trashclear.ui.mainpage.a.a() {

            final BoosterFragment._cls14 a;

            public void onAnimationEnd(Animation animation)
            {
                com.qihoo.security.ui.b.b.c(4);
                animation = BoosterFragment.o(a.a);
                com.qihoo.security.locale.widget.LocaleTextView localetextview = BoosterFragment.n(a.a);
                com.qihoo.security.widget.RevealPanel revealpanel = BoosterFragment.l(a.a);
                com.qihoo.security.widget.RevealPanel revealpanel1 = BoosterFragment.m(a.a);
                com.nineoldandroids.a.b b1 = BoosterFragment.s(a.a);
                com.qihoo.security.ui.main.a.a(0L, new View[] {
                    animation, localetextview, revealpanel, revealpanel1
                }, null, b1);
            }

            public void onAnimationStart(Animation animation)
            {
                com.qihoo.security.ui.b.b.a(4, BoosterFragment.r(a.a));
            }

            
            {
                a = BoosterFragment._cls14.this;
                super();
            }
        });
    }

    .a.a(BoosterFragment boosterfragment)
    {
        a = boosterfragment;
        super();
    }
}
