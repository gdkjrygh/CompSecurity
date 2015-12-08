// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.deeplink;

import Ek;
import El;
import com.snapchat.android.stories.deeplink.StoriesDeepLinkProcessor;
import up;
import vk;

public final class DeepLinkProcessorRegistry extends Enum
{

    private static final DeepLinkProcessorRegistry $VALUES[];
    public static final DeepLinkProcessorRegistry DISCOVER;
    public static final DeepLinkProcessorRegistry EMAIL_SETTING;
    public static final DeepLinkProcessorRegistry PHONE_SETTING;
    public static final DeepLinkProcessorRegistry STORIES;
    private final String a;
    private final up b;

    private DeepLinkProcessorRegistry(String s, int i, String s1, up up)
    {
        super(s, i);
        a = s1;
        b = up;
    }

    public static DeepLinkProcessorRegistry valueOf(String s)
    {
        return (DeepLinkProcessorRegistry)Enum.valueOf(com/snapchat/android/deeplink/DeepLinkProcessorRegistry, s);
    }

    public static DeepLinkProcessorRegistry[] values()
    {
        return (DeepLinkProcessorRegistry[])$VALUES.clone();
    }

    public final String getKey()
    {
        return a;
    }

    public final up getProcessor()
    {
        return b;
    }

    static 
    {
        DISCOVER = new DeepLinkProcessorRegistry("DISCOVER", 0, "discover", new vk());
        STORIES = new DeepLinkProcessorRegistry("STORIES", 1, "stories", new StoriesDeepLinkProcessor());
        EMAIL_SETTING = new DeepLinkProcessorRegistry("EMAIL_SETTING", 2, "email_setting", new Ek());
        PHONE_SETTING = new DeepLinkProcessorRegistry("PHONE_SETTING", 3, "phone_setting", new El());
        $VALUES = (new DeepLinkProcessorRegistry[] {
            DISCOVER, STORIES, EMAIL_SETTING, PHONE_SETTING
        });
    }
}
