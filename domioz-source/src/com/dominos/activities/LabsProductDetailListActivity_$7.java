// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.activities;

import java.util.concurrent.CountDownLatch;

// Referenced classes of package com.dominos.activities:
//            LabsProductDetailListActivity_

class val.asyncWaitLatch
    implements Runnable
{

    final LabsProductDetailListActivity_ this$0;
    final CountDownLatch val$asyncWaitLatch;

    public void run()
    {
        LabsProductDetailListActivity_.access$401(LabsProductDetailListActivity_.this, val$asyncWaitLatch);
    }

    ()
    {
        this$0 = final_labsproductdetaillistactivity_;
        val$asyncWaitLatch = CountDownLatch.this;
        super();
    }
}
