// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.paymentcard.api;


public final class CardColor
{

    public static final CardColor BLACK;
    public static final CardColor BLUE;
    private static final CardColor CARD_COLORS[];
    public static final CardColor GOLD;
    public static final CardColor GRAY;
    public static final CardColor GREEN;
    public static final CardColor RED;
    private final int mLower;
    private final int mUpper;

    private CardColor(int i, int j)
    {
        mUpper = i;
        mLower = j;
    }

    public static CardColor create(int i, int j)
    {
        CardColor acardcolor[] = CARD_COLORS;
        int l = acardcolor.length;
        for (int k = 0; k < l; k++)
        {
            CardColor cardcolor = acardcolor[k];
            if (cardcolor.getUpper() == i && cardcolor.getLower() == j)
            {
                return cardcolor;
            }
        }

        return new CardColor(i, j);
    }

    public static CardColor getDefaultColor()
    {
        return GRAY;
    }

    private int getLower()
    {
        return mLower;
    }

    private int getUpper()
    {
        return mUpper;
    }

    public final boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj == null || getClass() != obj.getClass())
            {
                return false;
            }
            obj = (CardColor)obj;
            if (getUpper() != ((CardColor) (obj)).getUpper() || getLower() != ((CardColor) (obj)).getLower())
            {
                return false;
            }
        }
        return true;
    }

    public final int[] getGradientDrawableColors()
    {
        return (new int[] {
            mUpper, mLower
        });
    }

    public final int hashCode()
    {
        return mUpper * 31 + mLower;
    }

    static 
    {
        GRAY = new CardColor(0xffe0e0e0, 0xffa1a1a1);
        GOLD = new CardColor(0xfff8db6a, 0xffb96c00);
        RED = new CardColor(0xfff8484e, 0xffc31000);
        BLACK = new CardColor(0xff555555, 0xff222222);
        GREEN = new CardColor(0xff8dd100, 0xff4f8700);
        BLUE = new CardColor(0xff7fcef2, 0xff0069ba);
        CARD_COLORS = (new CardColor[] {
            GRAY, GOLD, RED, BLACK, GREEN, BLUE
        });
    }
}
