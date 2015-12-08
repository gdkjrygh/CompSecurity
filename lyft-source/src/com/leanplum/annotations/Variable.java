// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.leanplum.annotations;

import java.lang.annotation.Annotation;

public interface Variable
    extends Annotation
{

    public abstract String group();

    public abstract String name();
}
