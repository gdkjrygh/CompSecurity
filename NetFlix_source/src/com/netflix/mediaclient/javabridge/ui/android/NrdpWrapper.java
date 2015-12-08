// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.javabridge.ui.android;

import com.netflix.mediaclient.javabridge.NrdProxy;
import com.netflix.mediaclient.javabridge.ui.Device;
import com.netflix.mediaclient.javabridge.ui.EventListener;
import com.netflix.mediaclient.javabridge.ui.IMedia;
import com.netflix.mediaclient.javabridge.ui.Log;
import com.netflix.mediaclient.javabridge.ui.Nrdp;
import com.netflix.mediaclient.javabridge.ui.Registration;
import com.netflix.mediaclient.javabridge.ui.Storage;
import com.netflix.mediaclient.javabridge.ui.mdxcontroller.MdxController;

public final class NrdpWrapper
    implements Nrdp
{

    private Device deviceImpl;
    private Log logImpl;
    private MdxController mdxControllerImpl;
    private IMedia mediaImpl;
    private Nrdp nrdpImpl;
    private Registration regImpl;
    private Storage storageImpl;

    public NrdpWrapper(NrdProxy nrdproxy)
    {
        nrdpImpl = (Nrdp)nrdproxy.findObjectCache("nrdp");
        mediaImpl = (IMedia)nrdproxy.findObjectCache("nrdp.media");
        storageImpl = (Storage)nrdproxy.findObjectCache("nrdp.storage");
        logImpl = (Log)nrdproxy.findObjectCache("nrdp.log");
        regImpl = (Registration)nrdproxy.findObjectCache("nrdp.registration");
        deviceImpl = (Device)nrdproxy.findObjectCache("nrdp.device");
        mdxControllerImpl = (MdxController)nrdproxy.findObjectCache("nrdp.mdx");
    }

    public void addEventListener(String s, EventListener eventlistener)
    {
        nrdpImpl.addEventListener(s, eventlistener);
    }

    public boolean debug()
    {
        return nrdpImpl.debug();
    }

    public void exit()
    {
        nrdpImpl.exit();
    }

    public void getConfigList()
    {
        nrdpImpl.getConfigList();
    }

    public Device getDevice()
    {
        return deviceImpl;
    }

    public Log getLog()
    {
        return logImpl;
    }

    public MdxController getMdxController()
    {
        return mdxControllerImpl;
    }

    public IMedia getMedia()
    {
        return mediaImpl;
    }

    public Registration getRegistration()
    {
        return regImpl;
    }

    public Storage getStorage()
    {
        return storageImpl;
    }

    public boolean isReady()
    {
        return nrdpImpl.isReady();
    }

    public long now()
    {
        return nrdpImpl.now();
    }

    public void removeEventListener(String s, EventListener eventlistener)
    {
        nrdpImpl.removeEventListener(s, eventlistener);
    }

    public void setConfigData(String s, String s1)
    {
        nrdpImpl.setConfigData(s, s1);
    }
}
