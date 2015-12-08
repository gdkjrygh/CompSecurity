// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.camera.model;

import afw;

// Referenced classes of package com.snapchat.android.camera.model:
//            CameraModel

public final class CameraModel_Factory extends Enum
    implements afw
{

    private static final CameraModel_Factory $VALUES[];
    public static final CameraModel_Factory INSTANCE;

    private CameraModel_Factory(String s)
    {
        super(s, 0);
    }

    public static afw create()
    {
        return INSTANCE;
    }

    public static CameraModel_Factory valueOf(String s)
    {
        return (CameraModel_Factory)Enum.valueOf(com/snapchat/android/camera/model/CameraModel_Factory, s);
    }

    public static CameraModel_Factory[] values()
    {
        return (CameraModel_Factory[])$VALUES.clone();
    }

    public final CameraModel get()
    {
        return new CameraModel();
    }

    public final volatile Object get()
    {
        return get();
    }

    static 
    {
        INSTANCE = new CameraModel_Factory("INSTANCE");
        $VALUES = (new CameraModel_Factory[] {
            INSTANCE
        });
    }
}
