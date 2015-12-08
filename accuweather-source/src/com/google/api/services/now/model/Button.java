// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.api.services.now.model;

import com.google.api.client.json.GenericJson;
import com.google.api.client.util.GenericData;

// Referenced classes of package com.google.api.services.now.model:
//            Action

public final class Button extends GenericJson
{

    private String icon;
    private String name;
    private Action tapAction;

    public Button()
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

    public Button clone()
    {
        return (Button)super.clone();
    }

    public volatile Object clone()
        throws CloneNotSupportedException
    {
        return clone();
    }

    public String getIcon()
    {
        return icon;
    }

    public String getName()
    {
        return name;
    }

    public Action getTapAction()
    {
        return tapAction;
    }

    public volatile GenericJson set(String s, Object obj)
    {
        return set(s, obj);
    }

    public volatile GenericData set(String s, Object obj)
    {
        return set(s, obj);
    }

    public Button set(String s, Object obj)
    {
        return (Button)super.set(s, obj);
    }

    public Button setIcon(String s)
    {
        icon = s;
        return this;
    }

    public Button setName(String s)
    {
        name = s;
        return this;
    }

    public Button setTapAction(Action action)
    {
        tapAction = action;
        return this;
    }
}
