// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.microsoft.dl.video.capture.api;

import java.io.Serializable;

// Referenced classes of package com.microsoft.dl.video.capture.api:
//            FpsRange, Resolution, ImageFormat

public class CameraParameters
    implements Serializable, Cloneable
{

    private Resolution a;
    private ImageFormat b;
    private FpsRange c;

    public CameraParameters()
    {
    }

    public final CameraParameters clone()
    {
        CameraParameters cameraparameters;
        try
        {
            cameraparameters = (CameraParameters)super.clone();
            cameraparameters.a = a;
            cameraparameters.b = b;
            cameraparameters.c = c;
        }
        catch (CloneNotSupportedException clonenotsupportedexception)
        {
            throw new AssertionError(clonenotsupportedexception);
        }
        return cameraparameters;
    }

    public volatile Object clone()
        throws CloneNotSupportedException
    {
        return clone();
    }

    public final boolean equals(Object obj)
    {
        if (this != obj) goto _L2; else goto _L1
_L1:
        return true;
_L2:
        if (obj == null || getClass() != obj.getClass())
        {
            return false;
        }
        obj = (CameraParameters)obj;
        if (c == null)
        {
            if (((CameraParameters) (obj)).c != null)
            {
                return false;
            }
        } else
        if (!c.equals(((CameraParameters) (obj)).c))
        {
            return false;
        }
        if (b != ((CameraParameters) (obj)).b)
        {
            return false;
        }
        if (a != null)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (((CameraParameters) (obj)).a == null) goto _L1; else goto _L3
_L3:
        return false;
        if (a.equals(((CameraParameters) (obj)).a)) goto _L1; else goto _L4
_L4:
        return false;
    }

    public final FpsRange getFpsRange()
    {
        return c;
    }

    public final ImageFormat getImageFormat()
    {
        return b;
    }

    public final Resolution getResolution()
    {
        return a;
    }

    public final int hashCode()
    {
        int k = 0;
        int i;
        int j;
        if (c == null)
        {
            i = 0;
        } else
        {
            i = c.hashCode();
        }
        if (b == null)
        {
            j = 0;
        } else
        {
            j = b.hashCode();
        }
        if (a != null)
        {
            k = a.hashCode();
        }
        return ((i + 31) * 31 + j) * 31 + k;
    }

    public final void setFpsRange(FpsRange fpsrange)
    {
        c = fpsrange;
    }

    public final void setImageFormat(ImageFormat imageformat)
    {
        b = imageformat;
    }

    public final void setResolution(Resolution resolution)
    {
        a = resolution;
    }

    public final String toString()
    {
        return (new StringBuilder()).append(a).append(" ").append(b).append(" ").append(c).append(" fps").toString();
    }
}
