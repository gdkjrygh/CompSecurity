// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.moviemaker.filterpacks.miscellaneous;

import ahn;
import ahs;
import aif;
import aig;
import ajo;
import ajr;
import aju;
import ajw;
import b;

public class FrameDropFilter extends ahn
{

    private float mDropRate;

    public FrameDropFilter(ajr ajr, String s)
    {
        super(ajr, s);
        mDropRate = 0.95F;
    }

    public final ajw b()
    {
        return (new ajw()).a("input", 2, aif.a()).b("output", 2, aif.a()).a("dropRate", 1, aif.a(Float.TYPE)).a("frameNumber", 2, aif.a(Integer.TYPE)).a();
    }

    public final void b(ajo ajo1)
    {
        if (ajo1.b.equals("dropRate"))
        {
            ajo1.a("mDropRate");
            ajo1.g = true;
        }
    }

    protected final void e()
    {
        ahs ahs1 = a("input").a();
        if (!b.a(((Integer)a("frameNumber").a().d().m()).intValue(), mDropRate))
        {
            b("output").a(ahs1);
        }
    }
}
