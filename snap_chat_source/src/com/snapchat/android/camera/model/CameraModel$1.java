// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.camera.model;


// Referenced classes of package com.snapchat.android.camera.model:
//            CameraModel

static final class meraType
{

    static final int a[];

    static 
    {
        a = new int[meraType.values().length];
        try
        {
            a[meraType.BACK_FACING.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        try
        {
            a[meraType.FRONT_FACING.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror)
        {
            return;
        }
    }
}
