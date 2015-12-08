// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.microsoft.dl.video.capture;

import com.microsoft.dl.utils.Log;
import com.microsoft.dl.video.capture.api.FpsRange;
import com.microsoft.dl.video.capture.api.Resolution;
import java.util.HashSet;
import java.util.NavigableMap;
import java.util.Set;
import java.util.TreeMap;

public class CapturerConfiguration
{
    public static class ResolutionParameters
    {

        private final boolean a;

        public final boolean isMandatory()
        {
            return a;
        }

        public final String toString()
        {
            if (a)
            {
                return "mandatory";
            } else
            {
                return "optional";
            }
        }

        public ResolutionParameters(boolean flag)
        {
            a = flag;
        }
    }

    static final class TransformationOptions extends Enum
    {

        public static final TransformationOptions AllowCroppingAnyResolution;
        public static final TransformationOptions AllowCroppingMandatoryResolutions;
        public static final TransformationOptions AllowMultipleScalingAnyResolution;
        public static final TransformationOptions AllowMultipleScalingMandatoryResolutions;
        public static final TransformationOptions AllowScalingAnyResolution;
        public static final TransformationOptions AllowScalingMandatoryResolutions;
        private static final TransformationOptions a[];

        public static TransformationOptions valueOf(String s)
        {
            return (TransformationOptions)Enum.valueOf(com/microsoft/dl/video/capture/CapturerConfiguration$TransformationOptions, s);
        }

        public static TransformationOptions[] values()
        {
            return (TransformationOptions[])a.clone();
        }

        static 
        {
            AllowCroppingMandatoryResolutions = new TransformationOptions("AllowCroppingMandatoryResolutions", 0);
            AllowMultipleScalingMandatoryResolutions = new TransformationOptions("AllowMultipleScalingMandatoryResolutions", 1);
            AllowScalingMandatoryResolutions = new TransformationOptions("AllowScalingMandatoryResolutions", 2);
            AllowCroppingAnyResolution = new TransformationOptions("AllowCroppingAnyResolution", 3);
            AllowMultipleScalingAnyResolution = new TransformationOptions("AllowMultipleScalingAnyResolution", 4);
            AllowScalingAnyResolution = new TransformationOptions("AllowScalingAnyResolution", 5);
            a = (new TransformationOptions[] {
                AllowCroppingMandatoryResolutions, AllowMultipleScalingMandatoryResolutions, AllowScalingMandatoryResolutions, AllowCroppingAnyResolution, AllowMultipleScalingAnyResolution, AllowScalingAnyResolution
            });
        }

        private TransformationOptions(String s, int i)
        {
            super(s, i);
        }
    }


    private FpsRange a;
    private int b;
    private int c;
    private int d;
    private final Set e = new HashSet();
    private final NavigableMap f = new TreeMap();
    private final Set g = new HashSet();

    public CapturerConfiguration()
    {
    }

    public final boolean addOutputResolution(int i, int j, boolean flag)
    {
        try
        {
            f.put(new Resolution(i, j), new ResolutionParameters(flag));
        }
        catch (RuntimeException runtimeexception)
        {
            if (Log.isLoggable("Capture", 6))
            {
                Log.e("Capture", "Exception caught", runtimeexception);
            }
            return false;
        }
        return true;
    }

    public final boolean addTransformationOption(int i)
    {
        try
        {
            g.add(TransformationOptions.values()[i]);
        }
        catch (RuntimeException runtimeexception)
        {
            if (Log.isLoggable("Capture", 6))
            {
                Log.e("Capture", "Exception caught", runtimeexception);
            }
            return false;
        }
        return true;
    }

    public final boolean banCameraResolution(int i, int j)
    {
        try
        {
            e.add(new Resolution(i, j));
        }
        catch (RuntimeException runtimeexception)
        {
            if (Log.isLoggable("Capture", 6))
            {
                Log.e("Capture", "Exception caught", runtimeexception);
            }
            return false;
        }
        return true;
    }

    public final FpsRange getAbsFpsRange()
    {
        return a;
    }

    public final Set getBannedCameraResolution()
    {
        return e;
    }

    public final int getMaxTransformationCrop()
    {
        return c;
    }

    public final int getMaxTransformationZoom()
    {
        return b;
    }

    public final int getNumBuffers()
    {
        return d;
    }

    public final Iterable getOutputResolutions()
    {
        return f.entrySet();
    }

    public final Set getTransformationOptions()
    {
        return g;
    }

    public final void setAbsFpsRange(int i, int j)
    {
        a = new FpsRange(i, j);
    }

    public final void setMaxTransformationCrop(int i)
    {
        c = i;
    }

    public final void setMaxTransformationZoom(int i)
    {
        b = i;
    }

    public final void setNumBuffers(int i)
    {
        d = i;
    }

    public final String toString()
    {
        return (new StringBuilder()).append(getClass().getSimpleName()).append(" [absFpsRange=").append(a).append(", maxTransformationZoom=").append(b).append(", maxTransformationCrop=").append(c).append(", outputRresolutions=").append(f).append(", numBuffers=").append(d).append(", bannedCameraResolution=").append(e).append(", transformationOptions=").append(g).append("]").toString();
    }
}
