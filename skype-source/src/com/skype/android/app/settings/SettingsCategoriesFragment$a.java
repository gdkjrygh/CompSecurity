// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.settings;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.skype.android.app.settings:
//            SettingsCategoriesFragment, DebugSettingsFragment, SettingsFragment, NotificationSettingsFragment, 
//            AboutFragment

private static final class fragmentClass extends Enum
{

    private static final CHAT $VALUES[];
    public static final CHAT ABOUT;
    public static final CHAT CALLS;
    public static final CHAT CHAT;
    public static final CHAT CONNECTION;
    public static final CHAT CONTACTS;
    public static final CHAT DEBUG;
    public static final CHAT EMOTICONS;
    public static final CHAT MESSAGES;
    public static final CHAT NOTIFICATIONS;
    public static final CHAT SUPPORT;
    private Class fragmentClass;
    private int keyId;
    private int titleId;

    public static List getValues(boolean flag, boolean flag1)
    {
        ArrayList arraylist = new ArrayList();
        fragmentClass afragmentclass[] = values();
        int j = afragmentclass.length;
        for (int i = 0; i < j; i++)
        {
            fragmentClass fragmentclass = afragmentclass[i];
            if ((fragmentclass != DEBUG && fragmentclass != EMOTICONS || flag) && (fragmentclass != SUPPORT || flag1))
            {
                arraylist.add(fragmentclass);
            }
        }

        return arraylist;
    }

    public static SUPPORT valueOf(String s)
    {
        return (SUPPORT)Enum.valueOf(com/skype/android/app/settings/SettingsCategoriesFragment$a, s);
    }

    public static SUPPORT[] values()
    {
        return (SUPPORT[])$VALUES.clone();
    }

    public final Fragment create()
    {
        Fragment fragment;
        try
        {
            fragment = (Fragment)fragmentClass.newInstance();
            Bundle bundle = new Bundle();
            if (keyId > 0)
            {
                bundle.putInt("category_key", keyId);
            }
            fragment.setArguments(bundle);
        }
        catch (Exception exception)
        {
            throw new RuntimeException(exception);
        }
        return fragment;
    }

    static 
    {
        DEBUG = new <init>("DEBUG", 0, 0x7f080243, 0x7f060007, com/skype/android/app/settings/DebugSettingsFragment);
        EMOTICONS = new <init>("EMOTICONS", 1, 0x7f08024c, 0x7f060009, com/skype/android/app/settings/SettingsFragment);
        NOTIFICATIONS = new <init>("NOTIFICATIONS", 2, 0x7f0802f0, 0, com/skype/android/app/settings/NotificationSettingsFragment);
        CONTACTS = new <init>("CONTACTS", 3, 0x7f080240, 0x7f060006, com/skype/android/app/settings/SettingsFragment);
        MESSAGES = new <init>("MESSAGES", 4, 0x7f080267, 0x7f06000d, com/skype/android/app/settings/SettingsFragment);
        CALLS = new <init>("CALLS", 5, 0x7f080286, 0x7f060013, com/skype/android/app/settings/SettingsFragment);
        CONNECTION = new <init>("CONNECTION", 6, 0x7f08023b, 0x7f060004, com/skype/android/app/settings/SettingsFragment);
        SUPPORT = new <init>("SUPPORT", 7, 0x7f08027e, 0x7f060010, com/skype/android/app/settings/SettingsFragment);
        ABOUT = new <init>("ABOUT", 8, 0x7f080224, 0, com/skype/android/app/settings/AboutFragment);
        CHAT = new <init>("CHAT", 9, 0x7f080238, 0x7f060003, com/skype/android/app/settings/SettingsFragment);
        $VALUES = (new .VALUES[] {
            DEBUG, EMOTICONS, NOTIFICATIONS, CONTACTS, MESSAGES, CALLS, CONNECTION, SUPPORT, ABOUT, CHAT
        });
    }


    private A(String s, int i, int j, int k, Class class1)
    {
        super(s, i);
        titleId = j;
        keyId = k;
        fragmentClass = class1;
    }
}
