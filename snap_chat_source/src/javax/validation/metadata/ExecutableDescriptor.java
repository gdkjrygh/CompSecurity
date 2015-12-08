// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package javax.validation.metadata;

import java.util.List;
import java.util.Set;

// Referenced classes of package javax.validation.metadata:
//            ElementDescriptor, CrossParameterDescriptor, ReturnValueDescriptor

public interface ExecutableDescriptor
    extends ElementDescriptor
{

    public abstract ElementDescriptor.ConstraintFinder findConstraints();

    public abstract Set getConstraintDescriptors();

    public abstract CrossParameterDescriptor getCrossParameterDescriptor();

    public abstract String getName();

    public abstract List getParameterDescriptors();

    public abstract ReturnValueDescriptor getReturnValueDescriptor();

    public abstract boolean hasConstrainedParameters();

    public abstract boolean hasConstrainedReturnValue();

    public abstract boolean hasConstraints();
}
