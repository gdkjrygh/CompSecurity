// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.javabridge.ui;

import com.netflix.mediaclient.javabridge.ui.mdxcontroller.MdxController;

// Referenced classes of package com.netflix.mediaclient.javabridge.ui:
//            EventListener, Device, Log, IMedia, 
//            Registration, Storage

public interface Nrdp
{

    public static final String ACTION_ID = "ACTION_ID";
    public static final String COMPLETE = "COMPLETE";
    public static final String ERROR = "ERROR";
    public static final String EVENT_ObjectSyncComplete = "ObjectSyncComplete";
    public static final String EVENT_background = "background";
    public static final String EVENT_command = "command";
    public static final String EVENT_config = "config";
    public static final String EVENT_fatalerror = "fatalerror";
    public static final String EVENT_nrdconf = "nrdconf";
    public static final String NAME = "";
    public static final String NETWORK_ERROR = "NETWORK_ERROR";
    public static final String PATH = "nrdp";
    public static final String READY = "READY";

    public abstract void addEventListener(String s, EventListener eventlistener);

    public abstract boolean debug();

    public abstract void exit();

    public abstract void getConfigList();

    public abstract Device getDevice();

    public abstract Log getLog();

    public abstract MdxController getMdxController();

    public abstract IMedia getMedia();

    public abstract Registration getRegistration();

    public abstract Storage getStorage();

    public abstract boolean isReady();

    public abstract long now();

    public abstract void removeEventListener(String s, EventListener eventlistener);

    public abstract void setConfigData(String s, String s1);
}
