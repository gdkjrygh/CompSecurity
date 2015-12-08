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
    implements n
{

    final User a;
    final b b;

    public final void a()
    {
        b.b.g.a(a, new ao() {

            final bd._cls7._cls1 a;

            public final void a()
            {
                bd.p(a.b.a);
                bd.q(a.b.a);
            }

            public final void a(User user)
            {
                bd.p(a.b.a);
                bd.q(a.b.a);
            }

            public final void a(User user, SuperlikeStatus superlikestatus)
            {
                bd.a(a.b.a, user);
                bd.a(a.b.a, bd.m(a.b.a));
                a.b.a.g.a.add(0, user);
                bd.a(a.b.a, superlikestatus.numRemaining);
                bd.e(a.b.a).a(bd.o(a.b.a));
            }

            public final void a(String s)
            {
                bd.p(a.b.a);
                (new StringBuilder("lastRecWasSuperlike? ")).append(bd.g(a.b.a));
                bd.q(a.b.a);
                if (TextUtils.equals(bd.o(a.b.a).getId(), s))
                {
                    bd.r(a.b.a);
                }
            }

            public final void b()
            {
                bd.p(a.b.a);
                bd.q(a.b.a);
            }

            
            {
                a = bd._cls7._cls1.this;
                super();
            }
        });
    }

    public final void b()
    {
        bd.p(b.b);
        bd.q(b.b);
    }

    public final void c()
    {
        bd.p(b.b);
        bd.q(b.b);
    }

    _cls1.a(_cls1.a a1, User user)
    {
        b = a1;
        a = user;
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

}
