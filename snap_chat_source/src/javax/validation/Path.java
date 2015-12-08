// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package javax.validation;

import java.util.List;

public interface Path
    extends Iterable
{
    public static interface BeanNode
        extends Node
    {
    }

    public static interface ConstructorNode
        extends Node
    {

        public abstract List getParameterTypes();
    }

    public static interface CrossParameterNode
        extends Node
    {
    }

    public static interface MethodNode
        extends Node
    {

        public abstract List getParameterTypes();
    }

    public static interface Node
    {

        public abstract Node as$2e59f947();

        public abstract Integer getIndex();

        public abstract Object getKey();

        public abstract int getKind$62ec5c83();

        public abstract String getName();

        public abstract boolean isInIterable();
    }

    public static interface ParameterNode
        extends Node
    {

        public abstract int getParameterIndex();
    }

    public static interface PropertyNode
        extends Node
    {
    }

    public static interface ReturnValueNode
        extends Node
    {
    }

}
