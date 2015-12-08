// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.chromium.net;

import java.lang.reflect.Constructor;

public abstract class HistogramManager
{

    HistogramManager()
    {
    }

    public static HistogramManager b()
    {
        HistogramManager histogrammanager;
        try
        {
            histogrammanager = (HistogramManager)org/chromium/net/HistogramManager.getClassLoader().loadClass("org.chromium.net.CronetHistogramManager").asSubclass(org/chromium/net/HistogramManager).getConstructor(new Class[0]).newInstance(new Object[0]);
        }
        catch (ClassNotFoundException classnotfoundexception)
        {
            return null;
        }
        catch (Exception exception)
        {
            throw new IllegalStateException("Cannot instantiate: org.chromium.net.CronetHistogramManager", exception);
        }
        return histogrammanager;
    }

    public abstract byte[] a();
}
