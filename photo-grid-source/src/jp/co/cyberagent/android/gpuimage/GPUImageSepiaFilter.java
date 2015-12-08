// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package jp.co.cyberagent.android.gpuimage;


// Referenced classes of package jp.co.cyberagent.android.gpuimage:
//            GPUImageColorMatrixFilter

public class GPUImageSepiaFilter extends GPUImageColorMatrixFilter
{

    public GPUImageSepiaFilter()
    {
        this(1.0F);
    }

    public GPUImageSepiaFilter(float f)
    {
        super(f, new float[] {
            0.3588F, 0.7044F, 0.1368F, 0.0F, 0.299F, 0.587F, 0.114F, 0.0F, 0.2392F, 0.4696F, 
            0.0912F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F
        });
    }
}
