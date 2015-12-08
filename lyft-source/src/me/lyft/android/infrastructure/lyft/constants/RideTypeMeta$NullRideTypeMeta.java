// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.infrastructure.lyft.constants;


// Referenced classes of package me.lyft.android.infrastructure.lyft.constants:
//            RideTypeMeta, Button, Map, Popup, 
//            Selector

public class Q extends RideTypeMeta
{

    private static final INSTANCE INSTANCE = new <init>();

    public static Q getInstance()
    {
        return INSTANCE;
    }

    public Button getButton()
    {
        return Button.empty();
    }

    public String getId()
    {
        return "";
    }

    public Map getMap()
    {
        return Map.empty();
    }

    public Popup getPopup()
    {
        return Popup.empty();
    }

    public Selector getSelector()
    {
        return Selector.empty();
    }

    public boolean isNull()
    {
        return true;
    }


    private Q()
    {
    }
}
