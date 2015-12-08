// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.platform.capture;

import java.io.Serializable;
import java.util.NavigableSet;
import java.util.TreeSet;

public class CameraCapabilities
    implements Serializable, Cloneable
{

    private int a;
    private NavigableSet b;
    private NavigableSet c;
    private NavigableSet d;
    private float e;

    public CameraCapabilities()
    {
    }

    public final int a()
    {
        return a;
    }

    public final void a(float f1)
    {
        e = f1;
    }

    public final void a(int i)
    {
        a = i;
    }

    public final void a(NavigableSet navigableset)
    {
        b = navigableset;
    }

    public final NavigableSet b()
    {
        return b;
    }

    public final void b(NavigableSet navigableset)
    {
        c = navigableset;
    }

    public final NavigableSet c()
    {
        return c;
    }

    public final void c(NavigableSet navigableset)
    {
        d = navigableset;
    }

    public Object clone()
        throws CloneNotSupportedException
    {
        return f();
    }

    public final NavigableSet d()
    {
        return d;
    }

    public final float e()
    {
        return e;
    }

    public final CameraCapabilities f()
    {
        CameraCapabilities cameracapabilities;
        try
        {
            cameracapabilities = (CameraCapabilities)super.clone();
            cameracapabilities.b = new TreeSet(b);
            cameracapabilities.c = new TreeSet(c);
            cameracapabilities.d = new TreeSet(d);
            cameracapabilities.e = e;
        }
        catch (CloneNotSupportedException clonenotsupportedexception)
        {
            throw new AssertionError(clonenotsupportedexception);
        }
        return cameracapabilities;
    }

    public final String toString()
    {
        return (new StringBuilder()).append(getClass().getSimpleName()).append(" [cameraId=").append(a).append(", supportedImageFormats=").append(b).append(", supportedResolutions=").append(c).append(", supportedFpsRanges=").append(d).append(", nativeAspectRatio=").append(e).append("]").toString();
    }
}
