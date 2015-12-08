// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.addlive.platform;


public class PlatformInitOptions
{

    private Long applicationId;
    private boolean consoleLoggingEnabled;
    private String interactionsLogTag;
    private boolean interactionsLoggingEnabled;
    private String libName;
    private String storageDir;
    private String streamerEndpointResolver;
    private boolean useExternalVideoInput;

    public PlatformInitOptions()
    {
        streamerEndpointResolver = null;
        applicationId = null;
        interactionsLoggingEnabled = false;
        interactionsLogTag = "AddLive_SDK";
        consoleLoggingEnabled = true;
        libName = null;
    }

    public Long getApplicationId()
    {
        return applicationId;
    }

    public String getInteractionsLogTag()
    {
        return interactionsLogTag;
    }

    public String getLibName()
    {
        return libName;
    }

    public String getStorageDir()
    {
        return storageDir;
    }

    public String getStreamerEndpointResolver()
    {
        return streamerEndpointResolver;
    }

    public boolean isConsoleLoggingEnabled()
    {
        return consoleLoggingEnabled;
    }

    public boolean isInteractionsLoggingEnabled()
    {
        return interactionsLoggingEnabled;
    }

    public void setApplicationId(Long long1)
    {
        applicationId = long1;
    }

    public void setConsoleLoggingEnabled(boolean flag)
    {
        consoleLoggingEnabled = flag;
    }

    public void setInteractionsLogTag(String s)
    {
        interactionsLogTag = s;
    }

    public void setInteractionsLoggingEnabled(boolean flag)
    {
        interactionsLoggingEnabled = flag;
    }

    public void setLibName(String s)
    {
        libName = s;
    }

    public void setStorageDir(String s)
    {
        storageDir = s;
    }

    public void setStreamerEndpointResolver(String s)
    {
        streamerEndpointResolver = s;
    }

    public void setUseExternalVideoInput(boolean flag)
    {
        useExternalVideoInput = flag;
    }

    public boolean useExternalVideoInput()
    {
        return useExternalVideoInput;
    }
}
