// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.commerce.ocr.capture.pipeline;

import com.google.android.libraries.commerce.ocr.capture.processors.Processor;
import java.util.concurrent.ExecutorService;

// Referenced classes of package com.google.android.libraries.commerce.ocr.capture.pipeline:
//            PipelineNode, SharedReferencePipelineNode

public final class Pipeline
{
    public static final class PipelineBuilder
    {

        private final PipelineNode root;

        public final PipelineNode getPipelineNode()
        {
            return root;
        }

        public final PipelineBuilder pipeTo(PipelineNode pipelinenode)
        {
            root.pipeTo(pipelinenode);
            return Pipeline.wire(pipelinenode);
        }

        public final PipelineBuilder to(PipelineNode pipelinenode)
        {
            root.pipeTo(pipelinenode);
            return this;
        }

        private PipelineBuilder(PipelineNode pipelinenode)
        {
            root = pipelinenode;
        }

    }


    public static PipelineNode forAsync(ExecutorService executorservice, Processor processor)
    {
        return new PipelineNode(executorservice, processor);
    }

    public static SharedReferencePipelineNode forSharedReferenceSync(Processor processor)
    {
        return new SharedReferencePipelineNode(null, processor);
    }

    public static PipelineNode forSync(Processor processor)
    {
        return new PipelineNode(null, processor);
    }

    public static PipelineBuilder wire(PipelineNode pipelinenode)
    {
        return new PipelineBuilder(pipelinenode);
    }
}
