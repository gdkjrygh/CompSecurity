// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.ui.swipefilters;


public final class VisualFilterType extends Enum
{

    private static final VisualFilterType $VALUES[];
    public static final VisualFilterType GREYSCALE;
    public static final VisualFilterType INSTASNAP;
    public static final VisualFilterType MISS_ETIKATE;
    public static final VisualFilterType UNFILTERED;

    private VisualFilterType(String s, int i)
    {
        super(s, i);
    }

    public static VisualFilterType valueOf(String s)
    {
        return (VisualFilterType)Enum.valueOf(com/snapchat/android/ui/swipefilters/VisualFilterType, s);
    }

    public static VisualFilterType[] values()
    {
        return (VisualFilterType[])$VALUES.clone();
    }

    static 
    {
        INSTASNAP = new VisualFilterType("INSTASNAP", 0);
        MISS_ETIKATE = new VisualFilterType("MISS_ETIKATE", 1);
        GREYSCALE = new VisualFilterType("GREYSCALE", 2);
        UNFILTERED = new VisualFilterType("UNFILTERED", 3);
        $VALUES = (new VisualFilterType[] {
            INSTASNAP, MISS_ETIKATE, GREYSCALE, UNFILTERED
        });
    }
}
