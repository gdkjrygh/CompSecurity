// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.domain.ride;

import java.util.Iterator;
import java.util.List;
import me.lyft.android.common.INullable;
import me.lyft.android.common.Objects;
import me.lyft.android.domain.payment.Money;
import me.lyft.android.domain.payment.NullMoney;

public class FixedFare
    implements INullable
{

    String buttonText;
    Money comparisonMoney;
    String comparisonText;
    String confirmationButtonText;
    String confirmationSubtitle;
    String confirmationTitle;
    String descriptionText;
    long dispatchTimeout;
    protected String fixedFareToken;
    boolean isSelected;
    protected int numSeats;
    protected Object originalJson;
    Money totalMoney;

    protected FixedFare()
    {
    }

    public static FixedFare create(Money money, int i, boolean flag, long l, Money money1, String s, String s1, 
            String s2, String s3, String s4, String s5, String s6, Object obj)
    {
        FixedFare fixedfare = new FixedFare();
        fixedfare.totalMoney = money;
        fixedfare.numSeats = i;
        fixedfare.isSelected = flag;
        fixedfare.dispatchTimeout = l;
        fixedfare.comparisonMoney = money1;
        fixedfare.comparisonText = s;
        fixedfare.buttonText = s1;
        fixedfare.confirmationButtonText = s2;
        fixedfare.confirmationTitle = s3;
        fixedfare.confirmationSubtitle = s4;
        fixedfare.descriptionText = s5;
        fixedfare.fixedFareToken = s6;
        fixedfare.originalJson = obj;
        return fixedfare;
    }

    public static FixedFare empty()
    {
        return NullFixedFare.getInstance();
    }

    public static FixedFare findFareByPartySize(List list, int i)
    {
        for (list = list.iterator(); list.hasNext();)
        {
            FixedFare fixedfare = (FixedFare)list.next();
            if (Objects.equals(fixedfare.getNumSeats(), Integer.valueOf(i)))
            {
                return fixedfare;
            }
        }

        return empty();
    }

    public String getButtonText()
    {
        return buttonText;
    }

    public Money getComparisonMoney()
    {
        return (Money)Objects.firstNonNull(comparisonMoney, NullMoney.getInstance());
    }

    public String getComparisonText()
    {
        return comparisonText;
    }

    public String getConfirmationButtonText()
    {
        return confirmationButtonText;
    }

    public String getConfirmationSubtitle()
    {
        return confirmationSubtitle;
    }

    public String getConfirmationTitle()
    {
        return confirmationTitle;
    }

    public String getDescriptionText()
    {
        return descriptionText;
    }

    public Long getDispatchTimeout()
    {
        return (Long)Objects.firstNonNull(Long.valueOf(dispatchTimeout), Long.valueOf(60L));
    }

    public String getFixedFareToken()
    {
        return fixedFareToken;
    }

    public Integer getNumSeats()
    {
        return Integer.valueOf(numSeats);
    }

    public Object getOriginalJson()
    {
        return originalJson;
    }

    public Money getTotalMoney()
    {
        return (Money)Objects.firstNonNull(totalMoney, NullMoney.getInstance());
    }

    public boolean isNull()
    {
        return false;
    }

    public Boolean isSelected()
    {
        return Boolean.valueOf(isSelected);
    }

    private class NullFixedFare extends FixedFare
    {

        private static final FixedFare INSTANCE = new NullFixedFare();

        static FixedFare getInstance()
        {
            return INSTANCE;
        }

        public boolean isNull()
        {
            return true;
        }


        private NullFixedFare()
        {
        }
    }

}
