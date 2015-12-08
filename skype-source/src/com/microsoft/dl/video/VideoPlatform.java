// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.microsoft.dl.video;

import android.content.Context;
import com.microsoft.dl.Platform;
import com.microsoft.dl.video.capture.api.CameraManagerSingleton;
import java.util.Locale;

public final class VideoPlatform
{
    private static final class CameraManagerFactoryType extends Enum
    {

        public static final CameraManagerFactoryType REAL;
        public static final CameraManagerFactoryType VIRTUAL;
        private static final CameraManagerFactoryType a[];

        public static CameraManagerFactoryType valueOf(String s)
        {
            return (CameraManagerFactoryType)Enum.valueOf(com/microsoft/dl/video/VideoPlatform$CameraManagerFactoryType, s);
        }

        public static CameraManagerFactoryType[] values()
        {
            return (CameraManagerFactoryType[])a.clone();
        }

        static 
        {
            REAL = new CameraManagerFactoryType("REAL", 0);
            VIRTUAL = new CameraManagerFactoryType("VIRTUAL", 1);
            a = (new CameraManagerFactoryType[] {
                REAL, VIRTUAL
            });
        }

        private CameraManagerFactoryType(String s, int i)
        {
            super(s, i);
        }
    }


    private VideoPlatform()
    {
    }

    private static native String getCameraManagerFactoryName();

    public static void initialize(Context context)
    {
        com/microsoft/dl/video/VideoPlatform;
        JVM INSTR monitorenter ;
        Platform.initialize(context);
        context = CameraManagerFactoryType.valueOf(getCameraManagerFactoryName().toUpperCase(Locale.US));
        static class _cls1
        {

            static final int a[];

            static 
            {
                a = new int[CameraManagerFactoryType.values().length];
                try
                {
                    a[CameraManagerFactoryType.REAL.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[CameraManagerFactoryType.VIRTUAL.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        switch (_cls1.a[context.ordinal()])
        {
        default:
            throw new IllegalArgumentException((new StringBuilder("Unknown CameraManagerFactoryType ")).append(context).toString());

        case 2: // '\002'
            break MISSING_BLOCK_LABEL_98;

        case 1: // '\001'
            break;
        }
        break MISSING_BLOCK_LABEL_82;
        context;
        com/microsoft/dl/video/VideoPlatform;
        JVM INSTR monitorexit ;
        throw context;
        context = new com.microsoft.dl.video.capture.impl.real.RealCameraManagerImpl.Factory();
_L1:
        CameraManagerSingleton.setFactory(context);
        com/microsoft/dl/video/VideoPlatform;
        JVM INSTR monitorexit ;
        return;
        context = new com.microsoft.dl.video.capture.impl.virtual.VirtualCameraManagerImpl.Factory();
          goto _L1
    }
}
