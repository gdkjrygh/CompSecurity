// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.api.igmodel;

import com.pinterest.api.model.Domain;
import com.pinterest.api.model.User;

// Referenced classes of package com.pinterest.api.igmodel:
//            IgModel, IgUser

public class IgDomain
    implements IgModel
{

    public String a;
    public String b;
    public IgUser c;

    public IgDomain()
    {
    }

    public final Domain a()
    {
        Domain domain = new Domain();
        domain.setUid(a);
        domain.setName(b);
        if (c != null)
        {
            User user = c.a();
            domain.cacheOfficialUser(user);
            domain.setOfficialUserUid(user.getUid());
        }
        return domain;
    }

    public Object getModel()
    {
        return a();
    }
}
