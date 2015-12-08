// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.c;

import android.view.View;
import android.widget.ProgressBar;
import com.tinder.e.r;
import com.tinder.managers.a;
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
        SparksEvent sparksevent = new SparksEvent("Match.OpenChat");
        sparksevent.put("matchId", com.tinder.c.ae.a(a).getId());
        sparksevent.put("superLike", Boolean.valueOf(com.tinder.c.ae.a(a).isTheSuperLiker(view)));
        sparksevent.put("didSuperLike", Boolean.valueOf(com.tinder.c.ae.a(a).superLikerIsThem()));
        com.tinder.managers.a.a(sparksevent);
        ae.b(a).a(com.tinder.c.ae.a(a));
        ae.c(a).setVisibility(0);
    }

    gressBar(ae ae1)
    {
        a = ae1;
        super();
    }
}
