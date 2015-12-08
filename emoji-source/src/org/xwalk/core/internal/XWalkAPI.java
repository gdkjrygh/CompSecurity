// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.xwalk.core.internal;

import java.lang.annotation.Annotation;

public interface XWalkAPI
    extends Annotation
{

    public abstract boolean createExternally();

    public abstract boolean createInternally();

    public abstract Class extendClass();

    public abstract Class impl();

    public abstract Class instance();

    public abstract boolean isConst();

    public abstract boolean noInstance();

    public abstract String[] postWrapperLines();

    public abstract String[] preWrapperLines();
}
