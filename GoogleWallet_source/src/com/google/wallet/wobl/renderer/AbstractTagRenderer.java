// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.wallet.wobl.renderer;

import com.google.wallet.wobl.intermediaterepresentation.IntermediateRepresentation;

// Referenced classes of package com.google.wallet.wobl.renderer:
//            AbstractRenderer

public abstract class AbstractTagRenderer
{

    private final AbstractRenderer renderer;

    public AbstractTagRenderer(AbstractRenderer abstractrenderer)
    {
        renderer = abstractrenderer;
    }

    protected AbstractRenderer getRenderer()
    {
        return renderer;
    }

    public abstract Object render(IntermediateRepresentation intermediaterepresentation);
}
