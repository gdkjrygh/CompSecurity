// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.fragments;

import android.widget.Toast;
import com.android.volley.Request;
import com.tinder.a.f;
import com.tinder.adapters.i;
import com.tinder.e.al;
import com.tinder.enums.Blend;
import com.tinder.enums.SwipeType;
import com.tinder.events.EventNewMatch;
import com.tinder.managers.ManagerApp;
import com.tinder.managers.a;
import com.tinder.managers.ab;
import com.tinder.managers.ae;
import com.tinder.managers.d;
import com.tinder.managers.e;
import com.tinder.managers.y;
import com.tinder.model.ConnectionsGroup;
import com.tinder.model.Match;
import com.tinder.model.SparksEvent;
import com.tinder.model.SuperlikeStatus;
import com.tinder.model.User;
import com.tinder.views.RecCard;
import de.greenrobot.event.c;
import java.util.LinkedList;
import org.json.JSONObject;

// Referenced classes of package com.tinder.fragments:
//            bd

final class a
    implements al
{

    final String a;
    final b b;

    public final void a()
    {
        com.tinder.fragments.bd.a(b.b, bd.m(b.b));
        (new StringBuilder("lastRecWasSuperlike? ")).append(bd.g(b.b));
        bd.l(b.b);
        b.b.k.e();
    }

    public final void a(Match match)
    {
        b.b.n.c(new EventNewMatch(match));
    }

    public final void a(SuperlikeStatus superlikestatus)
    {
        Object obj;
        Object obj1;
        int j;
        boolean flag;
        if (b.b)
        {
            obj = "BUTTON";
        } else
        {
            obj = "SWIPE";
        }
        flag = com.tinder.fragments.bd.c(b.b).getRec().isSuperLike();
        obj1 = b.b.j;
        j = ab.c(ae.C()).source;
        obj1 = new SparksEvent("Recs.Rate");
        ((SparksEvent) (obj1)).put("didSuperLike", Boolean.valueOf(flag));
        ((SparksEvent) (obj1)).put("superLike", Boolean.valueOf(bd.g(b.b)));
        ((SparksEvent) (obj1)).put("otherId", a);
        ((SparksEvent) (obj1)).put("method", obj);
        ((SparksEvent) (obj1)).put("fromMore", Boolean.valueOf(bd.h(b.b)));
        ((SparksEvent) (obj1)).put("like", Boolean.valueOf(true));
        ((SparksEvent) (obj1)).put("userTraveling", Boolean.valueOf(b.b.e.b()));
        b.b.o.a(a, ((SparksEvent) (obj1)));
        ((SparksEvent) (obj1)).put("blend", Integer.valueOf(j));
        if (b.b != null)
        {
            ((SparksEvent) (obj1)).put("recTraveling", Boolean.valueOf(b.b.isRecAndPassporting()));
            obj = b.b.getConnections();
            if (obj != null)
            {
                ((SparksEvent) (obj1)).put("firstDegrees", Integer.valueOf(((ConnectionsGroup) (obj)).getDegreeCount(1)));
                ((SparksEvent) (obj1)).put("secondDegrees", Integer.valueOf(((ConnectionsGroup) (obj)).getDegreeCount(2)));
            }
        }
        com.tinder.managers.a.a(((SparksEvent) (obj1)));
        if (com.tinder.fragments.bd.i(b.b))
        {
            if (bd.j(b.b))
            {
                bd.k(b.b);
            }
            bd bd1 = b.b;
            if (b.b)
            {
                obj = SwipeType.SUPER_LIKE_BUTTON;
            } else
            {
                obj = SwipeType.SUPER_LIKE_SWIPE;
            }
            com.tinder.fragments.bd.a(bd1, ((SwipeType) (obj)));
            com.tinder.fragments.bd.a(b.b, superlikestatus.numRemaining);
            bd.l(b.b);
        }
    }

    public final void a(User user)
    {
        com.tinder.fragments.bd.a(b.b, bd.m(b.b));
        (new StringBuilder("lastRecWasSuperlike? ")).append(bd.g(b.b));
        if (com.tinder.fragments.bd.i(b.b))
        {
            if (user != null)
            {
                Toast.makeText(b.b.getActivity(), b.b.getString(0x7f0601e3, new Object[] {
                    user.getName()
                }), 0).show();
            }
            if (com.tinder.fragments.bd.c(b.b) != null)
            {
                if (com.tinder.fragments.bd.c(b.b).getRecId().equals(a))
                {
                    com.tinder.fragments.bd.e(b.b).a();
                } else
                {
                    user = b.b.g;
                    User user1 = b.b;
                    if (((ab) (user)).a.size() > 2)
                    {
                        ((ab) (user)).a.add(2, user1);
                    } else
                    {
                        ((ab) (user)).a.add(user1);
                    }
                }
            }
            bd.l(b.b);
            b.b.a(false);
        }
    }

    public final void b()
    {
        com.tinder.fragments.bd.a(b.b, bd.m(b.b));
        (new StringBuilder("lastRecWasSuperlike? ")).append(bd.g(b.b));
        if (com.tinder.fragments.bd.c(b.b) != null)
        {
            com.tinder.fragments.bd.e(b.b).a();
        }
        bd.l(b.b);
        b.b.d();
    }

    public final void b(SuperlikeStatus superlikestatus)
    {
        com.tinder.fragments.bd.a(b.b, bd.m(b.b));
        (new StringBuilder("lastRecWasSuperlike? ")).append(bd.g(b.b));
        if (com.tinder.fragments.bd.i(b.b))
        {
            com.tinder.fragments.bd.a(b.b, superlikestatus.numRemaining);
            com.tinder.fragments.bd.e(b.b).a();
            bd.n(b.b);
        }
    }

    pp(pp pp, String s)
    {
        b = pp;
        a = s;
        super();
    }

    // Unreferenced inner class com/tinder/fragments/bd$6

/* anonymous class */
    final class bd._cls6
        implements Runnable
    {

        final boolean a;
        final User b;
        final bd c;

        public final void run()
        {
            String s = com.tinder.fragments.bd.c(c).getRecId();
            ab ab1 = c.g;
            bd._cls6._cls1 _lcls1 = new bd._cls6._cls1(this, s);
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
            obj = new com.tinder.a.d(1, String.format(ab1.m.O, new Object[] {
                s
            }), new JSONObject(), new com.tinder.managers.ab._cls2(ab1, ((User) (obj)), _lcls1, s), new com.tinder.managers.ab._cls3(ab1, _lcls1, ((User) (obj)), s), d.b());
            obj.j = new com.android.volley.c(20000, 1, 1.0F);
            ManagerApp.b().a(((Request) (obj)));
        }

            
            {
                c = bd1;
                a = flag;
                b = user;
                super();
            }
    }

}
