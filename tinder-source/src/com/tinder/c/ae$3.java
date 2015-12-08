// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.c;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import com.tinder.managers.a;
import com.tinder.managers.i;
import com.tinder.managers.z;
import com.tinder.model.Match;
import com.tinder.model.SparksEvent;

// Referenced classes of package com.tinder.c:
//            ae

final class init>
    implements android.view.OnClickListener
{

    final ae a;

    public final void onClick(View view)
    {
        view = a.b.b();
        SparksEvent sparksevent = new SparksEvent("Match.InviteFriends");
        sparksevent.put("matchId", com.tinder.c.ae.a(a).getId());
        sparksevent.put("superLike", Boolean.valueOf(com.tinder.c.ae.a(a).isTheSuperLiker(view)));
        sparksevent.put("didSuperLike", Boolean.valueOf(com.tinder.c.ae.a(a).superLikerIsThem()));
        com.tinder.managers.a.a(sparksevent);
        view = new Intent("android.intent.action.SEND");
        view.setType("text/plain");
        view.putExtra("android.intent.extra.TEXT", String.format(ae.d(a).getString(0x7f0601d2), new Object[] {
            Integer.valueOf(a.a.j())
        }));
        ae.d(a).startActivity(Intent.createChooser(view, ae.d(a).getString(0x7f0601d1)));
    }

    s.i(ae ae1)
    {
        a = ae1;
        super();
    }
}
