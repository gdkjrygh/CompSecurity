// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.platform.capture;

import java.io.Serializable;

public class CameraInfo
    implements Serializable, Cloneable
{
    public static final class Facing extends Enum
    {

        public static final Facing a;
        public static final Facing b;
        private static final Facing c[];

        public static Facing valueOf(String s)
        {
            return (Facing)Enum.valueOf(com/skype/android/platform/capture/CameraInfo$Facing, s);
        }

        public static Facing[] values()
        {
            return (Facing[])c.clone();
        }

        static 
        {
            a = new Facing("BACK", 0);
            b = new Facing("FRONT", 1);
            c = (new Facing[] {
                a, b
            });
        }

        private Facing(String s, int i)
        {
            super(s, i);
        }
    }


    private final Facing a;
    private final int b;

    public CameraInfo(Facing facing, int i)
    {
        a = facing;
        b = i;
    }

    public final Facing a()
    {
        return a;
    }

    public final int b()
    {
        return b;
    }

    public final CameraInfo c()
    {
        CameraInfo camerainfo;
        try
        {
            camerainfo = (CameraInfo)super.clone();
        }
        catch (CloneNotSupportedException clonenotsupportedexception)
        {
            throw new AssertionError(clonenotsupportedexception);
        }
        return camerainfo;
    }

    public Object clone()
        throws CloneNotSupportedException
    {
        return c();
    }

    public final String toString()
    {
        return (new StringBuilder()).append(getClass().getSimpleName()).append(" [facing=").append(a).append(", orientation=").append(b).append(" ]").toString();
    }
}
