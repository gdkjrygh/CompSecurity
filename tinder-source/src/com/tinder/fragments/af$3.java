// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.fragments;

import com.tinder.e.ap;
import com.tinder.enums.ReportCause;

// Referenced classes of package com.tinder.fragments:
//            af

final class a
    implements ap
{

    final af a;

    public final void a(ReportCause reportcause, String s)
    {
        if (af.n(a) || af.l(a))
        {
            return;
        }
        af.o(a);
        if (reportcause != null)
        {
            af.a(a, reportcause, s, true);
        }
        af.a(a, reportcause, s);
    }

    se(af af1)
    {
        a = af1;
        super();
    }
}
