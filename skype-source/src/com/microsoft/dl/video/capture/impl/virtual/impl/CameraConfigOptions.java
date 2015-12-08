// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.microsoft.dl.video.capture.impl.virtual.impl;


public class CameraConfigOptions
{
    public static class Stamp
    {

        private final float a;
        private final float b;
        private final float c;

        public final float getHOffset()
        {
            return a;
        }

        public final float getSize()
        {
            return c;
        }

        public final float getVOffset()
        {
            return b;
        }

        public final String toString()
        {
            return (new StringBuilder()).append(getClass().getSimpleName()).append(" [hOffset=").append(a).append(", vOffset=").append(b).append(", size=").append(c).append("]").toString();
        }

        public Stamp(float f, float f1, float f2)
        {
            a = f;
            b = f1;
            c = f2;
        }
    }


    private String a;
    private Stamp b;

    public CameraConfigOptions()
    {
    }

    public final Stamp getStamp()
    {
        return b;
    }

    public final String getVideoFileName()
    {
        return a;
    }

    public final void setStamp(Stamp stamp)
    {
        b = stamp;
    }

    public final void setVideoFileName(String s)
    {
        a = s;
    }

    public final String toString()
    {
        return (new StringBuilder()).append(getClass().getSimpleName()).append(" [videoFileName=").append(a).append(", stamp=").append(b).append("]").toString();
    }
}
