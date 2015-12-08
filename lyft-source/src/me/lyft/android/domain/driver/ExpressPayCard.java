// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.domain.driver;

import java.util.List;

// Referenced classes of package me.lyft.android.domain.driver:
//            Card

public class ExpressPayCard extends Card
{

    private String buttonText;

    public ExpressPayCard(Card.Style style, String s, String s1, String s2, List list, String s3, String s4)
    {
        super(style, s, s1, s2, list, s4);
        buttonText = s3;
    }

    public String getButtonText()
    {
        return buttonText;
    }
}
