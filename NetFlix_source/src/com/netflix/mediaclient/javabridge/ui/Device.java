// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.javabridge.ui;


// Referenced classes of package com.netflix.mediaclient.javabridge.ui:
//            EventListener, Callback

public interface Device
{

    public static final String EVENT_factoryReset = "factoryReset";
    public static final String NAME = "device";
    public static final String PATH = "nrdp.device";

    public abstract void addEventListener(String s, EventListener eventlistener);

    public abstract void factoryReset(Callback callback);

    public abstract String getCertificationVersion();

    public abstract String getDeviceModel();

    public abstract String getESN();

    public abstract String getESNPrefix();

    public abstract String getFriendlyName();

    public abstract String getLanguage();

    public abstract String getSDKVersion();

    public abstract String getSoftwareVersion();

    public abstract String[] getUILanguages();

    public abstract String getUIVersion();

    public abstract void removeEventListener(String s, EventListener eventlistener);

    public abstract void setUILanguages(String as[]);

    public abstract void setUIVersion(String s);
}
