// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.domain.payment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import me.lyft.android.common.Objects;
import me.lyft.android.infrastructure.lyft.payment.CreditDTO;

// Referenced classes of package me.lyft.android.domain.payment:
//            Credit

public class CreditMapper
{

    public CreditMapper()
    {
    }

    public static List fromCreditDTO(List list)
    {
        if (list == null || list.isEmpty())
        {
            return Collections.emptyList();
        }
        ArrayList arraylist = new ArrayList();
        for (list = list.iterator(); list.hasNext(); arraylist.add(fromCreditDTO((CreditDTO)list.next()))) { }
        return arraylist;
    }

    public static Credit fromCreditDTO(CreditDTO creditdto)
    {
        Credit credit = new Credit();
        credit.setId((String)Objects.firstNonNull(creditdto.getId(), ""));
        credit.setLabel((String)Objects.firstNonNull(creditdto.getLabel(), ""));
        credit.setTitle((String)Objects.firstNonNull(creditdto.getTitle(), ""));
        credit.setCommuteCredits(((Boolean)Objects.firstNonNull(creditdto.isCommuteCredits(), Boolean.valueOf(false))).booleanValue());
        credit.setCreditRestrictions((List)Objects.firstNonNull(creditdto.getCreditRestrictions(), new ArrayList()));
        credit.setInvalidRestrictions((List)Objects.firstNonNull(creditdto.getInvalidRestrictions(), new ArrayList()));
        credit.setDescription((String)Objects.firstNonNull(creditdto.getDescription(), ""));
        credit.setInvalidTitle((String)Objects.firstNonNull(creditdto.getInvalidTitle(), ""));
        return credit;
    }
}
