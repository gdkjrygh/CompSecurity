// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.stripe.model;


// Referenced classes of package com.stripe.model:
//            StripeObject, DeletedStripeObject

public class DeletedInvoiceItem extends StripeObject
    implements DeletedStripeObject
{

    Boolean deleted;
    String id;

    public DeletedInvoiceItem()
    {
    }

    public Boolean getDeleted()
    {
        return deleted;
    }

    public String getId()
    {
        return id;
    }

    public void setDeleted(Boolean boolean1)
    {
        deleted = boolean1;
    }

    public void setId(String s)
    {
        id = s;
    }
}
