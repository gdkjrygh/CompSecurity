// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.api.services.now.model;

import com.google.api.client.json.GenericJson;
import com.google.api.client.util.Data;
import com.google.api.client.util.GenericData;
import java.util.List;

// Referenced classes of package com.google.api.services.now.model:
//            Button, Address, TemplatedString, Image, 
//            Action

public final class GenericCard extends GenericJson
{

    private Address address;
    private List buttons;
    private TemplatedString content;
    private Image image;
    private Image logo;
    private Action tapAction;
    private TemplatedString title;

    public GenericCard()
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

    public GenericCard clone()
    {
        return (GenericCard)super.clone();
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

    public TemplatedString getContent()
    {
        return content;
    }

    public Image getImage()
    {
        return image;
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

    public GenericCard set(String s, Object obj)
    {
        return (GenericCard)super.set(s, obj);
    }

    public GenericCard setAddress(Address address1)
    {
        address = address1;
        return this;
    }

    public GenericCard setButtons(List list)
    {
        buttons = list;
        return this;
    }

    public GenericCard setContent(TemplatedString templatedstring)
    {
        content = templatedstring;
        return this;
    }

    public GenericCard setImage(Image image1)
    {
        image = image1;
        return this;
    }

    public GenericCard setLogo(Image image1)
    {
        logo = image1;
        return this;
    }

    public GenericCard setTapAction(Action action)
    {
        tapAction = action;
        return this;
    }

    public GenericCard setTitle(TemplatedString templatedstring)
    {
        title = templatedstring;
        return this;
    }

    static 
    {
        Data.nullOf(com/google/api/services/now/model/Button);
    }
}
