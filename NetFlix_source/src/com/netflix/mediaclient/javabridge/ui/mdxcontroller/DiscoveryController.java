// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.javabridge.ui.mdxcontroller;

import java.util.Map;

public interface DiscoveryController
{

    public static final String LAUNCH_ARG_INTENT = "intent";
    public static final String LAUNCH_ARG_INTENT_VALUE_PLAY = "play";
    public static final String LAUNCH_ARG_INTENT_VALUE_SYNC = "sync";
    public static final String LAUNCH_ARG_TITLEID = "titleid";

    public abstract void isRemoteDeviceReady(String s);

    public abstract void launchNetflix(String s, Map map);
}
