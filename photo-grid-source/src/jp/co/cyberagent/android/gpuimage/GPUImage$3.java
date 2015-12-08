// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package jp.co.cyberagent.android.gpuimage;


// Referenced classes of package jp.co.cyberagent.android.gpuimage:
//            GPUImage, GPUImageFilter

class this._cls0
    implements Runnable
{

    final GPUImage this$0;

    public void run()
    {
        synchronized (GPUImage.access$000(GPUImage.this))
        {
            GPUImage.access$000(GPUImage.this).destroy();
            GPUImage.access$000(GPUImage.this).notify();
        }
        return;
        exception;
        gpuimagefilter;
        JVM INSTR monitorexit ;
        throw exception;
    }

    ter()
    {
        this$0 = GPUImage.this;
        super();
    }
}
