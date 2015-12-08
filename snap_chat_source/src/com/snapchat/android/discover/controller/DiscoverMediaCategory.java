// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.discover.controller;


public final class DiscoverMediaCategory extends Enum
{

    private static final DiscoverMediaCategory $VALUES[];
    public static final DiscoverMediaCategory EDITION;
    public static final DiscoverMediaCategory HOME_PAGE;

    private DiscoverMediaCategory(String s, int i)
    {
        super(s, i);
    }

    public static DiscoverMediaCategory valueOf(String s)
    {
        return (DiscoverMediaCategory)Enum.valueOf(com/snapchat/android/discover/controller/DiscoverMediaCategory, s);
    }

    public static DiscoverMediaCategory[] values()
    {
        return (DiscoverMediaCategory[])$VALUES.clone();
    }

    static 
    {
        HOME_PAGE = new DiscoverMediaCategory("HOME_PAGE", 0);
        EDITION = new DiscoverMediaCategory("EDITION", 1);
        $VALUES = (new DiscoverMediaCategory[] {
            HOME_PAGE, EDITION
        });
    }
}
