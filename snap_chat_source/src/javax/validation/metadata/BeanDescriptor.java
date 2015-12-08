// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package javax.validation.metadata;

import java.util.Set;

// Referenced classes of package javax.validation.metadata:
//            ElementDescriptor, ConstructorDescriptor, MethodDescriptor, PropertyDescriptor

public interface BeanDescriptor
    extends ElementDescriptor
{

    public abstract Set getConstrainedConstructors();

    public transient abstract Set getConstrainedMethods$4182084f$7cf224ab();

    public abstract Set getConstrainedProperties();

    public transient abstract ConstructorDescriptor getConstraintsForConstructor$21227bb8();

    public transient abstract MethodDescriptor getConstraintsForMethod$30b1c50b();

    public abstract PropertyDescriptor getConstraintsForProperty$7987561f();

    public abstract boolean isBeanConstrained();
}
