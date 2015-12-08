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

final class a
    implements com.tinder.utils._cls2._cls1
{

    final fire a;

    public final void a()
    {
        long l = (aj.c(a.a).getItemCount() - 1) + com.tinder.fragments.aj.d(a.a).b.size();
        Object obj = a.a.c.b();
        long l1 = d.a(((Iterable) (obj))).a(new at(this)).a();
        long l2 = d.a(((Iterable) (obj))).a(new au(this)).a();
        obj = (new SparksEvent("Match.SearchSelect")).put("numMatchesWithMessagesResult", Long.valueOf(l1)).put("numMatchesWithNameResult", Long.valueOf(l2)).put("numResults", Long.valueOf(l));
        if (a.a.getPerson() != null)
        {
            ((SparksEvent) (obj)).put("otherId", a.a.getPerson().userId);
        }
        ((SparksEvent) (obj)).put("matchId", a.a.getId());
        if (a.a.getName().toLowerCase().startsWith(com.tinder.fragments.aj.e(a.a)))
        {
            ((SparksEvent) (obj)).put("from", "name");
        } else
        {
            ((SparksEvent) (obj)).put("from", "message");
        }
        ((SparksEvent) (obj)).fire();
    }

    yMain(yMain ymain)
    {
        a = ymain;
        super();
    }

    // Unreferenced inner class com/tinder/fragments/aj$12

/* anonymous class */
    final class aj._cls12
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
                e.a(new aj._cls12._cls1(this)).a(false);
            }
        }

            
            {
                c = aj1;
                a = flag;
                b = match;
                super();
            }
    }

}
