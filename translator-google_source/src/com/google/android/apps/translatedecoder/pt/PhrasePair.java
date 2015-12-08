// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.translatedecoder.pt;

import com.google.android.apps.translatedecoder.decoder.w;
import java.io.Serializable;
import java.util.Arrays;

public class PhrasePair
    implements w, Serializable, Comparable
{

    private static final long serialVersionUID = 0x46fc92d9f4434e9bL;
    private double cost;
    private final int dictInfo[];
    private final int tgtWords[];

    public PhrasePair(int ai[], double d)
    {
        this(ai, null, d);
    }

    public PhrasePair(int ai[], int ai1[], double d)
    {
        tgtWords = ai;
        dictInfo = ai1;
        cost = d;
    }

    public int compareTo(PhrasePair phrasepair)
    {
        if (cost == phrasepair.cost())
        {
            return 0;
        }
        return cost() >= phrasepair.cost() ? 1 : -1;
    }

    public volatile int compareTo(Object obj)
    {
        return compareTo((PhrasePair)obj);
    }

    public double cost()
    {
        return cost;
    }

    public int[] dictInfo()
    {
        return dictInfo;
    }

    public boolean equals(Object obj)
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (obj instanceof PhrasePair)
        {
            obj = (PhrasePair)obj;
            flag = flag1;
            if (Arrays.equals(tgtWords, ((PhrasePair) (obj)).tgtWords))
            {
                flag = flag1;
                if (Arrays.equals(dictInfo, ((PhrasePair) (obj)).dictInfo))
                {
                    flag = flag1;
                    if (Math.abs(cost - ((PhrasePair) (obj)).cost) < 0.01D)
                    {
                        flag = true;
                    }
                }
            }
        }
        return flag;
    }

    public void setCost(double d)
    {
        cost = d;
    }

    public int[] tgtWords()
    {
        return tgtWords;
    }

    public String toString()
    {
        return (new StringBuilder("; trg=")).append(Arrays.toString(tgtWords)).append("; cost=").append(cost).toString();
    }
}
