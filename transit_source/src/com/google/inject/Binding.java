// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.inject;

import com.google.inject.spi.BindingScopingVisitor;
import com.google.inject.spi.BindingTargetVisitor;
import com.google.inject.spi.Element;

// Referenced classes of package com.google.inject:
//            Key, Provider

public interface Binding
    extends Element
{

    public abstract Object acceptScopingVisitor(BindingScopingVisitor bindingscopingvisitor);

    public abstract Object acceptTargetVisitor(BindingTargetVisitor bindingtargetvisitor);

    public abstract Key getKey();

    public abstract Provider getProvider();
}
