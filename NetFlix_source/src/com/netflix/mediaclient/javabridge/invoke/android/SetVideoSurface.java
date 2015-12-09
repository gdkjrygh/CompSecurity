// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.javabridge.invoke.android;

import android.view.Surface;
import com.netflix.mediaclient.javabridge.invoke.BaseInvoke;

public final class SetVideoSurface extends BaseInvoke
{

    private static final String METHOD = "setVideoSurface";
    private static final String TARGET = "android";
    private Surface surface;

    public SetVideoSurface(Surface surface1)
    {
        super("android", "setVideoSurface");
        if (surface1 == null)
        {
            throw new IllegalArgumentException("Surface can not be null!");
        } else
        {
            surface = surface1;
            return;
        }
    }

    public Surface getSurface()
    {
        return surface;
    }
}
