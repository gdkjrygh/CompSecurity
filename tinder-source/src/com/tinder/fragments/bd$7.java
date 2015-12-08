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

    final bd a;

    public final void a()
    {
        (new StringBuilder("lastRecWasSuperlike? ")).append(bd.g(a));
        bd.p(a);
        bd.q(a);
    }

    public final void a(User user)
    {
        a.k.a(1, new n(user) {

            final User a;
            final bd._cls7 b;

            public final void a()
            {
                b.a.g.a(a, new ao(this) {

                    final _cls1 a;

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
                a = _pcls1;
                super();
            }
                });
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
                b = bd._cls7.this;
                a = user;
                super();
            }
        });
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

    _cls1.a(bd bd1)
    {
        a = bd1;
        super();
    }
}
