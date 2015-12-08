// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.stripe.model;


// Referenced classes of package com.stripe.model:
//            StripeObject

public final class EvidenceDetails extends StripeObject
{

    protected Long dueBy;
    protected Integer submissionCount;

    public EvidenceDetails()
    {
    }

    public Long getDueBy()
    {
        return dueBy;
    }

    public Integer getSubmissionCount()
    {
        return submissionCount;
    }

    public void setDueBy(Long long1)
    {
        dueBy = long1;
    }

    public void setSubmissionCount(Integer integer)
    {
        submissionCount = integer;
    }
}
