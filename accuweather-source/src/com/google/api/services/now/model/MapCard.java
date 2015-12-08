// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.api.services.now.model;

import com.google.api.client.json.GenericJson;
import com.google.api.client.util.Data;
import com.google.api.client.util.GenericData;
import java.util.List;

// Referenced classes of package com.google.api.services.now.model:
//            Button, LabelContentPair, Image, Map, 
//            TemplatedString

public final class MapCard extends GenericJson
{

    private List buttons;
    private List labelContentPairs;
    private Image logo;
    private Map map;
    private TemplatedString title;

    public MapCard()
    {
    }

    public volatile GenericJson clone()
    {
        return clone();
    }

    public volatile GenericData clone()
    {
        return clone();
    }

    public MapCard clone()
    {
        return (MapCard)super.clone();
    }

    public volatile Object clone()
        throws CloneNotSupportedException
    {
        return clone();
    }

    public List getButtons()
    {
        return buttons;
    }

    public List getLabelContentPairs()
    {
        return labelContentPairs;
    }

    public Image getLogo()
    {
        return logo;
    }

    public Map getMap()
    {
        return map;
    }

    public TemplatedString getTitle()
    {
        return title;
    }

    public volatile GenericJson set(String s, Object obj)
    {
        return set(s, obj);
    }

    public volatile GenericData set(String s, Object obj)
    {
        return set(s, obj);
    }

    public MapCard set(String s, Object obj)
    {
        return (MapCard)super.set(s, obj);
    }

    public MapCard setButtons(List list)
    {
        buttons = list;
        return this;
    }

    public MapCard setLabelContentPairs(List list)
    {
        labelContentPairs = list;
        return this;
    }

    public MapCard setLogo(Image image)
    {
        logo = image;
        return this;
    }

    public MapCard setMap(Map map1)
    {
        map = map1;
        return this;
    }

    public MapCard setTitle(TemplatedString templatedstring)
    {
        title = templatedstring;
        return this;
    }

    static 
    {
        Data.nullOf(com/google/api/services/now/model/Button);
        Data.nullOf(com/google/api/services/now/model/LabelContentPair);
    }
}
