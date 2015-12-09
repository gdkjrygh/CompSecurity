// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.commerce.ocr.capture.pipeline;


// Referenced classes of package com.google.android.libraries.commerce.ocr.capture.pipeline:
//            Pipeline, PipelineNode

public static final class <init>
{

    private final PipelineNode root;

    public final PipelineNode getPipelineNode()
    {
        return root;
    }

    public final root pipeTo(PipelineNode pipelinenode)
    {
        root.pipeTo(pipelinenode);
        return Pipeline.wire(pipelinenode);
    }

    public final root to(PipelineNode pipelinenode)
    {
        root.pipeTo(pipelinenode);
        return this;
    }

    private Y(PipelineNode pipelinenode)
    {
        root = pipelinenode;
    }

    root(PipelineNode pipelinenode, root root1)
    {
        this(pipelinenode);
    }
}
