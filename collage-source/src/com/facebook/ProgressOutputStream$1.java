// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook;


// Referenced classes of package com.facebook:
//            ProgressOutputStream

class gressCallback
    implements Runnable
{

    final ProgressOutputStream this$0;
    final gressCallback val$progressCallback;

    public void run()
    {
        val$progressCallback.onBatchProgress(ProgressOutputStream.access$000(ProgressOutputStream.this), ProgressOutputStream.access$100(ProgressOutputStream.this), ProgressOutputStream.access$200(ProgressOutputStream.this));
    }

    gressCallback()
    {
        this$0 = final_progressoutputstream;
        val$progressCallback = gressCallback.this;
        super();
    }
}
