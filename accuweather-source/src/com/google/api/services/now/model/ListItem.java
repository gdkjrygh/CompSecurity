// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.api.services.now.model;

import com.google.api.client.json.GenericJson;
import com.google.api.client.util.GenericData;
import java.util.List;

// Referenced classes of package com.google.api.services.now.model:
//            Image, TemplatedString, Action

public final class ListItem extends GenericJson
{

    private List details;
    private Image image;
    private TemplatedString subtitle;
    private Action tapAction;
    private TemplatedString title;

    public ListItem()
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

    public ListItem clone()
    {
        return (ListItem)super.clone();
    }

    public volatile Object clone()
        throws CloneNotSupportedException
    {
        return clone();
    }

    public List getDetails()
    {
        return details;
    }

    public Image getImage()
    {
        return image;
    }

    public TemplatedString getSubtitle()
    {
        return subtitle;
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

    public ListItem set(String s, Object obj)
    {
        return (ListItem)super.set(s, obj);
    }

    public ListItem setDetails(List list)
    {
        details = list;
        return this;
    }

    public ListItem setImage(Image image1)
    {
        image = image1;
        return this;
    }

    public ListItem setSubtitle(TemplatedString templatedstring)
    {
        subtitle = templatedstring;
        return this;
    }

    public ListItem setTapAction(Action action)
    {
        tapAction = action;
        return this;
    }

    public ListItem setTitle(TemplatedString templatedstring)
    {
        title = templatedstring;
        return this;
    }
}
