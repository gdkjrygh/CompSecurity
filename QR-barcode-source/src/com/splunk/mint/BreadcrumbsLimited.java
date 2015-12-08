// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.splunk.mint;

import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONArray;

// Referenced classes of package com.splunk.mint:
//            Logger

class BreadcrumbsLimited extends ArrayList
{

    protected static final int MAX_BREADCRUMBS = 16;
    private static final long serialVersionUID = 0x9d0bd88c6ddf5fdbL;

    BreadcrumbsLimited()
    {
    }

    public boolean addToList(String s)
    {
        String s1 = s;
        if (s == null)
        {
            s1 = "null";
        }
        Logger.logInfo((new StringBuilder()).append("Breadcrumb: ").append(s1).append(" was added to the breadcrumb list").toString());
        add(s1);
        if (size() > 16)
        {
            Logger.logInfo((new StringBuilder()).append("Breadcrumbs list is bigger than ").append(String.valueOf(16)).append(" items, removing the oldest one.").toString());
            remove(0);
        }
        return true;
    }

    public JSONArray getList()
    {
        JSONArray jsonarray = new JSONArray();
        for (Iterator iterator = iterator(); iterator.hasNext(); jsonarray.put((String)iterator.next())) { }
        return jsonarray;
    }
}
