// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.ads.model;


public final class mValue extends Enum
{

    public static final d a;
    public static final d b;
    public static final d c;
    public static final d d;
    private static final d e[];
    private final String mValue;

    public static mValue a(String s)
    {
        mValue amvalue[] = values();
        int j = amvalue.length;
        for (int i = 0; i < j; i++)
        {
            mValue mvalue = amvalue[i];
            if (mvalue.mValue.equals(s))
            {
                return mvalue;
            }
        }

        return a;
    }

    public static a valueOf(String s)
    {
        return (a)Enum.valueOf(com/spotify/mobile/android/spotlets/ads/model/Ad$FeaturedActionType, s);
    }

    public static a[] values()
    {
        return (a[])e.clone();
    }

    static 
    {
        a = new <init>("NONE", 0, "");
        b = new <init>("SAVE", 1, "Save");
        c = new <init>("OPT_IN", 2, "optin");
        d = new <init>("OPT_OUT", 3, "optout");
        e = (new e[] {
            a, b, c, d
        });
    }

    private I(String s, int i, String s1)
    {
        super(s, i);
        mValue = s1;
    }
}
