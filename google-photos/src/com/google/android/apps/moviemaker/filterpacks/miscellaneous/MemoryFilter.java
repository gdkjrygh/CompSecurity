// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.moviemaker.filterpacks.miscellaneous;

import ahn;
import ahs;
import aif;
import ajo;
import ajr;
import aju;
import ajw;

public class MemoryFilter extends ahn
{

    private static final int PHASE_FILLING_BUFFER = 0;
    private static final int PHASE_NORMAL = 1;
    private int mNextSlot;
    private int mPhase;
    private ahs mPreviousFrames[];
    private int mSlots;

    public MemoryFilter(ajr ajr, String s)
    {
        super(ajr, s);
        mPreviousFrames = new ahs[0];
        mPhase = 0;
        mSlots = 1;
        mNextSlot = 0;
    }

    public final ajw b()
    {
        return (new ajw()).a("current", 2, aif.a()).b("current", 2, aif.a()).a("slots", 1, aif.a(Integer.TYPE)).b("previous", 2, aif.a()).a();
    }

    public final void b(ajo ajo1)
    {
        if (ajo1.b.equals("slots"))
        {
            ajo1.a("mSlots");
            ajo1.g = true;
        }
    }

    protected final void e()
    {
        aju aju1;
        aju aju2;
        Object obj;
        aju1 = b("previous");
        aju2 = b("current");
        obj = a("current");
        if (mSlots != mPreviousFrames.length)
        {
            mPreviousFrames = new ahs[mSlots];
            mPhase = 0;
            mNextSlot = 0;
        }
        mPhase;
        JVM INSTR tableswitch 0 1: default 80
    //                   0 81
    //                   1 166;
           goto _L1 _L2 _L3
_L1:
        return;
_L2:
        mPreviousFrames[mNextSlot] = ((ajo) (obj)).a();
        mPreviousFrames[mNextSlot].j();
        aju2.a(mPreviousFrames[mNextSlot]);
        aju1.a(mPreviousFrames[mNextSlot]);
        mNextSlot = (mNextSlot + 1) % mSlots;
        if (mNextSlot == 0)
        {
            mPhase = 1;
            obj.f = true;
            return;
        }
          goto _L1
_L3:
        obj = ((ajo) (obj)).a();
        aju2.a(((ahs) (obj)));
        aju1.a(mPreviousFrames[mNextSlot]);
        mPreviousFrames[mNextSlot].i();
        mPreviousFrames[mNextSlot] = ((ahs) (obj));
        mPreviousFrames[mNextSlot].j();
        mNextSlot = (mNextSlot + 1) % mSlots;
        return;
    }
}
