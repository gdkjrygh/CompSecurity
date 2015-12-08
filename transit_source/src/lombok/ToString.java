// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package lombok;

import java.lang.annotation.Annotation;

public interface ToString
    extends Annotation
{

    public abstract boolean callSuper();

    public abstract boolean doNotUseGetters();

    public abstract String[] exclude();

    public abstract boolean includeFieldNames();

    public abstract String[] of();
}
