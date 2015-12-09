// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.wobs.add;

import android.content.res.Resources;
import android.widget.ImageView;

public final class ProgramIcons
{

    public static int getIconResource(int i)
    {
        switch (i)
        {
        case 2: // '\002'
        case 3: // '\003'
        case 4: // '\004'
        case 5: // '\005'
        case 6: // '\006'
        case 7: // '\007'
        default:
            throw new IllegalArgumentException((new StringBuilder(28)).append("Unknown icon ID: ").append(i).toString());

        case 1: // '\001'
            return com.google.android.apps.walletnfcrel.R.drawable.ic_star_black_120dp;

        case 8: // '\b'
            return com.google.android.apps.walletnfcrel.R.drawable.ic_gift_black_120dp;

        case 9: // '\t'
            return com.google.android.apps.walletnfcrel.R.drawable.ic_grocery_black_120dp;

        case 10: // '\n'
            return com.google.android.apps.walletnfcrel.R.drawable.ic_dining_black_120dp;

        case 11: // '\013'
            return com.google.android.apps.walletnfcrel.R.drawable.ic_airline_black_120dp;

        case 12: // '\f'
            return com.google.android.apps.walletnfcrel.R.drawable.ic_pharmacy_black_120dp;
        }
    }

    public static void setColor(ImageView imageview, int i)
    {
        imageview.setColorFilter(imageview.getResources().getColor(i), android.graphics.PorterDuff.Mode.SRC_IN);
    }

    public static void setIcon(ImageView imageview, int i)
    {
        imageview.setImageResource(getIconResource(i));
    }
}
