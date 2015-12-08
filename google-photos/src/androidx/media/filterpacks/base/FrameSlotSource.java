// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package androidx.media.filterpacks.base;

import ahs;
import ahw;
import aif;
import ajr;
import aju;
import ajw;
import androidx.media.filterfw.SlotFilter;
import im;

public final class FrameSlotSource extends SlotFilter
{

    public FrameSlotSource(ajr ajr, String s, String s1)
    {
        super(ajr, s, s1);
    }

    public final ajw b()
    {
        return (new ajw()).b("frame", 2, aif.a()).a();
    }

    protected final void e()
    {
        Object obj = m();
        String s = mSlotName;
        ((ahw) (obj)).c();
        obj = ((ahw) (obj)).a(s).h();
        b("frame").a(((ahs) (obj)));
        ((ahs) (obj)).i();
    }

    protected final boolean k()
    {
        return super.k() && a();
    }
}
