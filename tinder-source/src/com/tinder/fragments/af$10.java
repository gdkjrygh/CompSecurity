// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.fragments;

import android.app.Activity;
import android.widget.TextView;
import com.tinder.adapters.n;
import com.tinder.e.q;
import com.tinder.enums.UserType;
import com.tinder.model.Match;
import com.tinder.model.Person;
import com.tinder.utils.ad;

// Referenced classes of package com.tinder.fragments:
//            af, bm

final class a
    implements Runnable
{

    final Activity a;
    final af b;

    public final void run()
    {
        af.i(b).b = 2;
        af.i(b).notifyDataSetChanged();
        af.a(b, (q)a);
        bm bm1 = af.i(b).c;
        if (bm1 != null)
        {
            Match match = af.c(b);
            bm1.f = UserType.MATCH;
            bm1.h = match;
            bm1.a(match.getPerson().getAvatarUrlsForSize(ad.a(bm1.getActivity())));
            bm1.d.setText(match.getName());
            (new StringBuilder("Match refresh career ")).append(bm1.h.getPerson().userId);
            bm1.a(bm1.getView());
        }
    }

    (af af1, Activity activity)
    {
        b = af1;
        a = activity;
        super();
    }
}
