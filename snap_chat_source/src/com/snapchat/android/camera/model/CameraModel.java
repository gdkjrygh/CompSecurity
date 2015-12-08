// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.camera.model;

import IK;
import android.hardware.Camera;
import qv;

public final class CameraModel
{
    public static final class CameraType extends Enum
    {

        private static final CameraType $VALUES[];
        public static final CameraType BACK_FACING;
        public static final CameraType FRONT_FACING;
        public static final CameraType NONE;

        public static CameraType valueOf(String s)
        {
            return (CameraType)Enum.valueOf(com/snapchat/android/camera/model/CameraModel$CameraType, s);
        }

        public static CameraType[] values()
        {
            return (CameraType[])$VALUES.clone();
        }

        static 
        {
            FRONT_FACING = new CameraType("FRONT_FACING", 0);
            BACK_FACING = new CameraType("BACK_FACING", 1);
            NONE = new CameraType("NONE", 2);
            $VALUES = (new CameraType[] {
                FRONT_FACING, BACK_FACING, NONE
            });
        }

        private CameraType(String s, int l)
        {
            super(s, l);
        }
    }


    public android.hardware.Camera.CameraInfo a[];
    public int b;
    public int c;
    public int d;
    public boolean e;
    public boolean f;
    public IK g;
    public boolean h;
    public qP.b i;
    public boolean j;
    public boolean k;

    public CameraModel()
    {
        a = qv.a();
        b = Camera.getNumberOfCameras();
        c = -1;
        d = -1;
        e = false;
        j = false;
        k = false;
    }

    public final void a(CameraType cameratype)
    {
        static final class _cls1
        {

            static final int a[];

            static 
            {
                a = new int[CameraType.values().length];
                try
                {
                    a[CameraType.BACK_FACING.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[CameraType.FRONT_FACING.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        _cls1.a[cameratype.ordinal()];
        JVM INSTR tableswitch 1 1: default 28
    //                   1 57;
           goto _L1 _L2
_L1:
        int l;
        cameratype = a;
        l = 0;
_L7:
        if (l >= cameratype.length) goto _L4; else goto _L3
_L3:
        if (((android.hardware.Camera.CameraInfo) (cameratype[l])).facing != 1) goto _L6; else goto _L5
_L5:
        c = l;
        return;
_L2:
        l = qv.a(a);
          goto _L5
_L6:
        l++;
          goto _L7
_L4:
        l = 0;
          goto _L5
    }

    public final boolean a()
    {
        return a(d);
    }

    public final boolean a(int l)
    {
        return d != -1 && l >= 0 && l < a.length && a[l].facing == 1;
    }

    public final boolean b()
    {
        return d == -1;
    }

    public final android.hardware.Camera.CameraInfo c()
    {
        if (d != -1)
        {
            return a[d];
        } else
        {
            return null;
        }
    }
}
