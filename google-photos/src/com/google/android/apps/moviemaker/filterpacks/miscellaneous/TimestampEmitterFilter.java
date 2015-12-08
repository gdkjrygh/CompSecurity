// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.moviemaker.filterpacks.miscellaneous;

import ahs;
import aif;
import ajo;
import ajr;
import aju;
import ajw;

// Referenced classes of package com.google.android.apps.moviemaker.filterpacks.miscellaneous:
//            BaseEmitterFilter

public class TimestampEmitterFilter extends BaseEmitterFilter
{

    public TimestampEmitterFilter(ajr ajr, String s)
    {
        super(ajr, s);
    }

    public final ajw b()
    {
        return (new ajw()).a("input", 2, aif.a()).b("output", 2, aif.a()).a();
    }

    protected final void b(ajo ajo1)
    {
        ajo1.a(b("output"));
    }

    protected final void e()
    {
        ahs ahs1 = a("input").a();
        a(ahs1.c() / 1000L, null);
        b("output").a(ahs1);
    }
}
