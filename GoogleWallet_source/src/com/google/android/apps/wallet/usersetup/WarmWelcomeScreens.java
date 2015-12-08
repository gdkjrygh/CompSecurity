// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.usersetup;


public final class WarmWelcomeScreens
{

    public static final int colors[];
    public static final int descriptions[];
    public static final int headers[];
    public static final int images[];
    public static final String screens[] = {
        "Warm Welcome Wallet Card", "Warm Welcome P2P", "Warm Welcome Loyalty and Gift Cards"
    };

    public static int length()
    {
        return headers.length;
    }

    static 
    {
        headers = (new int[] {
            com.google.android.apps.walletnfcrel.R.string.welcome_walletcard_heading, com.google.android.apps.walletnfcrel.R.string.welcome_p2p_heading, com.google.android.apps.walletnfcrel.R.string.welcome_loyalty_heading
        });
        descriptions = (new int[] {
            com.google.android.apps.walletnfcrel.R.string.welcome_walletcard_text, com.google.android.apps.walletnfcrel.R.string.welcome_p2p_text, com.google.android.apps.walletnfcrel.R.string.welcome_loyalty_text
        });
        images = (new int[] {
            com.google.android.apps.walletnfcrel.R.drawable.img_setup_walletcard_color_360x640dp, com.google.android.apps.walletnfcrel.R.drawable.img_setup_p2p_color_360x640dp, com.google.android.apps.walletnfcrel.R.drawable.img_setup_loyalty_color_360x640dp
        });
        colors = (new int[] {
            com.google.android.apps.walletnfcrel.R.color.warm_welcome_walletcard, com.google.android.apps.walletnfcrel.R.color.warm_welcome_p2p, com.google.android.apps.walletnfcrel.R.color.warm_welcome_loyalty
        });
    }
}
