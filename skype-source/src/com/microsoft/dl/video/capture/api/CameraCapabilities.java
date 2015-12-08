// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.microsoft.dl.video.capture.api;

import java.io.Serializable;
import java.util.NavigableSet;
import java.util.TreeSet;

public class CameraCapabilities
    implements Serializable, Cloneable
{
    public static final class Facing extends Enum
    {

        public static final Facing BACK;
        public static final Facing FRONT;
        public static final Facing OTHER;
        private static final Facing a[];

        public static Facing valueOf(String s)
        {
            return (Facing)Enum.valueOf(com/microsoft/dl/video/capture/api/CameraCapabilities$Facing, s);
        }

        public static Facing[] values()
        {
            return (Facing[])a.clone();
        }

        static 
        {
            BACK = new Facing("BACK", 0);
            FRONT = new Facing("FRONT", 1);
            OTHER = new Facing("OTHER", 2);
            a = (new Facing[] {
                BACK, FRONT, OTHER
            });
        }

        private Facing(String s, int i)
        {
            super(s, i);
        }
    }


    private int a;
    private Facing b;
    private int c;
    private NavigableSet d;
    private NavigableSet e;
    private NavigableSet f;
    private float g;

    public CameraCapabilities()
    {
    }

    public final CameraCapabilities clone()
    {
        CameraCapabilities cameracapabilities;
        try
        {
            cameracapabilities = (CameraCapabilities)super.clone();
            cameracapabilities.d = new TreeSet(d);
            cameracapabilities.e = new TreeSet(e);
            cameracapabilities.f = new TreeSet(f);
        }
        catch (CloneNotSupportedException clonenotsupportedexception)
        {
            throw new AssertionError(clonenotsupportedexception);
        }
        return cameracapabilities;
    }

    public volatile Object clone()
        throws CloneNotSupportedException
    {
        return clone();
    }

    public final int getCameraId()
    {
        return a;
    }

    public final Facing getFacing()
    {
        return b;
    }

    public final float getNativeAspectRatio()
    {
        return g;
    }

    public final int getOrientation()
    {
        return c;
    }

    public final NavigableSet getSupportedFpsRanges()
    {
        return f;
    }

    public final NavigableSet getSupportedImageFormats()
    {
        return d;
    }

    public final NavigableSet getSupportedResolutions()
    {
        return e;
    }

    public final void setCameraId(int i)
    {
        a = i;
    }

    public final void setFacing(Facing facing)
    {
        b = facing;
    }

    public final void setNativeAspectRatio(float f1)
    {
        g = f1;
    }

    public final void setOrientation(int i)
    {
        c = i;
    }

    public final void setSupportedFpsRanges(NavigableSet navigableset)
    {
        f = navigableset;
    }

    public final void setSupportedImageFormats(NavigableSet navigableset)
    {
        d = navigableset;
    }

    public final void setSupportedResolutions(NavigableSet navigableset)
    {
        e = navigableset;
    }

    public final String toString()
    {
        return (new StringBuilder()).append(getClass().getSimpleName()).append(" [cameraId=").append(a).append(", facing=").append(b).append(", orientation=").append(c).append(", supportedImageFormats=").append(d).append(", supportedResolutions=").append(e).append(", supportedFpsRanges=").append(f).append(", nativeAspectRatio=").append(g).append("]").toString();
    }
}
