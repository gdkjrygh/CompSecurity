// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.akamai.android.analytics;


public final class PluginEvent extends Enum
{

    public static final PluginEvent DEBUG;
    private static final PluginEvent ENUM$VALUES[];
    public static final PluginEvent ERROR;
    public static final PluginEvent INFO;
    public static final PluginEvent LOGLINE;

    private PluginEvent(String s, int i)
    {
        super(s, i);
    }

    public static PluginEvent valueOf(String s)
    {
        return (PluginEvent)Enum.valueOf(com/akamai/android/analytics/PluginEvent, s);
    }

    public static PluginEvent[] values()
    {
        PluginEvent apluginevent[] = ENUM$VALUES;
        int i = apluginevent.length;
        PluginEvent apluginevent1[] = new PluginEvent[i];
        System.arraycopy(apluginevent, 0, apluginevent1, 0, i);
        return apluginevent1;
    }

    static 
    {
        ERROR = new PluginEvent("ERROR", 0);
        INFO = new PluginEvent("INFO", 1);
        DEBUG = new PluginEvent("DEBUG", 2);
        LOGLINE = new PluginEvent("LOGLINE", 3);
        ENUM$VALUES = (new PluginEvent[] {
            ERROR, INFO, DEBUG, LOGLINE
        });
    }
}
