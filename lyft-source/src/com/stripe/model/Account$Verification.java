// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.stripe.model;

import java.util.List;

// Referenced classes of package com.stripe.model:
//            StripeObject

public class  extends StripeObject
{

    Boolean contacted;
    Long dueBy;
    List fieldsNeeded;

    public Boolean getContacted()
    {
        return contacted;
    }

    public Long getDueBy()
    {
        return dueBy;
    }

    public List getFieldsNeeded()
    {
        return fieldsNeeded;
    }

    public ()
    {
    }
}
