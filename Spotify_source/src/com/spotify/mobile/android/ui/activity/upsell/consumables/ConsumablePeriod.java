// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.ui.activity.upsell.consumables;


public final class ConsumablePeriod extends Enum
{

    public static final ConsumablePeriod a;
    public static final ConsumablePeriod b;
    public static final ConsumablePeriod c;
    private static final ConsumablePeriod d[];
    public int mCallToActionId;
    public int mCallToActionOneId;
    int mConfirmationId;
    int mConfirmationOneId;
    public int mDescriptionId;
    public int mDescriptionOneId;

    private ConsumablePeriod(String s, int i, int j, int k, int l, int i1, int j1, 
            int k1)
    {
        super(s, i);
        mDescriptionOneId = j;
        mDescriptionId = k;
        mConfirmationOneId = l;
        mConfirmationId = i1;
        mCallToActionOneId = j1;
        mCallToActionId = k1;
    }

    public static ConsumablePeriod valueOf(String s)
    {
        return (ConsumablePeriod)Enum.valueOf(com/spotify/mobile/android/ui/activity/upsell/consumables/ConsumablePeriod, s);
    }

    public static ConsumablePeriod[] values()
    {
        return (ConsumablePeriod[])d.clone();
    }

    static 
    {
        a = new ConsumablePeriod("HOUR", 0, 0x7f0805c9, 0x7f090031, 0x7f0805ba, 0x7f09002e, 0x7f0805b2, 0x7f09002b);
        b = new ConsumablePeriod("DAY", 1, 0x7f0805c8, 0x7f090030, 0x7f0805b9, 0x7f09002d, 0x7f0805b1, 0x7f09002a);
        c = new ConsumablePeriod("WEEK", 2, 0x7f0805ca, 0x7f090032, 0x7f0805bb, 0x7f09002f, 0x7f0805b3, 0x7f09002c);
        d = (new ConsumablePeriod[] {
            a, b, c
        });
    }
}
