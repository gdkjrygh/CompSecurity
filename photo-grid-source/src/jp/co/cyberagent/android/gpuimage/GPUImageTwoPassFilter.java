// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package jp.co.cyberagent.android.gpuimage;


// Referenced classes of package jp.co.cyberagent.android.gpuimage:
//            GPUImageFilterGroup, GPUImageFilter

public class GPUImageTwoPassFilter extends GPUImageFilterGroup
{

    public GPUImageTwoPassFilter(String s, String s1, String s2, String s3)
    {
        super(null);
        addFilter(new GPUImageFilter(s, s1));
        addFilter(new GPUImageFilter(s2, s3));
    }
}
