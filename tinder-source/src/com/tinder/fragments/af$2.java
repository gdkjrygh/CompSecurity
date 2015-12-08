// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.fragments;

import com.tinder.e.ag;
import com.tinder.enums.ReportCause;

// Referenced classes of package com.tinder.fragments:
//            af

final class a
    implements ag
{

    final af a;

    public final void a(ReportCause reportcause, String s)
    {
        if (af.l(a))
        {
            return;
        } else
        {
            af.m(a);
            af.a(a, reportcause, s, false);
            return;
        }
    }

    se(af af1)
    {
        a = af1;
        super();
    }
}
