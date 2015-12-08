// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.googlecode.flickrjandroid.stats;

import java.net.MalformedURLException;
import java.net.URL;
import org.json.JSONArray;
import org.json.JSONObject;

// Referenced classes of package com.googlecode.flickrjandroid.stats:
//            Domain, DomainList, Referrer, ReferrerList, 
//            Stats

public final class StatsUtils
{

    private StatsUtils()
    {
    }

    public static Domain createDomain(JSONObject jsonobject)
    {
        Domain domain = new Domain();
        domain.setName(jsonobject.getString("name"));
        domain.setViews(jsonobject.getInt("views"));
        return domain;
    }

    public static DomainList createDomainList(JSONObject jsonobject)
    {
        DomainList domainlist = new DomainList();
        domainlist.setPerPage(jsonobject.getInt("perpage"));
        domainlist.setPages(jsonobject.getInt("pages"));
        domainlist.setPage(jsonobject.getInt("page"));
        domainlist.setTotal(jsonobject.getInt("total"));
        jsonobject = jsonobject.optJSONArray("domain");
        int i = 0;
        do
        {
            if (jsonobject == null || i >= jsonobject.length())
            {
                return domainlist;
            }
            domainlist.add(createDomain(jsonobject.getJSONObject(i)));
            i++;
        } while (true);
    }

    public static Referrer createReferrer(JSONObject jsonobject)
    {
        Referrer referrer = new Referrer();
        String s = jsonobject.optString("url", null);
        if (s != null)
        {
            try
            {
                referrer.setUrl(new URL(s));
            }
            catch (MalformedURLException malformedurlexception) { }
        }
        referrer.setViews(jsonobject.getInt("views"));
        referrer.setSearchterm(jsonobject.optString("searchterm"));
        return referrer;
    }

    public static ReferrerList createReferrerList(JSONObject jsonobject)
    {
        ReferrerList referrerlist = new ReferrerList();
        referrerlist.setPerPage(jsonobject.getInt("perpage"));
        referrerlist.setPages(jsonobject.getInt("pages"));
        referrerlist.setPage(jsonobject.getInt("page"));
        referrerlist.setTotal(jsonobject.getInt("total"));
        referrerlist.setName(jsonobject.optString("name"));
        jsonobject = jsonobject.optJSONArray("referrer");
        int i = 0;
        do
        {
            if (jsonobject == null || i >= jsonobject.length())
            {
                return referrerlist;
            }
            referrerlist.add(createReferrer(jsonobject.getJSONObject(i)));
            i++;
        } while (true);
    }

    public static Stats createStats(JSONObject jsonobject)
    {
        jsonobject = jsonobject.getJSONObject("stats");
        Stats stats = new Stats();
        stats.setComments(jsonobject.optInt("comments"));
        stats.setViews(jsonobject.optInt("views"));
        stats.setFavorites(jsonobject.optInt("favorites"));
        return stats;
    }
}
