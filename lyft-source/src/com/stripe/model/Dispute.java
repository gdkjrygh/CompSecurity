// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.stripe.model;

import java.util.List;
import java.util.Map;

// Referenced classes of package com.stripe.model:
//            StripeObject, EvidenceDetails, EvidenceSubObject

public class Dispute extends StripeObject
{

    Integer amount;
    String balanceTransaction;
    List balanceTransactions;
    String charge;
    Long created;
    String currency;
    String evidence;
    EvidenceDetails evidenceDetails;
    Long evidenceDueBy;
    EvidenceSubObject evidenceSubObject;
    Boolean isChargeRefundable;
    Boolean livemode;
    Map metadata;
    String reason;
    String status;

    public Dispute()
    {
    }

    public Integer getAmount()
    {
        return amount;
    }

    public String getBalanceTransaction()
    {
        return balanceTransaction;
    }

    public List getBalanceTransactions()
    {
        return balanceTransactions;
    }

    public String getCharge()
    {
        return charge;
    }

    public Long getCreated()
    {
        return created;
    }

    public String getCurrency()
    {
        return currency;
    }

    public String getEvidence()
    {
        return evidence;
    }

    public EvidenceDetails getEvidenceDetails()
    {
        return evidenceDetails;
    }

    public Long getEvidenceDueBy()
    {
        return evidenceDueBy;
    }

    public EvidenceSubObject getEvidenceSubObject()
    {
        return evidenceSubObject;
    }

    public boolean getIsChargeRefundable()
    {
        return isChargeRefundable.booleanValue();
    }

    public Boolean getLivemode()
    {
        return livemode;
    }

    public Map getMetadata()
    {
        return metadata;
    }

    public String getReason()
    {
        return reason;
    }

    public String getStatus()
    {
        return status;
    }

    public void setAmount(Integer integer)
    {
        amount = integer;
    }

    public void setBalanceTransaction(String s)
    {
        balanceTransaction = s;
    }

    public void setBalanceTransactions(List list)
    {
        balanceTransactions = list;
    }

    public void setCharge(String s)
    {
        charge = s;
    }

    public void setCreated(Long long1)
    {
        created = long1;
    }

    public void setCurrency(String s)
    {
        currency = s;
    }

    public void setEvidence(String s)
    {
        evidence = s;
    }

    public void setEvidenceDetails(EvidenceDetails evidencedetails)
    {
        evidenceDetails = evidencedetails;
    }

    public void setEvidenceDueBy(Long long1)
    {
        evidenceDueBy = long1;
    }

    public void setEvidenceSubObject(EvidenceSubObject evidencesubobject)
    {
        evidenceSubObject = evidencesubobject;
    }

    public void setIsChargeRefundable(Boolean boolean1)
    {
        isChargeRefundable = boolean1;
    }

    public void setLivemode(Boolean boolean1)
    {
        livemode = boolean1;
    }

    public void setMetadata(Map map)
    {
        metadata = map;
    }

    public void setReason(String s)
    {
        reason = s;
    }

    public void setStatus(String s)
    {
        status = s;
    }
}
