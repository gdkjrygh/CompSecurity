// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.moodstocks.android;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import com.moodstocks.android.advanced.Tools;
import com.moodstocks.android.core.Loader;

public class Result
{

    private byte bytes[];
    private float corners[];
    private int dimensions[];
    private float homography[];
    private int length;
    private int origin;
    private int type;

    private Result(int i, int j, byte abyte0[], int k, float af[], float af1[], int ai[])
    {
        corners = null;
        homography = null;
        dimensions = null;
        type = i;
        origin = j;
        bytes = (byte[])abyte0.clone();
        length = k;
        corners = af;
        homography = af1;
        dimensions = ai;
    }

    public boolean equals(Object obj)
    {
        if (obj != null && obj.getClass() == getClass())
        {
            obj = (Result)obj;
            if (((Result) (obj)).type == type && ((Result) (obj)).getValue().equals(getValue()) && ((Result) (obj)).length == length)
            {
                return true;
            }
        }
        return false;
    }

    public float[] getCorners()
    {
        return corners;
    }

    public byte[] getData()
    {
        return bytes;
    }

    public native byte[] getDataFromBase64URL();

    public int[] getDimensions()
    {
        return dimensions;
    }

    public Matrix getHomography()
    {
        if (homography != null)
        {
            Matrix matrix = new Matrix();
            matrix.setValues(homography);
            return matrix;
        } else
        {
            return null;
        }
    }

    public int getOrigin()
    {
        return origin;
    }

    public int getType()
    {
        return type;
    }

    public String getValue()
    {
        return new String(bytes);
    }

    public Bitmap warpImage(Bitmap bitmap)
    {
        if (bitmap == null || dimensions == null || homography == null)
        {
            return null;
        } else
        {
            return Tools.warpBitmap(bitmap, getHomography(), dimensions[0], dimensions[1]);
        }
    }

    public Bitmap warpImage(Bitmap bitmap, float f)
    {
        if (bitmap == null || dimensions == null || homography == null)
        {
            return null;
        } else
        {
            return Tools.warpBitmap(bitmap, getHomography(), dimensions[0], dimensions[1], f);
        }
    }

    static 
    {
        Loader.load();
    }
}
