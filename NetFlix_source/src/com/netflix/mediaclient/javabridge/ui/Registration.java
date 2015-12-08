// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.javabridge.ui;


// Referenced classes of package com.netflix.mediaclient.javabridge.ui:
//            EventListener, Callback, DeviceAccount, ActivationTokens

public interface Registration
{

    public static final String EVENT_activate = "activate";
    public static final String EVENT_activateComplete = "activateComplete";
    public static final String EVENT_bind = "bind";
    public static final String EVENT_deactivated = "deactivated";
    public static final String NAME = "registration";
    public static final String PATH = "nrdp.registration";

    public abstract void addEventListener(String s, EventListener eventlistener);

    public abstract void createDeviceAccount(Callback callback);

    public abstract void deactivate(DeviceAccount deviceaccount, Callback callback);

    public abstract void deactivateAll(Callback callback);

    public abstract void emailActivate(String s, String s1);

    public abstract void esnMigration();

    public abstract ActivationTokens getActivationTokens();

    public abstract DeviceAccount getCurrentDeviceAccount();

    public abstract DeviceAccount[] getDeviceAccounts();

    public abstract void getDeviceTokens();

    public abstract String[] getUILanguages();

    public abstract boolean isRegistered();

    public abstract void massDeactivationCheck();

    public abstract void ping();

    public abstract void removeEventListener(String s, EventListener eventlistener);

    public abstract void selectDeviceAccount(DeviceAccount deviceaccount, Callback callback);

    public abstract void setActivationTokens(ActivationTokens activationtokens);

    public abstract void setUILanguages(String as[]);

    public abstract void tokenActivate(ActivationTokens activationtokens);

    public abstract void unselectDeviceAccount(Callback callback);
}
