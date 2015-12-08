// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.utils;

import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class CameraExtensions
{

    public static final int MAX_WIDTH = 2560;

    public CameraExtensions()
    {
    }

    public static android.hardware.Camera.Size getBestPictureSize(android.hardware.Camera.Parameters parameters)
    {
        List list = parameters.getSupportedPictureSizes();
        Collections.sort(list, new Comparator() {

            public int compare(android.hardware.Camera.Size size1, android.hardware.Camera.Size size2)
            {
                return size1.width - size2.width;
            }

            public volatile int compare(Object obj, Object obj1)
            {
                return compare((android.hardware.Camera.Size)obj, (android.hardware.Camera.Size)obj1);
            }

        });
        parameters = (android.hardware.Camera.Size)list.get(0);
        Iterator iterator = list.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            android.hardware.Camera.Size size = (android.hardware.Camera.Size)iterator.next();
            if (((android.hardware.Camera.Size) (parameters)).width <= size.width && size.width <= 2560 && size.width == (size.height * 4) / 3)
            {
                parameters = size;
            }
        } while (true);
        return parameters;
    }
}
