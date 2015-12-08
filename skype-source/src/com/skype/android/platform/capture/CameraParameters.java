// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.platform.capture;

import com.skype.android.video.hw.format.Resolution;
import java.io.Serializable;

// Referenced classes of package com.skype.android.platform.capture:
//            ImageFormat, FpsRange

public class CameraParameters
    implements Serializable, Cloneable
{

    private Resolution a;
    private ImageFormat b;
    private FpsRange c;

    public CameraParameters()
    {
    }

    public final Resolution a()
    {
        return a;
    }

    public final void a(FpsRange fpsrange)
    {
        c = fpsrange;
    }

    public final void a(ImageFormat imageformat)
    {
        b = imageformat;
    }

    public final void a(Resolution resolution)
    {
        a = resolution;
    }

    public final ImageFormat b()
    {
        return b;
    }

    public final FpsRange c()
    {
        return c;
    }

    public Object clone()
        throws CloneNotSupportedException
    {
        return d();
    }

    public final CameraParameters d()
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

    public final String toString()
    {
        return (new StringBuilder()).append(getClass().getSimpleName()).append(" [resolution=").append(a).append(", imageFormat=").append(b).append(", fpsRange=").append(c).append("]").toString();
    }
}
