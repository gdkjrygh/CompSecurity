// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.infrastructure.lyft.ride;

import java.util.List;
import me.lyft.android.infrastructure.lyft.payment.MoneyDTO;

public class FareDTO
{

    public static final String COURIER_TYPE = "courier";
    public final String buttonText;
    public final MoneyDTO comparisonMoney;
    public final String comparisonText;
    public final String confirmationButtonText;
    public final String confirmationSubtitle;
    public final String confirmationTitle;
    public final String descriptionText;
    public final Long dispatchTimeout;
    public final String fareType;
    public final String fixedFareToken;
    public final Boolean isSelected;
    public final List lineItems;
    public final Integer numSeats;
    public final Long timestamp;
    public final MoneyDTO totalMoney;

    public FareDTO(String s, MoneyDTO moneydto, String s1, MoneyDTO moneydto1, String s2, Integer integer, String s3, 
            Boolean boolean1, String s4, Long long1, String s5, String s6, String s7, Long long2, 
            List list)
    {
        fareType = s;
        totalMoney = moneydto;
        fixedFareToken = s1;
        comparisonMoney = moneydto1;
        comparisonText = s2;
        numSeats = integer;
        buttonText = s3;
        isSelected = boolean1;
        descriptionText = s4;
        dispatchTimeout = long1;
        confirmationTitle = s5;
        confirmationSubtitle = s6;
        confirmationButtonText = s7;
        timestamp = long2;
        lineItems = list;
    }
}
