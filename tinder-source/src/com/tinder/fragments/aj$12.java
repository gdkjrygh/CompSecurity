// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.fragments;

import com.b.a.d;
import com.tinder.activities.ActivityMain;
import com.tinder.adapters.ab;
import com.tinder.adapters.x;
import com.tinder.managers.i;
import com.tinder.model.Match;
import com.tinder.model.Person;
import com.tinder.model.SparksEvent;
import com.tinder.utils.e;
import java.util.ArrayList;

// Referenced classes of package com.tinder.fragments:
//            aj, at, au

final class b
    implements Runnable
{

    final boolean a;
    final Match b;
    final aj c;

    public final void run()
    {
        if (c.getActivity() instanceof ActivityMain)
        {
            ((ActivityMain)c.getActivity()).s();
        }
        if (a)
        {
            e.a(new com.tinder.utils.e.b() {

                final aj._cls12 a;

                public final void a()
                {
                    long l = (aj.c(a.c).getItemCount() - 1) + com.tinder.fragments.aj.d(a.c).b.size();
                    Object obj = a.c.c.b();
                    long l1 = d.a(((Iterable) (obj))).a(new at(this)).a();
                    long l2 = d.a(((Iterable) (obj))).a(new au(this)).a();
                    obj = (new SparksEvent("Match.SearchSelect")).put("numMatchesWithMessagesResult", Long.valueOf(l1)).put("numMatchesWithNameResult", Long.valueOf(l2)).put("numResults", Long.valueOf(l));
                    if (a.b.getPerson() != null)
                    {
                        ((SparksEvent) (obj)).put("otherId", a.b.getPerson().userId);
                    }
                    ((SparksEvent) (obj)).put("matchId", a.b.getId());
                    if (a.b.getName().toLowerCase().startsWith(com.tinder.fragments.aj.e(a.c)))
                    {
                        ((SparksEvent) (obj)).put("from", "name");
                    } else
                    {
                        ((SparksEvent) (obj)).put("from", "message");
                    }
                    ((SparksEvent) (obj)).fire();
                }

            
            {
                a = aj._cls12.this;
                super();
            }
            }).a(false);
        }
    }

    _cls1.a(aj aj1, boolean flag, Match match)
    {
        c = aj1;
        a = flag;
        b = match;
        super();
    }
}
