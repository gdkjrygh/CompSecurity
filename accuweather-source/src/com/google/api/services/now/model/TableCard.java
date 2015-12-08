// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.api.services.now.model;

import com.google.api.client.json.GenericJson;
import com.google.api.client.util.Data;
import com.google.api.client.util.GenericData;
import java.util.List;

// Referenced classes of package com.google.api.services.now.model:
//            Button, LabelContentPair, Address, Image, 
//            Action, TemplatedString

public final class TableCard extends GenericJson
{

    private Address address;
    private List buttons;
    private List labelContentPairs;
    private Image logo;
    private Action tapAction;
    private TemplatedString title;

    public TableCard()
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

    public TableCard clone()
    {
        return (TableCard)super.clone();
    }

    public volatile Object clone()
        throws CloneNotSupportedException
    {
        return clone();
    }

    public Address getAddress()
    {
        return address;
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

    public Action getTapAction()
    {
        return tapAction;
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

    public TableCard set(String s, Object obj)
    {
        return (TableCard)super.set(s, obj);
    }

    public TableCard setAddress(Address address1)
    {
        address = address1;
        return this;
    }

    public TableCard setButtons(List list)
    {
        buttons = list;
        return this;
    }

    public TableCard setLabelContentPairs(List list)
    {
        labelContentPairs = list;
        return this;
    }

    public TableCard setLogo(Image image)
    {
        logo = image;
        return this;
    }

    public TableCard setTapAction(Action action)
    {
        tapAction = action;
        return this;
    }

    public TableCard setTitle(TemplatedString templatedstring)
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
