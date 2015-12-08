// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.fragments;

import android.os.Handler;
import android.view.View;
import android.view.ViewPropertyAnimator;
import com.tinder.e.ac;
import com.tinder.enums.RateType;
import com.tinder.managers.ab;
import com.tinder.model.User;
import com.tinder.views.RecCard;

// Referenced classes of package com.tinder.fragments:
//            bd

final class a
    implements Runnable
{

    final RateType a;
    final b b;

    public final void run()
    {
        b.b.a(a);
        if (a.equals(RateType.SUPERLIKE))
        {
            bd.B(b.b);
        }
    }

    ator(ator ator, RateType ratetype)
    {
        b = ator;
        a = ratetype;
        super();
    }

    // Unreferenced inner class com/tinder/fragments/bd$31

/* anonymous class */
    final class bd._cls31
        implements ac
    {

        final bd a;

        public final void a()
        {
            User user = a.g.d();
            if (bd.c(a) != null && user != null && user.isSuperLike())
            {
                bd.c(a).getSuperLikeStar().setAlpha(0.0F);
            }
        }

        public final void a(int i)
        {
            bd.b(a, i);
            if (bd.c(a) != null && bd.c(a).getRec() != null)
            {
                bd.a(a, bd.c(a).getRec(), bd.c(a));
            }
        }

        public final void a(RateType ratetype)
        {
            bd.A(a);
            if (a.getView() != null)
            {
                bd.u(a).postDelayed(new bd._cls31._cls1(this, ratetype), 375L);
            }
        }

        public final void b()
        {
            bd.C(a);
            if (bd.c(a) != null)
            {
                User user = bd.c(a).getRec();
                if (user != null && user.isSuperLike())
                {
                    bd.c(a).getSuperLikeStar().animate().alpha(1.0F).start();
                }
            }
        }

            
            {
                a = bd1;
                super();
            }
    }

}
