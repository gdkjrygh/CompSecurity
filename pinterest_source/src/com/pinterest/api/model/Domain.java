// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.api.model;

import com.pinterest.network.json.PinterestJsonObject;
import java.util.Date;

// Referenced classes of package com.pinterest.api.model:
//            Model, User, ModelHelper

public class Domain extends Model
{

    private User _officialUser;
    private Date cacheExpirationDate;
    private Long id;
    private String name;
    private String officialUserUid;
    private String uid;

    public Domain()
    {
    }

    public Domain(Long long1)
    {
        id = long1;
    }

    public Domain(Long long1, String s, String s1, String s2, Date date)
    {
        id = long1;
        uid = s;
        name = s1;
        officialUserUid = s2;
        cacheExpirationDate = date;
    }

    public static Domain make(PinterestJsonObject pinterestjsonobject, boolean flag)
    {
        if (pinterestjsonobject == null)
        {
            pinterestjsonobject = new Domain();
        } else
        {
            Domain domain = (Domain)pinterestjsonobject.a(com/pinterest/api/model/Domain);
            Object obj = pinterestjsonobject.c("official_user");
            pinterestjsonobject = domain;
            if (obj != null)
            {
                obj = User.make(((PinterestJsonObject) (obj)), false);
                pinterestjsonobject = domain;
                if (obj != null)
                {
                    domain.cacheOfficialUser(((User) (obj)));
                    domain.setOfficialUserUid(((User) (obj)).getUid());
                    return domain;
                }
            }
        }
        return pinterestjsonobject;
    }

    public static Domain merge(Domain domain)
    {
        if (domain == null)
        {
            return null;
        } else
        {
            return merge(domain, ModelHelper.getDomain(domain.getUid()));
        }
    }

    public static Domain merge(Domain domain, Domain domain1)
    {
        Domain domain2;
        if (domain == null)
        {
            domain2 = null;
        } else
        {
            domain2 = domain;
            if (domain1 != null)
            {
                if (domain.cacheExpirationDate != null)
                {
                    domain1.cacheExpirationDate = domain.cacheExpirationDate;
                }
                if (domain.officialUserUid != null)
                {
                    domain1.officialUserUid = domain.officialUserUid;
                    if (domain._officialUser != null)
                    {
                        domain1._officialUser = User.merge(domain._officialUser);
                    }
                }
                if (domain.name != null)
                {
                    domain1.name = domain.name;
                }
                return domain1;
            }
        }
        return domain2;
    }

    public void cacheOfficialUser(User user)
    {
        _officialUser = user;
    }

    public Date getCacheExpirationDate()
    {
        return cacheExpirationDate;
    }

    public Long getId()
    {
        return id;
    }

    public String getName()
    {
        return name;
    }

    public User getOfficialUser()
    {
        if (_officialUser == null || !_officialUser.getUid().equals(getOfficialUserUid()))
        {
            _officialUser = ModelHelper.getUser(getOfficialUserUid());
        }
        return _officialUser;
    }

    public String getOfficialUserUid()
    {
        return officialUserUid;
    }

    public String getUid()
    {
        return uid;
    }

    public void setCacheExpirationDate(Date date)
    {
        cacheExpirationDate = date;
    }

    public void setId(Long long1)
    {
        id = long1;
    }

    public void setName(String s)
    {
        name = s;
    }

    public void setOfficialUserUid(String s)
    {
        officialUserUid = s;
    }

    public void setUid(String s)
    {
        uid = s;
    }
}
