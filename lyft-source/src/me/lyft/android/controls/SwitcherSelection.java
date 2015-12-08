// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.controls;


// Referenced classes of package me.lyft.android.controls:
//            ISwitcherItem

public class SwitcherSelection
{

    final boolean isUserAction;
    final ISwitcherItem switcherItem;

    public SwitcherSelection(ISwitcherItem iswitcheritem, boolean flag)
    {
        switcherItem = iswitcheritem;
        isUserAction = flag;
    }

    public ISwitcherItem getSwitcherItem()
    {
        return switcherItem;
    }

    public boolean isUserAction()
    {
        return isUserAction;
    }
}
