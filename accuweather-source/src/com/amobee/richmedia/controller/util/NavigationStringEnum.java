// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.amobee.richmedia.controller.util;


public final class NavigationStringEnum extends Enum
{

    public static final NavigationStringEnum BACK;
    public static final NavigationStringEnum CLOSE;
    private static final NavigationStringEnum ENUM$VALUES[];
    public static final NavigationStringEnum FORWARD;
    public static final NavigationStringEnum NONE;
    public static final NavigationStringEnum REFRESH;
    private String text;

    private NavigationStringEnum(String s, int i, String s1)
    {
        super(s, i);
        text = s1;
    }

    public static NavigationStringEnum fromString(String s)
    {
        if (s == null) goto _L2; else goto _L1
_L1:
        NavigationStringEnum anavigationstringenum[];
        int i;
        int j;
        anavigationstringenum = values();
        j = anavigationstringenum.length;
        i = 0;
_L7:
        if (i < j) goto _L3; else goto _L2
_L2:
        NavigationStringEnum navigationstringenum = null;
_L5:
        return navigationstringenum;
_L3:
        NavigationStringEnum navigationstringenum1;
        navigationstringenum1 = anavigationstringenum[i];
        navigationstringenum = navigationstringenum1;
        if (s.equalsIgnoreCase(navigationstringenum1.text)) goto _L5; else goto _L4
_L4:
        i++;
        if (true) goto _L7; else goto _L6
_L6:
    }

    public static NavigationStringEnum valueOf(String s)
    {
        return (NavigationStringEnum)Enum.valueOf(com/amobee/richmedia/controller/util/NavigationStringEnum, s);
    }

    public static NavigationStringEnum[] values()
    {
        NavigationStringEnum anavigationstringenum[] = ENUM$VALUES;
        int i = anavigationstringenum.length;
        NavigationStringEnum anavigationstringenum1[] = new NavigationStringEnum[i];
        System.arraycopy(anavigationstringenum, 0, anavigationstringenum1, 0, i);
        return anavigationstringenum1;
    }

    public String getText()
    {
        return text;
    }

    static 
    {
        NONE = new NavigationStringEnum("NONE", 0, "none");
        CLOSE = new NavigationStringEnum("CLOSE", 1, "close");
        BACK = new NavigationStringEnum("BACK", 2, "back");
        FORWARD = new NavigationStringEnum("FORWARD", 3, "forward");
        REFRESH = new NavigationStringEnum("REFRESH", 4, "refresh");
        ENUM$VALUES = (new NavigationStringEnum[] {
            NONE, CLOSE, BACK, FORWARD, REFRESH
        });
    }
}
