// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.fragments;

import android.widget.Toast;
import com.android.volley.Request;
import com.android.volley.c;
import com.tinder.a.d;
import com.tinder.a.f;
import com.tinder.adapters.i;
import com.tinder.d.a;
import com.tinder.e.al;
import com.tinder.enums.Blend;
import com.tinder.enums.SwipeType;
import com.tinder.events.EventNewMatch;
import com.tinder.managers.ManagerApp;
import com.tinder.managers.ab;
import com.tinder.managers.ae;
import com.tinder.managers.e;
import com.tinder.managers.y;
import com.tinder.model.ConnectionsGroup;
import com.tinder.model.Match;
import com.tinder.model.SparksEvent;
import com.tinder.model.SuperlikeStatus;
import com.tinder.model.User;
import com.tinder.views.RecCard;
import java.util.LinkedList;
import org.json.JSONObject;

// Referenced classes of package com.tinder.fragments:
//            bd

final class b
    implements Runnable
{

    final boolean a;
    final User b;
    final bd c;

    public final void run()
    {
        String s = com.tinder.fragments.bd.c(c).getRecId();
        ab ab1 = c.g;
        al al = new al(s) {

            final String a;
            final bd._cls6 b;

            public final void a()
            {
                com.tinder.fragments.bd.a(b.c, bd.m(b.c));
                (new StringBuilder("lastRecWasSuperlike? ")).append(bd.g(b.c));
                bd.l(b.c);
                b.c.k.e();
            }

            public final void a(Match match)
            {
                b.c.n.c(new EventNewMatch(match));
            }

            public final void a(SuperlikeStatus superlikestatus)
            {
                Object obj1;
                Object obj2;
                int j;
                boolean flag;
                if (b.a)
                {
                    obj1 = "BUTTON";
                } else
                {
                    obj1 = "SWIPE";
                }
                flag = com.tinder.fragments.bd.c(b.c).getRec().isSuperLike();
                obj2 = b.c.j;
                j = ab.c(ae.C()).source;
                obj2 = new SparksEvent("Recs.Rate");
                ((SparksEvent) (obj2)).put("didSuperLike", Boolean.valueOf(flag));
                ((SparksEvent) (obj2)).put("superLike", Boolean.valueOf(bd.g(b.c)));
                ((SparksEvent) (obj2)).put("otherId", a);
                ((SparksEvent) (obj2)).put("method", obj1);
                ((SparksEvent) (obj2)).put("fromMore", Boolean.valueOf(bd.h(b.c)));
                ((SparksEvent) (obj2)).put("like", Boolean.valueOf(true));
                ((SparksEvent) (obj2)).put("userTraveling", Boolean.valueOf(b.c.e.b()));
                b.c.o.a(a, ((SparksEvent) (obj2)));
                ((SparksEvent) (obj2)).put("blend", Integer.valueOf(j));
                if (b.b != null)
                {
                    ((SparksEvent) (obj2)).put("recTraveling", Boolean.valueOf(b.b.isRecAndPassporting()));
                    obj1 = b.b.getConnections();
                    if (obj1 != null)
                    {
                        ((SparksEvent) (obj2)).put("firstDegrees", Integer.valueOf(((ConnectionsGroup) (obj1)).getDegreeCount(1)));
                        ((SparksEvent) (obj2)).put("secondDegrees", Integer.valueOf(((ConnectionsGroup) (obj1)).getDegreeCount(2)));
                    }
                }
                com.tinder.managers.a.a(((SparksEvent) (obj2)));
                if (com.tinder.fragments.bd.i(b.c))
                {
                    if (bd.j(b.c))
                    {
                        bd.k(b.c);
                    }
                    bd bd1 = b.c;
                    if (b.a)
                    {
                        obj1 = SwipeType.SUPER_LIKE_BUTTON;
                    } else
                    {
                        obj1 = SwipeType.SUPER_LIKE_SWIPE;
                    }
                    com.tinder.fragments.bd.a(bd1, ((SwipeType) (obj1)));
                    com.tinder.fragments.bd.a(b.c, superlikestatus.numRemaining);
                    bd.l(b.c);
                }
            }

            public final void a(User user1)
            {
                com.tinder.fragments.bd.a(b.c, bd.m(b.c));
                (new StringBuilder("lastRecWasSuperlike? ")).append(bd.g(b.c));
                if (com.tinder.fragments.bd.i(b.c))
                {
                    if (user1 != null)
                    {
                        Toast.makeText(b.c.getActivity(), b.c.getString(0x7f0601e3, new Object[] {
                            user1.getName()
                        }), 0).show();
                    }
                    if (com.tinder.fragments.bd.c(b.c) != null)
                    {
                        if (com.tinder.fragments.bd.c(b.c).getRecId().equals(a))
                        {
                            com.tinder.fragments.bd.e(b.c).a();
                        } else
                        {
                            user1 = b.c.g;
                            User user2 = b.b;
                            if (((ab) (user1)).a.size() > 2)
                            {
                                ((ab) (user1)).a.add(2, user2);
                            } else
                            {
                                ((ab) (user1)).a.add(user2);
                            }
                        }
                    }
                    bd.l(b.c);
                    b.c.a(false);
                }
            }

            public final void b()
            {
                com.tinder.fragments.bd.a(b.c, bd.m(b.c));
                (new StringBuilder("lastRecWasSuperlike? ")).append(bd.g(b.c));
                if (com.tinder.fragments.bd.c(b.c) != null)
                {
                    com.tinder.fragments.bd.e(b.c).a();
                }
                bd.l(b.c);
                b.c.d();
            }

            public final void b(SuperlikeStatus superlikestatus)
            {
                com.tinder.fragments.bd.a(b.c, bd.m(b.c));
                (new StringBuilder("lastRecWasSuperlike? ")).append(bd.g(b.c));
                if (com.tinder.fragments.bd.i(b.c))
                {
                    com.tinder.fragments.bd.a(b.c, superlikestatus.numRemaining);
                    com.tinder.fragments.bd.e(b.c).a();
                    bd.n(b.c);
                }
            }

            
            {
                b = bd._cls6.this;
                a = s;
                super();
            }
        };
        ab1.n.g(s);
        Object obj;
        if (ab1.a.size() > 0)
        {
            obj = (User)ab1.a.getFirst();
            if (obj != null && ((User) (obj)).getId().equals(s))
            {
                User user = ab1.b(s);
                obj = user;
                if (user != null)
                {
                    ab1.f();
                    obj = user;
                }
            } else
            {
                obj = null;
            }
        } else
        {
            obj = null;
        }
        obj = new d(1, String.format(ab1.m.O, new Object[] {
            s
        }), new JSONObject(), new com.tinder.managers.<init>(ab1, ((User) (obj)), al, s), new com.tinder.managers.<init>(ab1, al, ((User) (obj)), s), com.tinder.managers.d.b());
        obj.j = new c(20000, 1, 1.0F);
        ManagerApp.b().a(((Request) (obj)));
    }

    _cls1.a(bd bd1, boolean flag, User user)
    {
        c = bd1;
        a = flag;
        b = user;
        super();
    }
}
