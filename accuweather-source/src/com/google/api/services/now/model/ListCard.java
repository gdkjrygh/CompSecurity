// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.api.services.now.model;

import com.google.api.client.json.GenericJson;
import com.google.api.client.util.GenericData;
import java.util.List;

// Referenced classes of package com.google.api.services.now.model:
//            Button, Image, TemplatedString

public final class ListCard extends GenericJson
{

    private Button button;
    private List listItems;
    private Image logo;
    private TemplatedString title;

    public ListCard()
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

    public ListCard clone()
    {
        return (ListCard)super.clone();
    }

    public volatile Object clone()
        throws CloneNotSupportedException
    {
        return clone();
    }

    public Button getButton()
    {
        return button;
    }

    public List getListItems()
    {
        return listItems;
    }

    public Image getLogo()
    {
        return logo;
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

    public ListCard set(String s, Object obj)
    {
        return (ListCard)super.set(s, obj);
    }

    public ListCard setButton(Button button1)
    {
        button = button1;
        return this;
    }

    public ListCard setListItems(List list)
    {
        listItems = list;
        return this;
    }

    public ListCard setLogo(Image image)
    {
        logo = image;
        return this;
    }

    public ListCard setTitle(TemplatedString templatedstring)
    {
        title = templatedstring;
        return this;
    }
}
