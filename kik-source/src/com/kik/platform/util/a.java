// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kik.platform.util;

import android.media.ExifInterface;

final class a
{

    public static float a(String s)
    {
        switch ((new ExifInterface(s)).getAttributeInt("Orientation", 1))
        {
        case 4: // '\004'
        case 5: // '\005'
        case 7: // '\007'
        default:
            return 0.0F;

        case 6: // '\006'
            return 90F;

        case 3: // '\003'
            return 180F;

        case 8: // '\b'
            return 270F;
        }
    }

    public static void a()
    {
    }

    static 
    {
        try
        {
            Class.forName("android.media.ExifInterface");
        }
        catch (Exception exception)
        {
            throw new RuntimeException(exception);
        }
    }
}
