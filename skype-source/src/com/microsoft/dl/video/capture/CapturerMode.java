// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.microsoft.dl.video.capture;

import com.microsoft.dl.video.capture.api.FpsRange;
import com.microsoft.dl.video.capture.api.ImageFormat;
import com.microsoft.dl.video.capture.api.Resolution;
import java.util.EnumSet;

public class CapturerMode
{
    public static final class Orientation extends Enum
    {

        public static final Orientation FlippedHorizontally;
        public static final Orientation FlippedVertically;
        public static final Orientation Transposed;
        private static final Orientation a[];

        public static Orientation valueOf(String s)
        {
            return (Orientation)Enum.valueOf(com/microsoft/dl/video/capture/CapturerMode$Orientation, s);
        }

        public static Orientation[] values()
        {
            return (Orientation[])a.clone();
        }

        static 
        {
            FlippedHorizontally = new Orientation("FlippedHorizontally", 0);
            FlippedVertically = new Orientation("FlippedVertically", 1);
            Transposed = new Orientation("Transposed", 2);
            a = (new Orientation[] {
                FlippedHorizontally, FlippedVertically, Transposed
            });
        }

        private Orientation(String s, int i)
        {
            super(s, i);
        }
    }


    private final com.microsoft.dl.video.capture.impl.ResolutionMatcher.ResolutionTransformation a;
    private final ImageFormat b;
    private final EnumSet c;
    private final FpsRange d;

    public CapturerMode(com.microsoft.dl.video.capture.impl.ResolutionMatcher.ResolutionTransformation resolutiontransformation, ImageFormat imageformat, EnumSet enumset, FpsRange fpsrange)
    {
        a = resolutiontransformation;
        b = imageformat;
        c = enumset;
        d = fpsrange;
    }

    public final int getBufferSize()
    {
        return b.getSampleSize(a.getFrom());
    }

    public final ImageFormat getFormat()
    {
        return b;
    }

    public final int getFourCC()
    {
        return b.getFourCC();
    }

    public final FpsRange getFrameRateRange()
    {
        return d;
    }

    public final int getInnerHeight()
    {
        return a.getFrom().getHeight();
    }

    public final int getInnerWidth()
    {
        return a.getFrom().getWidth();
    }

    public final int getMaxFrameRate()
    {
        return d.getMax();
    }

    public final int getMinFrameRate()
    {
        return d.getMin();
    }

    public final EnumSet getOrientation()
    {
        return c;
    }

    public final int getOuterHeight()
    {
        return a.getTo().getHeight();
    }

    public final int getOuterWidth()
    {
        return a.getTo().getWidth();
    }

    public final com.microsoft.dl.video.capture.impl.ResolutionMatcher.ResolutionTransformation getResolutionTransformation()
    {
        return a;
    }

    public final int getTransformation()
    {
        return a.getTransformation().ordinal();
    }

    public final boolean isFlippedHorizontally()
    {
        return c.contains(Orientation.FlippedHorizontally);
    }

    public final boolean isFlippedVertically()
    {
        return c.contains(Orientation.FlippedVertically);
    }

    public final boolean isTransposed()
    {
        return c.contains(Orientation.Transposed);
    }

    public final String toString()
    {
        return (new StringBuilder()).append(a).append(", ").append(b).append(", ").append(c).append(", ").append(d).append(" fps").toString();
    }
}
