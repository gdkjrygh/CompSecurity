// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.moviemaker.filterpacks.miscellaneous;

import ahs;
import aif;
import aig;
import ajo;
import ajr;
import ajw;
import akm;

// Referenced classes of package com.google.android.apps.moviemaker.filterpacks.miscellaneous:
//            BaseEmitterFilter

public class KeyFrameEmitterFilter extends BaseEmitterFilter
{

    public KeyFrameEmitterFilter(ajr ajr, String s)
    {
        super(ajr, s);
    }

    public final ajw b()
    {
        return (new ajw()).a("videoInfo", 2, aif.a(akm)).a("frameNumber", 2, aif.a(Integer.TYPE)).a();
    }

    protected final void e()
    {
        aig aig1 = a("videoInfo").a().d();
        aig aig2 = a("frameNumber").a().d();
        if (((akm)aig1.m()).a)
        {
            a(aig1.c() / 1000L, (Integer)aig2.m());
        }
    }
}
