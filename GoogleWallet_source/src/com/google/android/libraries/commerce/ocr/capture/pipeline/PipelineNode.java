// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.commerce.ocr.capture.pipeline;

import com.google.android.libraries.commerce.ocr.capture.processors.Processor;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;

public class PipelineNode
{

    private final ArrayList children = new ArrayList(3);
    protected final ExecutorService executor;
    private final AtomicBoolean isShutdown = new AtomicBoolean(false);
    protected final Processor processor;

    protected PipelineNode(ExecutorService executorservice, Processor processor1)
    {
        processor = processor1;
        executor = executorservice;
    }

    private com.google.android.libraries.commerce.ocr.util.ExecutorServiceFactory.RetirableRunnable createProcessingTask(final Object input)
    {
        return new com.google.android.libraries.commerce.ocr.util.ExecutorServiceFactory.RetirableRunnable() {

            final PipelineNode this$0;
            final Object val$input;

            public final void retire()
            {
                processor.discard(input);
            }

            public final void run()
            {
                onProcess(input);
            }

            
            {
                this$0 = PipelineNode.this;
                input = obj;
                super();
            }
        };
    }

    private void onProcess(Object obj)
    {
        if (!processor.isProcessingNeeded(obj))
        {
            processor.discard(obj);
        } else
        {
            obj = processor.process(obj);
            if (obj != null)
            {
                processNext(children, obj);
                return;
            }
        }
    }

    protected static void processNext(PipelineNode pipelinenode, Object obj)
    {
        pipelinenode.process(obj);
    }

    final void pipeTo(PipelineNode pipelinenode)
    {
        children.add(pipelinenode);
    }

    public final void process(Object obj)
    {
        if (isShutdown.get())
        {
            return;
        }
        if (executor != null)
        {
            executor.execute(createProcessingTask(obj));
            return;
        } else
        {
            onProcess(obj);
            return;
        }
    }

    protected void processNext(ArrayList arraylist, Object obj)
    {
        for (arraylist = arraylist.iterator(); arraylist.hasNext(); processNext((PipelineNode)arraylist.next(), obj)) { }
    }

    public final void shutdown()
    {
        processor.shutdown();
        if (executor != null)
        {
            executor.shutdown();
        }
        isShutdown.set(true);
        for (Iterator iterator = children.iterator(); iterator.hasNext(); ((PipelineNode)iterator.next()).shutdown()) { }
    }

}
