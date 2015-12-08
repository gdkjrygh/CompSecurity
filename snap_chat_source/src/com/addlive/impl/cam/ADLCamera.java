// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.addlive.impl.cam;

import java.util.List;

public interface ADLCamera
{

    public abstract void dispose();

    public abstract List getCameraDevices();

    public abstract String getDevice();

    public abstract int processProperty(String s, String s1);

    public abstract void setDevice(String s);

    public abstract void start(Object obj);

    public abstract void stop();
}
