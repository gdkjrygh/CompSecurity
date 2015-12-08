// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.auditude.ads.loader;


public interface IPluginLoader
{
    public static interface PluginLoaderListener
    {

        public abstract void loadComplete(Object obj);

        public abstract void loadFailed(Throwable throwable);
    }


    public abstract void cancel();

    public abstract void load();

    public abstract void setPluginLoaderListener(PluginLoaderListener pluginloaderlistener);
}
