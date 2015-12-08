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

public class FrameCountFilter extends ahn
{

    private static final aif INPUT_TYPE = aif.a();
    private static final aif OUTPUT_TYPE;
    private int mFrameNumber;
    public int mFrameNumberOffset;

    public FrameCountFilter(ajr ajr, String s)
    {
        super(ajr, s);
        mFrameNumber = 0;
        mFrameNumberOffset = 0;
    }

    public final ajw b()
    {
        return (new ajw()).a("input", 2, INPUT_TYPE).b("frameNumber", 2, OUTPUT_TYPE).a();
    }

    protected final void c()
    {
        super.c();
        mFrameNumber = 0;
    }

    protected final void e()
    {
        a("input").a();
        aju aju1 = b("frameNumber");
        aig aig1 = aju1.a(null).d();
        aig1.a(Integer.valueOf(mFrameNumberOffset + mFrameNumber));
        aju1.a(aig1);
        mFrameNumber = mFrameNumber + 1;
    }

    static 
    {
        OUTPUT_TYPE = aif.a(Integer.TYPE);
    }
}
