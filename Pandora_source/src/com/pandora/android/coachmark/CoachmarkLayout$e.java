// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.android.coachmark;

import com.pandora.android.provider.b;
import com.pandora.radio.util.k;
import p.bz.d;
import p.cw.c;

// Referenced classes of package com.pandora.android.coachmark:
//            CoachmarkLayout, CoachmarkBuilder

protected class a
{

    final CoachmarkLayout a;

    public void onApplicationFocusChanged(d d)
    {
        a.a(com.pandora.android.coachmark.a);
        d = CoachmarkLayout.a(a).e();
        if (d != null)
        {
            b.a.b().o().a((() (d))., (() (d)).., false, com.pandora.android.coachmark..);
        }
        b.a.e().b(com.pandora.android.coachmark.CoachmarkLayout.c(a));
    }

    protected (CoachmarkLayout coachmarklayout)
    {
        a = coachmarklayout;
        super();
    }
}
