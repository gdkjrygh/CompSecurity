// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package jp.co.cyberagent.android.gpuimage;


// Referenced classes of package jp.co.cyberagent.android.gpuimage:
//            GPUImageBoxBlurFilter

class this._cls0
    implements Runnable
{

    final GPUImageBoxBlurFilter this$0;

    public void run()
    {
        initTexelOffsets();
    }

    ()
    {
        this$0 = GPUImageBoxBlurFilter.this;
        super();
    }
}
