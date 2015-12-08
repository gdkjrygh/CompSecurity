// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.commerce.ocr.capture.pipeline;

import com.google.android.libraries.commerce.ocr.capture.processors.Processor;
import com.google.android.libraries.commerce.ocr.cv.SafeCountingPool;
import com.google.android.libraries.commerce.ocr.cv.SafePoolable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ExecutorService;

// Referenced classes of package com.google.android.libraries.commerce.ocr.capture.pipeline:
//            PipelineNode

final class SharedReferencePipelineNode extends PipelineNode
{

    protected SharedReferencePipelineNode(ExecutorService executorservice, Processor processor)
    {
        super(executorservice, processor);
    }

    private void processNext(ArrayList arraylist, SafePoolable safepoolable)
    {
        SafeCountingPool safecountingpool;
        safecountingpool = new SafeCountingPool(safepoolable);
        safepoolable = safecountingpool.useReference();
        for (arraylist = arraylist.iterator(); arraylist.hasNext(); processNext((PipelineNode)arraylist.next(), safecountingpool.useReference())) { }
        break MISSING_BLOCK_LABEL_54;
        arraylist;
        safepoolable.recycle();
        throw arraylist;
        safepoolable.recycle();
        return;
    }

    protected final volatile void processNext(ArrayList arraylist, Object obj)
    {
        processNext(arraylist, (SafePoolable)obj);
    }
}
