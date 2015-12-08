// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.stripe.model;


// Referenced classes of package com.stripe.model:
//            StripeObject

public class  extends StripeObject
{

    String details;
    String document;
    String status;

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj == null || getClass() != obj.getClass())
            {
                return false;
            }
            obj = ()obj;
            if (!equals(status, ((status) (obj)).status) || !equals(document, ((document) (obj)).document) || !equals(details, ((details) (obj)).details))
            {
                return false;
            }
        }
        return true;
    }

    public String getDetails()
    {
        return details;
    }

    public String getDocument()
    {
        return document;
    }

    public String getStatus()
    {
        return status;
    }

    public ()
    {
    }
}
