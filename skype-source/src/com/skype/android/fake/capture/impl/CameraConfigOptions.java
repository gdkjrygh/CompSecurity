// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.fake.capture.impl;


public class CameraConfigOptions
{
    public static class Stamp
    {

        private final float a;
        private final float b;
        private final float c;

        public final float a()
        {
            return a;
        }

        public final float b()
        {
            return b;
        }

        public final float c()
        {
            return c;
        }

        public String toString()
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

    public final String a()
    {
        return a;
    }

    public final void a(Stamp stamp)
    {
        b = stamp;
    }

    public final void a(String s)
    {
        a = s;
    }

    public final Stamp b()
    {
        return b;
    }

    public String toString()
    {
        return (new StringBuilder()).append(getClass().getSimpleName()).append(" [videoFileName=").append(a).append(", stamp=").append(b).append("]").toString();
    }
}
