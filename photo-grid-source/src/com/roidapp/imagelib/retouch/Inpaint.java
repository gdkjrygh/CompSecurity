// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.imagelib.retouch;

import android.graphics.Bitmap;

public class Inpaint
{

    public static boolean a = false;

    public Inpaint()
    {
    }

    public native void Inpaint(Bitmap bitmap, Bitmap bitmap1, int ai[], int i, int j, int k);

    static 
    {
        try
        {
            System.loadLibrary("imageprogress");
            a = false;
        }
        catch (UnsatisfiedLinkError unsatisfiedlinkerror)
        {
            unsatisfiedlinkerror.printStackTrace();
            a = true;
        }
    }
}
