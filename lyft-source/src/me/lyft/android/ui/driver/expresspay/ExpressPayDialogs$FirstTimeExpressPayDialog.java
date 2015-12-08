// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.driver.expresspay;

import me.lyft.android.infrastructure.lyft.constants.Constants;

public class setTargetScreen extends setTargetScreen
{

    public (Constants constants, String s)
    {
        setMessage(constants.getExpressPayPromoPopUpText());
        setTitleIcon(Integer.valueOf(0x7f0200f2));
        setTitle(s);
        setButtonText(constants.getExpressPayPromoPopUpButtonText());
        setTargetScreen(new me.lyft.android.ui.driver.sPayDialog.setTargetScreen());
    }
}
