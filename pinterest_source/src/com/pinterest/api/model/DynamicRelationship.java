// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.api.model;

import com.pinterest.network.json.PinterestJsonArray;
import com.pinterest.network.json.PinterestJsonObject;
import java.util.ArrayList;

// Referenced classes of package com.pinterest.api.model:
//            ModelHelper, Model

public class DynamicRelationship
{

    private String actionDeepLink;
    private String actionText;
    private ArrayList followIds;
    private String highlightedId;
    private ArrayList objects;

    public DynamicRelationship()
    {
    }

    public DynamicRelationship(String s, String s1, String s2)
    {
        actionText = s;
        highlightedId = s1;
        actionDeepLink = s2;
    }

    public static DynamicRelationship make(PinterestJsonObject pinterestjsonobject)
    {
        boolean flag = false;
        if (pinterestjsonobject != null) goto _L2; else goto _L1
_L1:
        Object obj = null;
_L4:
        return ((DynamicRelationship) (obj));
_L2:
        DynamicRelationship dynamicrelationship = (DynamicRelationship)pinterestjsonobject.a(com/pinterest/api/model/DynamicRelationship);
        if (pinterestjsonobject.f("follow_ids"))
        {
            obj = pinterestjsonobject.e("follow_ids");
            dynamicrelationship.followIds = new ArrayList(((PinterestJsonArray) (obj)).a());
            int k = ((PinterestJsonArray) (obj)).a();
            for (int i = 0; i < k; i++)
            {
                dynamicrelationship.followIds.add(((PinterestJsonArray) (obj)).a(i));
            }

        }
        obj = dynamicrelationship;
        if (!pinterestjsonobject.f("objects"))
        {
            continue;
        }
        pinterestjsonobject = pinterestjsonobject.e("objects");
        dynamicrelationship.objects = new ArrayList(pinterestjsonobject.a());
        int l = pinterestjsonobject.a();
        int j = ((flag) ? 1 : 0);
        do
        {
            obj = dynamicrelationship;
            if (j >= l)
            {
                continue;
            }
            obj = ModelHelper.getModelFromJson(pinterestjsonobject.d(j));
            if (obj != null)
            {
                dynamicrelationship.objects.add(obj);
            }
            j++;
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
    }

    public String getActionDeepLink()
    {
        return actionDeepLink;
    }

    public String getActionText()
    {
        return actionText;
    }

    public String getFollowId(int i)
    {
        if (followIds == null || followIds.size() <= i)
        {
            return null;
        } else
        {
            return (String)followIds.get(i);
        }
    }

    public String getHighlightedId()
    {
        return highlightedId;
    }

    public Model getObject(int i)
    {
        if (objects == null || objects.size() <= i)
        {
            return null;
        } else
        {
            return (Model)objects.get(i);
        }
    }

    public void setActionDeepLink(String s)
    {
        actionDeepLink = s;
    }

    public void setActionText(String s)
    {
        actionText = s;
    }

    public void setHighlightedId(String s)
    {
        highlightedId = s;
    }
}
