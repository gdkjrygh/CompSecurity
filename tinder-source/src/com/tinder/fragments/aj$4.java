// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.fragments;

import com.b.a.d;
import com.tinder.managers.a;
import com.tinder.managers.i;
import com.tinder.model.SparksEvent;
import java.util.Set;

// Referenced classes of package com.tinder.fragments:
//            aj, aq, ar

final class b
    implements com.tinder.utils.j._cls4
{

    final String a;
    final Set b;
    final aj c;

    public final void a()
    {
        Set set = c.c.b();
        SparksEvent sparksevent = new SparksEvent("Match.Search");
        sparksevent.put("query", a);
        sparksevent.put("numMatchesWithMessagesResult", Long.valueOf(d.a(set).a(new aq(this)).a()));
        sparksevent.put("numMatchesWithNameResult", Long.valueOf(d.a(set).a(new ar(this)).a()));
        sparksevent.put("numResults", Integer.valueOf(b.size()));
        com.tinder.managers.a.c(sparksevent);
    }

    nt(aj aj1, String s, Set set)
    {
        c = aj1;
        a = s;
        b = set;
        super();
    }
}
