// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package androidx.media.filterpacks.base;

import ahw;
import aif;
import ajo;
import ajr;
import ajw;
import androidx.media.filterfw.SlotFilter;
import im;

public final class FrameSlotTarget extends SlotFilter
{

    public FrameSlotTarget(ajr ajr, String s, String s1)
    {
        super(ajr, s, s1);
    }

    public final ajw b()
    {
        return (new ajw()).a("frame", 2, aif.a()).a();
    }

    protected final void e()
    {
        ahs ahs = a("frame").a();
        ahw ahw1 = m();
        String s = mSlotName;
        ahw1.c();
        ahw1.a(s).a(ahs);
    }
}
