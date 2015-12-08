// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package javax.validation.metadata;

import java.util.Set;

public interface ElementDescriptor
{
    public static interface ConstraintFinder
    {

        public transient abstract ConstraintFinder declaredOn$58e0e6bf();

        public abstract Set getConstraintDescriptors();

        public abstract boolean hasConstraints();

        public abstract ConstraintFinder lookingAt$66197095$7566a1f8();

        public transient abstract ConstraintFinder unorderedAndMatchingGroups$2b203509();
    }


    public abstract ConstraintFinder findConstraints();

    public abstract Set getConstraintDescriptors();

    public abstract Class getElementClass();

    public abstract boolean hasConstraints();
}
