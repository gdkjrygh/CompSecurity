// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.main;


public abstract class BaseNavigationTarget
    implements NavigationModel.Target
{

    private final int icon;
    private final int name;

    public BaseNavigationTarget(int i, int j)
    {
        name = i;
        icon = j;
    }

    public int getIcon()
    {
        return icon;
    }

    public int getName()
    {
        return name;
    }
}
