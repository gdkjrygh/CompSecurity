// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package dagger;

import java.lang.annotation.Annotation;

public interface Component
    extends Annotation
{
    public static interface Builder
        extends Annotation
    {
    }


    public abstract Class[] dependencies();

    public abstract Class[] modules();
}
