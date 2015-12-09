// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.ads.model;

import android.util.SparseArray;
import com.spotify.mobile.android.cosmos.JacksonModel;
import java.util.EnumSet;
import java.util.Iterator;

public final class mValue extends Enum
    implements JacksonModel
{

    private static final getValue $VALUES[];
    public static final getValue END_CARD_AD;
    public static final getValue NORMAL;
    public static final getValue OFFER_AD;
    private static SparseArray sValueMap;
    private final int mValue;

    public static mValue getByValue(int i)
    {
        return (mValue)sValueMap.get(i);
    }

    public static sValueMap valueOf(String s)
    {
        return (sValueMap)Enum.valueOf(com/spotify/mobile/android/spotlets/ads/model/Ad$AdType, s);
    }

    public static sValueMap[] values()
    {
        return (sValueMap[])$VALUES.clone();
    }

    public final int getValue()
    {
        return mValue;
    }

    static 
    {
        NORMAL = new <init>("NORMAL", 0, 0);
        OFFER_AD = new <init>("OFFER_AD", 1, 1);
        END_CARD_AD = new <init>("END_CARD_AD", 2, 2);
        $VALUES = (new .VALUES[] {
            NORMAL, OFFER_AD, END_CARD_AD
        });
        sValueMap = new SparseArray();
        mValue mvalue;
        for (Iterator iterator = EnumSet.allOf(com/spotify/mobile/android/spotlets/ads/model/Ad$AdType).iterator(); iterator.hasNext(); sValueMap.put(mvalue.getValue(), mvalue))
        {
            mvalue = (getValue)iterator.next();
        }

    }

    private (String s, int i, int j)
    {
        super(s, i);
        mValue = j;
    }
}
