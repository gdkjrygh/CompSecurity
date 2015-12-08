// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.fragments;

import android.text.TextUtils;
import com.tinder.adapters.i;
import com.tinder.e.ao;
import com.tinder.e.n;
import com.tinder.managers.ab;
import com.tinder.managers.d;
import com.tinder.model.SuperlikeStatus;
import com.tinder.model.User;
import java.util.LinkedList;

// Referenced classes of package com.tinder.fragments:
//            bd

final class a
    implements ao
{

    final a a;

    public final void a()
    {
        bd.p(a.a.a);
        bd.q(a.a.a);
    }

    public final void a(User user)
    {
        bd.p(a.a.a);
        bd.q(a.a.a);
    }

    public final void a(User user, SuperlikeStatus superlikestatus)
    {
        bd.a(a.a.a, user);
        bd.a(a.a.a, bd.m(a.a.a));
        a.a.a.g.a.add(0, user);
        bd.a(a.a.a, superlikestatus.numRemaining);
        bd.e(a.a.a).a(bd.o(a.a.a));
    }

    public final void a(String s)
    {
        bd.p(a.a.a);
        (new StringBuilder("lastRecWasSuperlike? ")).append(bd.g(a.a.a));
        bd.q(a.a.a);
        if (TextUtils.equals(bd.o(a.a.a).getId(), s))
        {
            bd.r(a.a.a);
        }
    }

    public final void b()
    {
        bd.p(a.a.a);
        bd.q(a.a.a);
    }

    us(us us)
    {
        a = us;
        super();
    }

    // Unreferenced inner class com/tinder/fragments/bd$7

/* anonymous class */
    final class bd._cls7
        implements ao
    {

        final bd a;

        public final void a()
        {
            (new StringBuilder("lastRecWasSuperlike? ")).append(bd.g(a));
            bd.p(a);
            bd.q(a);
        }

        public final void a(User user)
        {
            a.k.a(1, new bd._cls7._cls1(this, user));
        }

        public final void a(User user, SuperlikeStatus superlikestatus)
        {
            bd.a(a, bd.m(a));
            bd.a(a, superlikestatus.numRemaining);
            bd.e(a).a(bd.o(a));
        }

        public final void a(String s)
        {
            (new StringBuilder("mLastSwipeWasSuperlike was ")).append(bd.g(a));
            bd.p(a);
            bd.q(a);
            if (TextUtils.equals(bd.o(a).getId(), s))
            {
                bd.r(a);
            }
        }

        public final void b()
        {
            a.k.e();
        }

            
            {
                a = bd1;
                super();
            }
    }


    // Unreferenced inner class com/tinder/fragments/bd$7$1

/* anonymous class */
    final class bd._cls7._cls1
        implements n
    {

        final User a;
        final bd._cls7 b;

        public final void a()
        {
            b.a.g.a(a, new bd._cls7._cls1._cls1(this));
        }

        public final void b()
        {
            bd.p(b.a);
            bd.q(b.a);
        }

        public final void c()
        {
            bd.p(b.a);
            bd.q(b.a);
        }

            
            {
                b = _pcls7;
                a = user;
                super();
            }
    }

}
