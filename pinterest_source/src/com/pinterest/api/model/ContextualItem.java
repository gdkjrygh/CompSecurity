// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.api.model;

import com.pinterest.network.json.PinterestJsonArray;
import com.pinterest.network.json.PinterestJsonObject;
import com.pinterest.reporting.CrashReporting;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

// Referenced classes of package com.pinterest.api.model:
//            Model, Board, User, ContextualSearchObject

public class ContextualItem extends Model
{

    private String description;
    private String id;
    private com.pinterest.activity.explore.adapter.ContextualExploreAdapter.ObjectType objectType;
    private List relatedObjects;
    private String title;

    public ContextualItem()
    {
    }

    public static ContextualItem make(PinterestJsonObject pinterestjsonobject)
    {
        if (pinterestjsonobject != null) goto _L2; else goto _L1
_L1:
        return null;
_L2:
        ContextualItem contextualitem;
        contextualitem = new ContextualItem();
        contextualitem.setId(pinterestjsonobject.a("id", ""));
        contextualitem.setTitle(pinterestjsonobject.a("title", ""));
        contextualitem.setDescription(pinterestjsonobject.a("description", ""));
        contextualitem.setObjectType(pinterestjsonobject.a("object_type", ""));
        if (pinterestjsonobject.e("related_objects").a() == 0 || contextualitem.getObjectType() == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (contextualitem.getObjectType() == com.pinterest.activity.explore.adapter.ContextualExploreAdapter.ObjectType.Board)
        {
            contextualitem.setRelatedObjects(Board.makeAll(pinterestjsonobject.e("related_objects")));
        } else
        {
            if (contextualitem.getObjectType() != com.pinterest.activity.explore.adapter.ContextualExploreAdapter.ObjectType.User)
            {
                continue; /* Loop/switch isn't completed */
            }
            contextualitem.setRelatedObjects(User.makeAll(pinterestjsonobject.e("related_objects")));
        }
_L4:
        return contextualitem;
        if (contextualitem.getObjectType() != com.pinterest.activity.explore.adapter.ContextualExploreAdapter.ObjectType.Search) goto _L1; else goto _L3
_L3:
        contextualitem.setRelatedObjects(ContextualSearchObject.makeAll(pinterestjsonobject.e("related_objects")));
          goto _L4
        if (true) goto _L1; else goto _L5
_L5:
    }

    public static ArrayList parseContextualItemList(PinterestJsonArray pinterestjsonarray)
    {
        ArrayList arraylist;
        int i;
        arraylist = new ArrayList();
        if (pinterestjsonarray == null || pinterestjsonarray.a() <= 0)
        {
            break MISSING_BLOCK_LABEL_63;
        }
        i = 0;
_L3:
        if (i >= pinterestjsonarray.a()) goto _L2; else goto _L1
_L1:
        ContextualItem contextualitem = make(pinterestjsonarray.d(i));
        if (contextualitem != null)
        {
            try
            {
                arraylist.add(contextualitem);
            }
            catch (Exception exception)
            {
                CrashReporting.a(exception);
            }
        }
        i++;
          goto _L3
_L2:
        return arraylist;
    }

    public static void updateRelatedObjects(Object obj, ContextualItem contextualitem)
    {
        if (obj != null && contextualitem != null && (obj instanceof PinterestJsonArray))
        {
            obj = (PinterestJsonArray)obj;
            int i = 0;
            while (i < ((PinterestJsonArray) (obj)).a()) 
            {
                if (contextualitem.getObjectType() == com.pinterest.activity.explore.adapter.ContextualExploreAdapter.ObjectType.Board)
                {
                    contextualitem.setRelatedObjects(Board.makeAll(((PinterestJsonArray) (obj))));
                } else
                if (contextualitem.getObjectType() == com.pinterest.activity.explore.adapter.ContextualExploreAdapter.ObjectType.User)
                {
                    contextualitem.setRelatedObjects(User.makeAll(((PinterestJsonArray) (obj))));
                } else
                if (contextualitem.getObjectType() == com.pinterest.activity.explore.adapter.ContextualExploreAdapter.ObjectType.Search)
                {
                    contextualitem.setRelatedObjects(ContextualSearchObject.makeAll(((PinterestJsonArray) (obj))));
                }
                i++;
            }
        }
    }

    public Date getCacheExpirationDate()
    {
        return null;
    }

    public String getDescription()
    {
        return description;
    }

    public String getId()
    {
        return id;
    }

    public com.pinterest.activity.explore.adapter.ContextualExploreAdapter.ObjectType getObjectType()
    {
        return objectType;
    }

    public List getRelatedObjects()
    {
        return relatedObjects;
    }

    public String getTitle()
    {
        return title;
    }

    public String getUid()
    {
        return null;
    }

    public void setCacheExpirationDate(Date date)
    {
    }

    public void setDescription(String s)
    {
        description = s;
    }

    public void setId(String s)
    {
        id = s;
    }

    public void setObjectType(String s)
    {
        if (s.equalsIgnoreCase("board"))
        {
            objectType = com.pinterest.activity.explore.adapter.ContextualExploreAdapter.ObjectType.Board;
        } else
        {
            if (s.equalsIgnoreCase("user"))
            {
                objectType = com.pinterest.activity.explore.adapter.ContextualExploreAdapter.ObjectType.User;
                return;
            }
            if (s.equalsIgnoreCase("search"))
            {
                objectType = com.pinterest.activity.explore.adapter.ContextualExploreAdapter.ObjectType.Search;
                return;
            }
        }
    }

    public void setRelatedObjects(List list)
    {
        relatedObjects = list;
    }

    public void setTitle(String s)
    {
        title = s;
    }
}
