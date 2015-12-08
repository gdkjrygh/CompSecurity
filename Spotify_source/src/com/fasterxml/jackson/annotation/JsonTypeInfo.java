// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.annotation;

import java.lang.annotation.Annotation;

public interface JsonTypeInfo
    extends Annotation
{

    public abstract Class defaultImpl();

    public abstract As include();

    public abstract String property();

    public abstract Id use();

    public abstract boolean visible();
}
