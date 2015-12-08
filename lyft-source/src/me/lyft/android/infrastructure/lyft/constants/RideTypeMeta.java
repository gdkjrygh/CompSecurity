// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.infrastructure.lyft.constants;

import me.lyft.android.common.INullable;

// Referenced classes of package me.lyft.android.infrastructure.lyft.constants:
//            Button, Map, Popup, Selector

public class RideTypeMeta
    implements INullable
{

    Button button;
    String id;
    Map map;
    Integer maximumContributors;
    Popup popup;
    Selector selector;

    public RideTypeMeta()
    {
    }

    public Button getButton()
    {
        return button;
    }

    public String getId()
    {
        return id;
    }

    public Map getMap()
    {
        return map;
    }

    public Integer getMaximumContributors()
    {
        return maximumContributors;
    }

    public Popup getPopup()
    {
        return popup;
    }

    public Selector getSelector()
    {
        return selector;
    }

    public boolean isNull()
    {
        return false;
    }
}
