// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.commerce.ocr.capture.pipeline;

import com.google.android.libraries.commerce.ocr.capture.processors.Processor;

// Referenced classes of package com.google.android.libraries.commerce.ocr.capture.pipeline:
//            PipelineNode

final class val.input
    implements com.google.android.libraries.commerce.ocr.util.Factory.RetirableRunnable
{

    final PipelineNode this$0;
    final Object val$input;

    public final void retire()
    {
        processor.discard(val$input);
    }

    public final void run()
    {
        PipelineNode.access$000(PipelineNode.this, val$input);
    }

    rableRunnable()
    {
        this$0 = final_pipelinenode;
        val$input = Object.this;
        super();
    }
}
