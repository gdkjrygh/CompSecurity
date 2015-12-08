// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.auditude.ads.event;

import java.util.HashMap;

// Referenced classes of package com.auditude.ads.event:
//            AdPluginEvent

public class AdPluginErrorEvent extends AdPluginEvent
{

    public static final String INIT_FAILED = "initFailed";
    public static final String PLUGIN_ERROR = "pluginError";
    private Throwable error;

    public AdPluginErrorEvent(String s, Throwable throwable)
    {
        this(s, throwable, null);
    }

    public AdPluginErrorEvent(String s, Throwable throwable, HashMap hashmap)
    {
        super(s, hashmap);
        error = throwable;
    }

    public final Throwable getError()
    {
        return error;
    }
}
