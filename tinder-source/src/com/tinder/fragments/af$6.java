// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.fragments;

import android.view.View;
import com.tinder.c.m;
import com.tinder.managers.i;
import com.tinder.model.Match;
import com.tinder.utils.ad;

// Referenced classes of package com.tinder.fragments:
//            af

final class a
    implements android.view.OnClickListener
{

    final af a;

    public final void onClick(View view)
    {
        if (!ad.c(af.b(a)))
        {
            Match match = a.c.a(af.c(a).getId());
            view = match;
            if (match == null)
            {
                view = af.c(a);
            }
            af.a(a, new m(a.getActivity(), a, view, null));
            af.b(a).show();
        }
    }

    istener(af af1)
    {
        a = af1;
        super();
    }
}
