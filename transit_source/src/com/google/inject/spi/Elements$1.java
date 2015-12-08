// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.inject.spi;

import com.google.inject.Binding;

// Referenced classes of package com.google.inject.spi:
//            DefaultBindingTargetVisitor, Elements, InstanceBinding

static final class ding extends DefaultBindingTargetVisitor
{

    public Object visit(InstanceBinding instancebinding)
    {
        return instancebinding.getInstance();
    }

    protected Object visitOther(Binding binding)
    {
        throw new IllegalArgumentException();
    }

    ding()
    {
    }
}
