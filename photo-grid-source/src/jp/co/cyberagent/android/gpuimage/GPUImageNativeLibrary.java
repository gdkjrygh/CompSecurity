// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package jp.co.cyberagent.android.gpuimage;


public class GPUImageNativeLibrary
{

    public static boolean loadGPUImageFailed = false;

    public GPUImageNativeLibrary()
    {
    }

    public static native void YUVtoARBG(byte abyte0[], int i, int j, int ai[]);

    public static native void YUVtoRBGA(byte abyte0[], int i, int j, int ai[]);

    static 
    {
        try
        {
            System.loadLibrary("gpuimage-library");
            loadGPUImageFailed = false;
        }
        catch (UnsatisfiedLinkError unsatisfiedlinkerror)
        {
            loadGPUImageFailed = true;
        }
    }
}
