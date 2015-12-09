// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.wallet.wobl.renderer;

import com.google.wallet.wobl.intermediaterepresentation.IntermediateRepresentation;
import java.util.HashMap;
import java.util.Map;

// Referenced classes of package com.google.wallet.wobl.renderer:
//            AbstractTagRenderer

public abstract class AbstractRenderer
{

    private Map renderers;

    public AbstractRenderer()
    {
        renderers = new HashMap();
    }

    AbstractTagRenderer getTagRenderer(Class class1)
    {
        AbstractTagRenderer abstracttagrenderer = (AbstractTagRenderer)renderers.get(class1);
        if (abstracttagrenderer == null)
        {
            class1 = String.valueOf(class1);
            throw new IllegalArgumentException((new StringBuilder(String.valueOf(class1).length() + 32)).append("No renderer found for IR class: ").append(class1).toString());
        } else
        {
            return abstracttagrenderer;
        }
    }

    protected void registerTagRenderer(Class class1, AbstractTagRenderer abstracttagrenderer)
    {
        renderers.put(class1, abstracttagrenderer);
    }

    public Object render(IntermediateRepresentation intermediaterepresentation)
    {
        return getTagRenderer(intermediaterepresentation.getClass()).render(intermediaterepresentation);
    }
}
