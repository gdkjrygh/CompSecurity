// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.app2app;

import java.util.HashMap;
import java.util.Map;

public final class ChannelKey extends Enum
{

    private static final ChannelKey $VALUES[];
    public static final ChannelKey TRANSLATOR;
    private static Map map;
    private String name;

    private ChannelKey(String s, int i, String s1)
    {
        super(s, i);
        name = s1;
    }

    public static ChannelKey getChannelByName(String s)
    {
        if (map == null)
        {
            HashMap hashmap = new HashMap();
            ChannelKey achannelkey[] = values();
            int j = achannelkey.length;
            for (int i = 0; i < j; i++)
            {
                ChannelKey channelkey = achannelkey[i];
                hashmap.put(channelkey.getName(), channelkey);
            }

            map = hashmap;
        }
        return (ChannelKey)map.get(s);
    }

    public static ChannelKey valueOf(String s)
    {
        return (ChannelKey)Enum.valueOf(com/skype/android/app/app2app/ChannelKey, s);
    }

    public static ChannelKey[] values()
    {
        return (ChannelKey[])$VALUES.clone();
    }

    public final String getName()
    {
        return name;
    }

    static 
    {
        TRANSLATOR = new ChannelKey("TRANSLATOR", 0, "Translator");
        $VALUES = (new ChannelKey[] {
            TRANSLATOR
        });
    }
}
