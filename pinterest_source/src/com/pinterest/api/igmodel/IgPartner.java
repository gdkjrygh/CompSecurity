// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.api.igmodel;

import com.pinterest.api.model.Partner;

// Referenced classes of package com.pinterest.api.igmodel:
//            IgModel

public class IgPartner
    implements IgModel
{

    public String a;
    public String b;
    public Boolean c;
    public String d;
    public String e;
    public String f;

    public IgPartner()
    {
    }

    public final Partner a()
    {
        Partner partner = new Partner();
        partner.setUid(a);
        partner.setAccountType(b);
        partner.setAutoFollowAllowed(c);
        partner.setBusinessName(d);
        partner.setContactName(e);
        partner.setType(f);
        return partner;
    }

    public Object getModel()
    {
        return a();
    }
}
