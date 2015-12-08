// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package androidx.media.filterfw;

import ahn;
import ahw;
import ajr;
import im;

public abstract class SlotFilter extends ahn
{

    public final String mSlotName;

    public SlotFilter(ajr ajr, String s, String s1)
    {
        super(ajr, s);
        mSlotName = s1;
    }

    public final boolean a()
    {
        return m().a(mSlotName).h_();
    }
}
