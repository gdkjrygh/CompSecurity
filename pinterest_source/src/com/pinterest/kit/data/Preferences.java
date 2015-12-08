// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.kit.data;


// Referenced classes of package com.pinterest.kit.data:
//            PreferencesManager

public class Preferences
{

    public static final String PERSISTED_GROUP_NAME = "pinterest.persist";
    public static final String USER_GROUP_NAME = "pinterest";
    private static PreferencesManager _persistedManager;
    private static PreferencesManager _userManager;

    public Preferences()
    {
    }

    public static PreferencesManager persisted()
    {
        if (_persistedManager == null)
        {
            _persistedManager = new PreferencesManager("pinterest.persist");
        }
        return _persistedManager;
    }

    public static PreferencesManager user()
    {
        if (_userManager == null)
        {
            _userManager = new PreferencesManager("pinterest");
        }
        return _userManager;
    }
}
